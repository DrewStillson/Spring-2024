import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Sorting sort = new Sorting();
        ArrayList<Integer> arrayList = sort.getArray();
        arrayList = sort.sortArray(arrayList);
        System.out.println(arrayList.get(0) + " " + arrayList.get(1) + " " + arrayList.get(2) + " " + arrayList.get(3) + " " + arrayList.get(4));
    }
}
