package interface1;
public class SimpleClass implements SimpleInterface {
    @Override
    public void display() {
        System.out.println("Display method implemented.");
    }

    public static void main(String[] args) {
        SimpleClass obj = new SimpleClass();
        obj.display(); // Call the implemented method
    }
}

