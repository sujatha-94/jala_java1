package javaIO;

import java.io.FileReader;
import java.io.IOException;

public class ReadUsingFileReader {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("input.txt")) {
            int content;
            while ((content = fileReader.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
