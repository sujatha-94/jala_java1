
package javaIO;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteUsingBufferedWriter {
    public static void main(String[] args) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"))) {
            bufferedWriter.write("This is written using BufferedWriter.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
