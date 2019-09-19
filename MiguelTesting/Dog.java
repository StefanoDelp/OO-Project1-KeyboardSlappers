public class Dog extends Canine {
    String name;
    public void setName(String x) {
        name = x;
    }
    @Override
    public String makeNoise() {
        return (name + " said woof");
    }
}