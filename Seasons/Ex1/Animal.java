package Ex1;
public abstract class Animal implements Seasonable,Comparable{
    protected int weight;
    private Season season;
    protected Color color;
    // TODO: Add auxiliary fields and functions.

    protected String status = "";
    public int GetWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    Animal(int weight, Season season, Color color){
        this.weight =weight;
        this.season =season;
        this.color =color;
    }

    @Override
    public Season getCurrentSeason() {
        return season;
    }

    @Override
    public void changeSeason() {
        switch (season) {
            case WINTER -> this.season = Season.SPRING;
            case SPRING -> this.season = Season.SUMMER;
            case SUMMER -> this.season = Season.FALL;
            case FALL -> this.season = Season.WINTER;
        }
    }

    @Override
    public int compareTo(Object o) {

        return 0;
    }




}
