import java.util.ArrayList;
import java.util.Scanner;
public class Sorting {
    private Scanner reader = new Scanner(System.in);
    public ArrayList<Integer> getArray() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter integer " + (i+1) + ": ");
            list.add(reader.nextInt());
            reader.nextLine();
        }
        return list;
    }
    public ArrayList<Integer> sortArray(ArrayList<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            int j = i - 1;
            while (j >= 0) {
                if (list.get(i) < list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                    j--;
                }
            }
        }
        return list;
    }
}
