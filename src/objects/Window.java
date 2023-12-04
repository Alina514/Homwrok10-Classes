package objects;

public class Window {
    private String material;
    private Integer dimension;

    public Window(String material, Integer dimension) {
        this.material = material;
        this.dimension = dimension;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Integer getDimension() {
        return dimension;
    }

    public void setDimension(Integer dimension) {
        this.dimension = dimension;
    }
    public void displayInformation(){
        System.out.println("material " + material);
        System.out.println("dimension " + dimension);
    }

    @Override
    public String toString() {
        return "My window is made by " + material + " and has a dimension of " + dimension + " meters";
    }
}
