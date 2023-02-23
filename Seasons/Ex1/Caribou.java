package Ex1;
public class Caribou extends Animal {

    Caribou(int weight, Season season) {
        // TODO: Implement.
        super(0, null, null);
    }

    @Override
    public String toString(){
        String res = "";
        res += status + " My weight is:" + this.weight + "and my color is:" + this.color;
        return res;
    }

    @Override
    public void changeSeason() {
        super.changeSeason();
        switch (this.getCurrentSeason()) {
            case WINTER:
                this.color = Color.WHITE;
                this.status = "I am migrating south";
                break;
            case SPRING:
                this.color = Color.BROWN;
                break;
            case SUMMER:
                this.status = "I am migrating south";
                break;
            case FALL:
                break;
        }
    }


}
