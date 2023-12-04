package objects;

public class Animal {
    private String type;
    private Integer howManyLegs;

    public Animal(String type, Integer howManyLegs) {
        this.type = type;
        this.howManyLegs = howManyLegs;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getHowManyLegs() {
        return howManyLegs;
    }

    public void setHowManyLegs(Integer howManyLegs) {
        this.howManyLegs = howManyLegs;
    }
    public void displayInformation() {
        System.out.println("Type: " + type);
        System.out.println("Numbers of legs: " + howManyLegs);
    }
    public String toString() {
        return "This animal is " + type + "  and has " + howManyLegs +  " legs";
    }
}
