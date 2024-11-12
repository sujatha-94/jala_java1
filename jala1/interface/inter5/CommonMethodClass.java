package inter5;

public class CommonMethodClass implements InterfaceX, InterfaceY {
    @Override
    public void commonMethod() {
        System.out.println("Common method implemented.");
    }

    public static void main(String[] args) {
        CommonMethodClass obj = new CommonMethodClass();
        obj.commonMethod();
    }
}

