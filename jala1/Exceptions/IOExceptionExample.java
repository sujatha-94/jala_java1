package Exceptions;
import java.io.FileWriter;
import java.io.IOException;

public class IOExceptionExample {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, world!");
            writer.close();
        } catch (IOException e) {
            System.out.println("Caught IOException");
        }
    }
}


