package javaIO;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteUsingOutputStream {
    public static void main(String[] args) {
        try (FileOutputStream outputStream = new FileOutputStream("output.txt")) {
            String data = "Hello, this is a test.";
            outputStream.write(data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
