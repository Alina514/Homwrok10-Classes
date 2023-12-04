package objects;

public class Door {
    private String colour;
    private String type;

    public Door(String colour, String type) {
        this.colour = colour;
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void displayInformation(){
        System.out.println("colour " + colour);
        System.out.println("type " + type);
    }

    @Override
    public String toString() {
        return "My door is " + colour + " and it is used for " + type + " spaces ";
    }
}
