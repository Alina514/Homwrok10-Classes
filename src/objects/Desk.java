package objects;

public class Desk {
    private String colour;
    private String material;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Desk(String colour, String material) {
        this.colour = colour;
        this.material = material;
    }
    public void displayInformation(){
        System.out.println("colour " + colour );
        System.out.println("material " + material);
    }
    public String toString(){
        return "My desk is " + colour + " and is made by " + material;
    }
}
