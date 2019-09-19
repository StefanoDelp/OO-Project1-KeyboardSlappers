import java.util.*;


public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Dog x = new Dog();
        x.setName("Dummy the Dog");
        zoo.add(x);
        Animal y = new Dog(); //Poly morphism
        zoo.add(y);
        y.setName("Stupid the Dog");
        zoo.rollCall();

    }
}