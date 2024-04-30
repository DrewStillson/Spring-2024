import java.util.Scanner;
public class TeamCreator {

    private Scanner reader = new Scanner(System.in);
    private int numPlayers;
    private String coachName;
    private String sport;

    public TeamCreator(int p, String c, String s) {
        numPlayers = p;
        coachName = c;
        sport = s;
    }

    public void updatePlayers(int p) {
        numPlayers = p;
    }

}
