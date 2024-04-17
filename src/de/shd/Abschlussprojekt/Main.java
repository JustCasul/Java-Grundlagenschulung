//package de.shd.Abschlussprojekt;
//
//
//import java.util.Scanner;
//
//public class Main {
//
//    /**
//        In diesem Textadventure spielt man Amanda Ripley aus Alien Isolation welche mal wieder auf einem Raumschiff festsitzt welches kurz davor ist zu explodieren,
//        deine Aufgabe ist es die Schlüsselkarte für die Extraktionssonde zu finden und heil von dem Raumschiff zu entkommen bevor das Raumschiff in die Luft geht,
//        aber das wird nicht so einfach weil du die anwesenheit von etwas anderem auf dem Raumschiff spürst, was das wohl ist? hoffentlich nichts tödliches...
//
//        Du hast 1,5 Minuten um die Schlüsselkarte zu finden und von dem raumschiff zu entkommen bevor es in die Luft geht
//
//        Spielkarte:
//
//            ______1___________2___________3___________4___________5______
//        A   |   Start   |   Weg     |   Weg     |   null    |   Ziel    |
//            -------------------------------------------------------------
//        B   |   null    |   null    |   Weg     |   Weg     |   Weg     |
//            -------------------------------------------------------------
//        C   |   null    |   null    |   null    |   Weg     |   null    |
//            -------------------------------------------------------------
//        D   |   null    |   null    |   Weg     |   Weg     |   Weg     |
//            -------------------------------------------------------------
//        E   |   Card*   |   Weg    |   Weg     |   null    |   Trap*   |
//            _____________________________________________________________
//            Card* = Schlüsselkarte (Questgegenstand)
//            Trap* = Falle für den Spieler
//    **/
//
//
//    //Räume deklarieren
//    private static Room space;
//    private static Room start;
//    private static Room hallwayA1A3;
//    private static Room lEngineRoom;
//    private static Room ziel;
//    private static Room hallwayA3B4;
//    private static Room cafeteria;
//    private static Room hallwayA5B4;
//    private static Room cockpit;
//    private static Room hallwayD4E3;
//    private static Room admin;
//    private static Room hallwayD4E5;
//    private static Room storage;
//    private static Room hallwayE1E3;
//    private static Room rEngineRoom;
//    private static Room trap;
//
//    //Character deklarieren
//    private static Character character;
//
//    //Waffe Deklarieren
//    private static Weapon stungun;
//
//    //Item deklarieren
//    private static Item map;
//    private static Item stungunAmmo;
//
//    //aktueller Raum
//    static Room currentRoom;
//
//    //aktuelles Item des Spielers
//    static Item currentItem;
//
//    //Scanner
//    static Scanner searchRoomScannerYN;
//    static Scanner introInputScanner;
//
//    public static void main(String[] args) {
//
//
//
//        if (saveFileExist){
//            //Save laden
//        } else {
//            initialisierung();
//            intro(); //Spiel normal Starten
//        }
//
//
//    }
//
//    public static void initialisierung(){
//
//        //Räume init
//        space = new Room ("none", "Space",  null, null, null, null, "You cant leave the ship, you dont have a spacesuit.", null, false, false ,false);
//        start = new Room("A1", "Medical Bay",space, space, hallwayA1A3 , space, "You are in Med Bay and need to get to the ", null, false, false ,false);
//        hallwayA1A3 = new Room("A2", "HallwayA1-A3", space, space, lEngineRoom, start, "This is the left engine room", null, false, false ,false);
//        lEngineRoom = new Room("A3", "Left Engine Room", space, hallwayA3B4, space, hallwayA1A3, "", null, false, false ,false);
//        ziel = new Room("A5", "Extraction Pod", space, hallwayA5B4, space, space, "", null, false, false ,false);
//        hallwayA3B4 = new Room("B3", "HallwayA3-B4", lEngineRoom, space, cafeteria, space, "", null, false, false ,false);
//        cafeteria = new Room("B4", "Cafeteria", space, cockpit, hallwayA5B4, hallwayA3B4, "", null, false, false ,false);
//        hallwayA5B4 = new Room("B5", "HallwayA5-B4", ziel, space, space, cafeteria, "", null, false, false ,false);
//        cockpit = new Room("C4", "Cockpit", cafeteria, admin, space, space, "", null, false, false ,false);
//        hallwayD4E3 = new Room("D3", "HallwayD4-E3", space, rEngineRoom, admin, space, "", null, false, false ,false);
//        admin = new Room("D4", "Admin", cockpit, space, hallwayD4E5, hallwayD4E3, "", null, false, false ,false);
//        hallwayD4E5 = new Room("D5", "HallwayD4-E5",space, trap, space, admin, "", null, false, false ,false);
//        storage = new Room("E1", "Storage", space, space, hallwayE1E3, space, "", null, false, false ,false);
//        hallwayE1E3 = new Room("E2", "HallwayE1-E3", space, space, storage, rEngineRoom, "", null, false, false ,false);
//        rEngineRoom = new Room("E3", "Right Engine Room", hallwayD4E3, space, space, hallwayE1E3, "", null, false, false ,false);
//        trap = new Room("E5", "Trap", hallwayD4E5, space, space, space, "", null,false, false ,false);
//
//        currentRoom = start;
//
//        //Character init
//        character = new Character("Amanda Ripley", 3, null, null);
//
//        //Waffe init
//        stungun = new Weapon("Stungun", 1);
//
//        //Item init
//        map = new Item("Map", """
//
//                        -------------------------------------           -------------
//                        |   Medbay  |  Hallway  |Left Engine|           |Extract Pod|
//                        -------------------------------------------------------------
//                                                |  Hallway  | Cafeteria |  Hallway  |
//                                                -------------------------------------
//                                                            |   Cockpit |
//                                                -------------------------------------
//                                                |  Hallway  |   Admin   |  Hallway  |
//                        -------------------------------------------------------------
//                        |  Storage  |  Hallway  |RightEngine|           |Extract Pod|
//                        -------------------------------------           -------------
//
//                """);
//        stungunAmmo = new Item("Stungun Munition", "");
//
//        //Booleans setzen
//        if (currentRoom.getItem() == null) {
//            currentRoom.setHasItem(false);
//        } else {
//            currentRoom.setHasItem(true);
//        }
//
//        //Timer starten
//        ExplosionTimer explosionTimer = new ExplosionTimer();
//        explosionTimer.timerInit(90000);
//    }
//
//    public static void status(){
//        System.out.println("Name: " + character.getName());
//        System.out.println("Lifepoints: " + character.getLifepoints() + "/3");
//        if (character.getWeapon().equals(stungun)){
//            System.out.println("Stungun Ammo: " + stungun.getAmmunition() + "/1");
//        }
//        if (character.getItem() == null){
//        } else {
//            System.out.println("Current Item: " + character.getItem());
//        }
//        System.out.println("Current Room: " + currentRoom.getRoomName());
//        System.out.println("Status: " + currentRoom.getRoomDescription());
//
//    }
//
//    public static void start(){
//        status();
//
//
//    }
//
//    //Intro/Tutorial
//    public static void intro(){
//        //start/load input
//        introInputScanner = new Scanner(System.in);
//
//        //gibt es ein Save-File?
//        boolean saveFileExist;
//
//        System.out.println( "This is a Textadventure so you have to type in the console what you want to do, your options are: 'north' 'east' 'west' " +
//                            "'south' for movement and additionally you can search a room by typing 'search' and use an item by typing 'item'.");
//        System.out.println( "You are " + character.getName() + " and are on a spaceship that is about to blow up and need o get out of here asap, " +
//                            "your objective is to find the keycard and get to an extraction pod safely before the ship blow up, but you might not " +
//                            "be alone on this ship so watch out.");
//        System.out.println("Do you want to Start a new game or load a savefile? (type: 'start', 'load')");
//        String introInputScannerAnswer = introInputScanner.next();
//        if (introInputScannerAnswer.equalsIgnoreCase("start")){
//
//        } else if (introInputScannerAnswer.equalsIgnoreCase("load") {
//            if (saveFileExist == true){
//                //Load Savefile
//            }else {
//                System.out.println("No savefile to load found");
//            }
//
//        }else {
//            System.out.println("Thats not a possible input");
//        }
//
//
//    }
//
//    public static void searchRoom(){
//        searchRoomScannerYN = new Scanner(System.in);
//
//
//        if (currentRoom.isSearched() && currentRoom.isHasItem()){
//            System.out.println("Youve seen everything already, heres nothing more to find.");
//        } else if (currentRoom.isSearched() && !currentRoom.isHasItem()) {
//            System.out.println("You already searched the room, do you want to take the item with you? (y/n)");
//            String searchRoomScannerAnswer = searchRoomScannerYN.next(); //Scanner y/n?
//            if (searchRoomScannerAnswer.equalsIgnoreCase("y")){
//                if (character.getItem() == null) {
//                    System.out.println("You take the " + currentRoom.getItem() + ".");
//
//                    //Character bekommt Item
//                    character.setItem(currentRoom.getItem());
//
//                    //Room verliert Item
//                    currentRoom.setItem(null);
//                    currentRoom.setHasItem(false);
//                }else {
//                    System.out.println("You switch your current Item for " + currentRoom.getItem() + ".");
//                    currentItem = character.getItem();
//                    //Character bekommt Item
//                    character.setItem(currentRoom.getItem());
//                    //Room bekommt Item
//                    currentRoom.setItem(currentItem);
//                }
//            } else if (searchRoomScannerAnswer.equalsIgnoreCase("n")) {
//                System.out.println("You dont take the Item, what now?");
//            }
//
//        } else if (!currentRoom.isSearched() && !currentRoom.isHasItem()) {
//            System.out.println("You searched the Room and found " + currentRoom.getItem() + ", do you want to take it with you?");
//            currentRoom.setSearched(true);
//            String searchRoomScannerAnswer = searchRoomScannerYN.next(); //Scanner y/n?
//            if (searchRoomScannerAnswer.equalsIgnoreCase("y")) {
//                if (currentRoom.getItem() == stungunAmmo) {
//                    stungun.setAmmunition(stungun.getAmmunition() + 1);
//
//                } else {
//                    if (character.getItem() == null) {
//                        System.out.println("You take the " + currentRoom.getItem() + ".");
//
//                        //Character bekommt Item
//                        character.setItem(currentRoom.getItem());
//
//                        //Room verliert Item
//                        currentRoom.setItem(null);
//                        currentRoom.setHasItem(false);
//                    } else {
//                        System.out.println("You switch your current Item for " + currentRoom.getItem() + ".");
//                        currentItem = character.getItem();
//                        //Character bekommt Item
//                        character.setItem(currentRoom.getItem());
//                        //Room bekommt Item
//                        currentRoom.setItem(currentItem);
//                    }
//                }
//            }
//        }else {
//            System.out.println("***Error: unlogical exception***");
//        }
//
//
//    }
//
//
//}
