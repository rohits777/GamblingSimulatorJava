package com.bridgelabz;
import java.util.Random;

public class GamblingSimulation {
    public static final int STAKE=100;
    public static final int BET=1;

    //check win or lose
    public void winOrLose(){
        Random random=new Random();
        int value= random.nextInt(2);

        if (value==1){
            System.out.println("player Win");
        }else
            System.out.println("player Lose");

    }
    public static void main(String[] args) {
        System.out.println("Welcome to gambling Simulation program");
        System.out.println("You have Stake every day = " +(STAKE));
        System.out.println("you bet every game = " +(BET));

        GamblingSimulation simulator= new GamblingSimulation();
        simulator.winOrLose();
    }
}
