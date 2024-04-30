import java.util.Scanner;
public class CharacterBattle {
    public static void main(String [] args){

        Scanner reader = new Scanner(System.in);
        String name1, name2;
        int hp1, hp2;
        String move1, move2;
        int power1, power2;
        int speed1, speed2;
        int win1 = 0, win2 = 0;
        int counter = 1;

        System.out.print("Enter the odd amount of rounds you'd like to play: ");
        int rounds = reader.nextInt();

        while (rounds % 2 != 1){
            System.out.print("It seems you entered an even round number, try again: ");
            rounds = reader.nextInt();
        }

        while (rounds >= counter) {
            System.out.println();
            System.out.println("Starting Round " + counter + ":");

            System.out.println("Player 1: Select your name, hp, move name, move power, attack speed");
            reader.nextLine();
            System.out.print("Name: ");
            name1 = reader.nextLine();
            System.out.print("HP: ");
            hp1 = reader.nextInt();
            reader.nextLine();
            System.out.print("Move: ");
            move1 = reader.nextLine();
            System.out.print("Power: ");
            power1 = reader.nextInt();
            System.out.print("Speed: ");
            speed1 = reader.nextInt();

            System.out.println();
            System.out.println("Player 2: Select your name, hp, move name, move power, attack speed");
            reader.nextLine();
            System.out.print("Name: ");
            name2 = reader.nextLine();
            System.out.print("HP: ");
            hp2 = reader.nextInt();
            reader.nextLine();
            System.out.print("Move: ");
            move2 = reader.nextLine();
            System.out.print("Power: ");
            power2 = reader.nextInt();
            System.out.print("Speed: ");
            speed2 = reader.nextInt();
            System.out.println();

            while (hp1 > 0 && hp2 > 0) {
                if (speed1 > speed2){
                    hp2 -= power1;
                    System.out.println(name1 + " used " + move1 + " and dealt " + power1 + " damage! " + name2 + "'s HP: " + hp2);
                    if (hp2 <= 0){
                        break;
                    }
                    hp1 -= power2;
                    System.out.println(name2 + " used " + move2 + " and dealt " + power2 + " damage! " + name1 + "'s HP: " + hp1);
                }
                else if (speed2 > speed1) {
                    hp1 -= power2;
                    System.out.println(name2 + " used " + move2 + " and dealt " + power2 + " damage! " + name1 + "'s HP: " + hp1);
                    if (hp1 <= 0){
                        break;
                    }
                    hp2 -= power1;
                    System.out.println(name1 + " used " + move1 + " and dealt " + power1 + " damage! " + name2 + "'s HP: " + hp2);
                }
                else {
                    int random = (int)(Math.random() * 2 + 1);

                    if (random == 1) {
                        hp2 -= power1;
                        System.out.println(name1 + " used " + move1 + " and dealt " + power1 + " damage! " + name2 + "'s HP: " + hp2);
                        if (hp2 <= 0){
                            break;
                        }
                        hp1 -= power2;
                        System.out.println(name2 + " used " + move2 + " and dealt " + power2 + " damage! " + name1 + "'s HP: " + hp1);
                    }
                    else {
                        hp1 -= power2;
                        System.out.println(name2 + " used " + move2 + " and dealt " + power2 + " damage! " + name1 + "'s HP: " + hp1);
                        if (hp1 <= 0){
                            break;
                        }
                        hp2 -= power1;
                        System.out.println(name1 + " used " + move1 + " and dealt " + power1 + " damage! " + name2 + "'s HP: " + hp2);
                    }
                }
            }
            System.out.println();
            if (hp1 <= 0) {
                System.out.println("Player 2 is the winner of round " + counter + "!");
                win2 += 1;
            }
            else {
                System.out.println("Player 1 is the winner of round " + counter + "!");
                win1 += 1;
            }
            System.out.println();
            counter += 1;
        }

        System.out.println("The final scores were - \tPlayer 1: " + win1 + " \tPlayer 2: " + win2);
        if (win1 > win2){
            System.out.println("Player 1 has won the battle!");
        }
        else {
            System.out.println("Player 2 has won the battle!");
        }
    }
}
