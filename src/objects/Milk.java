package objects;

public class Milk {
    private String animalProvider;
    private Integer fat;

    public String getAnimalProvider() {
        return animalProvider;
    }

    public void setAnimalProvider(String animalProvider) {
        this.animalProvider = animalProvider;
    }

    public Integer getFat() {
        return fat;
    }

    public void setFat(Integer fat) {
        this.fat = fat;
    }

    public Milk(String animalProvider, Integer fat) {
        this.animalProvider = animalProvider;
        this.fat = fat;
    }
    public void displayInformation(){
        System.out.println("animalProvider" + animalProvider);
        System.out.println("fat "+ fat);
    }

    @Override
    public String toString() {
        return "My milk is coming from " + animalProvider + " and has " + fat + "% fat.";
    }
}
