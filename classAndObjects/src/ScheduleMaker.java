public class ScheduleMaker {

    private int numGames;
    private String rivalTeam;
    private String jerseyColor;

    public ScheduleMaker(int g, String t, String j) {
        numGames = g;
        rivalTeam = t;
        jerseyColor = j;
    }

    public int getNumGames() {
        return numGames;
    }

}
