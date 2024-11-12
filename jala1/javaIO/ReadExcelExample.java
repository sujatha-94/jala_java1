package javaIO;


import java.io.*;

public class ReadExcelExample {
    public static void main(String[] args) {
        // Corrected file path using double backslashes
        String filePath = "C:\\Users\\sujat\\OneDrive\\Desktop\\jala1\\data.csv";
  // Absolute path example
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Split each line by commas to get the columns
                String[] columns = line.split(",");
                
                // Print the columns (representing the rows in the Excel sheet)
                for (String column : columns) {
                    System.out.print(column + "\t");  // Tab-separated for better readability
                }
                System.out.println();  // Move to the next line (row in Excel)
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}