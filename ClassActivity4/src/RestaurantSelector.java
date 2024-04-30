import java.util.Scanner;
public class RestaurantSelector {
    public static void main(String []args){

        String options = "";
        Scanner reader = new Scanner(System.in);

        System.out.print("Is anyone in your party a vegetarian? ");
        String vegetarian = reader.nextLine();
        System.out.print("Is anyone in your party a vegan? ");
        String vegan = reader.nextLine();
        System.out.print("Is anyone in your party a gluten-free? ");
        String gluten = reader.nextLine();

        if (vegetarian.equals("no") && vegan.equals("no") && gluten.equals("no")){
            options += "\tJoe's Street Burgers\n";
        }
        if (vegetarian.equals("yes") && vegan.equals("no") && gluten.equals("yes")){
            options += "\tMain Street Pizza Company\n";
        }
        if (vegetarian.equals("yes") && vegan.equals("yes") && gluten.equals("yes")){
            options += "\tCorner Cafe\n\tThe Chef's Kitchen\n";
        }
        if (vegetarian.equals("yes") && vegan.equals("no") && gluten.equals("no")){
            options += "\tMama's Fine Italian\n";
        }


        System.out.print("Here are your restaurant choices:\n" + options);

    }
}

