package composition;
//composition
public class Table {
	
	private int size;
	private String type;
	
	public Table(int size, String type){
		
		this.size = size;
		this.type = type;
	}
	public void makeTable(){
		System.out.println("Table is created");
	}
	public int getSize() {
		return size;
	}
	public String getType() {
		return type;
	}
	public int getSize(int size){
		return size;
	}
	
	public String getType(String type){
		return type;
	}

}
