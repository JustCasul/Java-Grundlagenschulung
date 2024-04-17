package de.shd.Abschlussprojekt;

public class Room {

    //ATTRIBUTE
    private final String roomNumber; //Nummer des Raums
    private final String roomName; //Name des Raums
    private final Room directionNorth; //Nördlicher Raum
    private final Room directionSouth; //Südlicher Raum
    private final Room directionEast; //Östlicher Raum
    private final Room directionWest; //Westlicher Raum
    private final String roomDescription; //Text welcher bei betreten des raums ausgegeben wird (beschreibt Szenerie/Geschehen)
    private Item item; //Item was in dem Raum liegt
    private boolean searched; //Status ob Raum schon durchsucht wurde
    private boolean hasItem; //Status ob das schon gelootet wurde oder nicht
    private boolean visited; //Status ob der Raum schonmal betreten wurde


    //KONSTRUKTOR
    public Room(String roomNumber, String roomName, Room directionNorth, Room directionSouth, Room directionEast, Room directionWest, String roomDescription , Item item, boolean searched, boolean itemAlreadyLooted, boolean visited) {
        this.roomNumber = roomNumber;
        this.directionNorth = directionNorth;
        this.directionSouth = directionSouth;
        this.directionEast = directionEast;
        this.directionWest = directionWest;
        this.roomDescription = roomDescription;
        this.roomName = roomName;
        this.item = item;
        this.searched = searched;
        this.hasItem = itemAlreadyLooted;
        this.visited = visited;
    }


    //METHODEN
    public String getRoomNumber() {
        return roomNumber;
    }

    public String getRoomName() {
        return roomName;
    }

    public Room getDirectionNorth() {
        return directionNorth;
    }

    public Room getDirectionSouth() {
        return directionSouth;
    }

    public Room getDirectionEast() {
        return directionEast;
    }

    public Room getDirectionWest() {
        return directionWest;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public boolean isSearched() {
        return searched;
    }

    public void setSearched(boolean searched) {
        this.searched = searched;
    }

    public boolean isHasItem() {
        return hasItem;
    }

    public void setHasItem(boolean hasItem) {
        this.hasItem = hasItem;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
}