package objects;

public class Bike {
    private String type;
    private String brand;

    public Bike(String type, String brand) {
        this.type = type;
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void displayInformation() {
        System.out.println("Type: " + type);
        System.out.println("Brand: " + brand);
    }
    public String toString() {
        return "Bike: type:" + type + "brand" + brand;
    }
}
