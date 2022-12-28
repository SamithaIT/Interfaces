public interface Java {
    void code();
}
interface JVM extends Java{
    void run();
}
class Output implements JVM{
    @Override
    public void code() {
        System.out.println("Coding!");
    }

    @Override
    public void run() {
        System.out.println("Running!");
    }

    public static void main(String[] args) {
        Output o=new Output();
        o.code();
        o.run();

        System.out.println("\n");

        JVM jvm=new Output();
        jvm.run();
        jvm.code();
    }
}
