import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class displayLine {
    public static void main(String[] args) {
        String filePath = "text.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNumber = 1;

            while ((line = reader.readLine()) != null) {
                System.out.printf("%d: %s%n", lineNumber, line);
                lineNumber++;
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}

