package objects;

public class Pen {
    private String type;
    private String dimension;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public Pen(String type, String dimension) {
        this.type = type;
        this.dimension = dimension;
    }
    public void displayInformation(){
        System.out.println("type: " + type);
        System.out.println("dimension: " + dimension);
    }
    public String toString(){
        return "My pen is " + type + " colour" + " and has " + dimension;
    }
}
