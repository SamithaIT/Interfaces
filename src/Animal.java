public interface Animal {
    void eat();
}
interface Dog{
    void bark();
}
class BabyDog implements Animal,Dog{
    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void bark() {
        System.out.println("Barking");
    }

    public static void main(String[] args) {
        BabyDog a=new BabyDog();
        a.bark();
        a.eat();
    }
}
