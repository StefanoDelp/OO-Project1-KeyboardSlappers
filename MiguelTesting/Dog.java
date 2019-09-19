public class Dog extends Canine {
    String name;
    @Override
    public String setName(String x) {
        name = x;
        return name;
    }
    @Override
    public String makeNoise() {
        return (name + " said woof");
    }
}