package realms_of_thuria;

public class Items {
	String name;
	String rarity;
	
	
	public Items (String n, String r){
		name = n;
		rarity = r;
	}
	
	public void description() {
        System.out.println("Voici "+name+" il est de rareté: "+rarity+"");
    }
}
