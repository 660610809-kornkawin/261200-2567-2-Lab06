public class PekingDuck extends Duck {
    PekingDuck(String name){
        super(name);
    }
    public void beCrispy(){
        System.out.println("Grob Grob (Sound Effect)");
    }
    @Override
    void clean(Animal animal) {
        System.out.println("I cannot clean.... I already died");
    }
}
