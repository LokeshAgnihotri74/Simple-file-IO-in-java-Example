
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

    public class FileIOExample {
        public static void main(String[] args) {
            // 1. Create a file object
            File myFile = new File("example.txt");

            // 2. Write to the file
            try {
                FileWriter writer = new FileWriter(myFile);
                writer.write("Hello, this is a simple file I/O example in Java.");
                writer.close(); // Always close after writing
                System.out.println("File written successfully.");
            } catch (IOException e) {
                System.out.println("An error occurred while writing the file.");
                e.printStackTrace();
            }

            // 3. Read from the file
            try {
                FileReader reader = new FileReader(myFile);
                int character;
                System.out.print("File contents: ");
                while ((character = reader.read()) != -1) {
                    System.out.print((char) character); // Convert int to char
                }
                reader.close(); // Always close after reading
            } catch (IOException e) {
                System.out.println("An error occurred while reading the file.");
                e.printStackTrace();
            }
        }
    }


