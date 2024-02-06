package realms_of_thuria;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// CREATION PLAYERS
		Player rizz = new Player(750, 100, 200);
		Player thewizzard = new Player(750, 100, 100);
		Player shadowknight = new Player(750, 100, 100);
		
		ArrayList<Player> listeplayers = new ArrayList<Player>();
		listeplayers.add(rizz);
		listeplayers.add(thewizzard);
		listeplayers.add(shadowknight);
				
		// CREATION ITEMS
		Items gargoyles = new Items("Gargoyles" , "Commun");
		Items ruthless_butcher = new Items("Ruthless Butcher","Rare");
		Items abyssal_tome_of_necromancy = new Items("Abyssal Tome of Necromancy", "Epic");
		Items shadowsteel_longsword = new Items("Shadowsteel Longsword", "Mythical");
		Items mystic_rune_engraved_shield = new Items("Mystic Rune Engraved Shield", "Legendary");

		// CREATION BOSS
		Boss velganos = new Boss("Velganos", 1000, 100);
		Boss kakulsaydon = new Boss("Kakul-Saydon", 1500, 80);
		Boss vilethorn = new Boss("Vilethorn", 2000, 75);
		Boss shadowmaw = new Boss("Shadowmaw", 3000, 50);
		Boss dreadclaw = new Boss("Dreadclaw", 5000, 25);		
		
		// CREATION ROOMS
		Rooms chaos_dungeon = new Rooms ("Chaos Dungeon", velganos);
		Rooms abyssal_dungeon = new Rooms ("Abyysal Dungeon", kakulsaydon);
		Rooms temple_of_the_elements = new Rooms ("Temple of the Elements", vilethorn);
		Rooms crypt_of_Lost_souls = new Rooms ("Crypt of Lost Souls", shadowmaw);
		Rooms sanctum_of_the_elements = new Rooms ("Sanctum of the Elements", dreadclaw);
		
		// CREATION COMBATS
		Fight playersvsvelganos = new Fight(rizz,"1er fight", velganos);
		Fight playersvskakulsaydon = new Fight(rizz,"2eme fight", kakulsaydon);
		Fight playersvsvilethorn = new Fight(rizz,"3eme fight", vilethorn);
		Fight playersvsshadowmaw = new Fight(rizz,"4eme fight", shadowmaw);
		Fight playersvsdreadclaw = new Fight(rizz,"4eme fight", dreadclaw);
		
		
		Scanner scanner = new Scanner(System.in);
		
		// CHOOSE YOUR CHARACTER
        System.out.print("Hello Player, Choose your main character.\rRizz \rTheWizzard \rShadowKnight ");
        String choosecharacter = scanner.nextLine();
        boolean launch = true;
        switch (choosecharacter) {
            case "Rizz":
                System.out.println("\nWelcome to Realms of Thuria Rizz.");
                break;
            case "TheWizzard":
                System.out.println("\nWelcome to Realms of Thuria TheWizzard.");
                break;
            case "ShadowKnight":
                System.out.println("\nWelcome to Realms of Thuria ShadowKnight. \r");
                break;
            default:
                System.out.println("Take a main character !");
                launch = true;
                System.exit(0);
                break;
        	}
        
        // OPEN CHEST OR NOT DEPENDS OF CHARACTER
        if(launch == true){
            System.out.print("\nOpen this chest "+choosecharacter+" (y/n)");
            String chest = scanner.nextLine();
            boolean openclose = true;
            switch (chest.toLowerCase()) {
                case "y":
                case "yes":
                case "ok":
                    System.out.println("Oh the chest seems empty... \n\rLet's Begin");
                    break;
                default:
                    System.out.println("ok ? \n\rLet's Begin");
                    
            }
        }
        
        // ENTREE DANS SALLE
        System.out.print("\nMaintenant, vous avez 5 salles disponible, plus vous monter de salles plus le niveau du boss sera dur, "
        		+ "\rdans quelle salle voulez vous allez ? (1)");
        String dungeon_rooms = scanner.nextLine();
        boolean chooserooms = true;
        switch (dungeon_rooms) {
            case "1":
            	System.out.println("In this room you will fight "+chaos_dungeon.boss.name+"");
            	break;
            case "2":
            	System.out.println("In this room you will fight "+abyssal_dungeon.boss.name+"");
            	break;
            case "3":
            	System.out.println("In this room you will fight "+temple_of_the_elements.boss.name+"");
            	break;
            case "4":
            	System.out.println("In this room you will fight "+crypt_of_Lost_souls.boss.name+"");
            	break;
            case "5":
            	System.out.println("In this room you will fight "+sanctum_of_the_elements.boss.name+"");
                break;
            default:
            	System.out.println("This room doesn't exist !");
            	chooserooms = true;
                break;
        	}
        
		// DEBUT 1ER COMBATS
		
        if(dungeon_rooms.contains("1")){
            System.out.print("Are u sure to start this fight versus "+chaos_dungeon.boss.name+" ? (y/n)");
            String fight1 = scanner.nextLine();
            boolean start1 = true;
            switch (fight1.toLowerCase()) {
                case "y":
                case "yes":
                    System.out.println("LET'S FIGHT !");
                    break;
                default:
                    System.out.println("Good Choice");
                    System.exit(0);
                    start1 = false;
            }
            
            
/////////////////////////////////////////////////////////COMBATS VS VELGANOS/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            
if(start1 = true) {
// ROUND PLAYERS
if(shadowknight.pv > 0 & thewizzard.pv > 0 & rizz.pv > 0 & velganos.pv > 0){
playersvsvelganos.mettreDgt(rizz, velganos);
playersvsvelganos.mettreDgt(thewizzard, velganos);
playersvsvelganos.mettreDgt(shadowknight, velganos);
System.out.println("WAOW nice damage team ! He has now, "+velganos.pv+" HP.");
}

Thread.sleep(2000);

// MORT BOSS
if (velganos.pv <= 0) {
playersvsvelganos.mortBoss();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// ROUND BOSS
if(velganos.pv > 0){
playersvsvelganos.degatsPris(rizz, velganos);
playersvsvelganos.degatsPris(thewizzard, velganos);
playersvsvelganos.degatsPris(shadowknight, velganos);
System.out.println("OUCH Velganos deals to you -"+velganos.degats+" ! Rizz you have:"+rizz.pv+", TheWizzard you have:"+thewizzard.pv+" and ShadowKnight you have:"+shadowknight.pv+".");
}

Thread.sleep(2000);

// MORT PLAYERS
if(shadowknight.pv <= 0 & thewizzard.pv <= 0 & rizz.pv <= 0){
playersvsvelganos.mortPer();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// ROUND PLAYERS
if(shadowknight.pv >= 0 & thewizzard.pv >= 0 & rizz.pv >= 0 & velganos.pv >= 0){
playersvsvelganos.mettreDgt(rizz, velganos);
playersvsvelganos.mettreDgt(thewizzard, velganos);
playersvsvelganos.mettreDgt(shadowknight, velganos);
System.out.println("WAOW nice damage team ! He has now, "+velganos.pv+" HP.");
}

Thread.sleep(2000);

// MORT BOSS
if (velganos.pv <= 0) {
playersvsvelganos.mortBoss();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// ROUND BOSS
if(velganos.pv > 0){
playersvsvelganos.degatsPris(rizz, velganos);
playersvsvelganos.degatsPris(thewizzard, velganos);
playersvsvelganos.degatsPris(shadowknight, velganos);
System.out.println("OUCH Velganos deals to you -"+velganos.degats+" ! Rizz you have:"+rizz.pv+", TheWizzard you have:"+thewizzard.pv+" and ShadowKnight you have:"+shadowknight.pv+".");
}

Thread.sleep(2000);

// MORT PLAYERS
if(shadowknight.pv <= 0 & thewizzard.pv <= 0 & rizz.pv <= 0){
playersvsvelganos.mortPer();
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// ROUND PLAYERS
if(shadowknight.pv > 0 & thewizzard.pv > 0 & rizz.pv > 0 & velganos.pv > 0){
playersvsvelganos.mettreDgt(rizz, velganos);
playersvsvelganos.mettreDgt(thewizzard, velganos);
playersvsvelganos.mettreDgt(shadowknight, velganos);
System.out.println("WAOW nice damage team ! He has now, "+velganos.pv+" HP.");
}

Thread.sleep(2000);

// MORT BOSS
if (velganos.pv <= 0) {
playersvsvelganos.mortBoss();
}
}
}
        
        System.out.println("OH he drops a thing, come over look, WAOW it's a Gargoyles");

/////////////////////////////////////////////////////////FIN COMBATS VS VELGANOS/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("\nVous etes low voulez-vous une potion ? (y/n)");
        String heal1 = scanner.nextLine();
        boolean heala = true;
        switch (heal1) {
            case "yes":
            case "k":
            case "y":
            	playersvsvelganos.reset(rizz);
            	playersvsvelganos.reset(thewizzard);
            	playersvsvelganos.reset(shadowknight);
            	break;
            case "no":
            case "n":
            	System.out.println("Ok u stay low HP !");
                break;
        	}

/////////////////////////////////////////////////////////COMBATS VS Kakul-Saydon/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// ENTREE DANS SALLE
System.out.print("\nMaintenant, vous avez 4 salles disponible, plus vous monter de salles plus le niveau du boss sera dur, "
+ "\rdans quelle salle voulez vous allez ? (2)");
String dungeon_rooms2 = scanner.nextLine();
boolean chooserooms2 = true;
switch (dungeon_rooms2) {
case "1":
System.out.println("This room is not available anymore");
break;
case "2":
System.out.println("In this room you will fight "+abyssal_dungeon.boss.name+"");
break;
case "3":
System.out.println("In this room you will fight "+temple_of_the_elements.boss.name+"");
break;
case "4":
System.out.println("In this room you will fight "+crypt_of_Lost_souls.boss.name+"");
break;
case "5":
System.out.println("In this room you will fight "+sanctum_of_the_elements.boss.name+"");
break;
default:
System.out.println("This room doesn't exist !");
chooserooms2 = true;
break;
}

// DEBUT 1ER COMBATS

if(dungeon_rooms2.contains("2")){
System.out.print("Are u sure to start this fight versus "+abyssal_dungeon.boss.name+" ? (y/n)");
String fight2 = scanner.nextLine();
boolean start2 = true;
switch (fight2.toLowerCase()) {
case "y":
case "yes":
System.out.println("LET'S FIGHT !");
break;
default:
System.out.println("Good Choice");
System.exit(0);
start2 = false;
}


if(start2 = true) {
//ROUND PLAYERS
if(shadowknight.pv > 0 & thewizzard.pv > 0 & rizz.pv > 0 & kakulsaydon.pv > 0){
playersvskakulsaydon.mettreDgt(rizz, kakulsaydon);
playersvskakulsaydon.mettreDgt(thewizzard, kakulsaydon);
playersvskakulsaydon.mettreDgt(shadowknight, kakulsaydon);
System.out.println("WAOW nice damage team ! He has now, "+kakulsaydon.pv+" HP.");
}

Thread.sleep(2000);

//MORT BOSS
if (kakulsaydon.pv <= 0) {
playersvskakulsaydon.mortBoss();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND BOSS
if(kakulsaydon.pv > 0){
playersvskakulsaydon.degatsPris(rizz, kakulsaydon);
playersvskakulsaydon.degatsPris(thewizzard, kakulsaydon);
playersvskakulsaydon.degatsPris(shadowknight, kakulsaydon);
System.out.println("OUCH Kakul-Saydon deals to you -"+kakulsaydon.degats+" ! Rizz you have:"+rizz.pv+", TheWizzard you have:"+thewizzard.pv+" and ShadowKnight you have:"+shadowknight.pv+".");
}

Thread.sleep(2000);

//MORT PLAYERS
if(shadowknight.pv <= 0 & thewizzard.pv <= 0 & rizz.pv <= 0){
playersvskakulsaydon.mortPer();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND PLAYERS
if(shadowknight.pv >= 0 & thewizzard.pv >= 0 & rizz.pv >= 0 & kakulsaydon.pv >= 0){
playersvskakulsaydon.mettreDgt(rizz, kakulsaydon);
playersvskakulsaydon.mettreDgt(thewizzard, kakulsaydon);
playersvskakulsaydon.mettreDgt(shadowknight, kakulsaydon);
System.out.println("WAOW nice damage team ! He has now, "+kakulsaydon.pv+" HP.");
}

Thread.sleep(2000);

//MORT BOSS
if (kakulsaydon.pv <= 0) {
playersvskakulsaydon.mortBoss();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND BOSS
if(kakulsaydon.pv > 0){
playersvskakulsaydon.degatsPris(rizz, kakulsaydon);
playersvskakulsaydon.degatsPris(thewizzard, kakulsaydon);
playersvskakulsaydon.degatsPris(shadowknight, kakulsaydon);
System.out.println("OUCH Kakul-Saydon deals to you -"+kakulsaydon.degats+" ! Rizz you have:"+rizz.pv+", TheWizzard you have:"+thewizzard.pv+" and ShadowKnight you have:"+shadowknight.pv+".");
}

Thread.sleep(2000);

//MORT PLAYERS
if(shadowknight.pv <= 0 & thewizzard.pv <= 0 & rizz.pv <= 0){
playersvskakulsaydon.mortPer();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND PLAYERS
if(shadowknight.pv > 0 & thewizzard.pv > 0 & rizz.pv > 0 & kakulsaydon.pv > 0){
playersvskakulsaydon.mettreDgt(rizz, kakulsaydon);
playersvskakulsaydon.mettreDgt(thewizzard, kakulsaydon);
playersvskakulsaydon.mettreDgt(shadowknight, kakulsaydon);
System.out.println("WAOW nice damage team ! He has now, "+kakulsaydon.pv+" HP.");
}

Thread.sleep(2000);

//MORT BOSS
if (kakulsaydon.pv <= 0) {
playersvskakulsaydon.mortBoss();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND BOSS
if(kakulsaydon.pv > 0){
playersvskakulsaydon.degatsPris(rizz, kakulsaydon);
playersvskakulsaydon.degatsPris(thewizzard, kakulsaydon);
playersvskakulsaydon.degatsPris(shadowknight, kakulsaydon);
System.out.println("OUCH Kakul-Saydon deals to you -"+kakulsaydon.degats+" ! Rizz you have:"+rizz.pv+", TheWizzard you have:"+thewizzard.pv+" and ShadowKnight you have:"+shadowknight.pv+".");
}

Thread.sleep(2000);

//MORT PLAYERS
if(shadowknight.pv <= 0 & thewizzard.pv <= 0 & rizz.pv <= 0){
playersvskakulsaydon.mortPer();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND PLAYERS
if(shadowknight.pv > 0 & thewizzard.pv > 0 & rizz.pv > 0 & kakulsaydon.pv > 0){
playersvskakulsaydon.mettreDgt(rizz, kakulsaydon);
playersvskakulsaydon.mettreDgt(thewizzard, kakulsaydon);
playersvskakulsaydon.mettreDgt(shadowknight, kakulsaydon);
System.out.println("WAOW nice damage team ! He has now, "+kakulsaydon.pv+" HP.");
}

Thread.sleep(2000);

//MORT BOSS
if (kakulsaydon.pv <= 0) {
playersvskakulsaydon.mortBoss();
}
}
}

System.out.println("OH he drops a thing, come over look, WAOW it's a Ruthless Butcher");

/////////////////////////////////////////////////////////FIN COMBATS VS Kakul-Saydon//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

System.out.println("\nVous etes low voulez-vous une potion ? (y/n)");
String heal2 = scanner.nextLine();
boolean healb = true;
switch (heal2) {
    case "yes":
    case "k":
    case "y":
    	playersvskakulsaydon.reset(rizz);
    	playersvskakulsaydon.reset(thewizzard);
    	playersvskakulsaydon.reset(shadowknight);
    	break;
    case "no":
    case "n":
    	System.out.println("Ok u stay low HP !");
    default:
    	System.out.println("Ok u stay low HP !");
        break;
	}

/////////////////////////////////////////////////////////DEBUT COMBAT VS Vilethorn////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            

//ENTREE DANS SALLE
System.out.print("\nMaintenant, vous avez 3 salles disponible, plus vous monter de salles plus le niveau du boss sera dur, "
+ "\rdans quelle salle voulez vous allez ? (3)");
String dungeon_rooms3 = scanner.nextLine();
boolean chooserooms3 = true;
switch (dungeon_rooms3) {
case "1":
System.out.println("This room is not available anymore");
break;
case "2":
System.out.println("This room is not available anymore");
break;
case "3":
System.out.println("In this room you will fight "+temple_of_the_elements.boss.name+"");
break;
case "4":
System.out.println("In this room you will fight "+crypt_of_Lost_souls.boss.name+"");
break;
case "5":
System.out.println("In this room you will fight "+sanctum_of_the_elements.boss.name+"");
break;
default:
System.out.println("This room doesn't exist !");
chooserooms3 = true;
break;
}

//DEBUT 3EME COMBATS

if(dungeon_rooms3.contains("3")){
System.out.print("Are u sure to start this fight versus "+temple_of_the_elements.boss.name+" ? (y/n)");
String fight3 = scanner.nextLine();
boolean start3 = true;
switch (fight3.toLowerCase()) {
case "y":
case "yes":
System.out.println("LET'S FIGHT !");
break;
default:
System.out.println("Good Choice");
System.exit(0);
start3 = false;
}


if(start3 = true) {
//ROUND PLAYERS
if(shadowknight.pv > 0 & thewizzard.pv > 0 & rizz.pv > 0 & vilethorn.pv > 0){
	playersvsvilethorn.mettreDgt(rizz, vilethorn);
	playersvsvilethorn.mettreDgt(thewizzard, vilethorn);
	playersvsvilethorn.mettreDgt(shadowknight, vilethorn);
System.out.println("WAOW nice damage team ! He has now, "+vilethorn.pv+" HP.");
}

Thread.sleep(2000);

//MORT BOSS
if (vilethorn.pv <= 0) {
	playersvsvilethorn.mortBoss();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND BOSS
if(vilethorn.pv > 0){
	playersvsvilethorn.degatsPris(rizz, vilethorn);
	playersvsvilethorn.degatsPris(thewizzard, vilethorn);
	playersvsvilethorn.degatsPris(shadowknight, vilethorn);
System.out.println("OUCH Vilethorn deals to you -"+vilethorn.degats+" ! Rizz you have:"+rizz.pv+", TheWizzard you have:"+thewizzard.pv+" and ShadowKnight you have:"+shadowknight.pv+".");
}

Thread.sleep(2000);

//MORT PLAYERS
if(shadowknight.pv <= 0 & thewizzard.pv <= 0 & rizz.pv <= 0){
	playersvsvilethorn.mortPer();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND PLAYERS
if(shadowknight.pv >= 0 & thewizzard.pv >= 0 & rizz.pv >= 0 & vilethorn.pv >= 0){
	playersvsvilethorn.mettreDgt(rizz, vilethorn);
	playersvsvilethorn.mettreDgt(thewizzard, vilethorn);
	playersvsvilethorn.mettreDgt(shadowknight, vilethorn);
System.out.println("WAOW nice damage team ! He has now, "+vilethorn.pv+" HP.");
}

Thread.sleep(2000);

//MORT BOSS
if (vilethorn.pv <= 0) {
	playersvsvilethorn.mortBoss();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND BOSS
if(vilethorn.pv > 0){
	playersvsvilethorn.degatsPris(rizz, vilethorn);
	playersvsvilethorn.degatsPris(thewizzard, vilethorn);
	playersvsvilethorn.degatsPris(shadowknight, vilethorn);
System.out.println("OUCH Vilethorn deals to you -"+vilethorn.degats+" ! Rizz you have:"+rizz.pv+", TheWizzard you have:"+thewizzard.pv+" and ShadowKnight you have:"+shadowknight.pv+".");
}

Thread.sleep(2000);

//MORT PLAYERS
if(shadowknight.pv <= 0 & thewizzard.pv <= 0 & rizz.pv <= 0){
	playersvsvilethorn.mortPer();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND PLAYERS
if(shadowknight.pv > 0 & thewizzard.pv > 0 & rizz.pv > 0 & vilethorn.pv > 0){
	playersvsvilethorn.mettreDgt(rizz, vilethorn);
	playersvsvilethorn.mettreDgt(thewizzard, vilethorn);
	playersvsvilethorn.mettreDgt(shadowknight, vilethorn);
System.out.println("WAOW nice damage team ! He has now, "+vilethorn.pv+" HP.");
}

Thread.sleep(2000);

//MORT BOSS
if (vilethorn.pv <= 0) {
	playersvsvilethorn.mortBoss();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND BOSS
if(vilethorn.pv > 0){
	playersvsvilethorn.degatsPris(rizz, vilethorn);
	playersvsvilethorn.degatsPris(thewizzard, vilethorn);
	playersvsvilethorn.degatsPris(shadowknight, vilethorn);
System.out.println("OUCH Vilethorn deals to you -"+vilethorn.degats+" ! Rizz you have:"+rizz.pv+", TheWizzard you have:"+thewizzard.pv+" and ShadowKnight you have:"+shadowknight.pv+".");
}

Thread.sleep(2000);

//MORT PLAYERS
if(shadowknight.pv <= 0 & thewizzard.pv <= 0 & rizz.pv <= 0){
	playersvsvilethorn.mortPer();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND PLAYERS
if(shadowknight.pv > 0 & thewizzard.pv > 0 & rizz.pv > 0 & vilethorn.pv > 0){
	playersvsvilethorn.mettreDgt(rizz, vilethorn);
	playersvsvilethorn.mettreDgt(thewizzard, vilethorn);
	playersvsvilethorn.mettreDgt(shadowknight, vilethorn);
System.out.println("WAOW nice damage team ! He has now, "+vilethorn.pv+" HP.");
}

Thread.sleep(2000);

//MORT BOSS
if (vilethorn.pv <= 0) {
	playersvsvilethorn.mortBoss();
}
}
}     

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND BOSS
if(vilethorn.pv > 0){
	playersvsvilethorn.degatsPris(rizz, vilethorn);
	playersvsvilethorn.degatsPris(thewizzard, vilethorn);
	playersvsvilethorn.degatsPris(shadowknight, vilethorn);
System.out.println("OUCH Vilethorn deals to you -"+vilethorn.degats+" ! Rizz you have:"+rizz.pv+", TheWizzard you have:"+thewizzard.pv+" and ShadowKnight you have:"+shadowknight.pv+".");
}

Thread.sleep(2000);

//MORT PLAYERS
if(shadowknight.pv <= 0 & thewizzard.pv <= 0 & rizz.pv <= 0){
	playersvsvilethorn.mortPer();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND PLAYERS
if(shadowknight.pv > 0 & thewizzard.pv > 0 & rizz.pv > 0 & vilethorn.pv > 0){
playersvsvilethorn.mettreDgt(rizz, vilethorn);
playersvsvilethorn.mettreDgt(thewizzard, vilethorn);
playersvsvilethorn.mettreDgt(shadowknight, vilethorn);
System.out.println("WAOW nice damage team ! He has now, "+vilethorn.pv+" HP.");
}

Thread.sleep(2000);

//MORT BOSS
if (vilethorn.pv <= 0) {
playersvsvilethorn.mortBoss();
}

System.out.println("OH he drops a thing, come over look, WAOW it's a Abyssal Tome of Necromancy");

/////////////////////////////////////////////////////////FIN COMBATS VS VILETHORN/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

System.out.println("\nVous etes low voulez-vous une potion ? (y/n)");
String heal3 = scanner.nextLine();
boolean healc = true;
switch (heal3) {
case "yes":
case "k":
case "y":
playersvsvelganos.reset(rizz);
playersvsvelganos.reset(thewizzard);
playersvsvelganos.reset(shadowknight);
break;
case "no":
case "n":
System.out.println("Ok u stay low HP !");
break;
}

/////////////////////////////////////////////////////////DEBUT COMBAT VS ShadoMaw////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//ENTREE DANS SALLE
System.out.print("\nMaintenant, vous avez 2 salles disponible, plus vous monter de salles plus le niveau du boss sera dur, "
+ "\rdans quelle salle voulez vous allez ? (4)");
String dungeon_rooms4 = scanner.nextLine();
boolean chooserooms4 = true;
switch (dungeon_rooms4) {
case "1":
System.out.println("This room is not available anymore");
break;
case "2":
System.out.println("This room is not available anymore");
break;
case "3":
System.out.println("This room is not available anymore");
break;
case "4":
System.out.println("In this room you will fight "+crypt_of_Lost_souls.boss.name+"");
break;
case "5":
System.out.println("In this room you will fight "+sanctum_of_the_elements.boss.name+"");
break;
default:
System.out.println("This room doesn't exist !");
chooserooms4 = true;
break;
}
//DEBUT 4EME COMBATS

if(dungeon_rooms4.contains("4")){
System.out.print("Are u sure to start this fight versus "+crypt_of_Lost_souls.boss.name+" ? (y/n)");
String fight4 = scanner.nextLine();
boolean start4 = true;
switch (fight4.toLowerCase()) {
case "y":
case "yes":
System.out.println("LET'S FIGHT !");
break;
default:
System.out.println("Good Choice");
System.exit(0);
start4 = false;
}


if(start4 = true) {
//ROUND PLAYERS
if(shadowknight.pv > 0 & thewizzard.pv > 0 & rizz.pv > 0 & shadowmaw.pv > 0){
	playersvsshadowmaw.mettreDgt(rizz, shadowmaw);
playersvsshadowmaw.mettreDgt(thewizzard, shadowmaw);
playersvsshadowmaw.mettreDgt(shadowknight, shadowmaw);
System.out.println("WAOW nice damage team ! He has now, "+shadowmaw.pv+" HP.");
}

Thread.sleep(2000);

//MORT BOSS
if (shadowmaw.pv <= 0) {
	playersvsshadowmaw.mortBoss();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND BOSS
if(shadowmaw.pv > 0){
	playersvsshadowmaw.degatsPris(rizz, shadowmaw);
playersvsshadowmaw.degatsPris(thewizzard, shadowmaw);
playersvsshadowmaw.degatsPris(shadowknight, shadowmaw);
System.out.println("OUCH ShadowMaw deals to you -"+shadowmaw.degats+" ! Rizz you have:"+rizz.pv+", TheWizzard you have:"+thewizzard.pv+" and ShadowKnight you have:"+shadowknight.pv+".");
}

Thread.sleep(2000);

//MORT PLAYERS
if(shadowknight.pv <= 0 & thewizzard.pv <= 0 & rizz.pv <= 0){
	playersvsshadowmaw.mortPer();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND PLAYERS
if(shadowknight.pv >= 0 & thewizzard.pv >= 0 & rizz.pv >= 0 & shadowmaw.pv >= 0){
	playersvsshadowmaw.mettreDgt(rizz, shadowmaw);
playersvsshadowmaw.mettreDgt(thewizzard, shadowmaw);
playersvsshadowmaw.mettreDgt(shadowknight, shadowmaw);
System.out.println("WAOW nice damage team ! He has now, "+shadowmaw.pv+" HP.");
}

Thread.sleep(2000);

//MORT BOSS
if (shadowmaw.pv <= 0) {
	playersvsshadowmaw.mortBoss();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND BOSS
if(shadowmaw.pv > 0){
	playersvsshadowmaw.degatsPris(rizz, shadowmaw);
playersvsshadowmaw.degatsPris(thewizzard, shadowmaw);
playersvsshadowmaw.degatsPris(shadowknight, shadowmaw);
System.out.println("OUCH ShadowMaw deals to you -"+shadowmaw.degats+" ! Rizz you have:"+rizz.pv+", TheWizzard you have:"+thewizzard.pv+" and ShadowKnight you have:"+shadowknight.pv+".");
}

Thread.sleep(2000);

//MORT PLAYERS
if(shadowknight.pv <= 0 & thewizzard.pv <= 0 & rizz.pv <= 0){
	playersvsshadowmaw.mortPer();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND PLAYERS
if(shadowknight.pv > 0 & thewizzard.pv > 0 & rizz.pv > 0 & shadowmaw.pv > 0){
	playersvsshadowmaw.mettreDgt(rizz, shadowmaw);
playersvsshadowmaw.mettreDgt(thewizzard, shadowmaw);
playersvsshadowmaw.mettreDgt(shadowknight, shadowmaw);
System.out.println("WAOW nice damage team ! He has now, "+shadowmaw.pv+" HP.");
}

Thread.sleep(2000);

//MORT BOSS
if (shadowmaw.pv <= 0) {
	playersvsshadowmaw.mortBoss();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND BOSS
if(shadowmaw.pv > 0){
	playersvsshadowmaw.degatsPris(rizz, shadowmaw);
playersvsshadowmaw.degatsPris(thewizzard, shadowmaw);
playersvsshadowmaw.degatsPris(shadowknight, shadowmaw);
System.out.println("OUCH ShadowMaw deals to you -"+shadowmaw.degats+" ! Rizz you have:"+rizz.pv+", TheWizzard you have:"+thewizzard.pv+" and ShadowKnight you have:"+shadowknight.pv+".");
}

Thread.sleep(2000);

//MORT PLAYERS
if(shadowknight.pv <= 0 & thewizzard.pv <= 0 & rizz.pv <= 0){
	playersvsshadowmaw.mortPer();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND PLAYERS
if(shadowknight.pv > 0 & thewizzard.pv > 0 & rizz.pv > 0 & shadowmaw.pv > 0){
	playersvsshadowmaw.mettreDgt(rizz, shadowmaw);
playersvsshadowmaw.mettreDgt(thewizzard, shadowmaw);
playersvsshadowmaw.mettreDgt(shadowknight, shadowmaw);
System.out.println("WAOW nice damage team ! He has now, "+shadowmaw.pv+" HP.");
}

Thread.sleep(2000);

//MORT BOSS
if (shadowmaw.pv <= 0) {
	playersvsshadowmaw.mortBoss();
}
}
}     

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND BOSS
if(shadowmaw.pv > 0){
playersvsshadowmaw.degatsPris(rizz, shadowmaw);
playersvsshadowmaw.degatsPris(thewizzard, shadowmaw);
playersvsshadowmaw.degatsPris(shadowknight, shadowmaw);
System.out.println("OUCH ShadowMaw deals to you -"+shadowmaw.degats+" ! Rizz you have:"+rizz.pv+", TheWizzard you have:"+thewizzard.pv+" and ShadowKnight you have:"+shadowknight.pv+".");
}

Thread.sleep(2000);

//MORT PLAYERS
if(shadowknight.pv <= 0 & thewizzard.pv <= 0 & rizz.pv <= 0){
playersvsshadowmaw.mortPer();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND PLAYERS
if(shadowknight.pv > 0 & thewizzard.pv > 0 & rizz.pv > 0 & shadowmaw.pv > 0){
playersvsshadowmaw.mettreDgt(rizz, shadowmaw);
playersvsshadowmaw.mettreDgt(thewizzard, shadowmaw);
playersvsshadowmaw.mettreDgt(shadowknight, shadowmaw);
System.out.println("WAOW nice damage team ! He has now, "+shadowmaw.pv+" HP.");
}

Thread.sleep(2000);

//MORT BOSS
if (shadowmaw.pv <= 0) {
playersvsshadowmaw.mortBoss();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND BOSS
if(shadowmaw.pv > 0){
playersvsshadowmaw.degatsPris(rizz, shadowmaw);
playersvsshadowmaw.degatsPris(thewizzard, shadowmaw);
playersvsshadowmaw.degatsPris(shadowknight, shadowmaw);
System.out.println("OUCH ShadowMaw deals to you -"+shadowmaw.degats+" ! Rizz you have:"+rizz.pv+", TheWizzard you have:"+thewizzard.pv+" and ShadowKnight you have:"+shadowknight.pv+".");
}

Thread.sleep(2000);

//MORT PLAYERS
if(shadowknight.pv <= 0 & thewizzard.pv <= 0 & rizz.pv <= 0){
playersvsshadowmaw.mortPer();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND PLAYERS
if(shadowknight.pv > 0 & thewizzard.pv > 0 & rizz.pv > 0 & shadowmaw.pv > 0){
playersvsshadowmaw.mettreDgt(rizz, shadowmaw);
playersvsshadowmaw.mettreDgt(thewizzard, shadowmaw);
playersvsshadowmaw.mettreDgt(shadowknight, shadowmaw);
System.out.println("WAOW nice damage team ! He has now, "+shadowmaw.pv+" HP.");
}

Thread.sleep(2000);

//MORT BOSS
if (shadowmaw.pv <= 0) {
playersvsshadowmaw.mortBoss();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND BOSS
if(shadowmaw.pv > 0){
playersvsshadowmaw.degatsPris(rizz, shadowmaw);
playersvsshadowmaw.degatsPris(thewizzard, shadowmaw);
playersvsshadowmaw.degatsPris(shadowknight, shadowmaw);
System.out.println("OUCH ShadowMaw deals to you -"+shadowmaw.degats+" ! Rizz you have:"+rizz.pv+", TheWizzard you have:"+thewizzard.pv+" and ShadowKnight you have:"+shadowknight.pv+".");
}

Thread.sleep(2000);

//MORT PLAYERS
if(shadowknight.pv <= 0 & thewizzard.pv <= 0 & rizz.pv <= 0){
playersvsshadowmaw.mortPer();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND PLAYERS
if(shadowknight.pv > 0 & thewizzard.pv > 0 & rizz.pv > 0 & shadowmaw.pv > 0){
playersvsshadowmaw.mettreDgt(rizz, shadowmaw);
playersvsshadowmaw.mettreDgt(thewizzard, shadowmaw);
playersvsshadowmaw.mettreDgt(shadowknight, shadowmaw);
System.out.println("WAOW nice damage team ! He has now, "+shadowmaw.pv+" HP.");
}

Thread.sleep(2000);

//MORT BOSS
if (shadowmaw.pv <= 0) {
playersvsshadowmaw.mortBoss();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND BOSS
if(shadowmaw.pv > 0){
playersvsshadowmaw.degatsPris(rizz, shadowmaw);
playersvsshadowmaw.degatsPris(thewizzard, shadowmaw);
playersvsshadowmaw.degatsPris(shadowknight, shadowmaw);
System.out.println("OUCH ShadowMaw deals to you -"+shadowmaw.degats+" ! Rizz you have:"+rizz.pv+", TheWizzard you have:"+thewizzard.pv+" and ShadowKnight you have:"+shadowknight.pv+".");
}

Thread.sleep(2000);

//MORT PLAYERS
if(shadowknight.pv <= 0 & thewizzard.pv <= 0 & rizz.pv <= 0){
playersvsshadowmaw.mortPer();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND PLAYERS
if(shadowknight.pv > 0 & thewizzard.pv > 0 & rizz.pv > 0 & shadowmaw.pv > 0){
playersvsshadowmaw.mettreDgt(rizz, shadowmaw);
playersvsshadowmaw.mettreDgt(thewizzard, shadowmaw);
playersvsshadowmaw.mettreDgt(shadowknight, shadowmaw);
System.out.println("WAOW nice damage team ! He has now, "+shadowmaw.pv+" HP.");
}

Thread.sleep(2000);

//MORT BOSS
if (shadowmaw.pv <= 0) {
playersvsshadowmaw.mortBoss();
}

System.out.println("OH he drops a thing, come over look, WAOW it's a Shadowsteel Longsword");

/////////////////////////////////////////////////////////FIN COMBATS VS ShadowMaw/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

System.out.println("\nVous etes low voulez-vous une potion ? (y/n)");
String heal4 = scanner.nextLine();
boolean heald = true;
switch (heal4) {
case "yes":
case "k":
case "y":
playersvsvelganos.reset(rizz);
playersvsvelganos.reset(thewizzard);
playersvsvelganos.reset(shadowknight);
break;
case "no":
case "n":
System.out.println("Ok u stay low HP !");
break;
}




/////////////////////////////////////////////////////////DEBUT COMBAT VS DreadClaw////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//ENTREE DANS SALLE
System.out.print("\nMaintenant, vous avez 1 salles disponible, plus vous monter de salles plus le niveau du boss sera dur, "
+ "\rdans quelle salle voulez vous allez ? (5)");
String dungeon_rooms5 = scanner.nextLine();
boolean chooserooms5 = true;
switch (dungeon_rooms5) {
case "1":
System.out.println("This room is not available anymore");
break;
case "2":
System.out.println("This room is not available anymore");
break;
case "3":
System.out.println("This room is not available anymore");
break;
case "4":
System.out.println("This room is not available anymore");
break;
case "5":
System.out.println("In this room you will fight "+sanctum_of_the_elements.boss.name+"");
break;
default:
System.out.println("This room doesn't exist !");
chooserooms5 = true;
break;
}

//DEBUT 1ER COMBATS

if(dungeon_rooms5.contains("5")){
System.out.print("Are u sure to start this fight versus "+sanctum_of_the_elements.boss.name+" ? (y/n)");
String fight5 = scanner.nextLine();
boolean start5 = true;
switch (fight5.toLowerCase()) {
case "y":
case "yes":
System.out.println("LET'S FIGHT !");
break;
default:
System.out.println("Good Choice");
System.exit(0);
start5 = false;
}


if(start5 = true) {
//ROUND PLAYERS
if(shadowknight.pv > 0 & thewizzard.pv > 0 & rizz.pv > 0 & dreadclaw.pv > 0){
	playersvsdreadclaw.mettreDgt(rizz, dreadclaw);
playersvsdreadclaw.mettreDgt(thewizzard, dreadclaw);
playersvsdreadclaw.mettreDgt(shadowknight, dreadclaw);
System.out.println("WAOW nice damage team ! He has now, "+dreadclaw.pv+" HP.");
}

Thread.sleep(2000);

//MORT BOSS
if (dreadclaw.pv <= 0) {
	playersvsdreadclaw.mortBoss();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND BOSS
if(dreadclaw.pv > 0){
	playersvsdreadclaw.degatsPris(rizz, dreadclaw);
playersvsdreadclaw.degatsPris(thewizzard, dreadclaw);
playersvsdreadclaw.degatsPris(shadowknight, dreadclaw);
System.out.println("OUCH DreadClaw deals to you -"+dreadclaw.degats+" ! Rizz you have:"+rizz.pv+", TheWizzard you have:"+thewizzard.pv+" and ShadowKnight you have:"+shadowknight.pv+".");
}

Thread.sleep(2000);

//MORT PLAYERS
if(shadowknight.pv <= 0 & thewizzard.pv <= 0 & rizz.pv <= 0){
	playersvsdreadclaw.mortPer();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND PLAYERS
if(shadowknight.pv >= 0 & thewizzard.pv >= 0 & rizz.pv >= 0 & dreadclaw.pv >= 0){
	playersvsdreadclaw.mettreDgt(rizz, dreadclaw);
playersvsdreadclaw.mettreDgt(thewizzard, dreadclaw);
playersvsdreadclaw.mettreDgt(shadowknight, dreadclaw);
System.out.println("WAOW nice damage team ! He has now, "+dreadclaw.pv+" HP.");
}

Thread.sleep(2000);

//MORT BOSS
if (dreadclaw.pv <= 0) {
	playersvsdreadclaw.mortBoss();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND BOSS
if(dreadclaw.pv > 0){
	playersvsdreadclaw.degatsPris(rizz, dreadclaw);
playersvsdreadclaw.degatsPris(thewizzard, dreadclaw);
playersvsdreadclaw.degatsPris(shadowknight, dreadclaw);
System.out.println("OUCH DreadClaw deals to you -"+dreadclaw.degats+" ! Rizz you have:"+rizz.pv+", TheWizzard you have:"+thewizzard.pv+" and ShadowKnight you have:"+shadowknight.pv+".");
}

Thread.sleep(2000);

//MORT PLAYERS
if(shadowknight.pv <= 0 & thewizzard.pv <= 0 & rizz.pv <= 0){
	playersvsdreadclaw.mortPer();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND PLAYERS
if(shadowknight.pv > 0 & thewizzard.pv > 0 & rizz.pv > 0 & dreadclaw.pv > 0){
	playersvsdreadclaw.mettreDgt(rizz, dreadclaw);
playersvsdreadclaw.mettreDgt(thewizzard, dreadclaw);
playersvsdreadclaw.mettreDgt(shadowknight, dreadclaw);
System.out.println("WAOW nice damage team ! He has now, "+dreadclaw.pv+" HP.");
}

Thread.sleep(2000);

//MORT BOSS
if (dreadclaw.pv <= 0) {
	playersvsdreadclaw.mortBoss();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND BOSS
if(dreadclaw.pv > 0){
	playersvsdreadclaw.degatsPris(rizz, dreadclaw);
	playersvsdreadclaw.degatsPris(thewizzard, dreadclaw);
playersvsdreadclaw.degatsPris(shadowknight, dreadclaw);
System.out.println("OUCH DreadClaw deals to you -"+dreadclaw.degats+" ! Rizz you have:"+rizz.pv+", TheWizzard you have:"+thewizzard.pv+" and ShadowKnight you have:"+shadowknight.pv+".");
}

Thread.sleep(2000);

//MORT PLAYERS
if(shadowknight.pv <= 0 & thewizzard.pv <= 0 & rizz.pv <= 0){
	playersvsdreadclaw.mortPer();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND PLAYERS
if(shadowknight.pv > 0 & thewizzard.pv > 0 & rizz.pv > 0 & dreadclaw.pv > 0){
	playersvsdreadclaw.mettreDgt(rizz, dreadclaw);
playersvsdreadclaw.mettreDgt(thewizzard, dreadclaw);
playersvsdreadclaw.mettreDgt(shadowknight, dreadclaw);
System.out.println("WAOW nice damage team ! He has now, "+dreadclaw.pv+" HP.");
}

Thread.sleep(2000);

//MORT BOSS
if (dreadclaw.pv <= 0) {
	playersvsdreadclaw.mortBoss();
}
}
}     

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND BOSS
if(dreadclaw.pv > 0){
	playersvsdreadclaw.degatsPris(rizz, dreadclaw);
playersvsdreadclaw.degatsPris(thewizzard, dreadclaw);
playersvsdreadclaw.degatsPris(shadowknight, dreadclaw);
System.out.println("OUCH DreadClaw deals to you -"+dreadclaw.degats+" ! Rizz you have:"+rizz.pv+", TheWizzard you have:"+thewizzard.pv+" and ShadowKnight you have:"+shadowknight.pv+".");
}

Thread.sleep(2000);

//MORT PLAYERS
if(shadowknight.pv <= 0 & thewizzard.pv <= 0 & rizz.pv <= 0){
	playersvsdreadclaw.mortPer();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND PLAYERS
if(shadowknight.pv > 0 & thewizzard.pv > 0 & rizz.pv > 0 & dreadclaw.pv > 0){
	playersvsdreadclaw.mettreDgt(rizz, dreadclaw);
playersvsdreadclaw.mettreDgt(thewizzard, dreadclaw);
playersvsdreadclaw.mettreDgt(shadowknight, dreadclaw);
System.out.println("WAOW nice damage team ! He has now, "+dreadclaw.pv+" HP.");
}

Thread.sleep(2000);

//MORT BOSS
if (dreadclaw.pv <= 0) {
	playersvsdreadclaw.mortBoss();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND BOSS
if(dreadclaw.pv > 0){
	playersvsdreadclaw.degatsPris(rizz, dreadclaw);
playersvsdreadclaw.degatsPris(thewizzard, dreadclaw);
playersvsdreadclaw.degatsPris(shadowknight, dreadclaw);
System.out.println("OUCH DreadClaw deals to you -"+dreadclaw.degats+" ! Rizz you have:"+rizz.pv+", TheWizzard you have:"+thewizzard.pv+" and ShadowKnight you have:"+shadowknight.pv+".");
}

Thread.sleep(2000);

//MORT PLAYERS
if(shadowknight.pv <= 0 & thewizzard.pv <= 0 & rizz.pv <= 0){
	playersvsdreadclaw.mortPer();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND PLAYERS
if(shadowknight.pv > 0 & thewizzard.pv > 0 & rizz.pv > 0 & dreadclaw.pv > 0){
	playersvsdreadclaw.mettreDgt(rizz, dreadclaw);
	playersvsdreadclaw.mettreDgt(thewizzard, dreadclaw);
playersvsdreadclaw.mettreDgt(shadowknight, dreadclaw);
System.out.println("WAOW nice damage team ! He has now, "+dreadclaw.pv+" HP.");
}

Thread.sleep(2000);

//MORT BOSS
if (dreadclaw.pv <= 0) {
	playersvsdreadclaw.mortBoss();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND BOSS
if(dreadclaw.pv > 0){
	playersvsdreadclaw.degatsPris(rizz, dreadclaw);
playersvsdreadclaw.degatsPris(thewizzard, dreadclaw);
playersvsdreadclaw.degatsPris(shadowknight, dreadclaw);
System.out.println("OUCH DreadClaw deals to you -"+dreadclaw.degats+" ! Rizz you have:"+rizz.pv+", TheWizzard you have:"+thewizzard.pv+" and ShadowKnight you have:"+shadowknight.pv+".");
}

Thread.sleep(2000);

//MORT PLAYERS
if(shadowknight.pv <= 0 & thewizzard.pv <= 0 & rizz.pv <= 0){
	playersvsdreadclaw.mortPer();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND PLAYERS
if(shadowknight.pv > 0 & thewizzard.pv > 0 & rizz.pv > 0 & dreadclaw.pv > 0){
	playersvsdreadclaw.mettreDgt(rizz, dreadclaw);
playersvsdreadclaw.mettreDgt(thewizzard, dreadclaw);
playersvsdreadclaw.mettreDgt(shadowknight, dreadclaw);
System.out.println("WAOW nice damage team ! He has now, "+dreadclaw.pv+" HP.");
}

Thread.sleep(2000);

//MORT BOSS
if (dreadclaw.pv <= 0) {
	playersvsdreadclaw.mortBoss();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND BOSS
if(dreadclaw.pv > 0){
	playersvsdreadclaw.degatsPris(rizz, dreadclaw);
playersvsdreadclaw.degatsPris(thewizzard, dreadclaw);
playersvsdreadclaw.degatsPris(shadowknight, dreadclaw);
System.out.println("OUCH DreadClaw deals to you -"+dreadclaw.degats+" ! Rizz you have:"+rizz.pv+", TheWizzard you have:"+thewizzard.pv+" and ShadowKnight you have:"+shadowknight.pv+".");
}

Thread.sleep(2000);

//MORT PLAYERS
if(shadowknight.pv <= 0 & thewizzard.pv <= 0 & rizz.pv <= 0){
	playersvsdreadclaw.mortPer();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND PLAYERS
if(shadowknight.pv > 0 & thewizzard.pv > 0 & rizz.pv > 0 & dreadclaw.pv > 0){
	playersvsdreadclaw.mettreDgt(rizz, dreadclaw);
playersvsdreadclaw.mettreDgt(thewizzard, dreadclaw);
playersvsdreadclaw.mettreDgt(shadowknight, dreadclaw);
System.out.println("WAOW nice damage team ! He has now, "+dreadclaw.pv+" HP.");
}

Thread.sleep(2000);

//MORT BOSS
if (dreadclaw.pv <= 0) {
	playersvsdreadclaw.mortBoss();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND BOSS
if(dreadclaw.pv > 0){
	playersvsdreadclaw.degatsPris(rizz, dreadclaw);
playersvsdreadclaw.degatsPris(thewizzard, dreadclaw);
playersvsdreadclaw.degatsPris(shadowknight, dreadclaw);
System.out.println("OUCH DreadClaw deals to you -"+dreadclaw.degats+" ! Rizz you have:"+rizz.pv+", TheWizzard you have:"+thewizzard.pv+" and ShadowKnight you have:"+shadowknight.pv+".");
}

Thread.sleep(2000);

//MORT PLAYERS
if(shadowknight.pv <= 0 & thewizzard.pv <= 0 & rizz.pv <= 0){
	playersvsdreadclaw.mortPer();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND PLAYERS
if(shadowknight.pv > 0 & thewizzard.pv > 0 & rizz.pv > 0 & dreadclaw.pv > 0){
	playersvsdreadclaw.mettreDgt(rizz, dreadclaw);
playersvsdreadclaw.mettreDgt(thewizzard, dreadclaw);
playersvsdreadclaw.mettreDgt(shadowknight, dreadclaw);
System.out.println("WAOW nice damage team ! He has now, "+dreadclaw.pv+" HP.");
}

Thread.sleep(2000);

//MORT BOSS
if (dreadclaw.pv <= 0) {
	playersvsdreadclaw.mortBoss();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND BOSS
if(dreadclaw.pv > 0){
	playersvsdreadclaw.degatsPris(rizz, dreadclaw);
playersvsdreadclaw.degatsPris(thewizzard, dreadclaw);
playersvsdreadclaw.degatsPris(shadowknight, dreadclaw);
System.out.println("OUCH DreadClaw deals to you -"+dreadclaw.degats+" ! Rizz you have:"+rizz.pv+", TheWizzard you have:"+thewizzard.pv+" and ShadowKnight you have:"+shadowknight.pv+".");
}

Thread.sleep(2000);

//MORT PLAYERS
if(shadowknight.pv <= 0 & thewizzard.pv <= 0 & rizz.pv <= 0){
	playersvsdreadclaw.mortPer();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND PLAYERS
if(shadowknight.pv > 0 & thewizzard.pv > 0 & rizz.pv > 0 & dreadclaw.pv > 0){
	playersvsdreadclaw.mettreDgt(rizz, dreadclaw);
playersvsdreadclaw.mettreDgt(thewizzard, dreadclaw);
playersvsdreadclaw.mettreDgt(shadowknight, dreadclaw);
System.out.println("WAOW nice damage team ! He has now, "+dreadclaw.pv+" HP.");
}

Thread.sleep(2000);

//MORT BOSS
if (dreadclaw.pv <= 0) {
	playersvsdreadclaw.mortBoss();
}
        
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND BOSS
if(dreadclaw.pv > 0){
	playersvsdreadclaw.degatsPris(rizz, dreadclaw);
playersvsdreadclaw.degatsPris(thewizzard, dreadclaw);
playersvsdreadclaw.degatsPris(shadowknight, dreadclaw);
System.out.println("OUCH DreadClaw deals to you -"+dreadclaw.degats+" ! Rizz you have:"+rizz.pv+", TheWizzard you have:"+thewizzard.pv+" and ShadowKnight you have:"+shadowknight.pv+".");
}

Thread.sleep(2000);

//MORT PLAYERS
if(shadowknight.pv <= 0 & thewizzard.pv <= 0 & rizz.pv <= 0){
	playersvsdreadclaw.mortPer();
}
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND PLAYERS
if(shadowknight.pv > 0 & thewizzard.pv > 0 & rizz.pv > 0 & dreadclaw.pv > 0){
	playersvsdreadclaw.mettreDgt(rizz, dreadclaw);
playersvsdreadclaw.mettreDgt(thewizzard, dreadclaw);
playersvsdreadclaw.mettreDgt(shadowknight, dreadclaw);
System.out.println("WAOW nice damage team ! He has now, "+dreadclaw.pv+" HP.");
}

Thread.sleep(2000);

//MORT BOSS
if (dreadclaw.pv <= 0) {
	playersvsdreadclaw.mortBoss();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND BOSS
if(dreadclaw.pv > 0){
	playersvsdreadclaw.degatsPris(rizz, dreadclaw);
playersvsdreadclaw.degatsPris(thewizzard, dreadclaw);
playersvsdreadclaw.degatsPris(shadowknight, dreadclaw);
System.out.println("OUCH DreadClaw deals to you -"+dreadclaw.degats+" ! Rizz you have:"+rizz.pv+", TheWizzard you have:"+thewizzard.pv+" and ShadowKnight you have:"+shadowknight.pv+".");
}

Thread.sleep(2000);

//MORT PLAYERS
if(shadowknight.pv <= 0 & thewizzard.pv <= 0 & rizz.pv <= 0){
	playersvsdreadclaw.mortPer();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND PLAYERS
if(shadowknight.pv > 0 & thewizzard.pv > 0 & rizz.pv > 0 & dreadclaw.pv > 0){
	playersvsdreadclaw.mettreDgt(rizz, dreadclaw);
playersvsdreadclaw.mettreDgt(thewizzard, dreadclaw);
playersvsdreadclaw.mettreDgt(shadowknight, dreadclaw);
System.out.println("WAOW nice damage team ! He has now, "+dreadclaw.pv+" HP.");
}

Thread.sleep(2000);

//MORT BOSS
if (dreadclaw.pv <= 0) {
	playersvsdreadclaw.mortBoss();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND BOSS
if(dreadclaw.pv > 0){
	playersvsdreadclaw.degatsPris(rizz, dreadclaw);
playersvsdreadclaw.degatsPris(thewizzard, dreadclaw);
playersvsdreadclaw.degatsPris(shadowknight, dreadclaw);
System.out.println("OUCH DreadClaw deals to you -"+dreadclaw.degats+" ! Rizz you have:"+rizz.pv+", TheWizzard you have:"+thewizzard.pv+" and ShadowKnight you have:"+shadowknight.pv+".");
}

Thread.sleep(2000);

//MORT PLAYERS
if(shadowknight.pv <= 0 & thewizzard.pv <= 0 & rizz.pv <= 0){
	playersvsdreadclaw.mortPer();
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//ROUND PLAYERS
if(shadowknight.pv > 0 & thewizzard.pv > 0 & rizz.pv > 0 & dreadclaw.pv > 0){
	playersvsdreadclaw.mettreDgt(rizz, dreadclaw);
playersvsdreadclaw.mettreDgt(thewizzard, dreadclaw);
playersvsdreadclaw.mettreDgt(shadowknight, dreadclaw);
System.out.println("WAOW nice damage team ! He has now, "+dreadclaw.pv+" HP.");
}

Thread.sleep(2000);

//MORT BOSS
if (dreadclaw.pv <= 0) {
playersvsdreadclaw.mortBoss();
}

System.out.println("OH he drops a thing, come over look, WAOW it's a Mystic Rune Engraved Shield");
System.out.println("WAIT");

Thread.sleep(5000);
System.out.println("\n...");
Thread.sleep(5000);

System.out.println("\nOMG U BEAT THE REALMS OF THURIA \nRUN FOREST !");
System.exit(0);
		
		
		
		
		
		
		
		
		
		
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

		 }
	}