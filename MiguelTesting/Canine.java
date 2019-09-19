import java.util.*;

public abstract class Canine implements Animal {

    public String makeNoise() {
        if(Response() == 1) {
            return ("Canine woofed.");
        }
        else {
            return ("Canine did not woof.");
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
            return ("Canine roamed.");
        }
        else {
            //awake = false;
            return ("Canine did not roam.");
        }
    }
    public String eat() {
        if(Response() == 1) {
            return ("Canine ate.");
        }
        else {
            return ("Canine did not want to eat.");
        }
    }
    public String sleep() {
        if(Response() == 1) {
            return ("Canine is sleeping.");
        }
        else {
            return ("Canine did not want to sleep.");
        }
    }
    public String wakeUp() {
        if(Response() == 1) {
            return ("Canine is awake.");
        }
        else {
            return ("Canine did not want to wake up.");
        }
    }
}