package objects;

public class Pool {
    private Integer dimension;
    private Integer length;

    public Pool(Integer dimension, Integer length) {
        this.dimension = dimension;
        this.length = length;

    }

    public Integer getDimension() {
        return dimension;
    }

    public void setDimension(Integer dimension) {
        this.dimension = dimension;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }
    public void displayInformation(){
        System.out.println("dimension: " + dimension);
        System.out.println("length: " + length);
    }

    @Override
    public String toString() {
        return "This pool has " + dimension + "meters width and " + length + " meters -length";
    }
}
