import java.util.*;

public class Zookeeper {
    public static void main(String[] args) {
        //This is where all of the testing is going to go
    }
}

//This has all the common methods
interface Animal {
    boolean wakeup();
    String makeNoise();
    String eat();
    void roam();
    boolean sleep();
}

//This is the zoo class 
class Zoo {
    //Put the list in here instead of in main
    ArrayList<Animal> Animals = new ArrayList<>();
    
    //Adding an animal 
    public void add(Animal x) {
        Animals.add(x);
    }
    public void rollCall() {
        System.out.println("\nNow rollcalling\n");
        for(Animal var : Animals) {
            System.out.println(var.makeNoise());
        }
    }
    public void wakeUp() {
        System.out.println("\nNow waking up.\n");
        for(Animal var : Animals) {
            System.out.println(var.wakeUp());
        }
    }
    public void roam() {
        System.out.println("\nNow roaming.\n");
        for(Animal var : Animals) {
            System.out.println(var.roam());
        }
    }
    public void eat() {
        System.out.println("\nNow eating.\n");
        for(Animal var : Animals) {
            System.out.println(var.eat());
        }
    }
    public void sleep() {
        System.out.println("\nNow sleeping\n");
        for(Animal var : Animals) {
            System.out.println(var.sleep());
        }
    }
}