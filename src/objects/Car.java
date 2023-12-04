package objects;

public class Car {
    private String brand;
    private Integer Wheels;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getWheels() {
        return Wheels;
    }

    public void setWheels(Integer wheels) {
        Wheels = wheels;
    }

    public Car(String brand, Integer wheels) {
        this.brand = brand;
        this.Wheels = wheels;

    }
    public void displayInformation(){
        System.out.println("Brand:" + brand);
        System.out.println("Wheels:" + Wheels);
    }
    public String toString(){
        return "My car's brand is:"  +  brand +  " and it got " +  Wheels  + " wheels";
    }
}

