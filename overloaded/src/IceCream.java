public class IceCream {

    private String flavor;
    private int scoops;
    private String cone;
    private boolean hasSprinkles;

    public IceCream() {
        this.flavor = "Vanilla";
        this.scoops = 1;
        this.cone = "Sugar";
        this.hasSprinkles = false;
    }
    public IceCream(String f) {
        this.flavor = f;
        this.scoops = 1;
        this.cone = "Sugar";
        this.hasSprinkles = false;
    }
    public IceCream(String f, int s, String c, boolean sprink) {
        this.flavor = f;
        this.scoops = s;
        this.cone = c;
        this.hasSprinkles = sprink;
    }
    public void setFlavor() {
        this.flavor = "Cookie Dough";
    }
    public String getFlavor() {
        return flavor;
    }
    public void setFlavor(String f) {
        this.flavor = f;
    }
    public int getScoops() {
        return scoops;
    }
    public void setScoops(int s) {
        this.scoops = s;
    }
    public String getCone() {
        return cone;
    }
    public void setCone(String c) {
        this.cone = c;
    }
    public Boolean getSprinkles() {
        return hasSprinkles;
    }
    public void setSprinkles(boolean sprink) {
        this.hasSprinkles = sprink;
    }
}
