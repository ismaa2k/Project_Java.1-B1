package realms_of_thuria;

public class Player {
	 int pv;
	 int shield;
	 int degats;
	
	public Player (int p, int s, int d){
		pv = p;
		shield = s;
		degats = d;
	}
	
	public void description() {
        System.out.println("J'ai "+pv+" PV avec un shield de "+shield+"");
    }
	
}