package com.company;

public class Neighbor extends Tile {
    boolean hidden = true;

    public Neighbor() {
        super();
    }

    @Override
    public String toString() {
        //TODO: get count of neighbors
        if (hidden)
            return "#";
        return "9";
    }

}
