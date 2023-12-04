import objects.*;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Mihai", 33);
        System.out.println(person1);
        Person person2 = new Person("Andrei", 55);
        System.out.println(person2);

        Animal animal1 = new Animal("salbatic", 4);
        System.out.println(animal1);
        Animal animal2 = new Animal("domestic", 4);
        System.out.println(animal2);

        Bike bike = new Bike("MountainBike",  "Pegasus");
        System.out.println(bike);

        Car car = new Car("BMW", 4);
        System.out.println(car);

        House house = new House("white", 5);
        System.out.println(house);

        Desk desk = new Desk("brown", "wood");
        System.out.println(desk);

        Pen pen = new Pen("blue", "10 centimeters");
        System.out.println(pen);

        Guitar guitar = new Guitar("acustic", 1400);
        System.out.println(guitar);

        Door door = new Door("black", "outside");
        System.out.println(door);

        Chair chair = new Chair(4, "kitchen");
        System.out.println(chair);

        School school = new School(5, 26);
        System.out.println(school);

        Window window = new Window("glass", 3);
        System.out.println(window);

        Pool pool= new Pool(20, 5);
        System.out.println(pool);

        Classroom classroom = new Classroom(25, "math");
        System.out.println(classroom);

        Telephone telephone = new Telephone("Apple", 250);
        System.out.println(telephone);

        Laptop laptop = new Laptop("Asus", 15);
        System.out.println(laptop);

        Book book = new Book("Paulo Coelho", 500);
        System.out.println(book);

        Coffe coffe = new Coffe("Brasil", "decaffeinated");
        System.out.println(coffe);

        Milk milk = new Milk("cow",10);
        System.out.println(milk);

        TV tv = new TV("Philips", 80);
        System.out.println(tv);
    }
}
