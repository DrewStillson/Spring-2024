public class Main {
    public static void main(String [] args) {

        StringArrayList myArray = new StringArrayList();
        myArray.addString("Coke");
        myArray.addString("Pepsi");
        myArray.addString("Sprite");
        myArray.addString("Dr.Pepper");
        System.out.println("Array Size: " + myArray.getArraySize());
        System.out.println();
        System.out.println("Element at Index 2: " + myArray.getElement(2));
        System.out.println();
        myArray.displayArray();
        System.out.println();
        System.out.println("Removing Pepsi");
        myArray.removeString("Pepsi");
        System.out.println();
        myArray.displayArray(true);

    }
}
