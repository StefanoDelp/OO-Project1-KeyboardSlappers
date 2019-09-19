import java.util.*;


public class Zoo {
    public static void main(String[] args) {
        Zookeeper zoo = new Zookeeper();
        Dog x = new Dog();
        x.setName("Dummy the Dog");
        zoo.add(x);
        Animal y = new Dog(); //Poly morphism
        zoo.add(y);
        y.setName("Stupid the Dog");
        zoo.wakeUp();
        zoo.rollCall();
        zoo.roam();
        zoo.eat();
        zoo.sleep();
    }
}