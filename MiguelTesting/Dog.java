public class Dog extends Canine {
    String name;
    public void setName(String x) {
        name = x;
    }
    @Override
    public void makeNoise() {
        System.out.println(name + "said woof");
    }
}