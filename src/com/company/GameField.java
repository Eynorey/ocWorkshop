package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class GameField {
    public HashMap<Coordinates, Tile> tiles = new HashMap<Coordinates, Tile>();

    public GameField() {
        init();
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (Entry<Coordinates, Tile> each : tiles.entrySet()) {
            Tile tile = each.getValue();
            String value = tile.toString();
            sb.append(value);
        }
        return sb.toString();
    }

    private void init() {
        for (int i = 0; i < 100; i++) {
            int row = i%10 + 1;
            int col = i/10 + 1;
            Coordinates coords = new Coordinates(col, row);
            tiles.put(coords, new Tile());
        }

        MinePlacer mp = new MinePlacer();
        HashSet<Coordinates> minesCoords = mp.createSet();

        for (Coordinates each : minesCoords) {
            tiles.replace(each, new Bomb());
        }
    }

    public void uncover(Coordinates coords) {
        Tile toUncover = tiles.get(coords);
        toUncover.hidden = false;
    }
}