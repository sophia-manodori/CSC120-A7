import java.util.ArrayList;

public class CampusMap {

    ArrayList<Building> buildings;

    /* Default constructor, initializes empty ArrayList */
    public CampusMap() {
        buildings = new ArrayList<Building>();
    }

    /**
     * Adds a Building to the map
     * @param b the Building to add
     */
    public void addBuilding(Building b) {
        if(!this.buildings.contains(b)) {
            System.out.println("Adding building...");
            buildings.add(b);
            System.out.println("-->Successfully added " + b.getName() + " to the map.");
        }
        else{
            throw new RuntimeException("Building is already on the map");
        }
    }

    /**
     * Removes a Building from the map
     * @param b the Building to remove
     * @return the removed Building
     */
    public Building removeBuilding(Building b) {
        if(this.buildings.contains(b)){
            System.out.println("Removing building...");
            buildings.remove(b);
            System.out.println("-->Successfully removed " + b.getName() + " to the map.");
        }
        else{
            throw new RuntimeException("Building is not on map");
        }
        return b;
    }

    public String toString() {
        String mapString = "DIRECTORY of BUILDINGS";

        for (int i = 0; i < this.buildings.size(); i ++) {
            mapString += "\n  " + (i+1) + ". "+ this.buildings.get(i).getName() + " (" + this.buildings.get(i).getAddress() + ")";
        }
        return mapString;
    }

    public static void main(String[] args) {
        CampusMap myMap = new CampusMap();
        myMap.addBuilding(new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4));
        myMap.addBuilding(new House("King", "180 Elm Street", 3, true, true));
        myMap.addBuilding(new House("Scales", "170 Elm Street", 3, true, true));
        myMap.addBuilding(new House("Cushing", "Paradise Street", 3, true, true));
        myMap.addBuilding(new House("Morris", "Green Street", 3));
        myMap.addBuilding(new House("Lamont", "Not exactly sure", 3, true, true));
        myMap.addBuilding(new Library("Neilson", true, "Smith College", 4));
        myMap.addBuilding(new Cafe("Compass Cafe", "Neilson Library", 2));
        myMap.addBuilding(new Cafe("Campus Center Cafe", "Campus Center", 1));
        myMap.addBuilding(new Building("Burton", true, "Smith College", 4));
        myMap.addBuilding(new Building("Sealey", true, "Smith College", 3));

        System.out.println(myMap);
    }
    
}
