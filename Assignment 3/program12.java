// Building class
class Building {
    private int floors;
    private int rooms;
    private double footage;

    public Building(int floors, int rooms, double footage) {
        this.floors = floors;
        this.rooms = rooms;
        this.footage = footage;
    }

    public int getFloors() {
        return floors;
    }

    public int getRooms() {
        return rooms;
    }

    public double getFootage() {
        return footage;
    }
}

// House class (derived from Building)
class House extends Building {
    private int bedrooms;
    private int bathrooms;

    public House(int floors, int rooms, double footage, int bedrooms, int bathrooms) {
        super(floors, rooms, footage);
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }
}

// Office class (derived from Building)
class Office extends Building {
    private int telephones;
    private int tables;

    public Office(int floors, int rooms, double footage, int telephones, int tables) {
        super(floors, rooms, footage);
        this.telephones = telephones;
        this.tables = tables;
    }

    public int getTelephones() {
        return telephones;
    }

    public int getTables() {
        return tables;
    }
}

// Demonstration of the classes
public class program12 {
    public static void main(String[] args) {

        // Create a building
        Building building = new Building(5, 20, 5000.0);
        System.out.println("Building - Floors: " + building.getFloors() +
                ", Rooms: " + building.getRooms() +
                ", Footage: " + building.getFootage());

        // Create a house
        House house = new House(2, 6, 2000.0, 3, 2);
        System.out.println("House - Floors: " + house.getFloors() +
                ", Rooms: " + house.getRooms() +
                ", Footage: " + house.getFootage() +
                ", Bedrooms: " + house.getBedrooms() +
                ", Bathrooms: " + house.getBathrooms());

        // Create an office
        Office office = new Office(10, 50, 10000.0, 50, 100);
        System.out.println("Office - Floors: " + office.getFloors() +
                ", Rooms: " + office.getRooms() +
                ", Footage: " + office.getFootage() +
                ", Telephones: " + office.getTelephones() +
                ", Tables: " + office.getTables());
    }
}
