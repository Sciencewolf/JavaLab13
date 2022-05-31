package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
	    makeAction action = new makeAction();
        action.action();
    }
}

class Alien{
    public static Random rand = new Random();
    public Scanner sc = new Scanner(System.in);
    public String firstName = "Alfred Alien";
    public String secondName = "Poco Alien";
    public int HP = rand.nextInt(1000);
    public static boolean SHIELD = true;

    public void introduction(){
        System.out.println("Welcome to ");

    }

    static class Weapons{
        public void laser(){
            int damage = rand.nextInt(300);
        }
        public void proton_pistol(){
            int damage = rand.nextInt(350);
        }
        public void shield(){
            SHIELD = rand.nextBoolean();
            if(SHIELD){
                int shield = rand.nextInt(100);
            }
        }
    }
}

class Player{
    public static Random rand = new Random();
    public Scanner sc = new Scanner(System.in);
    public String playerName = "";
    public int HP = rand.nextInt(1000);
    public static boolean SHIELD = rand.nextBoolean();


    public void inputYourName(){
        System.out.print("Enter your name: ");
        playerName = sc.next();
    }

    static class Weapons{
        public void Axe(){
            int damage = rand.nextInt(300);
        }
        public void sword(){
            int damage = rand.nextInt(350);
        }
        public void shield(){
            int shield = rand.nextInt(100);
        }
    }
}

class makeAction{
    public void action(){
        Alien alien = new Alien();
        Alien.Weapons alienWeapons = new Alien.Weapons();
        Player player = new Player();
        Player.Weapons  playerWeapons = new Player.Weapons();
        playerWeapons.Axe();
    }
}