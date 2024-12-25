public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal(); <-- error
        Cow wagyu = new Cow();
        Duck donald = new Duck("Donald");
        Duck daisy = new Duck("Daisy");
        Pig burin = new Pig();
        Owl hedwig = new Owl();

//        wagyu.sound();
//        donald.sound();
//        burin.sound();
//        hedwig.sound();

        donald.clean(wagyu);
        daisy.clean(donald);
        PekingDuck fourseasons = new PekingDuck("4ss");
        fourseasons.beCrispy();
        fourseasons.clean(daisy);
        fourseasons.fly();

        donald.clean(new Cow());


    }
}