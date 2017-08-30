package com.company;

public class Tile {
    boolean hidden = true;

    public Tile() {
    }

    @Override
    public String toString() {
        if (hidden)
            return "#";
        return ".";
    }

}
