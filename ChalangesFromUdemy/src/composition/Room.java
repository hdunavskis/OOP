package composition;
//composition
public class Room {
	// allows to have objects as a members from another class.
	private Chair chair;
	private Table table;
	private Bed bed;
	
	public Room (Chair chair, Table table, Bed bed){
		
		this.chair = chair;
		this.table = table;
		this.bed = bed;
	}

	public void addContents(){
		
		chair.makeChair();
		table.makeTable();
		System.out.println("Chair, table and bed is added to the room");
	}

	public Chair getChair() {
		return chair;
	}

	public Table getTable() {
		return table;
	}

	public Bed getBed() {
		return bed;
	}
	
}