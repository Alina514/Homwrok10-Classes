package objects;

public class Laptop {
    private String brand;
    private Integer dimension;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getDimension() {
        return dimension;
    }

    public void setDimension(Integer dimension) {
        this.dimension = dimension;
    }

    public Laptop(String brand, Integer dimension) {
        this.brand = brand;
        this.dimension = dimension;
    }
    public void displayInformation(){
        System.out.println(" brand " + brand);
        System.out.println("dimension " + dimension);
    }

    @Override
    public String toString() {
        return "My laptop is " + brand + " and it is " + dimension + "inch";
    }
}
