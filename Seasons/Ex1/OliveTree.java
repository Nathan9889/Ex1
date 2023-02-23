package Ex1;
public class OliveTree extends Tree {


    OliveTree(int height, Season season) {
        // TODO: Implement.
        super(0,null,null);
    }

    @Override
    public String toString() {
        String res = "";
        res += status + " My height is:" + this.height + "and my color is:" + this.leavesColor;
        return res;
    }
    @Override
    public void changeSeason() {
        super.changeSeason();
        switch (this.getCurrentSeason()) {
            case WINTER:
                this.height = this.height +5;
                break;
            case SPRING, SUMMER:
                this.height = this.height +10;
                break;
            case FALL:
                this.height = this.height + 5;
                this.status = "I give fruit";
                break;
        }
    }
}
