import java.util.Random;
import java.util.Scanner;
public class Battle {
    private Scanner reader = new Scanner(System.in);
    private Random random = new Random();
    private PokeDex teamBuilder() {
        PokeDex team = new PokeDex();
        System.out.print("\tHow many Pokemon would you like on your team (up to 6 and 1 will be a Legendary): ");
        int numMons = reader.nextInt();
        reader.nextLine();
        while (numMons > 6) {
            System.out.print("\tSorry that is too many for a team try again: ");
            numMons = reader.nextInt();
            reader.nextLine();
        }
        for (int i = 1; i < numMons; i++) {
            System.out.println("\t\tCreate Pokemon " + i + " - ");
            System.out.print("\t\t\tWhat is the name of your Pokemon: ");
            String pokemonName = reader.nextLine();
            System.out.print("\t\t\tWhat is the HP of " + pokemonName + ": ");
            int hp = reader.nextInt();
            reader.nextLine();
            Pokemon pokemon = new Pokemon(pokemonName, hp);
            System.out.print("\t\t\tHow many moves would you like " + pokemonName + " to have (up to 4): ");
            int numMoves = reader.nextInt();
            reader.nextLine();
            while (numMoves > 4) {
                System.out.print("\t\t\tSorry that is too many moves try again: ");
                numMoves = reader.nextInt();
                reader.nextLine();
            }
            for (int j = 1; j <= numMoves; j++) {
                System.out.println("\t\t\t\tCreate Move " + j + " - ");
                System.out.print("\t\t\t\t\tWhat is the name of the move: ");
                String moveName = reader.nextLine();
                System.out.print("\t\t\t\t\tWhat is the speed of " + moveName + ": ");
                int speed = reader.nextInt();
                reader.nextLine();
                System.out.print("\t\t\t\t\tWhat is the power of " + moveName + ": ");
                int power = reader.nextInt();
                reader.nextLine();
                Move move = new Move(moveName, speed, power);
                pokemon.addMove(move);
            }
            team.addPokemon(pokemon);
        }
        System.out.println("\t\tCreate your Legendary Pokemon - ");
        System.out.print("\t\t\tWhat is the name of your Pokemon: ");
        String pokemonName = reader.nextLine();
        System.out.print("\t\t\tWhat is the HP of " + pokemonName + ": ");
        int hp = reader.nextInt();
        reader.nextLine();
        System.out.print("\t\t\tWhat is the name of " + pokemonName + "'s special move: ");
        String specialMove = reader.nextLine();
        Pokemon pokemon = new LegendaryPokemon(pokemonName, hp, specialMove);
        System.out.print("\t\t\tHow many moves would you like " + pokemonName + " to have (up to 4): ");
        int numMoves = reader.nextInt();
        reader.nextLine();
        while (numMoves > 4) {
            System.out.print("\t\t\tSorry that is too many moves try again: ");
            numMoves = reader.nextInt();
            reader.nextLine();
        }
        for (int j = 1; j <= numMoves; j++) {
            System.out.println("\t\t\t\tCreate Move " + j + " - ");
            System.out.print("\t\t\t\t\tWhat is the name of the move: ");
            String moveName = reader.nextLine();
            System.out.print("\t\t\t\t\tWhat is the speed of " + moveName + ": ");
            int speed = reader.nextInt();
            reader.nextLine();
            System.out.print("\t\t\t\t\tWhat is the power of " + moveName + ": ");
            int power = reader.nextInt();
            reader.nextLine();
            Move move = new Move(moveName, speed, power);
            pokemon.addMove(move);
        }
        team.addPokemon(pokemon);
        return team;
    }
    public void battleTime() {
        System.out.println("Player 1 Create Your Team - ");
        PokeDex team1 = teamBuilder();
        System.out.println("Player 2 Create Your Team - ");
        PokeDex team2 = teamBuilder();
        System.out.println("\n-----Time to Battle!-----\n");
        Pokemon mon1 = null;
        Pokemon mon2 = null;
        String p1Choice = "Y";
        String p2Choice = "Y";
        while (!team1.getPokemonList().isEmpty() && !team2.getPokemonList().isEmpty()) {
            if (p1Choice.equals("Y")) {
                System.out.println("\nPlayer 1's Team - ");
                team1.printPokemon();
                System.out.print("\nPlayer 1 which Pokemon would you like to use: ");
                mon1 = team1.getPokemon(reader.nextLine());
                while (mon1 == null) {
                    System.out.print("Sorry you do not have that Pokemon try again: ");
                    mon1 = team1.getPokemon(reader.nextLine());
                }
            }
            if (p2Choice.equals("Y")) {
                System.out.println("\nPlayer 2's Team - ");
                team2.printPokemon();
                System.out.print("\nPlayer 2 which Pokemon would you like to use: ");
                mon2 = team2.getPokemon(reader.nextLine());
                while (mon2 == null) {
                    System.out.print("Sorry you do not have that Pokemon try again: ");
                    mon2 = team2.getPokemon(reader.nextLine());
                }
            }
            while (mon1.getHp() > 0 && mon2.getHp() > 0) {
                System.out.println("\n" + mon1.getName() + "'s Moves - ");
                mon1.printMoves();
                System.out.print("\nWhich move would you like " + mon1.getName() + " to use: ");
                Move move1 = mon1.getMove(reader.nextLine());
                while (move1 == null) {
                    System.out.print("Sorry you do not have that Move try again: ");
                    move1 = mon1.getMove(reader.nextLine());
                }
                System.out.println("\n" + mon2.getName() + "'s Moves - ");
                mon2.printMoves();
                System.out.print("\nWhich move would you like " + mon2.getName() + " to use: ");
                Move move2 = mon2.getMove(reader.nextLine());
                while (move2 == null) {
                    System.out.print("Sorry you do not have that Move try again: ");
                    move2 = mon2.getMove(reader.nextLine());
                }
                if (move1.getSpeed() > move2.getSpeed()) {
                    mon2.setHp(mon2.getHp() - move1.getPower());
                    System.out.println("\n" + mon1.getName() + " used " + move1.getName() + " and dealt " + move1.getPower() + " damage! " +
                            mon2.getName() + " now has " + mon2.getHp() + " HP!\n");
                    if (mon2.getHp() > 0) {
                        mon1.setHp(mon1.getHp() - move2.getPower());
                        System.out.println("\n" + mon2.getName() + " used " + move2.getName() + " and dealt " + move2.getPower() + " damage! " +
                                mon1.getName() + " now has " + mon1.getHp() + " HP!\n");
                    }

                }
                else if (move2.getSpeed() > move1.getSpeed()) {
                    mon1.setHp(mon1.getHp() - move2.getPower());
                    System.out.println("\n" + mon2.getName() + " used " + move2.getName() + " and dealt " + move2.getPower() + " damage! " +
                            mon1.getName() + " now has " + mon1.getHp() + " HP!\n");
                    if (mon1.getHp() > 0) {
                        mon2.setHp(mon2.getHp() - move1.getPower());
                        System.out.println("\n" + mon1.getName() + " used " + move1.getName() + " and dealt " + move1.getPower() + " damage! " +
                                mon2.getName() + " now has " + mon2.getHp() + " HP!\n");
                    }
                }
                else {
                    int randomNum = random.nextInt(1, 3);
                    if (randomNum == 1) {
                        mon2.setHp(mon2.getHp() - move1.getPower());
                        System.out.println("\n" + mon1.getName() + " used " + move1.getName() + " and dealt " + move1.getPower() + " damage! " +
                                mon2.getName() + " now has " + mon2.getHp() + " HP!\n");
                        if (mon2.getHp() > 0) {
                            mon1.setHp(mon1.getHp() - move2.getPower());
                            System.out.println("\n" + mon2.getName() + " used " + move2.getName() + " and dealt " + move2.getPower() + " damage! " +
                                    mon1.getName() + " now has " + mon1.getHp() + " HP!\n");
                        }
                    }
                    else {
                        mon1.setHp(mon1.getHp() - move2.getPower());
                        System.out.println("\n" + mon2.getName() + " used " + move2.getName() + " and dealt " + move2.getPower() + " damage! " +
                                mon1.getName() + " now has " + mon1.getHp() + " HP!\n");
                        if (mon1.getHp() > 0) {
                            mon2.setHp(mon2.getHp() - move1.getPower());
                            System.out.println("\n" + mon1.getName() + " used " + move1.getName() + " and dealt " + move1.getPower() + " damage! " +
                                    mon2.getName() + " now has " + mon2.getHp() + " HP!\n");
                        }
                    }
                }
            }
            if (mon1.getHp() <= 0) {
                System.out.println(mon1.getName() + " has fainted!\n");
                team1.removePokemon(mon1);
                if (!team1.getPokemonList().isEmpty()) {
                    System.out.print("Player 2 would you like to switch Pokemon (Y or N): ");
                    p2Choice = reader.nextLine();
                    p1Choice = "Y";
                }
            }
            else {
                System.out.println(mon2.getName() + " has fainted!\n");
                team2.removePokemon(mon2);
                if (!team2.getPokemonList().isEmpty()) {
                    System.out.print("Player 1 would you like to switch Pokemon (Y or N): ");
                    p1Choice = reader.nextLine();
                    p2Choice = "Y";
                }
            }
        }
        if (team1.getPokemonList().isEmpty()) {
            System.out.println("\nPlayer 2 Wins!\n");
        }
        else {
            System.out.println("\nPlayer 1 Wins!\n");
        }
    }
}
