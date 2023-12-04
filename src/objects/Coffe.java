package objects;

public class Coffe {
    private String origin;
    private String type;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Coffe(String origin, String type) {
        this.origin = origin;
        this.type = type;
    }
    public void displayInformation(){
        System.out.println("origin " + origin);
        System.out.println("type " + type);
    }

    @Override
    public String toString() {
        return "The coffe is made in " + origin + " and it is a " + type + " coffe.";
    }
}
