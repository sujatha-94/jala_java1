package inter3;

class InstanceDemo implements SimpleInterface {
    
    public void display() {
        System.out.println("Interface method called using instance.");
    }

    public static void main(String[] args) {
        InstanceDemo obj = new InstanceDemo();
        obj.display();
    }
}

