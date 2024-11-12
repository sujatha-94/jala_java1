

class Parent {
    int parentNumber = 50;
    String parentText = "Parent Class Field";

    void displayParentFields() {
        System.out.println("Parent Number: " + parentNumber);
        System.out.println("Parent Text: " + parentText);
    }
}

class Child extends Parent {
    int childNumber = 20;
    String childText = "Child Class Field";

    void printFields() {
        // Accessing parent class fields using 'super'
        System.out.println("Parent Number (using super): " + super.parentNumber);
        System.out.println("Parent Text (using super): " + super.parentText);

        // Accessing child class fields using 'this'
        System.out.println("Child Number (using this): " + this.childNumber);
        System.out.println("Child Text (using this): " + this.childText);
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.printFields(); // Call method to print parent and child fields
    }
}
