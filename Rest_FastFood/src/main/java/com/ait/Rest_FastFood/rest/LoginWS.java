package com.ait.Rest_FastFood.rest;

import java.util.Base64;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import com.ait.Rest_FastFood.controller.PasswordChecker;
import com.ait.Rest_FastFood.data.UserDAO;
import com.ait.Rest_FastFood.model.User;

import javax.ws.rs.core.MediaType;


@Path("/login")
@Stateless
@LocalBean
public class LoginWS {
	
	@EJB
	private UserDAO userDAO;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response login(@HeaderParam("authorization") String auth) {
		User customer = isAuthenticationValid(auth);
		if (customer != null) {
			return Response.status(Status.OK).entity(customer).build();
		}
		return Response.status(Status.UNAUTHORIZED).entity("User not found!").build();
	}

	private User isAuthenticationValid(String authentication) {
		String[] auth = authentication.split("\\s+");
		try {
			
			String userNameAndPasswordEncrypted  = new String(Base64.getDecoder().decode(auth[1]));
			
			String userName = userNameAndPasswordEncrypted.substring(0, userNameAndPasswordEncrypted.indexOf(':'));
			String password = userNameAndPasswordEncrypted.substring(userName.length()+1);
			
			User customer = userDAO.getCustomer(userName);
			if(PasswordChecker.checkIfPasswordsMatch(password, customer.getSalt(), customer.getPassword())) {
				return customer;
			}
			return null;
			
		} catch (Exception e) {
			return null;
		}
	}
}
