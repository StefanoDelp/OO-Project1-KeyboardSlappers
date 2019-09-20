import java.util.*;

public abstract class Feline implements Animal {

    public String makeNoise() {
        if(Response() == 1) {
            return ("Feline woofed.");
        }
        else {
            return ("Feline did not woof.");
        }
    }
    public int Response() {
        Random n = new Random();
        int y = n.nextInt(2);
        //System.out.println(y);
        return y;
    }
    public String roam() {
        if (Response() == 1) {
            //awake = true;
            return ("Feline roamed.");
        }
        else {
            //awake = false;
            return ("Feline did not roam.");
        }
    }
    public String eat() {
        if(Response() == 1) {
            return ("Feline ate.");
        }
        else {
            return ("Feline did not want to eat.");
        }
    }
    public String sleep() {
        if(Response() == 1) {
            return ("Feline is sleeping.");
        }
        else {
            return ("Feline did not want to sleep.");
        }
    }
    public String wakeUp() {
        if(Response() == 1) {
            return ("Feline is awake.");
        }
        else {
            return ("Feline did not want to wake up.");
        }
    }
}