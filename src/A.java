public interface A {
    void print();
}
class B implements A{
    @Override
    public void print() {
        System.out.println("Hello!");
    }

    public static void main(String[] args) {
        A a=new B();
        a.print();
    }
}
