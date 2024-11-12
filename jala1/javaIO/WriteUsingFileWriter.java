package javaIO;

import java.io.FileWriter;
import java.io.IOException;

public class WriteUsingFileWriter {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("output.txt")) {
            fileWriter.write("Hello, writing using FileWriter.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

