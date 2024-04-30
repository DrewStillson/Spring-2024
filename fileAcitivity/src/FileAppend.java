import java.io.*;
import java.util.Scanner;
public class FileAppend {
    public static void main(String[] args) throws IOException {

        FileWriter myFile = new FileWriter("events.txt");
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.print("What new event would you like to add or q to quit: ");
            String eventName = reader.nextLine();
            if (eventName.equals("q")) {
                break;
            }
            System.out.print("How many people are attending: ");
            String numPeople = reader.nextLine();
            System.out.print("How long will your event last: ");
            String hours = reader.nextLine();
            myFile.write(eventName + " " + numPeople + " " + hours);
        }
    }
}