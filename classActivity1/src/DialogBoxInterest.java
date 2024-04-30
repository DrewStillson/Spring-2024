import javax.swing.*;
public class DialogBoxInterest {
    public static void main(String[] args) {

        JFrame f = new JFrame();


        int principal;
        double rate;
        int numCompounded;
        int years;
        double money;

        principal = Integer.parseInt(JOptionPane.showInputDialog(f, "What is the original principal: "));
        rate = Double.parseDouble(JOptionPane.showInputDialog(f, "What is the annual interest rate: ")) / 100.0;
        numCompounded = Integer.parseInt(JOptionPane.showInputDialog(f, "How many times per year is interest compounded: "));
        years = Integer.parseInt(JOptionPane.showInputDialog(f, "How many years will interest be compounded: "));

        money = principal * Math.pow(1 + rate / numCompounded, numCompounded * years);
        money = ((int)(money * 100)) / 100.0;

        JOptionPane.showMessageDialog(f, "After " + years + " you will have $" + money + ".");

    }
}