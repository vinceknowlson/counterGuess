package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int position = 0;
        int a = -1;
        int pointsTotal = 0;
        String[] colList = {"Blue", "Red", "Green", "Yellow"};
        String[] randColours = new String[10];
        for (int i = 0; i < 10; i++) {
            int randomPlace = random.nextInt(4);
            String randCol = colList[randomPlace];
            randColours[a + 1] = randCol;
            a = (a + 1);
        }

        System.out.println("What is your guess; Blue, Green, Yellow or Red?");
        String guessCol = input.next();
        if (guessCol.equals("Blue")) {

        }
    }
}
