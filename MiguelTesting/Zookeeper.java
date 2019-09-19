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

    public void rollCall(){
        for(Animal yourTurn: Animals) {
            System.out.println(yourTurn.getName() + "in the zoo says ");
            yourTurn.makeNoise();
        }
    }
}

public class Feline implements Animal {
    public void roam() {
        System.out.println("I a Feline, walked.");
    }
}

public class Pachyderm implements Animal {
    public void roam() {
        System.out.println("I a Pachyderm, walked.");
    }
}

public class Canine implements Animal {
    public void roam() {
        System.out.println("I a Canine, walked.");
    }
}

public class Hippo extends Pachyderm implements Animal {
    public String getNoise() {
        return "Muah";
    }
}

public class Rhino extends Pachyderm implements Animal {
    public String getNoise() {
        return "Hufff";
    }
}

public class Elephant extends Pachyderm implements Animal {
    public String getNoise() {
        return "Toot";
    }
}

public class Tiger extends Feline implements Animal {
    public String getNoise() {
        return "Rowl";
    }
}

public class Lion extends Feline implements Animal {
    public String getNoise() {
        return "Roar";
    }
}

public class Cat extends Feline implements Animal {
    public String getNoise() {
        return "Meow";
    }
}

public class Wolf extends Canine implements Animal {
    public String getNoise() {
        return "Howl";
    }
}

public class Dog extends Canine implements Animal {
    public String getNoise() {
        return "Woof";
    }
}