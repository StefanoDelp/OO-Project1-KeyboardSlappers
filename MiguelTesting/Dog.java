import java.util.Random;

public class Dog extends Canine {
    String name;
    @Override
    public String setName(String x) {
        name = x;
        return name;
    }
    public String getName(String x) {
        return name;
    }
    public int Response() {
        Random n = new Random();
        int y = n.nextInt(1);
        return y;
    }
    @Override
    public String makeNoise() {
        if(Response() == 1) {
            return (name + " said woof");
        }
        else {
            return(name + " did not say anything");
        }
    }
    @Override
    public String wakeUp() {
        if(Response() == 1) {
            return (name + " woke up.");
        }
        else {
            return (name + " did not want to wake up.");
        }
    }
}