package com.company;

import java.util.Scanner;

import com.company.Caracters;

public class Main {
    public static void main(String[] args) {
        game();
    }

    static boolean playing = false;
    static Caracters bear = new Caracters(10, 1, 2, "Bear");
    static Caracters mouse = new Caracters(10, 1, 4, "Mouse");

    public static void game() {
        Scanner user_input = new Scanner(System.in);
        String wantPlay;
        String wantPlay1;
        int count = 2;
        System.out.println(" Bear, do you  to play a fighting game?:(+/-) ");
        wantPlay = user_input.next();
        System.out.println(" Mouse, do you  to play a fighting game?:(+/-) ");
        wantPlay1 = user_input.next();
        if (wantPlay.equals("+") || wantPlay1.equals("+")) {
            playing = true;
        }
        while (playing) {

            System.out.println(bear.name + " has " + bear.health + " health remaining.");
            System.out.println(mouse.name + " has " + mouse.health + " health remaining.");
            if (!mouse.checkHealth(bear)) {
                System.out.println(bear.name + " wins");
                playing = false;
            } else if (!bear.checkHealth(mouse)) {
                System.out.println(mouse.name + " wins");
                playing = false;

            } else {
                if (count % 2 == 0) {
                    System.out.println(bear.name + ", your turn");
                    int a = bear.attack(mouse);
                    System.out.println(mouse.name + " lost " + a + " points from his health");
                    mouse.health = mouse.attacked(bear, a);
                    count += 1;

                } else {
                    System.out.println(mouse.name + ",your turn");
                    int a = mouse.attack(bear);
                    bear.health = mouse.attacked(mouse, a);
                    System.out.println(bear.name + " lost " + a + " points from his health");
                    count += 1;
                }
            }
        }
    }
}
