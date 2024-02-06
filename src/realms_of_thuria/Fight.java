package realms_of_thuria;

public class Fight {
	String fight;
    Player perso;
    Boss boss;
    int dgtpris;
    int dgtmit;
    
        public Fight(Player p, String f, Boss b) {
        	perso = p;
        	fight = f;
            boss = b;
        }
        
        public void mettreDgt(Player per, Boss bo) {
            if (bo.pv > 0) {
                int dgtmit = (per.degats);
                int pvBRestants = bo.pv - dgtmit;
                if (pvBRestants < 0) {
                    pvBRestants = 0;
                }
                bo.pv = pvBRestants;
            }
        }
        
        public void degatsPris(Player per, Boss bo) {
            if (per.pv > 0) {
                int pvtotaux = (per.pv);
                int pvPRestants = pvtotaux - bo.degats;
                if (pvPRestants < 0) {
                    pvPRestants = 0;
                }
                per.pv = pvPRestants;
            }
        }
        
    	public void reset (Player p) {
    		if(p.pv < 600) {
    			p.pv = 600;
    		}
    	}
        
        public void mortPer() {
            System.out.println("You are dead.");
            System.exit(0);
        }

        public void mortBoss() {
            System.out.println("The boss is dead congrats !");
        }
}

