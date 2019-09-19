import java.util.ArrayList;

import apple.laf.JRSUIConstants.Animating;

public class Zookeeper 
{
    public static void DayAtZoo(ArrayList<Animal> Animals)
    {
        WakeAnimals(Animals);
        RollCall(Animals);
        FeedAnimals(Animals);
        ExerciseAnimals(Animals);
        CloseZoo(Animals);
    }

    public static void WakeAnimals(ArrayList<Animal> Animals)
    {
        System.out.println("Waking Up Animals");
        for (Animal var : Animals) 
        {
            var.wakeup()
        }
    }
    public static void RollCall(ArrayList<Animal> Animals)
    {
        System.out.println("Roll Calling Animals");
        for (Animal var : Animals) 
        {
            var.makeNoise()
        }
    }

    public static void FeedAnimals(ArrayList<Animal> Animals)
    {
        System.out.println("Feeding Animals");
        for (Animal var : Animals) 
        {
            var.eat()
        }
    } 

    public static void ExerciseAnimals(ArrayList<Animal> Animals)
    {
        System.out.println("Exercising Animals");
        for (Animal var : Animals) 
        {
            var.roam()
        }
    }
    public static void CloseZoo(ArrayList<Animal> Animals) 
    {
        System.out.println("Closing Zoo");
        for (Animal var : Animals) 
        {
            var.sleep()
        }
    }
}

//This is the zoo class 
public class Zoo {
    public static void main(String[] args) {
        //This is where all of the testing is going to go
        CreateAnimals();
        DayAtZoo(Animals);
        
    }
    //Put the list in here instead of in main
    public ArrayList<Animal> Animals = new ArrayList<>();
    
    //Adding an animal 
    public void CreateAnimals() 
    {
        Lion Larry = new Lion();
        Larry.Name = "Larry the Lion";    
    }

    


}
