package objects;

public class Guitar {
    private String type;
    private Integer price;

    public Guitar(String type, Integer price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void displayInformation(){
        System.out.println("type: " + type);
        System.out.println("price: " + price);
    }

    @Override
    public String toString() {
        return "My guitar is " + type + " and cost " + price + " ron";
    }
}
