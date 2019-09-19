public class Main {
    public void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.add(new Dog());
        zoo.makeNoise();
    }
}

public class Zoo {
    //Put the list in here instead of in main
    ArrayList<Animal> Animals = new ArrayList<>();
    
    //Adding an animal 
    public void add(Animal x) {
        Animals.add(x);
    }
}