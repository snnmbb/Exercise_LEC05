public class Owl extends Animal implements Flyable {
    public String sound()
    {
        return "hoot";
    }
    public  String behaviors()
    {
        return "walk,fly";
    }
    public String eatbehaviors()
    {
        return "omnivore";
    }
    @Override
    public void fly() {
        System.out.println("....");
    }
    @Override
    public void glide() {
        System.out.println("....");
    }
    public String pettable()
    {
        return "worthy of being petted";
    }
}
