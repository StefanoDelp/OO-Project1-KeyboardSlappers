import java.util.*;

public class Zoo {
    //Put the list in here instead of in main
    ArrayList<Animal> Animals = new ArrayList<>();
    
    //Adding an animal 
    public void add(Animal x) {
        Animals.add(x);
    }
    public void rollCall() {
        for(Animal var : Animals) {
            System.out.println(makeNoise());
        }
    }
}