package objects;

public class Classroom {
    private Integer capacity;
    private String discipline;

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public Classroom(Integer capacity, String discipline) {
        this.capacity = capacity;
        this.discipline = discipline;
    }
    public void displayInformation(){
        System.out.println("capacity: " + capacity);
        System.out.println("discipline: " + discipline);
    }

    @Override
    public String toString() {
        return "This classroom has a capacity of " + capacity + " places. The children are learning " + discipline;
    }
}
