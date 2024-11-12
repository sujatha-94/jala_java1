package interface2;

public class CompleteClass extends PartialImplementation {
    @Override
    public void methodTwo() {
        System.out.println("Method Two implemented.");
    }

    public static void main(String[] args) {
        CompleteClass obj = new CompleteClass();
        obj.methodOne();
        obj.methodTwo();
    }
}

