public abstract class Feline implements Animals 
{
    public int Response()
    {
        int n = rand.nextInt(1);
        return n;
    }
    @Override
    public void makeNoise() {
        if (Response() == 1)
        {
            System.out.println("Meow"); 
        }
        else
        {
            System.out.println(Name+"did not want to make a noise"); 
        }
    }

    @Override
    public void wakeup() {
        if (Response() == 1)
        {
            Awake = true;
            System.out.println(Name+"Is up");
        }
        else
        {
            Awake = false;
            System.out.println(Name+"did not want to wake up"); 
        }
    }
    @Override
    public void eat()
    {
        if (Response() == 1)
        {
            System.out.println(Name+"ate"+Food);
        }
        else
        {
            System.out.println(Name+"did not want to eat"); 
        }
    }
    @Override
    public void roam()
    {
        if (Response() == 1)
        {
            System.out.println(Name+"Is Roaming");
        }
        else
        {
            System.out.println(Name+"did not want to roam"); 
        }
    }
    @Override
    public void sleep()
    {
        if (Response() == 1)
        {
            Awake = false;
            System.out.println(Name+"Is a sleep");
        }
        else
        {
            Awake = true;
            System.out.println(Name+"did not want to sleep"); 
        }
    }


}