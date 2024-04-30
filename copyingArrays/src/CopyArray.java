import java.util.Scanner;
public class CopyArray {
    public static void main(String [] args) {

        int counter = 0;
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the number of array elements: ");
        final int NUM_ITEMS = reader.nextInt();
        int[] array1 = new int[NUM_ITEMS];

        for (int i = 0; i < array1.length; i++) {
            System.out.print("Enter array element " + i + ": ");
            array1[i] = reader.nextInt();
        }

        System.out.println();
        System.out.println("Array 1");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.println();

        int[] array2 = new int[NUM_ITEMS];
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }

        System.out.println();
        System.out.println("Array 2 - copy");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }

        System.out.println();
        System.out.println();

        int[] array3 = new int[NUM_ITEMS];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = (int)Math.pow(array1[i], 2);
        }

        System.out.println("Array 3 - squared");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }

        System.out.println();
        System.out.println();


        int[] array4 = new int[NUM_ITEMS];
        for (int i = array1.length - 1; i >= 0; i--) {
            array4[counter] = array1[i];
            counter++;
        }

        System.out.println("Array 4 - reversed");
        for (int i = 0; i < array4.length; i++) {
            System.out.print(array4[i] + " ");
        }

    }
}
