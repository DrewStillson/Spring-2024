public class Move {

    private String name;
    private int speed;
    private int power;

    public Move(String moveName, int spd, int pow) {
        this.name = moveName;
        this.speed = spd;
        this.power = pow;
    }

    public String getName() {
        return this.name;
    }
    public int getSpeed() {
        return this.speed;
    }
    public int getPower() {
        return this.power;
    }
}
