public class Main {
    public static void main(String[] args) {
        Duck donald = new Duck();
        Duck daisy = new PekingDuck();

        donald.clean();
        donald.clean(new Cow());
        donald.clean(daisy);
    }
}