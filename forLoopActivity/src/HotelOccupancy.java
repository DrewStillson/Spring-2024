import java.util.Scanner;
public class HotelOccupancy {
    public static void main(String [] args) {

        Scanner reader = new Scanner(System.in);
        int totalRooms = 0;
        int occupied = 0;

        System.out.print("Enter number of floors: ");
        int numFloors = reader.nextInt();

        for (int i = 1; i <= numFloors; i++) {
            System.out.print("Enter the number of rooms on floor " + i + ": ");
            totalRooms += reader.nextInt();
            System.out.print("How many of the floor's rooms are occupied: ");
            occupied += reader.nextInt();
        }

        int vacant = totalRooms - occupied;
        double percent = (double)occupied/totalRooms;

        System.out.printf("Floors: " + numFloors + "\nRooms: " + totalRooms + "\nOccupied Rooms: " + occupied + "\nVacant Rooms: " + vacant + "\nOccupancy: %.2f" , percent);
        System.out.print(" (" + (int)(percent * 100) + "%)");

    }
}
