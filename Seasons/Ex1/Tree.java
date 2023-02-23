package Ex1;

import java.awt.*;

public abstract class Tree implements Comparable, Seasonable {
    protected int height;
    protected Season season;
    protected Color leavesColor;
    // TODO: Add auxiliary fields and functions.

    protected String status = "";

    public int GetHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Color getLeavesColor() {
        return leavesColor;
    }

    public void setLeavesColor(Color color) {
        this.leavesColor = color;
    }

    Tree(int height, Season season, Color leavesColor){
        this.height = height;
        this.season = season;
        this.leavesColor = leavesColor;
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
        // TODO: Implement.
        return 0;
    }
}
