package javaIO;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadUsingInputStream {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("input.txt")) {
            int content;
            while ((content = inputStream.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

