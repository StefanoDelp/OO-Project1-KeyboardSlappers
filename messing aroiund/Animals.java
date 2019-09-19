public interface Animals {
    String Name;
    String Sound = "Test Sound";
    String Food = "Test Food";
    boolean Awake = false;
    public void wakeup()
    {
        Awake = true;
        System.out.println(Name+"Is up");
    }
    public void makeNoise()
    {
        System.out.println(Name + "said" +Sound);
    }
    public void eat()
    {
        System.out.println(Name+"ate"+Food);
    }
    public void roam()
    {
        System.out.println(Name+"Is Roaming");
    }
    public void sleep()
    {
        Awake = false;
        System.out.println(Name+"Is a sleep");
    }

}