import java.util.*;

public abstract class Pachyderm implements Animal {

    public String makeNoise() {
        if(Response() == 1) {
            return ("Pachyderm woofed.");
        }
        else {
            return ("Pachyderm did not woof.");
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
            return ("Pachyderm roamed.");
        }
        else {
            //awake = false;
            return ("Pachyderm did not roam.");
        }
    }
    public String eat() {
        if(Response() == 1) {
            return ("Pachyderm ate.");
        }
        else {
            return ("Pachyderm did not want to eat.");
        }
    }
    public String sleep() {
        if(Response() == 1) {
            return ("Pachyderm is sleeping.");
        }
        else {
            return ("Pachyderm did not want to sleep.");
        }
    }
    public String wakeUp() {
        if(Response() == 1) {
            return ("Pachyderm is awake.");
        }
        else {
            return ("Pachyderm did not want to wake up.");
        }
    }
}