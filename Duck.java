public class Duck extends Animal implements Flyable{
    String name;
    public Duck(String name){
        this.name = name;
    }
    public String toString(){
        return "Duck:" + this.name;
    }

    @Override
    void sound(){
        System.out.println("Quack Quack");
    }

    @Override
    public void fly() {
        System.out.println("prbbb prbbb");
    }

    @Override
    public void glide() {
        System.out.println("Hi-yahhhhh!!!!!");
    }

    void clean(Animal animal){
        System.out.println(this + " is cleaning " + animal); // both are the same
        System.out.println(this.toString() + " is cleaning " + animal.toString()); // both are the same
    }


}
