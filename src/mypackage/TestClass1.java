package mypackage;

public class TestClass1 {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.name = "Baron";

        dog.color = "Cream";

        dog.walk("Yard");

        dog.feed("Meat");
        dog.sit();
        dog.lay();


        System.out.println("Cat color is: " + dog.color);
        System.out.println("Dog name is: " + dog.name);

    }

}