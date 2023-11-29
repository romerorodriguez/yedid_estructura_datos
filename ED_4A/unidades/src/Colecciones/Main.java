package Colecciones;

import Colecciones.ArraySet;

public class Main {
    public static void main(String[] args) {

        final int NUM_BALLS = 75, NULL_PULLS = 10;
        ArraySet<BingoBall> bingo = new ArraySet<>();
        BingoBall ball;
        for (int num = 1; num <= NUM_BALLS; num++) {
            ball = new BingoBall(num);
            bingo.add(ball);
        }

        System.out.println(bingo);
    }
}
