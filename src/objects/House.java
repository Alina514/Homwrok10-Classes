package objects;

public class House {
    private String colour;
    private Integer rooms;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Integer getRooms() {
        return rooms;
    }

    public void setRooms(Integer rooms) {
        this.rooms = rooms;
    }

    public House(String colour, Integer rooms) {
        this.colour = colour;
        this.rooms = rooms;
    }
    public void displayInformation(){
        System.out.println("colour" + colour);
        System.out.println("rooms" + rooms);
    }
    public String toString(){
        return "My house is " + colour + " and has " + rooms + " rooms";
    }
}
