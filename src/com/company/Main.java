package com.company;

public class Main {

    public static void main(String[] args) {
        GameField gameField = new GameField();
        gameField.uncover(new Coordinates(10,8));

        String lines = gameField.toString();
        for (int i=0; i<9; i++) {
            String line = lines.substring(0, 10);
            lines = lines.substring(10,100-(i*10));
            System.out.println(line);
        }
        System.out.println(lines);
    }
}