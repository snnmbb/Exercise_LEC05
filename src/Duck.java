import java.security.spec.RSAOtherPrimeInfo;

public class Duck extends Animal implements Flyable{
    public String sound()
    {
        return "quack";
    }
    public  void dive ()
    {
        System.out.println("jom+ boong+");
    }
    public String eatbehaviors()
    {
        return "herbivore";
    }
    @Override
    public void fly() {
        System.out.println("pb pb");
    }
    @Override
    public void glide() {
        System.out.println("fewwwww");
    }
    public String pettable()
    {
        return "capable of";
    }
}
