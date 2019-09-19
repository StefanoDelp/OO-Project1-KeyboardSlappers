import java.util.ArrayList;

import apple.laf.JRSUIConstants.Animating;

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
    String roam();
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

    public void


}
