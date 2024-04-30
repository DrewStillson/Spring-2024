import java.util.ArrayList;
public class GenericArrayList {
    public void printArrayList(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();
    }
}
