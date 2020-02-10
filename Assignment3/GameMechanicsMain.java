package GS222MH;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */

import java.util.Random;

public class GameMechanicsMain {
    public static void main(String[] args) {
        Random number = new Random();
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_PURPLE = "\u001B[35m";
        int times = 1;
        int heroXP = 100;
        int enemieXP = 100;
        int setWeapons = number.nextInt(3) + 1;
        int setTypOfWeapons = number.nextInt(3) + 1;
        int heroDice1 = number.nextInt(6) + 1;
        int heroDice2 = number.nextInt(6) + 1;
        int heroDice3 = number.nextInt(6) + 1;
        int enemieDice1 = number.nextInt(5) + 1;
        int enemieDice2 = number.nextInt(5) + 1;
        int enemieDice3 = number.nextInt(5) + 1;
        int enemieDice4 = number.nextInt(5) + 1;
        System.out.println("Game is starting");

        GameMechanics test = new GameMechanics("HERO", "ENEMY", heroDice1, heroDice2, heroDice3,
                enemieDice1, enemieDice2, enemieDice3, enemieDice4, setWeapons, setTypOfWeapons);

        System.out.println(ANSI_GREEN + test.getHeroName() + ANSI_RESET + " has " + heroXP + ANSI_PURPLE + "XP" + ANSI_RESET + ". And the " + ANSI_RED +
                test.getEnemieName() + ANSI_RESET + " has " + enemieXP + ANSI_PURPLE + "XP" + ANSI_RESET);


        boolean Alive = true;
        while (Alive) {
            setWeapons = number.nextInt(3) + 1;
            setTypOfWeapons = number.nextInt(3) + 1;
            heroDice1 = number.nextInt(6) + 1;
            heroDice2 = number.nextInt(6) + 1;
            heroDice3 = number.nextInt(6) + 1;
            enemieDice1 = number.nextInt(5) + 1;
            enemieDice2 = number.nextInt(5) + 1;
            enemieDice3 = number.nextInt(5) + 1;
            enemieDice4 = number.nextInt(5) + 1;

            GameMechanics game = new GameMechanics("HERO", "ENEMY", heroDice1, heroDice2, heroDice3,
                    enemieDice1, enemieDice2, enemieDice3, enemieDice4, setWeapons, setTypOfWeapons);

            System.out.println("Round " + times + ":");

            times++;
            if (game.getHeroSum() > game.getEnemieSum()) {
                System.out.println(ANSI_GREEN + game.getHeroName() + ANSI_RESET + " attacks " + ANSI_RED +
                        game.getEnemieName() + ANSI_RESET + " using "+ game.getWeaponsNameOfHero() + " ,but " +  ANSI_RED + game.getEnemieName() + ANSI_RESET + " is still alive, and the " + ANSI_PURPLE + "XP " + ANSI_RESET + "of " + ANSI_RED + game.getEnemieName() + ANSI_RESET + " is " + (enemieXP - game.getdamageOfHeroWeapons()));
                enemieXP = enemieXP - game.getdamageOfHeroWeapons();
            } else if (game.getHeroSum() < game.getEnemieSum()) {
                System.out.println(ANSI_RED + game.getEnemieName() + ANSI_RESET + " attacks " + ANSI_GREEN +
                        game.getHeroName() + ANSI_RESET + " using "+ game.getWeaponsNameOfEnemy() + " ,but " + ANSI_GREEN + game.getHeroName() + ANSI_RESET + " is still alive, and the " + ANSI_PURPLE + "XP " + ANSI_RESET + "of " + ANSI_GREEN + game.getHeroName() + ANSI_RESET + " is " + (heroXP - game.getdamageOfEnemyWeapons()));
                heroXP = heroXP - game.getdamageOfEnemyWeapons();
            } else {
                System.out.println("In this round, the powers are equal! Therefore no one attacks!");
            }

            if ((heroXP - game.getdamageOfEnemyWeapons()) <= 1) {
                System.out.println(ANSI_RED + game.getEnemieName() + ANSI_RESET + " attacks " + ANSI_GREEN +
                        game.getHeroName() + ANSI_RESET + " for the last time. " + game.getHeroName() + " is now dead.");
                System.out.println(ANSI_RED + game.getEnemieName() + ANSI_RESET + " has defeated " + ANSI_GREEN + game.getHeroName() + ANSI_RESET + ". GAME OVER");
                Alive = false;
            } else if ((enemieXP - game.getdamageOfHeroWeapons()) <= 1) {
                System.out.println(ANSI_GREEN + game.getHeroName() + ANSI_RESET + " attacks " + ANSI_RED +
                        game.getEnemieName() + ANSI_RESET + " for the last time. " + ANSI_RED + game.getEnemieName() + ANSI_RESET + " is now dead.");
                System.out.println(ANSI_GREEN + game.getHeroName() + ANSI_RESET + " has defeated " + ANSI_RED + game.getEnemieName() + ANSI_RESET + " YOU ARE THE VICTOR");
                Alive = false;
            }
        }
    }
}


