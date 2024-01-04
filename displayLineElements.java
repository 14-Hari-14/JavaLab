import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class displayLineElements {
    public static void main(String[] args) {
        String filePath = "input.txt";
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                String[] words = line.split("\\s+");
                wordCount += words.length;
                charCount += line.length();
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

        System.out.println("Number of lines: " + lineCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of characters: " + charCount);
    }
}

