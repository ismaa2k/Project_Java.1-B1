package realms_of_thuria;

public class Rooms {
	String name; 
	Boss boss;
	
	public Rooms (String n, Boss b){
		name = n;
		boss = b;
	}
	
	public void description() {
		System.out.println("Welcome to the "+name+"");
	}
}
