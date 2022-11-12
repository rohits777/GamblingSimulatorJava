package com.bridgelabz;


public class GamblingSimulation {
    public static final int STAKE = 100;
    public static final int BET = 1;
    static int stake=100;


    //check win or lose
    public void winOrLose() {
        int value=(int)(Math.random()*2);

        while(stake > 50 && stake < 150){

            if (value==1) {
                stake++;
                System.out.println("player Win stake is:" + stake);
            }else{
                stake--;
                    System.out.println("player Lose stake is:" +stake);}

            }

    }

    public static void main(String[] args) {
        System.out.println("Welcome to gambling Simulation program");
        System.out.println("You have Stake every day = " + (STAKE));
        System.out.println("you bet every game = " + (BET));

        GamblingSimulation simulator = new GamblingSimulation();
        simulator.winOrLose();
    }
}

