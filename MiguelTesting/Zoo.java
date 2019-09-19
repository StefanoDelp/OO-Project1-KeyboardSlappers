import java.util.*;


public class Zoo {
    public static void main(String[] args) {
        Zookeeper zoo = new Zookeeper();
        Dog x = new Dog();
        Animal y = new Dog(); //Poly morphism
        Wolf a = new Wolf();
        Animal b = new Wolf();
        Lion c =  new Lion();
        Animal d = new Lion();
        Cat e = new Cat();
        Animal f = new Cat();
        Tiger g = new Tiger();
        Animal h = new Tiger();
        Rino i = new Rino();
        Animal j = new Rino();
        Elephant k = new Elephant();
        Animal l = new Elephant();
        Hippo m = new Hippo();
        Animal n = new Hippo();
        a.setName("Willy the Wolf");
        b.setName("Willard the Wolf");
        x.setName("Dummy the Dog");
        y.setName("Stupid the Dog");
        c.setName("Larry the Lion");
        d.setName("Londonton the Lion");
        e.setName("Carl the Cat");
        f.setName("Charlie the Cat");
        g.setName("Tyler the  Tiger");
        h.setName("Thomas the Tiger");
        i.setName("Rick the Rino");
        j.setName("Riley the Rino");
        k.setName("Eddie the Elephany");
        l.setName("Edgar the Elephant");
        m.setName("Harry the Hippo");
        n.setName("Harold the Hippo");
        zoo.add(x);
        zoo.add(y);
        zoo.add(a);
        zoo.add(b);
        zoo.add(c);
        zoo.add(d);
        zoo.add(e);
        zoo.add(f);
        zoo.add(g);
        zoo.add(h);
        zoo.add(i);
        zoo.add(j);
        zoo.add(k);
        zoo.add(l);
        zoo.add(m);
        zoo.add(n);
        zoo.wakeUp();
        zoo.rollCall();
        zoo.roam();
        zoo.eat();
        zoo.sleep();
    }
}