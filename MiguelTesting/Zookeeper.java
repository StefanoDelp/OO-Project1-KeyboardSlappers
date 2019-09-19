import java.util.*;

public class Zookeeper {
    //Put the list in here instead of in main
    ArrayList<Animal> Animals = new ArrayList<>();
    
    //Adding an animal 
    public void add(Animal x) {
        Animals.add(x);
    }
    public void rollCall() {
        for(Animal var : Animals) {
            System.out.println(var.makeNoise());
        }
    }
    public void wakeUp() {
        for(Animal var : Animals) {
            System.out.println(var.wakeUp());
        }
    }
    public void roam() {
        for(Animal var : Animals) {
            System.out.println(var.roam());
        }
    }
    public void eat() {
        for(Animal var : Animals) {
            System.out.println(var.eat());
        }
    }
}