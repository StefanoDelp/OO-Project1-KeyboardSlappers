import java.util.Random;

public abstract class Canine implements Animals {

    @Override
    public void makeNoise() {
        System.out.println("Bork");
    }
    public int Response()
    {
        int n = rand.nextInt(1);
        return n;
    }
}