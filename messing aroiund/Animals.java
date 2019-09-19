public interface Animals {
    String Name;
    String Sound;
    String Food;
    boolean Awake;
    public void wakeup()
    {
        Awake = true;
        System.out.println(Name+"Is up");
    }
    public void makeNoise()
    {
        System.out.println(Sound);
    }
    public void eat()
    {
        System.out.println(Name+"ate"+Food);
    }
    void roam()
    {
        System.out.println(Name+"Is Roaming");
    }
    void sleep()
    {
        Awake = false;
        System.out.println(Name+"Is a sleep");
    }

}