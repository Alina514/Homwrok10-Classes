package objects;

public class Chair {
    private Integer howManyLegs;
    private String type;

    public Chair(Integer howManyLegs, String type) {
        this.howManyLegs = howManyLegs;
        this.type = type;
    }

    public Integer getHowManyLegs() {
        return howManyLegs;
    }

    public void setHowManyLegs(Integer howManyLegs) {
        this.howManyLegs = howManyLegs;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void displayInformation(){
        System.out.println("howManyLegs " + howManyLegs);
        System.out.println("Type "  + type);
    }

    @Override
    public String toString() {
        return "My chair has " + howManyLegs + " legs and it is a " + type + " chair";
    }
}
