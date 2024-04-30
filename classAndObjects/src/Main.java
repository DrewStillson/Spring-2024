import java.util.Scanner;
public class Main {
    public static void main(String [] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the number of players on your team: ");
        int numPlayers = reader.nextInt();
        reader.nextLine();
        System.out.print("Enter the name of your team's coach: ");
        String coach = reader.nextLine();
        System.out.print("Enter the sport your team plays: ");
        String sport = reader.nextLine();

        TeamCreator myTeam = new TeamCreator(numPlayers, coach, sport);
        System.out.print("Update the number of players: ");
        myTeam.updatePlayers(reader.nextInt());

        System.out.print("Enter the number of games your team will play: ");
        int numGames = reader.nextInt();
        reader.nextLine();
        System.out.print("Enter the name of your team's rival: ");
        String rival = reader.nextLine();
        System.out.print("Enter the color of your teams jersey: ");
        String color = reader.nextLine();

        ScheduleMaker mySchedule = new ScheduleMaker(numGames, rival, color);
        System.out.print("You will play " + mySchedule.getNumGames() + " games this season");

    }
}
