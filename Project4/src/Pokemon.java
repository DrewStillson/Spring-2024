import java.util.ArrayList;
public class Pokemon {
    protected String name;
    protected int hp;
    protected ArrayList<Move> moveList = new ArrayList<>();

    public Pokemon(String pokemonName, int health) {
        this.name = pokemonName;
        this.hp = health;
    }
    public void addMove(Move move) {
        moveList.add(move);
    }
    public void printMoves() {
        for (Move move : moveList) {
            System.out.println(move.getName());
        }
    }
    public String getName() {
        return this.name;
    }
    public int getHp() {
        return this.hp;
    }
    public Move getMove(String name) {
        Move wantedMove = null;
        for (Move move : moveList) {
            if (name.equals(move.getName())) {
                wantedMove = move;
            }
        }
        return wantedMove;
    }
    public void setHp(int health) {
        this.hp = health;
    }
}
