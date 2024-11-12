package inter4;

public class MultiInterfaceClass implements InterfaceA, InterfaceB {
    @Override
    public void methodA() {
        System.out.println("Method A implemented.");
    }

    @Override
    public void methodB() {
        System.out.println("Method B implemented.");
    }

    public static void main(String[] args) {
        MultiInterfaceClass obj = new MultiInterfaceClass();
        obj.methodA();
        obj.methodB();
    }
}
