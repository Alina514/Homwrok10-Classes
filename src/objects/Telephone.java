package objects;

public class Telephone {
    private String brand;
    private Integer memory;

    public Telephone(String brand, Integer memory) {
        this.brand = brand;
        this.memory = memory;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }
    public void displayInformation(){
        System.out.println("brand: " + brand);
        System.out.println("memory " + memory);
    }

    @Override
    public String toString() {
        return "This telephone is " + brand + " and has a memory of " + memory + " gb ";
    }
}
