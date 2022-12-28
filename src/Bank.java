public interface Bank {
    float interestRate();
}
class BOC implements Bank{
    @Override
    public float interestRate() {
        return 22.75f;
    }
}
class SDB implements Bank{
    @Override
    public float interestRate() {
        return 21.5f;
    }
}
class TestInterface{
    public static void main(String[] args) {
        Bank b=new BOC();
        System.out.println("BOC rate: "+b.interestRate()+"%");
        Bank c=new SDB();
        System.out.println("SDB rate: "+c.interestRate()+"%");
    }
}
