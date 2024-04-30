import javax.swing.JOptionPane;
public class JOptionPaneRectangle {
    public static void main(String [] args){

        int length = Integer.parseInt(JOptionPane.showInputDialog("Enter the length of the rectangle: "));
        int width = Integer.parseInt(JOptionPane.showInputDialog("Enter the width of the rectangle: "));

        int area = width * length;
        int perimeter = 2*width + 2*length;

        JOptionPane.showMessageDialog(null, String.format("The area is: %s%nThe perimeter is: %s%n", area, perimeter));

    }
}
