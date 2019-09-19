import java.util.*;


public class Zoo {
    public static void main(String[] args) {
        Zookeeper zoo = new Zookeeper();
        Dog x = new Dog();
        Animal y = new Dog(); //Poly morphism
        Wolf a = new Wolf();
        Animal b = new Wolf();
        a.setName("Willy the Wolf");
        b.setName("Willard the Wolf");
        x.setName("Dummy the Dog");
        y.setName("Stupid the Dog");
        zoo.add(x);
        zoo.add(y);
        zoo.add(a);
        zoo.add(b);
        zoo.wakeUp();
        zoo.rollCall();
        zoo.roam();
        zoo.eat();
        zoo.sleep();
    }
}