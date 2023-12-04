package objects;

public class School {
    private String groupAge;
    private Integer capacity;

    public School(Integer groupAge, Integer capacity) {
        this.groupAge = String.valueOf(groupAge);
        this.capacity = capacity;
    }

    public String getGroupAge() {
        return groupAge;
    }

    public void setGroupAge(Integer groupAge) {
        this.groupAge = String.valueOf(groupAge);
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
    public void displayInformation(){
        System.out.println("group age " + groupAge);
        System.out.println("capacity " + capacity);
    }

    @Override
    public String toString() {
        return "My school starts with children from age  " + groupAge + " years and got a capacity of " + capacity  + " classes";
    }
}
