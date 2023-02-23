package Ex1;
public class Bear extends Animal {

    Bear(int weight, Season season) {
        // TODO: Implement.
        super(0,null,null);

    }
    @Override
    public String toString(){
        String res = "";
        res += status +" My weight is:" + this.weight + "and my color is:" + this.color;
        return res;
    }


    @Override
    public void changeSeason() {
        super.changeSeason();
        int w = this.weight;
        switch (this.getCurrentSeason()) {
            case WINTER:
                this.weight = Math.round((float)0.8* w);
                this.status = "I am sleeping";
                break;
            case SPRING:
                this.weight = Math.round((float)0.75* w);
                break;
            case SUMMER:
                this.weight = Math.round((float)4/3* w);
                break;
            case FALL:
                this.weight = Math.round((float)1.25* w);
                break;
        }
        color = Color.BROWN;
    }
}
