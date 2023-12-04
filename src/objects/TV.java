package objects;

public class TV {
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

    public TV(String brand, Integer dimension) {
        this.brand = brand;
        this.dimension = dimension;
    }
    public void displayInformation(){
        System.out.println("brand " + brand);
        System.out.println("dimension" + dimension);
    }

    @Override
    public String toString() {
        return "This TV is " + brand + " and has " + dimension + " inch.";
    }
}
