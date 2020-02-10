package GS222MH;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */

import java.util.Random;

public class GameMechanics {
    private int heroSum;
    private int enemieSum;
    private String heroName;
    private String enemieName;
    private int damageOfHeroWeapons;
    private int damageOfEnemyWeapons;
    private String weaponsNameOfHero;
    private String weaponsNameOfEnemy;




    public GameMechanics() {
    }

    public GameMechanics(String hero, String enemie, int heroDice1, int heroDice2, int heroDice3,
                         int enemieDice1, int enemieDice2, int enemieDice3, int enemieDice4, int rndWeapons, int setTypOfWeapons) {
        setHeroName(hero);
        setEnemieName(enemie);
        setHeroSum(heroDice1, heroDice2, heroDice3);
        setEnemieSum(enemieDice1, enemieDice2, enemieDice3, enemieDice4);
        setHeroWeapon(rndWeapons, setTypOfWeapons);
        setEnemyWeapon(rndWeapons);
    }


    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String hero) {
        this.heroName = hero;
    }

    public String getEnemieName() {
        return enemieName;
    }

    public void setEnemieName(String enemie) {
        this.enemieName = enemie;
    }

    public int getHeroSum() {
        return heroSum;
    }

    //Set summan av tre kastnignar av en tärning. (Tärning är från 1 till 6)
    public void setHeroSum(int heroDice1, int heroDice2, int heroDice3) {
        int sum = heroDice1 + heroDice2 + heroDice3;
        this.heroSum = sum;
    }

    public int getEnemieSum() {
        return enemieSum;
    }

    //Set summan av fyra kastnignar av en tärning. (Tärning är från 1 till 5)
    public void setEnemieSum(int enemieDice1, int enemieDice2, int enemieDice3, int enemieDice4) {
        int sum = enemieDice1 + enemieDice2 + enemieDice3 + enemieDice4;
        this.enemieSum = sum;
    }

    public int getdamageOfHeroWeapons() {
        return damageOfHeroWeapons;
    }

    public int getdamageOfEnemyWeapons() {
        return damageOfEnemyWeapons;
    }

    /*
    Här har jag två rnd (1 til 3). Den fösta är för att bestämma hur många gånger kommer Hero att kasta en tärning.
    Den andra är för att adda ett litet specifikt, till exempel om hero kastar en tärning tre gånger och får 11, så kastar en gång till och får 2
    så damage ska vara 11 * 2 = 22.
     */
    public void setHeroWeapon(int rndWeapons, int setTypOfWeapon) {
        int sum = 0;
        Random number = new Random();
        while (rndWeapons != 0) {
            int weaponsOfRnd = number.nextInt(6) + 1;
            sum += weaponsOfRnd;
            rndWeapons--;
        }
        if (setTypOfWeapon == 2){
            this.damageOfHeroWeapons = sum * 2;
            this.weaponsNameOfHero = "M16";

        }
        else if (setTypOfWeapon == 3){
            this.damageOfHeroWeapons = sum + 6;
            this.weaponsNameOfHero = "Bazoka";

        }
        else if (setTypOfWeapon == 1){
            this.damageOfHeroWeapons = sum + 3;
            this.weaponsNameOfHero = "Glock 17";
        }
    }
    public String getWeaponsNameOfHero() {
        return weaponsNameOfHero;
    }
    public String getWeaponsNameOfEnemy() {
        return weaponsNameOfEnemy;
    }


    /*
    Enemy har bara ett vapen. Random för att bestämma hur många gånger kommer Enemy att kasta en tärning. Sen adderar de ihop.
     */
    public void setEnemyWeapon(int rndWeapons) {
        int sum = 0;
        Random number = new Random();
        while (rndWeapons != 0) {
            int weaponsOfRnd = number.nextInt(6) + 1;
            sum += weaponsOfRnd;
            rndWeapons--;
        }
        this.damageOfEnemyWeapons = sum;
        this.weaponsNameOfEnemy = "AK-47";
    }

}

