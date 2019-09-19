import java.util.Random;

public class Rino extends Pachyderm {
    String name;
    String food = "grass";
    int resp  = Response();
    @Override
    public String setName(String x) {
        name = x;
        return name;
    }

    @Override
    public String makeNoise() {
        if(resp == 1) {
            return (name + " said hhhhhh");
        }
        else {
            return(name + " did not say anything");
        }
    }

    @Override
    public String wakeUp() {
        if(resp == 1) {
            return (name + " woke up.");
        }
        else {
            return (name + " did not want to wake up.");
        }
    }

    @Override
    public String roam() {
        if(Response() == 1) {
            return(name + " roamed.");
        }
        else {
            return(name + " did not want to roam.");
        }
    }

    @Override
    public String eat() {
        if(Response() == 1) {
            return (name + " ate " + food);
        }
        else {
            return (name + " did not want to eat " + food);
        }
    }

    @Override
    public String sleep() {
        if(resp == 0) {
            return (name + " is sleeping");
        }
        else {
            return (name + " did not want to sleep.");
        }
    }
}