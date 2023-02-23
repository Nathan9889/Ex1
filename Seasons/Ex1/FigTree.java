package Ex1;
public class FigTree extends Tree {


    FigTree(int height, Season season) {
        super(0,null,null);
        this.height = height;
        this.season = season;
    }


    @Override
    public String toString(){
        String res = "";
        res += status + " My height is:" + this.height + "and my color is:" + this.leavesColor;
        return res;
    }
    @Override
    public void changeSeason() {
        super.changeSeason();
        switch (this.getCurrentSeason()) {
            case WINTER:
                this.height = this.height + 20;
                this.status = "I have no leaves";
                break;
            case SPRING:
                this.height = this.height + 30;
                break;
            case SUMMER:
                this.height = this.height + 30;
                this.status = "I give fruit";
                break;
            case FALL:
                this.height = this.height + 20;
                this.leavesColor = Color.YELLOW;
                break;
        }
    }
}
