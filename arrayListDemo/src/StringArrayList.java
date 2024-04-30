import java.util.ArrayList;
public class StringArrayList {

    private ArrayList<String> stringArray = new ArrayList<String>();

    public void addString(String word) {
        this.stringArray.add(word);
    }
    public void removeString(String word) {
        this.stringArray.remove(word);
    }
    public int getArraySize() {
        return this.stringArray.size();
    }
    public String getElement(int index) {
        return this.stringArray.get(index);
    }
    public void displayArray() {
        for(int i = 0; i < getArraySize(); i++) {
            System.out.println(getElement(i));
        }
    }
    public void displayArray(boolean isForEach) {
        for (String element: stringArray) {
            System.out.println(element);
        }
    }

}
