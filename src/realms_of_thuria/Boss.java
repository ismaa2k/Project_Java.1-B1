package realms_of_thuria;

public class Boss {
	String name;
	int pv;
	int degats;
	
	public Boss (String n, int p, int d){
		name = n;
		pv = p;
		degats = d;
	}
	
	public void description(){
        System.out.println("This is "+name+" he has "+pv+" PV");
    }
}

