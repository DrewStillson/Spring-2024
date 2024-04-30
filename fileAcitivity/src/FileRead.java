import java.io.*;
import java.util.Scanner;
public class FileRead {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            File myFile = new File("events.txt");
            Scanner reader = new Scanner(myFile);
            while (reader.hasNextLine()) {
                String fileInfo = reader.nextLine();
                System.out.println(fileInfo);
            }
        }
        catch (FileNotFoundException exception) {
            System.err.println("File Not Found");
        }
    }
}
