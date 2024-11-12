package javaIO;
import java.io.*;

public class WriteExcel{
    public static void main(String[] args) {
        // Data to write (like an Excel spreadsheet)
        String[][] data = {
            {"Name", "Age", "City"},
            {"Alice", "25", "New York"},
            {"Bob", "30", "Los Angeles"},
            {"Charlie", "35", "Chicago"}
        };
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("data1.csv"))) {
            // Iterate through the 2D array to write data to the CSV file
            for (int i = 0; i < data.length; i++) {
                // Write each row's data, separating columns with commas
                for (int j = 0; j < data[i].length; j++) {
                    writer.write(data[i][j]);
                    if (j < data[i].length - 1) {
                        writer.write(",");  // Add comma between values
                    }
                }
                writer.newLine();  // Move to the next line after each row
            }
            
            System.out.println("Data has been written to data1.csv successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
