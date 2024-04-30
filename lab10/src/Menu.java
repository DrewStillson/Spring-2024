import java.util.Scanner;
import java.util.ArrayList;
public class Menu {

    private Scanner reader = new Scanner(System.in);
    private Pokedex pokedex = new Pokedex();

    public void displayMenu() {
        while (true) {
            System.out.print("********* MENU *********\nPlease make a selection: \n" +
                    "1) Add a Pokemon\n2) Remove a Pokemon\n3) Display Pokemon Info\n" +
                    "4) Display All Pokemon Info\n5) Exit\n>> ");
            int choice = reader.nextInt();
            reader.nextLine();
            if (choice == 1) {
                createPokemon();
            } else if (choice == 2) {
                deletePokemon();
            } else if (choice == 3) {
                displayPokemon();
            } else if (choice == 4) {
                displayAllPokemon();
            } else if (choice == 5) {
                break;
            } else {
                System.out.print("Invalid Entry\n>> ");
            }
        }
    }
    private void createPokemon() {
        System.out.print("Enter the Pokemon name: ");
        String name = reader.nextLine();
        System.out.print("Enter the Pokemon hp: ");
        int hp = reader.nextInt();
        reader.nextLine();

        Pokemon pokemon = new Pokemon(name, hp);
        pokedex.addPokemon(pokemon);
        System.out.println("Enter Moves for " + name);


        while (true) {
            System.out.print("\tEnter a Move name or 'q' if finished: ");
            String input = reader.nextLine();

            if (input.equals("q")) {
                break;
            }

            System.out.print("\tEnter move's power: ");
            int power = reader.nextInt();
            reader.nextLine();
            System.out.print("\tEnter the move's speed: ");
            int speed = reader.nextInt();
            reader.nextLine();

            Move move = new Move(input, power, speed);
            pokemon.addMove(move);
        }
        System.out.println(name + " added to the Pokedex");
    }
    private void deletePokemon() {
        while (true) {
            System.out.print("Enter the name of the Pokemon you want to delete: ");
            String gonePokemon = reader.nextLine();
            Pokemon hasPokemon = pokedex.getPokemon(gonePokemon);
            if (hasPokemon == null) {
                System.out.println("Pokemon not found");

            }
            else {
                pokedex.removePokemon(hasPokemon);
                break;
            }
        }
    }
    private void displayPokemon() {
        while (true) {
            System.out.print("Enter the name of the Pokemon you want to see info: ");
            String pokemon = reader.nextLine();
            Pokemon thePokemon = pokedex.getPokemon(pokemon);
            if (thePokemon == null) {
                System.out.println("Pokemon not found");

            }
            else {
                System.out.println(thePokemon);
                break;
            }
        }
    }
    private void displayAllPokemon() {
        ArrayList<Pokemon> pokemonList = pokedex.getPokemonArrayList();
        int count = 1;
        for (Pokemon pokemon : pokemonList) {
            System.out.print(count + ". Name: " + pokemon.getName() + "\n" +
                    "HP: " + pokemon.getHp());
            System.out.println("\n");
        }
    }
}
