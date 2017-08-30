package com.company;

public class Bomb extends Tile {
    boolean hidden = true;

    public Bomb() {
        super();
    }

    @Override
    public String toString() {
        if (hidden)
            return "#";
        return "*";
    }
}
