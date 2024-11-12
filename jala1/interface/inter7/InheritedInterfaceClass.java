package inter7;

public class InheritedInterfaceClass implements ChildInterface {
    @Override
    public void parentMethod() {
        System.out.println("Parent method implemented.");
    }

    @Override
    public void childMethod() {
        System.out.println("Child method implemented.");
    }

    public static void main(String[] args) {
        InheritedInterfaceClass obj = new InheritedInterfaceClass();
        obj.parentMethod();
        obj.childMethod();
    }
}
