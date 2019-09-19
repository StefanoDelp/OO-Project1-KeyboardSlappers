import java.util.*;


public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Dog x = new Dog();
        x.setName("Dummy the Dog");
        zoo.add(x);
        zoo.rollCall();
    }
}