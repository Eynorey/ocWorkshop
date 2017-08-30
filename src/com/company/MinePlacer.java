package com.company;

import java.util.HashSet;
import java.util.Random;

public class MinePlacer {

    public MinePlacer() {
    }

    public HashSet<Coordinates> createSet() {
        HashSet<Coordinates> minesSet = new HashSet<Coordinates>();
        while(minesSet.size() < 10) {
            Random rand = new Random();
            int col = rand.nextInt(9) + 1;
            int row = rand.nextInt(9) + 1;
            Coordinates coords = new Coordinates(col, row);
            minesSet.add(coords);
        }
        return minesSet;
    }
}
