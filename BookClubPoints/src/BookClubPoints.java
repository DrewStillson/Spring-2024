import javax.swing.*;
public class BookClubPoints {
    public static void main(String [] args){

        int bookPoints;

        int numBooks = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of books you've purchased: "));

        if (numBooks == 0){
            bookPoints = 0;
        }
        else if (numBooks == 1){
            bookPoints = 5;
        }
        else if (numBooks == 2){
            bookPoints = 15;
        }
        else if (numBooks == 3){
            bookPoints = 30;
        }
        else if (numBooks >= 4){
            bookPoints = 60;
        }
        else{
            bookPoints = -1;
        }

        String output = String.format("The books entered: %d%nThe points earned are: %d", numBooks, bookPoints);
        JOptionPane.showMessageDialog(null, output);

    }
}
