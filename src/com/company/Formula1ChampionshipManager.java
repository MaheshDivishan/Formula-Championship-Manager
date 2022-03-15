package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Formula1ChampionshipManager implements ChampionshipManager {
    Formula1Driver p1 = new Formula1Driver();
    Formula1Driver p2 = new Formula1Driver();
    Formula1Driver p3 = new Formula1Driver();
    Formula1Driver p4 = new Formula1Driver();
    Formula1Driver p5 = new Formula1Driver();
    Formula1Driver p6 = new Formula1Driver();
    Formula1Driver p7 = new Formula1Driver();
    Formula1Driver p8 = new Formula1Driver();
    Formula1Driver p9 = new Formula1Driver();
    Formula1Driver p10 = new Formula1Driver();

    public static ArrayList<Formula1Driver> pread = new ArrayList <>();

    public static int countb = 0;


     public void addPlayers(){
        Formula1Driver.s.add(0,p1);
        Formula1Driver.s.get(0).setName("empty");
        Formula1Driver.s.get(0).setTeam("empty");
        Formula1Driver.s.add(1,p2);
        Formula1Driver.s.get(1).setName("empty");
        Formula1Driver.s.get(1).setTeam("empty");
        Formula1Driver.s.add(2,p3);
        Formula1Driver.s.get(2).setName("empty");
        Formula1Driver.s.get(2).setTeam("empty");
        Formula1Driver.s.add(3,p4);
        Formula1Driver.s.get(3).setName("empty");
        Formula1Driver.s.get(3).setTeam("empty");
        Formula1Driver.s.add(4,p5);
        Formula1Driver.s.get(4).setName("empty");
        Formula1Driver.s.get(4).setTeam("empty");
        Formula1Driver.s.add(5,p6);
        Formula1Driver.s.get(5).setName("empty");
        Formula1Driver.s.get(5).setTeam("empty");
        Formula1Driver.s.add(6,p7);
        Formula1Driver.s.get(6).setName("empty");
        Formula1Driver.s.get(6).setTeam("empty");
        Formula1Driver.s.add(7,p8);
        Formula1Driver.s.get(7).setName("empty");
        Formula1Driver.s.get(7).setTeam("empty");
        Formula1Driver.s.add(8,p9);
        Formula1Driver.s.get(8).setName("empty");
        Formula1Driver.s.get(8).setTeam("empty");
        Formula1Driver.s.add(9,p10);
        Formula1Driver.s.get(9).setName("empty");
        Formula1Driver.s.get(9).setTeam("empty");
    }




    @Override
    public void addRace() {  // add players to race
        while (true) {
            countb++;
            Scanner in = new Scanner(System.in);
            System.out.print("Enter date(dd/mm/yy) :");
            String s = in.next();
            Date.date[countb] = s;
            int count =0;
            for (int c = 0; c < Formula1Driver.s.size(); c++) {
                if (Formula1Driver.s.get(c).getName().equals("empty")){
                    count++;

                }


            }
            int players = 10 -count;
            Date.participants[countb] = players;



            for (int x = 0; x < Formula1Driver.s.size(); x++) {
                if (!Formula1Driver.s.get(x).getName().equals("empty"))
                    System.out.println("[" + x + "] " + Formula1Driver.s.get(x).getName() + " - " + Formula1Driver.s.get(x).getTeam());
            }

            for (int x = 0; x < 10-count; x++) {
                System.out.println("-----------------------------------------");
                System.out.print("Choose player number :");
                int playerNumber = in.nextInt();
                System.out.print("Give player Position  : ");
                int playerPosition = in.nextInt();
                Formula1Driver.s.get(playerNumber).p.add(playerPosition);




                jtable.points = Formula1Driver.points;
                ascendingOrder.points = Formula1Driver.points;
                GenerateRace.points = Formula1Driver.points;


            }
            break;

        }

            int player1Points = countPoint(p1.count(Formula1Driver.s.get(0).p, 1), p1.count(Formula1Driver.s.get(0).p, 2), p1.count(Formula1Driver.s.get(0).p, 3), p1.count(Formula1Driver.s.get(0).p, 4), p1.count(Formula1Driver.s.get(0).p, 5), p1.count(Formula1Driver.s.get(0).p, 6), p1.count(Formula1Driver.s.get(0).p, 7), p1.count(Formula1Driver.s.get(0).p, 8), p1.count(Formula1Driver.s.get(0).p, 9), p1.count(Formula1Driver.s.get(0).p, 10));
            int player2Points = countPoint(p1.count(Formula1Driver.s.get(1).p, 1), p1.count(Formula1Driver.s.get(1).p, 2), p1.count(Formula1Driver.s.get(1).p, 3), p1.count(Formula1Driver.s.get(1).p, 4), p1.count(Formula1Driver.s.get(1).p, 5), p1.count(Formula1Driver.s.get(1).p, 6), p1.count(Formula1Driver.s.get(1).p, 7), p1.count(Formula1Driver.s.get(1).p, 8), p1.count(Formula1Driver.s.get(1).p, 9), p1.count(Formula1Driver.s.get(1).p, 10));
            int player3Points = countPoint(p1.count(Formula1Driver.s.get(2).p, 1), p1.count(Formula1Driver.s.get(2).p, 2), p1.count(Formula1Driver.s.get(2).p, 3), p1.count(Formula1Driver.s.get(2).p, 4), p1.count(Formula1Driver.s.get(2).p, 5), p1.count(Formula1Driver.s.get(2).p, 6), p1.count(Formula1Driver.s.get(2).p, 7), p1.count(Formula1Driver.s.get(2).p, 8), p1.count(Formula1Driver.s.get(2).p, 9), p1.count(Formula1Driver.s.get(2).p, 10));
            int player4Points = countPoint(p1.count(Formula1Driver.s.get(3).p, 1), p1.count(Formula1Driver.s.get(3).p, 2), p1.count(Formula1Driver.s.get(3).p, 3), p1.count(Formula1Driver.s.get(3).p, 4), p1.count(Formula1Driver.s.get(3).p, 5), p1.count(Formula1Driver.s.get(3).p, 6), p1.count(Formula1Driver.s.get(3).p, 7), p1.count(Formula1Driver.s.get(3).p, 8), p1.count(Formula1Driver.s.get(3).p, 9), p1.count(Formula1Driver.s.get(3).p, 10));
            int player5Points = countPoint(p1.count(Formula1Driver.s.get(4).p, 1), p1.count(Formula1Driver.s.get(4).p, 2), p1.count(Formula1Driver.s.get(4).p, 3), p1.count(Formula1Driver.s.get(4).p, 4), p1.count(Formula1Driver.s.get(4).p, 5), p1.count(Formula1Driver.s.get(4).p, 6), p1.count(Formula1Driver.s.get(4).p, 7), p1.count(Formula1Driver.s.get(4).p, 8), p1.count(Formula1Driver.s.get(4).p, 9), p1.count(Formula1Driver.s.get(4).p, 10));
            int player6Points = countPoint(p1.count(Formula1Driver.s.get(5).p, 1), p1.count(Formula1Driver.s.get(5).p, 2), p1.count(Formula1Driver.s.get(5).p, 3), p1.count(Formula1Driver.s.get(5).p, 4), p1.count(Formula1Driver.s.get(5).p, 5), p1.count(Formula1Driver.s.get(5).p, 6), p1.count(Formula1Driver.s.get(5).p, 7), p1.count(Formula1Driver.s.get(5).p, 8), p1.count(Formula1Driver.s.get(5).p, 9), p1.count(Formula1Driver.s.get(5).p, 10));
            int player7Points = countPoint(p1.count(Formula1Driver.s.get(6).p, 1), p1.count(Formula1Driver.s.get(6).p, 2), p1.count(Formula1Driver.s.get(6).p, 3), p1.count(Formula1Driver.s.get(6).p, 4), p1.count(Formula1Driver.s.get(6).p, 5), p1.count(Formula1Driver.s.get(6).p, 6), p1.count(Formula1Driver.s.get(6).p, 7), p1.count(Formula1Driver.s.get(6).p, 8), p1.count(Formula1Driver.s.get(6).p, 9), p1.count(Formula1Driver.s.get(6).p, 10));
            int player8Points = countPoint(p1.count(Formula1Driver.s.get(7).p, 1), p1.count(Formula1Driver.s.get(7).p, 2), p1.count(Formula1Driver.s.get(7).p, 3), p1.count(Formula1Driver.s.get(7).p, 4), p1.count(Formula1Driver.s.get(7).p, 5), p1.count(Formula1Driver.s.get(7).p, 6), p1.count(Formula1Driver.s.get(7).p, 7), p1.count(Formula1Driver.s.get(7).p, 8), p1.count(Formula1Driver.s.get(7).p, 9), p1.count(Formula1Driver.s.get(7).p, 10));
            int player9Points = countPoint(p1.count(Formula1Driver.s.get(8).p, 1), p1.count(Formula1Driver.s.get(8).p, 2), p1.count(Formula1Driver.s.get(8).p, 3), p1.count(Formula1Driver.s.get(8).p, 4), p1.count(Formula1Driver.s.get(8).p, 5), p1.count(Formula1Driver.s.get(8).p, 6), p1.count(Formula1Driver.s.get(8).p, 7), p1.count(Formula1Driver.s.get(8).p, 8), p1.count(Formula1Driver.s.get(8).p, 9), p1.count(Formula1Driver.s.get(8).p, 10));
            int player10Points = countPoint(p1.count(Formula1Driver.s.get(9).p, 1), p1.count(Formula1Driver.s.get(9).p, 2), p1.count(Formula1Driver.s.get(9).p, 3), p1.count(Formula1Driver.s.get(9).p, 4), p1.count(Formula1Driver.s.get(9).p, 5), p1.count(Formula1Driver.s.get(9).p, 6), p1.count(Formula1Driver.s.get(9).p, 7), p1.count(Formula1Driver.s.get(9).p, 8), p1.count(Formula1Driver.s.get(9).p, 9), p1.count(Formula1Driver.s.get(9).p, 10));


        Formula1Driver.points[0] = player1Points;
        Formula1Driver.points[1] = player2Points;
        Formula1Driver.points[2] = player3Points;
        Formula1Driver.points[3] = player4Points;
        Formula1Driver.points[4] = player5Points;
        Formula1Driver.points[5] = player6Points;
        Formula1Driver.points[6] = player7Points;
        Formula1Driver.points[7] = player8Points;
        Formula1Driver.points[8] = player9Points;
        Formula1Driver.points[9] = player10Points;


        int temp;
        for (int i = 0; i < Formula1Driver.points.length; i++) {
            for (int j = i; j < Formula1Driver.points.length; j++) {
                if (Formula1Driver.points[i] < Formula1Driver.points[j]) {
                    temp = Formula1Driver.points[i];
                    Formula1Driver.points[i] = Formula1Driver.points[j];
                    Formula1Driver.points[j] = temp;
                }
            }
        }

        for (int i = 0; i < Formula1Driver.s.size(); i++) {
            if (Formula1Driver.points[i] == player1Points) {
                ascendingOrder.s[i] = Formula1Driver.s.get(0).getName();
                ascendingOrder.team[i] = Formula1Driver.s.get(0).getTeam();
                int firstPositionCount = p1.count(Formula1Driver.s.get(0).p, 1);
                int secondPositionCount = p1.count(Formula1Driver.s.get(0).p, 2);
                int thirdPositionCount = p1.count(Formula1Driver.s.get(0).p, 3);
                First.firstposition[i] = firstPositionCount;
                First.secondposition[i] = secondPositionCount;
                First.thirdtposition[i] = thirdPositionCount;


            }
        }
        for (int i = 0; i < Formula1Driver.s.size(); i++) {
            if (Formula1Driver.points[i] == player2Points) {
                ascendingOrder.s[i] = Formula1Driver.s.get(1).getName();
                ascendingOrder.team[i] = Formula1Driver.s.get(1).getTeam();
                int firstPositionCount = p1.count(Formula1Driver.s.get(1).p, 1);
                int secondPositionCount = p1.count(Formula1Driver.s.get(1).p, 2);
                int thirdPositionCount = p1.count(Formula1Driver.s.get(1).p, 3);
                First.firstposition[i] = firstPositionCount;
                First.secondposition[i] = secondPositionCount;
                First.thirdtposition[i] = thirdPositionCount;


            }

            if (Formula1Driver.points[i] == player3Points) {
                ascendingOrder.s[i] = Formula1Driver.s.get(2).getName();
                ascendingOrder.team[i] = Formula1Driver.s.get(2).getTeam();
                int firstPositionCount = p1.count(Formula1Driver.s.get(2).p, 1);
                int secondPositionCount = p1.count(Formula1Driver.s.get(2).p, 2);
                int thirdPositionCount = p1.count(Formula1Driver.s.get(2).p, 3);
                First.firstposition[i] = firstPositionCount;
                First.secondposition[i] = secondPositionCount;
                First.thirdtposition[i] = thirdPositionCount;


            }

            if (Formula1Driver.points[i] == player4Points) {
                ascendingOrder.s[i] = Formula1Driver.s.get(3).getName();
                ascendingOrder.team[i] = Formula1Driver.s.get(3).getTeam();
                int firstPositionCount = p1.count(Formula1Driver.s.get(3).p, 1);
                int secondPositionCount = p1.count(Formula1Driver.s.get(3).p, 2);
                int thirdPositionCount = p1.count(Formula1Driver.s.get(3).p, 3);
                First.firstposition[i] = firstPositionCount;
                First.secondposition[i] = secondPositionCount;
                First.thirdtposition[i] = thirdPositionCount;


            }

            if (Formula1Driver.points[i] == player5Points) {
                ascendingOrder.s[i] = Formula1Driver.s.get(4).getName();
                ascendingOrder.team[i] = Formula1Driver.s.get(4).getTeam();
                int firstPositionCount = p1.count(Formula1Driver.s.get(4).p, 1);
                int secondPositionCount = p1.count(Formula1Driver.s.get(4).p, 2);
                int thirdPositionCount = p1.count(Formula1Driver.s.get(4).p, 3);
                First.firstposition[i] = firstPositionCount;
                First.secondposition[i] = secondPositionCount;
                First.thirdtposition[i] = thirdPositionCount;


            }


            if (Formula1Driver.points[i] == player6Points) {
                ascendingOrder.s[i] = Formula1Driver.s.get(5).getName();
                ascendingOrder.team[i] = Formula1Driver.s.get(5).getTeam();
                int firstPositionCount = p1.count(Formula1Driver.s.get(5).p, 1);
                int secondPositionCount = p1.count(Formula1Driver.s.get(5).p, 2);
                int thirdPositionCount = p1.count(Formula1Driver.s.get(5).p, 3);
                First.firstposition[i] = firstPositionCount;
                First.secondposition[i] = secondPositionCount;
                First.thirdtposition[i] = thirdPositionCount;
            }


            if (Formula1Driver.points[i] == player7Points) {
                ascendingOrder.s[i] = Formula1Driver.s.get(6).getName();
                ascendingOrder.team[i] = Formula1Driver.s.get(6).getTeam();
                int firstPositionCount = p1.count(Formula1Driver.s.get(6).p, 1);
                int secondPositionCount = p1.count(Formula1Driver.s.get(6).p, 2);
                int thirdPositionCount = p1.count(Formula1Driver.s.get(6).p, 3);
                First.firstposition[i] = firstPositionCount;
                First.secondposition[i] = secondPositionCount;
                First.thirdtposition[i] = thirdPositionCount;


            }


            if (Formula1Driver.points[i] == player8Points) {
                ascendingOrder.s[i] = Formula1Driver.s.get(7).getName();
                ascendingOrder.team[i] = Formula1Driver.s.get(7).getTeam();
                int firstPositionCount = p1.count(Formula1Driver.s.get(7).p, 1);
                int secondPositionCount = p1.count(Formula1Driver.s.get(7).p, 2);
                int thirdPositionCount = p1.count(Formula1Driver.s.get(7).p, 3);
                First.firstposition[i] = firstPositionCount;
                First.secondposition[i] = secondPositionCount;
                First.thirdtposition[i] = thirdPositionCount;


            }


            if (Formula1Driver.points[i] == player9Points) {
                ascendingOrder.s[i] = Formula1Driver.s.get(8).getName();
                ascendingOrder.team[i] = Formula1Driver.s.get(8).getTeam();
                int firstPositionCount = p1.count(Formula1Driver.s.get(8).p, 1);
                int secondPositionCount = p1.count(Formula1Driver.s.get(8).p, 2);
                int thirdPositionCount = p1.count(Formula1Driver.s.get(8).p, 3);
                First.firstposition[i] = firstPositionCount;
                First.secondposition[i] = secondPositionCount;
                First.thirdtposition[i] = thirdPositionCount;


            }


            if (Formula1Driver.points[i] == player10Points) {
                ascendingOrder.s[i] = Formula1Driver.s.get(9).getName();
                ascendingOrder.team[i] = Formula1Driver.s.get(9).getTeam();
                int firstPositionCount = p1.count(Formula1Driver.s.get(9).p, 1);
                int secondPositionCount = p1.count(Formula1Driver.s.get(9).p, 2);
                int thirdPositionCount = p1.count(Formula1Driver.s.get(9).p, 3);
                First.firstposition[i] = firstPositionCount;
                First.secondposition[i] = secondPositionCount;
                First.thirdtposition[i] = thirdPositionCount;

            }
            int player1firstCount = p1.count(Formula1Driver.s.get(0).p, 1);
            int player2firstCount = p1.count(Formula1Driver.s.get(1).p, 1);
            int player3firstCount = p1.count(Formula1Driver.s.get(2).p, 1);
            int player4firstCount = p1.count(Formula1Driver.s.get(3).p, 1);
            int player5firstCount = p1.count(Formula1Driver.s.get(4).p, 1);
            int player6firstCount = p1.count(Formula1Driver.s.get(5).p, 1);
            int player7firstCount = p1.count(Formula1Driver.s.get(6).p, 1);
            int player8firstCount = p1.count(Formula1Driver.s.get(7).p, 1);
            int player9firstCount = p1.count(Formula1Driver.s.get(8).p, 1);
            int player10firstCount = p1.count(Formula1Driver.s.get(9).p, 1);
            First.firstPositionCount[0] = player1firstCount;
            First.firstPositionCount[1] = player2firstCount;
            First.firstPositionCount[2] = player3firstCount;
            First.firstPositionCount[3] = player4firstCount;
            First.firstPositionCount[4] = player5firstCount;
            First.firstPositionCount[6] = player7firstCount;
            First.firstPositionCount[7] = player8firstCount;
            First.firstPositionCount[8] = player9firstCount;
            First.firstPositionCount[9] = player10firstCount;

            int s;
            for (int x = 0; x < First.firstPositionCount.length; x++) {
                for (int j = x; j < First.firstPositionCount.length; j++) {
                    if (First.firstPositionCount[x] < First.firstPositionCount[j]) {
                        s = First.firstPositionCount[x];
                        First.firstPositionCount[x] = First.firstPositionCount[j];
                        First.firstPositionCount[j] = s;
                    }
                    int count =0;
                    for (int c = 0; c < Formula1Driver.s.size(); c++) {
                        if (Formula1Driver.s.get(c).getName().equals("empty")){
                            count++;

                        }


                    }

                    for (int y = 0; i < Formula1Driver.s.size() - count ; y++) {
                        if(!Formula1Driver.s.get(0).getName().equals("empty")){
                            if (First.firstPositionCount[i] == player1firstCount) {
                                First.c[i] = Formula1Driver.s.get(0).getName();
                                First.teams[i] = Formula1Driver.s.get(0).getTeam();
                            }

                        }
                        if (!Formula1Driver.s.get(1).getName().equals("empty")){
                            if (First.firstPositionCount[i] == player2firstCount) {
                                First.c[i] = Formula1Driver.s.get(1).getName();
                                First.teams[i] = Formula1Driver.s.get(1).getTeam();
                            }

                        }

                        if (!Formula1Driver.s.get(2).getName().equals("empty")){
                            if (First.firstPositionCount[i] == player3firstCount) {
                                First.c[i] = Formula1Driver.s.get(2).getName();
                                First.teams[i] = Formula1Driver.s.get(2).getTeam();
                            }

                        }
                        if (!Formula1Driver.s.get(3).getName().equals("empty")){
                            if (First.firstPositionCount[i] == player4firstCount) {
                                First.c[i] = Formula1Driver.s.get(3).getName();
                                First.teams[i] = Formula1Driver.s.get(3).getTeam();
                            }

                        }
                        if (!Formula1Driver.s.get(4).getName().equals("empty")){
                            if (First.firstPositionCount[i] == player5firstCount) {
                                First.c[i] = Formula1Driver.s.get(4).getName();
                                First.teams[i] = Formula1Driver.s.get(4).getTeam();
                            }

                        }
                        if (!Formula1Driver.s.get(5).getName().equals("empty")){
                            if (First.firstPositionCount[i] == player6firstCount) {
                                First.c[i] = Formula1Driver.s.get(5).getName();
                                First.teams[i] = Formula1Driver.s.get(5).getTeam();
                            }

                        }
                        if (!Formula1Driver.s.get(6).getName().equals("empty")){
                            if (First.firstPositionCount[i] == player7firstCount) {
                                First.c[i] = Formula1Driver.s.get(6).getName();
                                First.teams[i] = Formula1Driver.s.get(6).getTeam();
                            }

                        }
                        if (!Formula1Driver.s.get(7).getName().equals("empty")){
                            if (First.firstPositionCount[i] == player8firstCount) {
                                First.c[i] = Formula1Driver.s.get(7).getName();
                                First.teams[i] = Formula1Driver.s.get(7).getTeam();
                            }

                        }
                        if (!Formula1Driver.s.get(8).getName().equals("empty")){
                            if (First.firstPositionCount[i] == player9firstCount) {
                                First.c[i] = Formula1Driver.s.get(8).getName();
                                First.teams[i] = Formula1Driver.s.get(8).getTeam();
                            }

                        }
                        if (!Formula1Driver.s.get(9).getName().equals("empty")){
                            if (First.firstPositionCount[i] == player10firstCount) {
                                First.c[i] = Formula1Driver.s.get(9).getName();
                                First.teams[i] = Formula1Driver.s.get(9).getTeam();
                            }

                        }
                        Date.player[countb] = ascendingOrder.s[0];
                        Date.playerteam[countb] = ascendingOrder.team[0];
                        Date.playerPoint[countb] = ascendingOrder.points[0];

                       break;
                    }



                }
            }
        }
    }




    @Override
    public void driverTable() {  // this table include players positions,points,number of races and player ranking
        int player1Points = countPoint(p1.count(Formula1Driver.s.get(0).p, 1), p1.count(Formula1Driver.s.get(0).p, 2), p1.count(Formula1Driver.s.get(0).p, 3), p1.count(Formula1Driver.s.get(0).p, 4), p1.count(Formula1Driver.s.get(0).p, 5), p1.count(Formula1Driver.s.get(0).p, 6), p1.count(Formula1Driver.s.get(0).p, 7), p1.count(Formula1Driver.s.get(0).p, 8), p1.count(Formula1Driver.s.get(0).p, 9), p1.count(Formula1Driver.s.get(0).p, 10));
        int player2Points = countPoint(p1.count(Formula1Driver.s.get(1).p, 1), p1.count(Formula1Driver.s.get(1).p, 2), p1.count(Formula1Driver.s.get(1).p, 3), p1.count(Formula1Driver.s.get(1).p, 4), p1.count(Formula1Driver.s.get(1).p, 5), p1.count(Formula1Driver.s.get(1).p, 6), p1.count(Formula1Driver.s.get(1).p, 7), p1.count(Formula1Driver.s.get(1).p, 8), p1.count(Formula1Driver.s.get(1).p, 9), p1.count(Formula1Driver.s.get(1).p, 10));
        int player3Points = countPoint(p1.count(Formula1Driver.s.get(2).p, 1), p1.count(Formula1Driver.s.get(2).p, 2), p1.count(Formula1Driver.s.get(2).p, 3), p1.count(Formula1Driver.s.get(2).p, 4), p1.count(Formula1Driver.s.get(2).p, 5), p1.count(Formula1Driver.s.get(2).p, 6), p1.count(Formula1Driver.s.get(2).p, 7), p1.count(Formula1Driver.s.get(2).p, 8), p1.count(Formula1Driver.s.get(2).p, 9), p1.count(Formula1Driver.s.get(2).p, 10));
        int player4Points = countPoint(p1.count(Formula1Driver.s.get(3).p, 1), p1.count(Formula1Driver.s.get(3).p, 2), p1.count(Formula1Driver.s.get(3).p, 3), p1.count(Formula1Driver.s.get(3).p, 4), p1.count(Formula1Driver.s.get(3).p, 5), p1.count(Formula1Driver.s.get(3).p, 6), p1.count(Formula1Driver.s.get(3).p, 7), p1.count(Formula1Driver.s.get(3).p, 8), p1.count(Formula1Driver.s.get(3).p, 9), p1.count(Formula1Driver.s.get(3).p, 10));
        int player5Points = countPoint(p1.count(Formula1Driver.s.get(4).p, 1), p1.count(Formula1Driver.s.get(4).p, 2), p1.count(Formula1Driver.s.get(4).p, 3), p1.count(Formula1Driver.s.get(4).p, 4), p1.count(Formula1Driver.s.get(4).p, 5), p1.count(Formula1Driver.s.get(4).p, 6), p1.count(Formula1Driver.s.get(4).p, 7), p1.count(Formula1Driver.s.get(4).p, 8), p1.count(Formula1Driver.s.get(4).p, 9), p1.count(Formula1Driver.s.get(4).p, 10));
        int player6Points = countPoint(p1.count(Formula1Driver.s.get(5).p, 1), p1.count(Formula1Driver.s.get(5).p, 2), p1.count(Formula1Driver.s.get(5).p, 3), p1.count(Formula1Driver.s.get(5).p, 4), p1.count(Formula1Driver.s.get(5).p, 5), p1.count(Formula1Driver.s.get(5).p, 6), p1.count(Formula1Driver.s.get(5).p, 7), p1.count(Formula1Driver.s.get(5).p, 8), p1.count(Formula1Driver.s.get(5).p, 9), p1.count(Formula1Driver.s.get(5).p, 10));
        int player7Points = countPoint(p1.count(Formula1Driver.s.get(6).p, 1), p1.count(Formula1Driver.s.get(6).p, 2), p1.count(Formula1Driver.s.get(6).p, 3), p1.count(Formula1Driver.s.get(6).p, 4), p1.count(Formula1Driver.s.get(6).p, 5), p1.count(Formula1Driver.s.get(6).p, 6), p1.count(Formula1Driver.s.get(6).p, 7), p1.count(Formula1Driver.s.get(6).p, 8), p1.count(Formula1Driver.s.get(6).p, 9), p1.count(Formula1Driver.s.get(6).p, 10));
        int player8Points = countPoint(p1.count(Formula1Driver.s.get(7).p, 1), p1.count(Formula1Driver.s.get(7).p, 2), p1.count(Formula1Driver.s.get(7).p, 3), p1.count(Formula1Driver.s.get(7).p, 4), p1.count(Formula1Driver.s.get(7).p, 5), p1.count(Formula1Driver.s.get(7).p, 6), p1.count(Formula1Driver.s.get(7).p, 7), p1.count(Formula1Driver.s.get(7).p, 8), p1.count(Formula1Driver.s.get(7).p, 9), p1.count(Formula1Driver.s.get(7).p, 10));
        int player9Points = countPoint(p1.count(Formula1Driver.s.get(8).p, 1), p1.count(Formula1Driver.s.get(8).p, 2), p1.count(Formula1Driver.s.get(8).p, 3), p1.count(Formula1Driver.s.get(8).p, 4), p1.count(Formula1Driver.s.get(8).p, 5), p1.count(Formula1Driver.s.get(8).p, 6), p1.count(Formula1Driver.s.get(8).p, 7), p1.count(Formula1Driver.s.get(8).p, 8), p1.count(Formula1Driver.s.get(8).p, 9), p1.count(Formula1Driver.s.get(8).p, 10));
        int player10Points = countPoint(p1.count(Formula1Driver.s.get(9).p, 1), p1.count(Formula1Driver.s.get(9).p, 2), p1.count(Formula1Driver.s.get(9).p, 3), p1.count(Formula1Driver.s.get(9).p, 4), p1.count(Formula1Driver.s.get(9).p, 5), p1.count(Formula1Driver.s.get(9).p, 6), p1.count(Formula1Driver.s.get(9).p, 7), p1.count(Formula1Driver.s.get(9).p, 8), p1.count(Formula1Driver.s.get(9).p, 9), p1.count(Formula1Driver.s.get(9).p, 10));

        int player1Races = countRace(p1.count(Formula1Driver.s.get(0).p, 1), p1.count(Formula1Driver.s.get(0).p, 2), p1.count(Formula1Driver.s.get(0).p, 3), p1.count(Formula1Driver.s.get(0).p, 4), p1.count(Formula1Driver.s.get(0).p, 5), p1.count(Formula1Driver.s.get(0).p, 6), p1.count(Formula1Driver.s.get(0).p, 7), p1.count(Formula1Driver.s.get(0).p, 8), p1.count(Formula1Driver.s.get(0).p, 9), p1.count(Formula1Driver.s.get(0).p, 10));
        int player2Races = countRace(p1.count(Formula1Driver.s.get(1).p, 1), p1.count(Formula1Driver.s.get(1).p, 2), p1.count(Formula1Driver.s.get(1).p, 3), p1.count(Formula1Driver.s.get(1).p, 4), p1.count(Formula1Driver.s.get(1).p, 5), p1.count(Formula1Driver.s.get(1).p, 6), p1.count(Formula1Driver.s.get(1).p, 7), p1.count(Formula1Driver.s.get(1).p, 8), p1.count(Formula1Driver.s.get(1).p, 9), p1.count(Formula1Driver.s.get(1).p, 10));
        int player3Races = countRace(p1.count(Formula1Driver.s.get(2).p, 1), p1.count(Formula1Driver.s.get(2).p, 2), p1.count(Formula1Driver.s.get(2).p, 3), p1.count(Formula1Driver.s.get(2).p, 4), p1.count(Formula1Driver.s.get(2).p, 5), p1.count(Formula1Driver.s.get(2).p, 6), p1.count(Formula1Driver.s.get(2).p, 7), p1.count(Formula1Driver.s.get(2).p, 8), p1.count(Formula1Driver.s.get(2).p, 9), p1.count(Formula1Driver.s.get(2).p, 10));
        int player4Races = countRace(p1.count(Formula1Driver.s.get(3).p, 1), p1.count(Formula1Driver.s.get(3).p, 2), p1.count(Formula1Driver.s.get(3).p, 3), p1.count(Formula1Driver.s.get(3).p, 4), p1.count(Formula1Driver.s.get(3).p, 5), p1.count(Formula1Driver.s.get(3).p, 6), p1.count(Formula1Driver.s.get(3).p, 7), p1.count(Formula1Driver.s.get(3).p, 8), p1.count(Formula1Driver.s.get(3).p, 9), p1.count(Formula1Driver.s.get(3).p, 10));
        int player5Races = countRace(p1.count(Formula1Driver.s.get(4).p, 1), p1.count(Formula1Driver.s.get(4).p, 2), p1.count(Formula1Driver.s.get(4).p, 3), p1.count(Formula1Driver.s.get(4).p, 4), p1.count(Formula1Driver.s.get(4).p, 5), p1.count(Formula1Driver.s.get(4).p, 6), p1.count(Formula1Driver.s.get(4).p, 7), p1.count(Formula1Driver.s.get(4).p, 8), p1.count(Formula1Driver.s.get(4).p, 9), p1.count(Formula1Driver.s.get(4).p, 10));
        int player6Races = countRace(p1.count(Formula1Driver.s.get(5).p, 1), p1.count(Formula1Driver.s.get(5).p, 2), p1.count(Formula1Driver.s.get(5).p, 3), p1.count(Formula1Driver.s.get(5).p, 4), p1.count(Formula1Driver.s.get(5).p, 5), p1.count(Formula1Driver.s.get(5).p, 6), p1.count(Formula1Driver.s.get(5).p, 7), p1.count(Formula1Driver.s.get(5).p, 8), p1.count(Formula1Driver.s.get(5).p, 9), p1.count(Formula1Driver.s.get(5).p, 10));
        int player7Races = countRace(p1.count(Formula1Driver.s.get(6).p, 1), p1.count(Formula1Driver.s.get(6).p, 2), p1.count(Formula1Driver.s.get(6).p, 3), p1.count(Formula1Driver.s.get(6).p, 4), p1.count(Formula1Driver.s.get(6).p, 5), p1.count(Formula1Driver.s.get(6).p, 6), p1.count(Formula1Driver.s.get(6).p, 7), p1.count(Formula1Driver.s.get(6).p, 8), p1.count(Formula1Driver.s.get(6).p, 9), p1.count(Formula1Driver.s.get(6).p, 10));
        int player8Races = countRace(p1.count(Formula1Driver.s.get(7).p, 1), p1.count(Formula1Driver.s.get(7).p, 2), p1.count(Formula1Driver.s.get(7).p, 3), p1.count(Formula1Driver.s.get(7).p, 4), p1.count(Formula1Driver.s.get(7).p, 5), p1.count(Formula1Driver.s.get(7).p, 6), p1.count(Formula1Driver.s.get(7).p, 7), p1.count(Formula1Driver.s.get(7).p, 8), p1.count(Formula1Driver.s.get(7).p, 9), p1.count(Formula1Driver.s.get(7).p, 10));
        int player9Races = countRace(p1.count(Formula1Driver.s.get(8).p, 1), p1.count(Formula1Driver.s.get(8).p, 2), p1.count(Formula1Driver.s.get(8).p, 3), p1.count(Formula1Driver.s.get(8).p, 4), p1.count(Formula1Driver.s.get(8).p, 5), p1.count(Formula1Driver.s.get(8).p, 6), p1.count(Formula1Driver.s.get(8).p, 7), p1.count(Formula1Driver.s.get(8).p, 8), p1.count(Formula1Driver.s.get(8).p, 9), p1.count(Formula1Driver.s.get(8).p, 10));
        int player10Races = countRace(p1.count(Formula1Driver.s.get(9).p, 1), p1.count(Formula1Driver.s.get(9).p, 2), p1.count(Formula1Driver.s.get(9).p, 3), p1.count(Formula1Driver.s.get(9).p, 4), p1.count(Formula1Driver.s.get(9).p, 5), p1.count(Formula1Driver.s.get(9).p, 6), p1.count(Formula1Driver.s.get(9).p, 7), p1.count(Formula1Driver.s.get(9).p, 8), p1.count(Formula1Driver.s.get(9).p, 9), p1.count(Formula1Driver.s.get(9).p, 10));



        Formula1Driver.points[0] = player1Points;
        Formula1Driver.points[1] = player2Points;
        Formula1Driver.points[2] = player3Points;
        Formula1Driver.points[3] = player4Points;
        Formula1Driver.points[4] = player5Points;
        Formula1Driver.points[5] = player6Points;
        Formula1Driver.points[6] = player7Points;
        Formula1Driver.points[7] = player8Points;
        Formula1Driver.points[8] = player9Points;
        Formula1Driver.points[9] = player10Points;




        int temp;
        for (int i = 0; i < Formula1Driver.points.length; i++) {
            for (int j = i; j < Formula1Driver.points.length; j++) {
                if (Formula1Driver.points[i] < Formula1Driver.points[j]) {
                    temp = Formula1Driver.points[i];
                    Formula1Driver.points[i] = Formula1Driver.points[j];
                    Formula1Driver.points[j] = temp;
                }
            }
        }

        if (Formula1Driver.s.size()!=0){
            int count =0;
            for (int c = 0; c < Formula1Driver.s.size(); c++) {
                if (Formula1Driver.s.get(c).getName().equals("empty")){
                    count++;

                }


            }

            System.out.println("+------------+-----------------+-------------+----------------+-----------------+----------------+------------+");
            System.out.println("|Player name |       Team      |    Count    | First Position | Second Position | Third Position | Race Count |");
            System.out.println("+------------+-----------------+-------------+----------------+-----------------+----------------+------------+");
            for (int i = 0; i < Formula1Driver.s.size(); i++) {
                if (!Formula1Driver.s.get(0).getName().equals("empty")) {
                    if (Formula1Driver.points[i] == player1Points) {
                        System.out.println("| " +Formula1Driver.s.get(0).getName()+"         | "+Formula1Driver.s.get(0).getTeam()+ "        |  " +player1Points+ "         | "+p1.count(Formula1Driver.s.get(0).p, 1)+"               | "+p1.count(Formula1Driver.s.get(0).p, 2)+"               |" +p1.count(Formula1Driver.s.get(0).p, 3)+"              |"+player1Races+"           | " );
                        System.out.println("+------------+-----------------+-------------+----------------+-----------------+----------------+------------+");

                    }

                }

                if (!Formula1Driver.s.get(1).getName().equals("empty")) {
                    if (Formula1Driver.points[i] == player2Points) {

                        System.out.println("| " +Formula1Driver.s.get(1).getName()+"         | "+Formula1Driver.s.get(1).getTeam()+ "          |  " +player2Points+ "         | "+p1.count(Formula1Driver.s.get(1).p, 1)+"               | "+p1.count(Formula1Driver.s.get(1).p, 2)+"               |" +p1.count(Formula1Driver.s.get(1).p, 3)+"              |"+player2Races+"           | " );
                        System.out.println("+------------+-----------------+-------------+----------------+-----------------+----------------+------------+");
                    }

                }
                if (!Formula1Driver.s.get(2).getName().equals("empty")) {
                    if (Formula1Driver.points[i] == player3Points) {

                        System.out.println("| " +Formula1Driver.s.get(2).getName()+"         | "+Formula1Driver.s.get(2).getTeam()+ "      |  " +player3Points+ "         | "+p1.count(Formula1Driver.s.get(2).p, 1)+"               | "+p1.count(Formula1Driver.s.get(2).p, 2)+"               |" +p1.count(Formula1Driver.s.get(2).p, 3)+"              |"+player3Races+"           | " );
                        System.out.println("+------------+-----------------+-------------+----------------+-----------------+----------------+------------+");

                    }

                }
                if (!Formula1Driver.s.get(3).getName().equals("empty")) {
                    if (Formula1Driver.points[i] == player4Points) {

                        System.out.println("| " +Formula1Driver.s.get(3).getName()+"         | "+Formula1Driver.s.get(3).getTeam()+ "            |  " +player4Points+ "         | "+p1.count(Formula1Driver.s.get(3).p, 1)+"               | "+p1.count(Formula1Driver.s.get(3).p, 2)+"               |" +p1.count(Formula1Driver.s.get(3).p, 3)+"              |"+player4Races+"           | " );
                        System.out.println("+------------+-----------------+-------------+----------------+-----------------+----------------+------------+");

                    }
                }
                if (!Formula1Driver.s.get(4).getName().equals("empty")) {
                    if (Formula1Driver.points[i] == player5Points) {

                        System.out.println("| " +Formula1Driver.s.get(4).getName()+"         | "+Formula1Driver.s.get(4).getTeam()+ "             |  " +player5Points+ "         | "+p1.count(Formula1Driver.s.get(4).p, 1)+"               | "+p1.count(Formula1Driver.s.get(4).p, 2)+"               |" +p1.count(Formula1Driver.s.get(4).p, 3)+"              |"+player5Races+"           | " );
                        System.out.println("+------------+-----------------+-------------+----------------+-----------------+----------------+------------+");

                    }
                }


                if (!Formula1Driver.s.get(5).getName().equals("empty")) {
                    if (Formula1Driver.points[i] == player6Points) {

                        System.out.println("| " +Formula1Driver.s.get(5).getName()+"         | "+Formula1Driver.s.get(5).getTeam()+ "          |  " +player6Points+ "         | "+p1.count(Formula1Driver.s.get(5).p, 1)+"               | "+p1.count(Formula1Driver.s.get(5).p, 2)+"               |" +p1.count(Formula1Driver.s.get(5).p, 3)+"              |"+player6Races+"           | " );
                        System.out.println("+------------+-----------------+-------------+----------------+-----------------+----------------+------------+");

                    }


                }
                if (!Formula1Driver.s.get(6).getName().equals("empty")) {
                    if (Formula1Driver.points[i] == player7Points) {

                        System.out.println("| " +Formula1Driver.s.get(6).getName()+"         | "+Formula1Driver.s.get(6).getTeam()+ "           |  " +player7Points+ "         | "+p1.count(Formula1Driver.s.get(6).p, 1)+"               | "+p1.count(Formula1Driver.s.get(6).p, 2)+"               |" +p1.count(Formula1Driver.s.get(6).p, 3)+"              |"+player7Races+"           | " );
                        System.out.println("+------------+-----------------+-------------+----------------+-----------------+----------------+------------+");

                    }


                }
                if (!Formula1Driver.s.get(7).getName().equals("empty")) {
                    if (Formula1Driver.points[i] == player8Points) {
                        System.out.println("| " +Formula1Driver.s.get(7).getName()+"         | "+Formula1Driver.s.get(7).getTeam()+ "          |  " +player8Points+ "         | "+p1.count(Formula1Driver.s.get(7).p, 1)+"               | "+p1.count(Formula1Driver.s.get(7).p, 2)+"               |" +p1.count(Formula1Driver.s.get(7).p, 3)+"              |"+player8Races+"           | " );
                        System.out.println("+------------+-----------------+-------------+----------------+-----------------+----------------+------------+");

                    }

                }
                if (!Formula1Driver.s.get(8).getName().equals("empty")) {
                    if (Formula1Driver.points[i] == player9Points) {
                        System.out.println("| " +Formula1Driver.s.get(8).getName()+"         | "+Formula1Driver.s.get(8).getTeam()+ "          |  " +player9Points+ "         | "+p1.count(Formula1Driver.s.get(8).p, 1)+"               | "+p1.count(Formula1Driver.s.get(8).p, 2)+"               |" +p1.count(Formula1Driver.s.get(8).p, 3)+"              |"+player9Races+"           | " );
                        System.out.println("+------------+-----------------+-------------+----------------+-----------------+----------------+------------+");

                    }


                }
                if (!Formula1Driver.s.get(9).getName().equals("empty")) {
                    if (Formula1Driver.points[i] == player10Points) {

                        System.out.println("| " +Formula1Driver.s.get(9).getName()+"         | "+Formula1Driver.s.get(9).getTeam()+ "            |  " +player10Points+ "         | "+p1.count(Formula1Driver.s.get(9).p, 1)+"               | "+p1.count(Formula1Driver.s.get(9).p, 2)+"               |" +p1.count(Formula1Driver.s.get(9).p, 3)+"              |"+player10Races+"           | " );
                        System.out.println("+------------+-----------------+-------------+----------------+-----------------+----------------+------------+");

                    }


                }





            }


        }
        else {
            System.out.println("There are no drivers to show");

        }



    }



    @Override
    public void addDriver() {  // add drivers
        boolean m = true;


        while (m) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a driver name :");
            String driverName = in.next();
            System.out.print("Enter a driver location :");
            String location = in.next();
            System.out.print("Enter a driver Age :");
            int driverAge = in.nextInt();

            String[] team = {"Mercedez", "Ferari", "Lamboghini", "Benz", "BMW", "Toyota", "Honda", "Suzuki","Nissan","Ford"};
            for (int x = 0; x < 10; x++) {

                System.out.println(x + " - " + " " + team[x]);

            }

            System.out.print("Select a team(select number) : ");
            int no = in.nextInt();
            if (Formula1Driver.s.get(no).getName().equals("empty")){
                Formula1Driver.s.get(no).setName(driverName);
                Formula1Driver.s.get(no).setAge(driverAge);
                Formula1Driver.s.get(no).setTeam(team[no]);
                ascendingOrder.team[no] = team[no];



            }
            else{
                System.out.println("This team selected by"+" "+Formula1Driver.s.get(no).getName());
                System.out.println(" ");
                this.addDriver();
            }







            System.out.print("Do you enter another driver(Y/N): ");
            String d = in.next();
            if (d.equals("n")) {
                m = false;
            }
            int count = 0;
            for (int c = 0; c < Formula1Driver.s.size(); c++) {
                if (Formula1Driver.s.get(c).getName().equals("empty")){
                    count++;


                }


            }
            System.out.println("-------------------Drivers--------------------------------");
            for (int x = 0; x < Formula1Driver.s.size(); x++) {
                if (!Formula1Driver.s.get(x).getName().equals("empty"))
                    System.out.println("[" + x + "] " + Formula1Driver.s.get(x).getName() + " - " + Formula1Driver.s.get(x).getTeam());
            }

            System.out.println("----------------------------------------------------------");
            int s = 10 -(Formula1Driver.s.size() - count) ;
            if(s == 0){
                m = false;
            }



        }



    }


    public  void generateRace() {  // race generated by auto
        Random rnd = new Random();
        int count =0;
        for (int c = 0; c < Formula1Driver.s.size(); c++) {
            if (Formula1Driver.s.get(c).getName().equals("empty")){
                count++;
            }
        }
        for (int x = 0; x < Formula1Driver.s.size(); x++) {
            if (!Formula1Driver.s.get(x).getName().equals("empty")){
                Formula1Driver.s.get(x).p.add(1 + rnd.nextInt(Formula1Driver.s.size() - count));

            }

        }

        int player1Points = countPoint(p1.count(Formula1Driver.s.get(0).p, 1), p1.count(Formula1Driver.s.get(0).p, 2), p1.count(Formula1Driver.s.get(0).p, 3), p1.count(Formula1Driver.s.get(0).p, 4), p1.count(Formula1Driver.s.get(0).p, 5), p1.count(Formula1Driver.s.get(0).p, 6), p1.count(Formula1Driver.s.get(0).p, 7), p1.count(Formula1Driver.s.get(0).p, 8), p1.count(Formula1Driver.s.get(0).p, 9), p1.count(Formula1Driver.s.get(0).p, 10));
        int player2Points = countPoint(p1.count(Formula1Driver.s.get(1).p, 1), p1.count(Formula1Driver.s.get(1).p, 2), p1.count(Formula1Driver.s.get(1).p, 3), p1.count(Formula1Driver.s.get(1).p, 4), p1.count(Formula1Driver.s.get(1).p, 5), p1.count(Formula1Driver.s.get(1).p, 6), p1.count(Formula1Driver.s.get(1).p, 7), p1.count(Formula1Driver.s.get(1).p, 8), p1.count(Formula1Driver.s.get(1).p, 9), p1.count(Formula1Driver.s.get(1).p, 10));
        int player3Points = countPoint(p1.count(Formula1Driver.s.get(2).p, 1), p1.count(Formula1Driver.s.get(2).p, 2), p1.count(Formula1Driver.s.get(2).p, 3), p1.count(Formula1Driver.s.get(2).p, 4), p1.count(Formula1Driver.s.get(2).p, 5), p1.count(Formula1Driver.s.get(2).p, 6), p1.count(Formula1Driver.s.get(2).p, 7), p1.count(Formula1Driver.s.get(2).p, 8), p1.count(Formula1Driver.s.get(2).p, 9), p1.count(Formula1Driver.s.get(2).p, 10));
        int player4Points = countPoint(p1.count(Formula1Driver.s.get(3).p, 1), p1.count(Formula1Driver.s.get(3).p, 2), p1.count(Formula1Driver.s.get(3).p, 3), p1.count(Formula1Driver.s.get(3).p, 4), p1.count(Formula1Driver.s.get(3).p, 5), p1.count(Formula1Driver.s.get(3).p, 6), p1.count(Formula1Driver.s.get(3).p, 7), p1.count(Formula1Driver.s.get(3).p, 8), p1.count(Formula1Driver.s.get(3).p, 9), p1.count(Formula1Driver.s.get(3).p, 10));
        int player5Points = countPoint(p1.count(Formula1Driver.s.get(4).p, 1), p1.count(Formula1Driver.s.get(4).p, 2), p1.count(Formula1Driver.s.get(4).p, 3), p1.count(Formula1Driver.s.get(4).p, 4), p1.count(Formula1Driver.s.get(4).p, 5), p1.count(Formula1Driver.s.get(4).p, 6), p1.count(Formula1Driver.s.get(4).p, 7), p1.count(Formula1Driver.s.get(4).p, 8), p1.count(Formula1Driver.s.get(4).p, 9), p1.count(Formula1Driver.s.get(4).p, 10));
        int player6Points = countPoint(p1.count(Formula1Driver.s.get(5).p, 1), p1.count(Formula1Driver.s.get(5).p, 2), p1.count(Formula1Driver.s.get(5).p, 3), p1.count(Formula1Driver.s.get(5).p, 4), p1.count(Formula1Driver.s.get(5).p, 5), p1.count(Formula1Driver.s.get(5).p, 6), p1.count(Formula1Driver.s.get(5).p, 7), p1.count(Formula1Driver.s.get(5).p, 8), p1.count(Formula1Driver.s.get(5).p, 9), p1.count(Formula1Driver.s.get(5).p, 10));
        int player7Points = countPoint(p1.count(Formula1Driver.s.get(6).p, 1), p1.count(Formula1Driver.s.get(6).p, 2), p1.count(Formula1Driver.s.get(6).p, 3), p1.count(Formula1Driver.s.get(6).p, 4), p1.count(Formula1Driver.s.get(6).p, 5), p1.count(Formula1Driver.s.get(6).p, 6), p1.count(Formula1Driver.s.get(6).p, 7), p1.count(Formula1Driver.s.get(6).p, 8), p1.count(Formula1Driver.s.get(6).p, 9), p1.count(Formula1Driver.s.get(6).p, 10));
        int player8Points = countPoint(p1.count(Formula1Driver.s.get(7).p, 1), p1.count(Formula1Driver.s.get(7).p, 2), p1.count(Formula1Driver.s.get(7).p, 3), p1.count(Formula1Driver.s.get(7).p, 4), p1.count(Formula1Driver.s.get(7).p, 5), p1.count(Formula1Driver.s.get(7).p, 6), p1.count(Formula1Driver.s.get(7).p, 7), p1.count(Formula1Driver.s.get(7).p, 8), p1.count(Formula1Driver.s.get(7).p, 9), p1.count(Formula1Driver.s.get(7).p, 10));
        int player9Points = countPoint(p1.count(Formula1Driver.s.get(8).p, 1), p1.count(Formula1Driver.s.get(8).p, 2), p1.count(Formula1Driver.s.get(8).p, 3), p1.count(Formula1Driver.s.get(8).p, 4), p1.count(Formula1Driver.s.get(8).p, 5), p1.count(Formula1Driver.s.get(8).p, 6), p1.count(Formula1Driver.s.get(8).p, 7), p1.count(Formula1Driver.s.get(8).p, 8), p1.count(Formula1Driver.s.get(8).p, 9), p1.count(Formula1Driver.s.get(8).p, 10));
        int player10Points = countPoint(p1.count(Formula1Driver.s.get(9).p, 1), p1.count(Formula1Driver.s.get(9).p, 2), p1.count(Formula1Driver.s.get(9).p, 3), p1.count(Formula1Driver.s.get(9).p, 4), p1.count(Formula1Driver.s.get(9).p, 5), p1.count(Formula1Driver.s.get(9).p, 6), p1.count(Formula1Driver.s.get(9).p, 7), p1.count(Formula1Driver.s.get(9).p, 8), p1.count(Formula1Driver.s.get(9).p, 9), p1.count(Formula1Driver.s.get(9).p, 10));






        Formula1Driver.points[0] = player1Points;
        Formula1Driver.points[1] = player2Points;
        Formula1Driver.points[2] = player3Points;
        Formula1Driver.points[3] = player4Points;
        Formula1Driver.points[4] = player5Points;
        Formula1Driver.points[5] = player6Points;
        Formula1Driver.points[6] = player7Points;
        Formula1Driver.points[7] = player8Points;
        Formula1Driver.points[8] = player9Points;
        Formula1Driver.points[9] = player10Points;


        int temp;
        for (int i = 0; i < Formula1Driver.points.length; i++) {
            for (int j = i; j < Formula1Driver.points.length; j++) {
                if (Formula1Driver.points[i] < Formula1Driver.points[j]) {
                    temp = Formula1Driver.points[i];
                    Formula1Driver.points[i] = Formula1Driver.points[j];
                    Formula1Driver.points[j] = temp;
                }
            }
        }

        for (int i = 0; i < Formula1Driver.s.size(); i++) {
            if (Formula1Driver.points[i] == player1Points) {
                ascendingOrder.s[i] = Formula1Driver.s.get(0).getName();
                ascendingOrder.team[i] = Formula1Driver.s.get(0).getTeam();
                int firstPositionCount = p1.count(Formula1Driver.s.get(0).p, 1);
                int secondPositionCount = p1.count(Formula1Driver.s.get(0).p, 2);
                int thirdPositionCount = p1.count(Formula1Driver.s.get(0).p, 3);
                First.firstposition[i] = firstPositionCount;
                First.secondposition[i] = secondPositionCount;
                First.thirdtposition[i] = thirdPositionCount;


            }
        }
        for (int i = 0; i < Formula1Driver.s.size(); i++) {
            if (Formula1Driver.points[i] == player2Points) {
                ascendingOrder.s[i] = Formula1Driver.s.get(1).getName();
                ascendingOrder.team[i] = Formula1Driver.s.get(1).getTeam();
                int firstPositionCount = p1.count(Formula1Driver.s.get(1).p, 1);
                int secondPositionCount = p1.count(Formula1Driver.s.get(1).p, 2);
                int thirdPositionCount = p1.count(Formula1Driver.s.get(1).p, 3);
                First.firstposition[i] = firstPositionCount;
                First.secondposition[i] = secondPositionCount;
                First.thirdtposition[i] = thirdPositionCount;


            }

            if (Formula1Driver.points[i] == player3Points) {
                ascendingOrder.s[i] = Formula1Driver.s.get(2).getName();
                ascendingOrder.team[i] = Formula1Driver.s.get(2).getTeam();
                int firstPositionCount = p1.count(Formula1Driver.s.get(2).p, 1);
                int secondPositionCount = p1.count(Formula1Driver.s.get(2).p, 2);
                int thirdPositionCount = p1.count(Formula1Driver.s.get(2).p, 3);
                First.firstposition[i] = firstPositionCount;
                First.secondposition[i] = secondPositionCount;
                First.thirdtposition[i] = thirdPositionCount;


            }

            if (Formula1Driver.points[i] == player4Points) {
                ascendingOrder.s[i] = Formula1Driver.s.get(3).getName();
                ascendingOrder.team[i] = Formula1Driver.s.get(3).getTeam();
                int firstPositionCount = p1.count(Formula1Driver.s.get(3).p, 1);
                int secondPositionCount = p1.count(Formula1Driver.s.get(3).p, 2);
                int thirdPositionCount = p1.count(Formula1Driver.s.get(3).p, 3);
                First.firstposition[i] = firstPositionCount;
                First.secondposition[i] = secondPositionCount;
                First.thirdtposition[i] = thirdPositionCount;


            }

            if (Formula1Driver.points[i] == player5Points) {
                ascendingOrder.s[i] = Formula1Driver.s.get(4).getName();
                ascendingOrder.team[i] = Formula1Driver.s.get(4).getTeam();
                int firstPositionCount = p1.count(Formula1Driver.s.get(4).p, 1);
                int secondPositionCount = p1.count(Formula1Driver.s.get(4).p, 2);
                int thirdPositionCount = p1.count(Formula1Driver.s.get(4).p, 3);
                First.firstposition[i] = firstPositionCount;
                First.secondposition[i] = secondPositionCount;
                First.thirdtposition[i] = thirdPositionCount;


            }


            if (Formula1Driver.points[i] == player6Points) {
                ascendingOrder.s[i] = Formula1Driver.s.get(5).getName();
                ascendingOrder.team[i] = Formula1Driver.s.get(5).getTeam();
                int firstPositionCount = p1.count(Formula1Driver.s.get(5).p, 1);
                int secondPositionCount = p1.count(Formula1Driver.s.get(5).p, 2);
                int thirdPositionCount = p1.count(Formula1Driver.s.get(5).p, 3);
                First.firstposition[i] = firstPositionCount;
                First.secondposition[i] = secondPositionCount;
                First.thirdtposition[i] = thirdPositionCount;
            }


            if (Formula1Driver.points[i] == player7Points) {
                ascendingOrder.s[i] = Formula1Driver.s.get(6).getName();
                ascendingOrder.team[i] = Formula1Driver.s.get(6).getTeam();
                int firstPositionCount = p1.count(Formula1Driver.s.get(6).p, 1);
                int secondPositionCount = p1.count(Formula1Driver.s.get(6).p, 2);
                int thirdPositionCount = p1.count(Formula1Driver.s.get(6).p, 3);
                First.firstposition[i] = firstPositionCount;
                First.secondposition[i] = secondPositionCount;
                First.thirdtposition[i] = thirdPositionCount;


            }


            if (Formula1Driver.points[i] == player8Points) {
                ascendingOrder.s[i] = Formula1Driver.s.get(7).getName();
                ascendingOrder.team[i] = Formula1Driver.s.get(7).getTeam();
                int firstPositionCount = p1.count(Formula1Driver.s.get(7).p, 1);
                int secondPositionCount = p1.count(Formula1Driver.s.get(7).p, 2);
                int thirdPositionCount = p1.count(Formula1Driver.s.get(7).p, 3);
                First.firstposition[i] = firstPositionCount;
                First.secondposition[i] = secondPositionCount;
                First.thirdtposition[i] = thirdPositionCount;


            }


            if (Formula1Driver.points[i] == player9Points) {
                ascendingOrder.s[i] = Formula1Driver.s.get(8).getName();
                ascendingOrder.team[i] = Formula1Driver.s.get(8).getTeam();
                int firstPositionCount = p1.count(Formula1Driver.s.get(8).p, 1);
                int secondPositionCount = p1.count(Formula1Driver.s.get(8).p, 2);
                int thirdPositionCount = p1.count(Formula1Driver.s.get(8).p, 3);
                First.firstposition[i] = firstPositionCount;
                First.secondposition[i] = secondPositionCount;
                First.thirdtposition[i] = thirdPositionCount;


            }


            if (Formula1Driver.points[i] == player10Points) {
                ascendingOrder.s[i] = Formula1Driver.s.get(9).getName();
                ascendingOrder.team[i] = Formula1Driver.s.get(9).getTeam();
                int firstPositionCount = p1.count(Formula1Driver.s.get(9).p, 1);
                int secondPositionCount = p1.count(Formula1Driver.s.get(9).p, 2);
                int thirdPositionCount = p1.count(Formula1Driver.s.get(9).p, 3);
                First.firstposition[i] = firstPositionCount;
                First.secondposition[i] = secondPositionCount;
                First.thirdtposition[i] = thirdPositionCount;

            }
            int player1firstCount = p1.count(Formula1Driver.s.get(0).p, 1);
            int player2firstCount = p1.count(Formula1Driver.s.get(1).p, 1);
            int player3firstCount = p1.count(Formula1Driver.s.get(2).p, 1);
            int player4firstCount = p1.count(Formula1Driver.s.get(3).p, 1);
            int player5firstCount = p1.count(Formula1Driver.s.get(4).p, 1);
            int player6firstCount = p1.count(Formula1Driver.s.get(5).p, 1);
            int player7firstCount = p1.count(Formula1Driver.s.get(6).p, 1);
            int player8firstCount = p1.count(Formula1Driver.s.get(7).p, 1);
            int player9firstCount = p1.count(Formula1Driver.s.get(8).p, 1);
            int player10firstCount = p1.count(Formula1Driver.s.get(9).p, 1);
            First.firstPositionCount[0] = player1firstCount;
            First.firstPositionCount[1] = player2firstCount;
            First.firstPositionCount[2] = player3firstCount;
            First.firstPositionCount[3] = player4firstCount;
            First.firstPositionCount[4] = player5firstCount;
            First.firstPositionCount[6] = player7firstCount;
            First.firstPositionCount[7] = player8firstCount;
            First.firstPositionCount[8] = player9firstCount;
            First.firstPositionCount[9] = player10firstCount;

            int s;
            for (int x = 0; x < First.firstPositionCount.length; x++) {
                for (int j = x; j < First.firstPositionCount.length; j++) {
                    if (First.firstPositionCount[x] < First.firstPositionCount[j]) {
                        s = First.firstPositionCount[x];
                        First.firstPositionCount[x] = First.firstPositionCount[j];
                        First.firstPositionCount[j] = s;
                    }
                    for (int c = 0; c < Formula1Driver.s.size(); c++) {
                        if (Formula1Driver.s.get(c).getName().equals("empty")){
                            count++;

                        }


                    }

                    for (int y = 0; i < Formula1Driver.s.size() - count ; y++) {
                        if(!Formula1Driver.s.get(0).getName().equals("empty")){
                            if (First.firstPositionCount[i] == player1firstCount) {
                                First.c[i] = Formula1Driver.s.get(0).getName();
                                First.teams[i] = Formula1Driver.s.get(0).getTeam();
                            }

                        }
                        if (!Formula1Driver.s.get(1).getName().equals("empty")){
                            if (First.firstPositionCount[i] == player2firstCount) {
                                First.c[i] = Formula1Driver.s.get(1).getName();
                                First.teams[i] = Formula1Driver.s.get(1).getTeam();
                            }

                        }

                        if (!Formula1Driver.s.get(2).getName().equals("empty")){
                            if (First.firstPositionCount[i] == player3firstCount) {
                                First.c[i] = Formula1Driver.s.get(2).getName();
                                First.teams[i] = Formula1Driver.s.get(2).getTeam();
                            }

                        }
                        if (!Formula1Driver.s.get(3).getName().equals("empty")){
                            if (First.firstPositionCount[i] == player4firstCount) {
                                First.c[i] = Formula1Driver.s.get(3).getName();
                                First.teams[i] = Formula1Driver.s.get(3).getTeam();
                            }

                        }
                        if (!Formula1Driver.s.get(4).getName().equals("empty")){
                            if (First.firstPositionCount[i] == player5firstCount) {
                                First.c[i] = Formula1Driver.s.get(4).getName();
                                First.teams[i] = Formula1Driver.s.get(4).getTeam();
                            }

                        }
                        if (!Formula1Driver.s.get(5).getName().equals("empty")){
                            if (First.firstPositionCount[i] == player6firstCount) {
                                First.c[i] = Formula1Driver.s.get(5).getName();
                                First.teams[i] = Formula1Driver.s.get(5).getTeam();
                            }

                        }
                        if (!Formula1Driver.s.get(6).getName().equals("empty")){
                            if (First.firstPositionCount[i] == player7firstCount) {
                                First.c[i] = Formula1Driver.s.get(6).getName();
                                First.teams[i] = Formula1Driver.s.get(6).getTeam();
                            }

                        }
                        if (!Formula1Driver.s.get(7).getName().equals("empty")){
                            if (First.firstPositionCount[i] == player8firstCount) {
                                First.c[i] = Formula1Driver.s.get(7).getName();
                                First.teams[i] = Formula1Driver.s.get(7).getTeam();
                            }

                        }
                        if (!Formula1Driver.s.get(8).getName().equals("empty")){
                            if (First.firstPositionCount[i] == player9firstCount) {
                                First.c[i] = Formula1Driver.s.get(8).getName();
                                First.teams[i] = Formula1Driver.s.get(8).getTeam();
                            }

                        }
                        if (!Formula1Driver.s.get(9).getName().equals("empty")){
                            if (First.firstPositionCount[i] == player10firstCount) {
                                First.c[i] = Formula1Driver.s.get(9).getName();
                                First.teams[i] = Formula1Driver.s.get(9).getTeam();
                            }

                        }
                        Date.player[countb] = ascendingOrder.s[0];
                        Date.playerteam[countb] = ascendingOrder.team[0];
                        Date.playerPoint[countb] = ascendingOrder.points[0];

                        break;
                    }



                }
            }
        }
    }
    public  void startingPosition() {  // race generated by auto and player has probability to win race
        Random rnd = new Random();
        int count =0;
        int [] a ={1,1,1,1,0,0,0,0,0,0}; //40% win percentage
        int [] b ={1,1,1,0,0,0,0,0,0,0};//30% win percentage
        int [] m ={1,0,0,0,0,0,0,0,0,0}; //10% win percentage
        int [] n ={1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}; //2% win percentage
        int [] d ={2,3,4,5,6,7,8,9};
        for (int c = 0; c < Formula1Driver.s.size(); c++) {
            if (Formula1Driver.s.get(c).getName().equals("empty")){
                count++;
            }
        }
        for (int x = 0; x < Formula1Driver.s.size() ; x++) {
            Formula1Driver.positions[x] = 1 + rnd.nextInt(Formula1Driver.s.size() - count);
            if(!Formula1Driver.s.get(x).getName().equals("empty")){
                if (Formula1Driver.positions[x] == 1) {
                    if (a[rnd.nextInt(10)] == 1){
                        Formula1Driver.s.get(x).p.add(1);

                    }
                    else {
                        Formula1Driver.s.get(x).p.add(d[rnd.nextInt(8)]);

                    }
                    Formula1Driver.s.get(x).setPosition(1);

                }


                if (Formula1Driver.positions[x] == 2) {
                    if (b[rnd.nextInt(10)] == 1){
                        Formula1Driver.s.get(x).p.add(1);

                    }
                    else {
                        Formula1Driver.s.get(x).p.add(d[rnd.nextInt(8)]);

                    }
                    Formula1Driver.s.get(x).setPosition(2);


                }
                if (Formula1Driver.positions[x] == 3) {
                    if (m[rnd.nextInt(10)] == 1){
                        Formula1Driver.s.get(x).p.add(1);

                    }
                    else {
                        Formula1Driver.s.get(x).p.add(d[rnd.nextInt(8)]);

                    }
                    Formula1Driver.s.get(x).setPosition(3);
                }
                if (Formula1Driver.positions[x] == 4) {
                    if (m[rnd.nextInt(10)] == 1){
                        Formula1Driver.s.get(x).p.add(1);

                    }
                    else {
                        Formula1Driver.s.get(x).p.add(d[rnd.nextInt(8)]);

                    }
                    Formula1Driver.s.get(x).setPosition(4);
                }
                if (Formula1Driver.positions[x] == 5) {
                    if (n[rnd.nextInt(50)] == 1){
                        Formula1Driver.s.get(x).p.add(1);

                    }
                    else {
                        Formula1Driver.s.get(x).p.add(d[rnd.nextInt(8)]);

                    }
                    Formula1Driver.s.get(x).setPosition(5);
                }
                if (Formula1Driver.positions[x] == 6) {
                    if (b[rnd.nextInt(50)] == 1){
                        Formula1Driver.s.get(x).p.add(1);

                    }
                    else {
                        Formula1Driver.s.get(x).p.add(d[rnd.nextInt(8)]);

                    }
                    Formula1Driver.s.get(x).setPosition(6);
                }
                if (Formula1Driver.positions[x] == 7) {
                    if (b[rnd.nextInt(50)] == 1){
                        Formula1Driver.s.get(x).p.add(1);

                    }
                    else {
                        Formula1Driver.s.get(x).p.add(d[rnd.nextInt(8)]);

                    }
                    Formula1Driver.s.get(x).setPosition(7);
                }
                if (Formula1Driver.positions[x] == 8) {
                    if (b[rnd.nextInt(50)] == 1){
                        Formula1Driver.s.get(x).p.add(1);

                    }
                    else {
                        Formula1Driver.s.get(x).p.add(d[rnd.nextInt(9)]);

                    }
                    Formula1Driver.s.get(x).setPosition(8);
                }
                if (Formula1Driver.positions[x] == 9) {
                    if (b[rnd.nextInt(50)] == 1){
                        Formula1Driver.s.get(x).p.add(1);

                    }
                    else {
                        Formula1Driver.s.get(x).p.add(d[rnd.nextInt(8)]);

                    }
                    Formula1Driver.s.get(x).setPosition(9);
                }
                if (Formula1Driver.positions[x] == 10) {
                    Formula1Driver.s.get(x).p.add(d[rnd.nextInt(8)]);
                    Formula1Driver.s.get(x).setPosition(10);
                }

            }


        }




        int player1Points = countPoint(p1.count(Formula1Driver.s.get(0).p, 1), p1.count(Formula1Driver.s.get(0).p, 2), p1.count(Formula1Driver.s.get(0).p, 3), p1.count(Formula1Driver.s.get(0).p, 4), p1.count(Formula1Driver.s.get(0).p, 5), p1.count(Formula1Driver.s.get(0).p, 6), p1.count(Formula1Driver.s.get(0).p, 7), p1.count(Formula1Driver.s.get(0).p, 8), p1.count(Formula1Driver.s.get(0).p, 9), p1.count(Formula1Driver.s.get(0).p, 10));
        int player2Points = countPoint(p1.count(Formula1Driver.s.get(1).p, 1), p1.count(Formula1Driver.s.get(1).p, 2), p1.count(Formula1Driver.s.get(1).p, 3), p1.count(Formula1Driver.s.get(1).p, 4), p1.count(Formula1Driver.s.get(1).p, 5), p1.count(Formula1Driver.s.get(1).p, 6), p1.count(Formula1Driver.s.get(1).p, 7), p1.count(Formula1Driver.s.get(1).p, 8), p1.count(Formula1Driver.s.get(1).p, 9), p1.count(Formula1Driver.s.get(1).p, 10));
        int player3Points = countPoint(p1.count(Formula1Driver.s.get(2).p, 1), p1.count(Formula1Driver.s.get(2).p, 2), p1.count(Formula1Driver.s.get(2).p, 3), p1.count(Formula1Driver.s.get(2).p, 4), p1.count(Formula1Driver.s.get(2).p, 5), p1.count(Formula1Driver.s.get(2).p, 6), p1.count(Formula1Driver.s.get(2).p, 7), p1.count(Formula1Driver.s.get(2).p, 8), p1.count(Formula1Driver.s.get(2).p, 9), p1.count(Formula1Driver.s.get(2).p, 10));
        int player4Points = countPoint(p1.count(Formula1Driver.s.get(3).p, 1), p1.count(Formula1Driver.s.get(3).p, 2), p1.count(Formula1Driver.s.get(3).p, 3), p1.count(Formula1Driver.s.get(3).p, 4), p1.count(Formula1Driver.s.get(3).p, 5), p1.count(Formula1Driver.s.get(3).p, 6), p1.count(Formula1Driver.s.get(3).p, 7), p1.count(Formula1Driver.s.get(3).p, 8), p1.count(Formula1Driver.s.get(3).p, 9), p1.count(Formula1Driver.s.get(3).p, 10));
        int player5Points = countPoint(p1.count(Formula1Driver.s.get(4).p, 1), p1.count(Formula1Driver.s.get(4).p, 2), p1.count(Formula1Driver.s.get(4).p, 3), p1.count(Formula1Driver.s.get(4).p, 4), p1.count(Formula1Driver.s.get(4).p, 5), p1.count(Formula1Driver.s.get(4).p, 6), p1.count(Formula1Driver.s.get(4).p, 7), p1.count(Formula1Driver.s.get(4).p, 8), p1.count(Formula1Driver.s.get(4).p, 9), p1.count(Formula1Driver.s.get(4).p, 10));
        int player6Points = countPoint(p1.count(Formula1Driver.s.get(5).p, 1), p1.count(Formula1Driver.s.get(5).p, 2), p1.count(Formula1Driver.s.get(5).p, 3), p1.count(Formula1Driver.s.get(5).p, 4), p1.count(Formula1Driver.s.get(5).p, 5), p1.count(Formula1Driver.s.get(5).p, 6), p1.count(Formula1Driver.s.get(5).p, 7), p1.count(Formula1Driver.s.get(5).p, 8), p1.count(Formula1Driver.s.get(5).p, 9), p1.count(Formula1Driver.s.get(5).p, 10));
        int player7Points = countPoint(p1.count(Formula1Driver.s.get(6).p, 1), p1.count(Formula1Driver.s.get(6).p, 2), p1.count(Formula1Driver.s.get(6).p, 3), p1.count(Formula1Driver.s.get(6).p, 4), p1.count(Formula1Driver.s.get(6).p, 5), p1.count(Formula1Driver.s.get(6).p, 6), p1.count(Formula1Driver.s.get(6).p, 7), p1.count(Formula1Driver.s.get(6).p, 8), p1.count(Formula1Driver.s.get(6).p, 9), p1.count(Formula1Driver.s.get(6).p, 10));
        int player8Points = countPoint(p1.count(Formula1Driver.s.get(7).p, 1), p1.count(Formula1Driver.s.get(7).p, 2), p1.count(Formula1Driver.s.get(7).p, 3), p1.count(Formula1Driver.s.get(7).p, 4), p1.count(Formula1Driver.s.get(7).p, 5), p1.count(Formula1Driver.s.get(7).p, 6), p1.count(Formula1Driver.s.get(7).p, 7), p1.count(Formula1Driver.s.get(7).p, 8), p1.count(Formula1Driver.s.get(7).p, 9), p1.count(Formula1Driver.s.get(7).p, 10));
        int player9Points = countPoint(p1.count(Formula1Driver.s.get(8).p, 1), p1.count(Formula1Driver.s.get(8).p, 2), p1.count(Formula1Driver.s.get(8).p, 3), p1.count(Formula1Driver.s.get(8).p, 4), p1.count(Formula1Driver.s.get(8).p, 5), p1.count(Formula1Driver.s.get(8).p, 6), p1.count(Formula1Driver.s.get(8).p, 7), p1.count(Formula1Driver.s.get(8).p, 8), p1.count(Formula1Driver.s.get(8).p, 9), p1.count(Formula1Driver.s.get(8).p, 10));
        int player10Points = countPoint(p1.count(Formula1Driver.s.get(9).p, 1), p1.count(Formula1Driver.s.get(9).p, 2), p1.count(Formula1Driver.s.get(9).p, 3), p1.count(Formula1Driver.s.get(9).p, 4), p1.count(Formula1Driver.s.get(9).p, 5), p1.count(Formula1Driver.s.get(9).p, 6), p1.count(Formula1Driver.s.get(9).p, 7), p1.count(Formula1Driver.s.get(9).p, 8), p1.count(Formula1Driver.s.get(9).p, 9), p1.count(Formula1Driver.s.get(9).p, 10));


        Formula1Driver.points[0] = player1Points;
        Formula1Driver.points[1] = player2Points;
        Formula1Driver.points[2] = player3Points;
        Formula1Driver.points[3] = player4Points;
        Formula1Driver.points[4] = player5Points;
        Formula1Driver.points[5] = player6Points;
        Formula1Driver.points[6] = player7Points;
        Formula1Driver.points[7] = player8Points;
        Formula1Driver.points[8] = player9Points;
        Formula1Driver.points[9] = player10Points;


        int temp;
        for (int i = 0; i < Formula1Driver.points.length; i++) {
            for (int j = i; j < Formula1Driver.points.length; j++) {
                if (Formula1Driver.points[i] < Formula1Driver.points[j]) {
                    temp = Formula1Driver.points[i];
                    Formula1Driver.points[i] = Formula1Driver.points[j];
                    Formula1Driver.points[j] = temp;
                }
            }
        }

        for (int i = 0; i < Formula1Driver.s.size(); i++) {
            if (Formula1Driver.points[i] == player1Points) {
                ascendingOrder.s[i] = Formula1Driver.s.get(0).getName();
                ascendingOrder.team[i] = Formula1Driver.s.get(0).getTeam();
                StartingPosition.position[i] = Formula1Driver.s.get(0).getPosition();
                int firstPositionCount = p1.count(Formula1Driver.s.get(0).p, 1);
                int secondPositionCount = p1.count(Formula1Driver.s.get(0).p, 2);
                int thirdPositionCount = p1.count(Formula1Driver.s.get(0).p, 3);
                First.firstposition[i] = firstPositionCount;
                First.secondposition[i] = secondPositionCount;
                First.thirdtposition[i] = thirdPositionCount;


            }
        }
        for (int i = 0; i < Formula1Driver.s.size(); i++) {
            if (Formula1Driver.points[i] == player2Points) {
                ascendingOrder.s[i] = Formula1Driver.s.get(1).getName();
                ascendingOrder.team[i] = Formula1Driver.s.get(1).getTeam();
                StartingPosition.position[i] = Formula1Driver.s.get(1).getPosition();
                int firstPositionCount = p1.count(Formula1Driver.s.get(1).p, 1);
                int secondPositionCount = p1.count(Formula1Driver.s.get(1).p, 2);
                int thirdPositionCount = p1.count(Formula1Driver.s.get(1).p, 3);
                First.firstposition[i] = firstPositionCount;
                First.secondposition[i] = secondPositionCount;
                First.thirdtposition[i] = thirdPositionCount;


            }

            if (Formula1Driver.points[i] == player3Points) {
                ascendingOrder.s[i] = Formula1Driver.s.get(2).getName();
                ascendingOrder.team[i] = Formula1Driver.s.get(2).getTeam();
                StartingPosition.position[i] = Formula1Driver.s.get(2).getPosition();
                int firstPositionCount = p1.count(Formula1Driver.s.get(2).p, 1);
                int secondPositionCount = p1.count(Formula1Driver.s.get(2).p, 2);
                int thirdPositionCount = p1.count(Formula1Driver.s.get(2).p, 3);
                First.firstposition[i] = firstPositionCount;
                First.secondposition[i] = secondPositionCount;
                First.thirdtposition[i] = thirdPositionCount;


            }

            if (Formula1Driver.points[i] == player4Points) {
                ascendingOrder.s[i] = Formula1Driver.s.get(3).getName();
                ascendingOrder.team[i] = Formula1Driver.s.get(3).getTeam();
                StartingPosition.position[i] = Formula1Driver.s.get(3).getPosition();
                int firstPositionCount = p1.count(Formula1Driver.s.get(3).p, 1);
                int secondPositionCount = p1.count(Formula1Driver.s.get(3).p, 2);
                int thirdPositionCount = p1.count(Formula1Driver.s.get(3).p, 3);
                First.firstposition[i] = firstPositionCount;
                First.secondposition[i] = secondPositionCount;
                First.thirdtposition[i] = thirdPositionCount;


            }

            if (Formula1Driver.points[i] == player5Points) {
                ascendingOrder.s[i] = Formula1Driver.s.get(4).getName();
                ascendingOrder.team[i] = Formula1Driver.s.get(4).getTeam();
                StartingPosition.position[i] = Formula1Driver.s.get(4).getPosition();
                int firstPositionCount = p1.count(Formula1Driver.s.get(4).p, 1);
                int secondPositionCount = p1.count(Formula1Driver.s.get(4).p, 2);
                int thirdPositionCount = p1.count(Formula1Driver.s.get(4).p, 3);
                First.firstposition[i] = firstPositionCount;
                First.secondposition[i] = secondPositionCount;
                First.thirdtposition[i] = thirdPositionCount;


            }


            if (Formula1Driver.points[i] == player6Points) {
                ascendingOrder.s[i] = Formula1Driver.s.get(5).getName();
                ascendingOrder.team[i] = Formula1Driver.s.get(5).getTeam();
                StartingPosition.position[i] = Formula1Driver.s.get(5).getPosition();
                int firstPositionCount = p1.count(Formula1Driver.s.get(5).p, 1);
                int secondPositionCount = p1.count(Formula1Driver.s.get(5).p, 2);
                int thirdPositionCount = p1.count(Formula1Driver.s.get(5).p, 3);
                First.firstposition[i] = firstPositionCount;
                First.secondposition[i] = secondPositionCount;
                First.thirdtposition[i] = thirdPositionCount;
            }


            if (Formula1Driver.points[i] == player7Points) {
                ascendingOrder.s[i] = Formula1Driver.s.get(6).getName();
                ascendingOrder.team[i] = Formula1Driver.s.get(6).getTeam();
                StartingPosition.position[i] = Formula1Driver.s.get(6).getPosition();
                int firstPositionCount = p1.count(Formula1Driver.s.get(6).p, 1);
                int secondPositionCount = p1.count(Formula1Driver.s.get(6).p, 2);
                int thirdPositionCount = p1.count(Formula1Driver.s.get(6).p, 3);
                First.firstposition[i] = firstPositionCount;
                First.secondposition[i] = secondPositionCount;
                First.thirdtposition[i] = thirdPositionCount;


            }


            if (Formula1Driver.points[i] == player8Points) {
                ascendingOrder.s[i] = Formula1Driver.s.get(7).getName();
                ascendingOrder.team[i] = Formula1Driver.s.get(7).getTeam();
                StartingPosition.position[i] = Formula1Driver.s.get(7).getPosition();
                int firstPositionCount = p1.count(Formula1Driver.s.get(7).p, 1);
                int secondPositionCount = p1.count(Formula1Driver.s.get(7).p, 2);
                int thirdPositionCount = p1.count(Formula1Driver.s.get(7).p, 3);
                First.firstposition[i] = firstPositionCount;
                First.secondposition[i] = secondPositionCount;
                First.thirdtposition[i] = thirdPositionCount;


            }


            if (Formula1Driver.points[i] == player9Points) {
                ascendingOrder.s[i] = Formula1Driver.s.get(8).getName();
                ascendingOrder.team[i] = Formula1Driver.s.get(8).getTeam();
                StartingPosition.position[i] = Formula1Driver.s.get(8).getPosition();
                int firstPositionCount = p1.count(Formula1Driver.s.get(8).p, 1);
                int secondPositionCount = p1.count(Formula1Driver.s.get(8).p, 2);
                int thirdPositionCount = p1.count(Formula1Driver.s.get(8).p, 3);
                First.firstposition[i] = firstPositionCount;
                First.secondposition[i] = secondPositionCount;
                First.thirdtposition[i] = thirdPositionCount;


            }


            if (Formula1Driver.points[i] == player10Points) {
                ascendingOrder.s[i] = Formula1Driver.s.get(9).getName();
                ascendingOrder.team[i] = Formula1Driver.s.get(9).getTeam();
                StartingPosition.position[i] = Formula1Driver.s.get(9).getPosition();
                int firstPositionCount = p1.count(Formula1Driver.s.get(9).p, 1);
                int secondPositionCount = p1.count(Formula1Driver.s.get(9).p, 2);
                int thirdPositionCount = p1.count(Formula1Driver.s.get(9).p, 3);
                First.firstposition[i] = firstPositionCount;
                First.secondposition[i] = secondPositionCount;
                First.thirdtposition[i] = thirdPositionCount;

            }
            int player1firstCount = p1.count(Formula1Driver.s.get(0).p, 1);
            int player2firstCount = p1.count(Formula1Driver.s.get(1).p, 1);
            int player3firstCount = p1.count(Formula1Driver.s.get(2).p, 1);
            int player4firstCount = p1.count(Formula1Driver.s.get(3).p, 1);
            int player5firstCount = p1.count(Formula1Driver.s.get(4).p, 1);
            int player6firstCount = p1.count(Formula1Driver.s.get(5).p, 1);
            int player7firstCount = p1.count(Formula1Driver.s.get(6).p, 1);
            int player8firstCount = p1.count(Formula1Driver.s.get(7).p, 1);
            int player9firstCount = p1.count(Formula1Driver.s.get(8).p, 1);
            int player10firstCount = p1.count(Formula1Driver.s.get(9).p, 1);
            First.firstPositionCount[0] = player1firstCount;
            First.firstPositionCount[1] = player2firstCount;
            First.firstPositionCount[2] = player3firstCount;
            First.firstPositionCount[3] = player4firstCount;
            First.firstPositionCount[4] = player5firstCount;
            First.firstPositionCount[6] = player7firstCount;
            First.firstPositionCount[7] = player8firstCount;
            First.firstPositionCount[8] = player9firstCount;
            First.firstPositionCount[9] = player10firstCount;

            int s;
            for (int x = 0; x < First.firstPositionCount.length; x++) {
                for (int j = x; j < First.firstPositionCount.length; j++) {
                    if (First.firstPositionCount[x] < First.firstPositionCount[j]) {
                        s = First.firstPositionCount[x];
                        First.firstPositionCount[x] = First.firstPositionCount[j];
                        First.firstPositionCount[j] = s;
                    }
                    for (int c = 0; c < Formula1Driver.s.size(); c++) {
                        if (Formula1Driver.s.get(c).getName().equals("empty")){
                            count++;

                        }


                    }

                    for (int y = 0; i < Formula1Driver.s.size() - count ; y++) {
                        if(!Formula1Driver.s.get(0).getName().equals("empty")){
                            if (First.firstPositionCount[i] == player1firstCount) {
                                First.c[i] = Formula1Driver.s.get(0).getName();
                                First.teams[i] = Formula1Driver.s.get(0).getTeam();
                            }

                        }
                        if (!Formula1Driver.s.get(1).getName().equals("empty")){
                            if (First.firstPositionCount[i] == player2firstCount) {
                                First.c[i] = Formula1Driver.s.get(1).getName();
                                First.teams[i] = Formula1Driver.s.get(1).getTeam();
                            }

                        }

                        if (!Formula1Driver.s.get(2).getName().equals("empty")){
                            if (First.firstPositionCount[i] == player3firstCount) {
                                First.c[i] = Formula1Driver.s.get(2).getName();
                                First.teams[i] = Formula1Driver.s.get(2).getTeam();
                            }

                        }
                        if (!Formula1Driver.s.get(3).getName().equals("empty")){
                            if (First.firstPositionCount[i] == player4firstCount) {
                                First.c[i] = Formula1Driver.s.get(3).getName();
                                First.teams[i] = Formula1Driver.s.get(3).getTeam();
                            }

                        }
                        if (!Formula1Driver.s.get(4).getName().equals("empty")){
                            if (First.firstPositionCount[i] == player5firstCount) {
                                First.c[i] = Formula1Driver.s.get(4).getName();
                                First.teams[i] = Formula1Driver.s.get(4).getTeam();
                            }

                        }
                        if (!Formula1Driver.s.get(5).getName().equals("empty")){
                            if (First.firstPositionCount[i] == player6firstCount) {
                                First.c[i] = Formula1Driver.s.get(5).getName();
                                First.teams[i] = Formula1Driver.s.get(5).getTeam();
                            }

                        }
                        if (!Formula1Driver.s.get(6).getName().equals("empty")){
                            if (First.firstPositionCount[i] == player7firstCount) {
                                First.c[i] = Formula1Driver.s.get(6).getName();
                                First.teams[i] = Formula1Driver.s.get(6).getTeam();
                            }

                        }
                        if (!Formula1Driver.s.get(7).getName().equals("empty")){
                            if (First.firstPositionCount[i] == player8firstCount) {
                                First.c[i] = Formula1Driver.s.get(7).getName();
                                First.teams[i] = Formula1Driver.s.get(7).getTeam();
                            }

                        }
                        if (!Formula1Driver.s.get(8).getName().equals("empty")){
                            if (First.firstPositionCount[i] == player9firstCount) {
                                First.c[i] = Formula1Driver.s.get(8).getName();
                                First.teams[i] = Formula1Driver.s.get(8).getTeam();
                            }

                        }
                        if (!Formula1Driver.s.get(9).getName().equals("empty")){
                            if (First.firstPositionCount[i] == player10firstCount) {
                                First.c[i] = Formula1Driver.s.get(9).getName();
                                First.teams[i] = Formula1Driver.s.get(9).getTeam();
                            }

                        }
                        Date.player[countb] = ascendingOrder.s[0];
                        Date.playerteam[countb] = ascendingOrder.team[0];
                        Date.playerPoint[countb] = ascendingOrder.points[0];

                        break;
                    }



                }
            }
        }
    }







    @Override
    public void deleteDriver() { // delete driver
        for (int x = 0; x < Formula1Driver.s.size(); x++) {
            if (!Formula1Driver.s.get(x).getName().equals("empty"))
                System.out.println("[" + x + "] " + Formula1Driver.s.get(x).getName() + " - " + Formula1Driver.s.get(x).getTeam());
        }
        Scanner in = new Scanner(System.in);
        System.out.print("select driver to delete(Enter number) : ");
        int number = in.nextInt();

        if (number == 0){
            Formula1Driver.s.get(0).setName("empty");
            Formula1Driver.s.get(0).setTeam("empty");


        }
        else if (number == 1){
            Formula1Driver.s.get(1).setName("empty");
            Formula1Driver.s.get(1).setTeam("empty");


        }
        else if (number == 2){
            Formula1Driver.s.get(2).setName("empty");
            Formula1Driver.s.get(2).setTeam("empty");

        }
        else if (number == 3){
            Formula1Driver.s.get(3).setName("empty");
            Formula1Driver.s.get(3).setTeam("empty");

        }
        else if (number == 4){
            Formula1Driver.s.get(4).setName("empty");
            Formula1Driver.s.get(4).setTeam("empty");

        }
        else if (number == 5){
            Formula1Driver.s.get(5).setName("empty");
            Formula1Driver.s.get(5).setTeam("empty");

        }
        else if (number == 6){
            Formula1Driver.s.get(6).setName("empty");
            Formula1Driver.s.get(6).setTeam("empty");

        }
        else if (number == 7){
            Formula1Driver.s.get(7).setName("empty");
            Formula1Driver.s.get(7).setTeam("empty");

        }
        else if (number == 8){
            Formula1Driver.s.get(8).setName("empty");
            Formula1Driver.s.get(8).setTeam("empty");

        }
        else if (number == 9){
            Formula1Driver.s.get(9).setName("empty");
            Formula1Driver.s.get(9).setTeam("empty");

        }





        ascendingOrder.s[number] = null;
        ascendingOrder.team[number] = null;
        if (number == 0){
            for (int i = 0; i<Formula1Driver.s.get(0).p.size(); i++)
                Formula1Driver.s.get(0).p.remove(i);

        }
        else if (number == 1){
            for (int i = 0; i<Formula1Driver.s.get(1).p.size(); i++)
                Formula1Driver.s.get(1).p.remove(i);

        }
        else if (number == 2){
            for (int i = 0; i< Formula1Driver.s.get(2).p.size(); i++)
                Formula1Driver.s.get(2).p.remove(i);

        }
        else if (number == 3){
            for (int i = 0; i< Formula1Driver.s.get(3).p.size(); i++)
                Formula1Driver.s.get(3).p.remove(i);

        }
        else if (number == 4){
            for (int i = 0; i< Formula1Driver.s.get(4).p.size(); i++)
                Formula1Driver.s.get(4).p.remove(i);

        }
        else if (number == 5){
            for (int i = 0; i< Formula1Driver.s.get(5).p.size(); i++)
                Formula1Driver.s.get(5).p.remove(i);

        }
        else if (number == 6){
            for (int i = 0; i< Formula1Driver.s.get(6).p.size(); i++)
                Formula1Driver.s.get(6).p.remove(i);

        }
        else if (number == 7){
            for (int i = 0; i< Formula1Driver.s.get(7).p.size(); i++)
                Formula1Driver.s.get(7).p.remove(i);

        }
        else if (number == 8){
            for (int i = 0; i< Formula1Driver.s.get(8).p.size(); i++)
                Formula1Driver.s.get(8).p.remove(i);

        }
        else if (number == 9){
            for (int i = 0; i< Formula1Driver.s.get(9).p.size(); i++)
                Formula1Driver.s.get(9).p.remove(i);

        }

        System.out.println("Driver deleted successfully");
        System.out.println("");
        if (Formula1Driver.s.isEmpty()) {
            System.out.println("There are no drivers");
        } else {
            System.out.println("Available drivers now");
            System.out.println("");
            for (int x = 0; x < Formula1Driver.s.size(); x++) {
                if (!Formula1Driver.s.get(x).getName().equals("empty"))
                    System.out.println(Formula1Driver.s.get(x).getName() + " - " + Formula1Driver.s.get(x).getTeam());
            }


        }
    }

    @Override
    public void playerStatistic() {   // show player statistics

        while (true){
            for (int x = 0; x < Formula1Driver.s.size(); x++) {
                if (!Formula1Driver.s.get(x).getName().equals("empty"))
                    System.out.println("[" + x + "] " + Formula1Driver.s.get(x).getName() + " - " + Formula1Driver.s.get(x).getTeam());
            }
            Scanner in = new Scanner(System.in);
            System.out.println(" ");
            System.out.print("Choose player number to get player statistic : ");
            int playerno = in.nextInt();
            System.out.println(" ");
            System.out.println("***************** Player Statistics ***********************");
            System.out.println(" ");
            System.out.println("        Player Name - "+ Formula1Driver.s.get(playerno).getName());
            System.out.println("        Team        - "+ Formula1Driver.s.get(playerno).getTeam());

            if(playerno == 0){
                System.out.println("        Points      - "+ countPoint(p1.count(Formula1Driver.s.get(0).p,1), p1.count(Formula1Driver.s.get(0).p,2), p1.count(Formula1Driver.s.get(0).p,3), p1.count(Formula1Driver.s.get(0).p,4), p1.count(Formula1Driver.s.get(0).p,5), p1.count(Formula1Driver.s.get(0).p,6), p1.count(Formula1Driver.s.get(0).p,7), p1.count(Formula1Driver.s.get(0).p,8), p1.count(Formula1Driver.s.get(0).p,9), p1.count(Formula1Driver.s.get(0).p,10)));
                System.out.println("        Number of 1 Position -"+ p1.count(Formula1Driver.s.get(0).p,1));
                System.out.println("        Number of 2 Position -"+ p1.count(Formula1Driver.s.get(0).p,2));
                System.out.println("        Number of 3 Position -"+ p1.count(Formula1Driver.s.get(0).p,3));

            }
            if(playerno == 1){
                System.out.println("        Points      - "+ countPoint(p1.count(Formula1Driver.s.get(1).p,1), p1.count(Formula1Driver.s.get(1).p,2), p1.count(Formula1Driver.s.get(1).p,3), p1.count(Formula1Driver.s.get(1).p,4), p1.count(Formula1Driver.s.get(1).p,5), p1.count(Formula1Driver.s.get(1).p,6), p1.count(Formula1Driver.s.get(1).p,7), p1.count(Formula1Driver.s.get(1).p,8), p1.count(Formula1Driver.s.get(1).p,9), p1.count(Formula1Driver.s.get(1).p,10)));
                System.out.println("        Number of 1 Position -"+ p1.count(Formula1Driver.s.get(1).p,1));
                System.out.println("        Number of 2 Position -"+ p1.count(Formula1Driver.s.get(1).p,2));
                System.out.println("        Number of 3 Position -"+ p1.count(Formula1Driver.s.get(1).p,3));

            }
            if(playerno == 2){
                System.out.println("        Points      - "+ countPoint(p1.count(Formula1Driver.s.get(2).p,1), p1.count(Formula1Driver.s.get(2).p,2), p1.count(Formula1Driver.s.get(2).p,3), p1.count(Formula1Driver.s.get(2).p,4), p1.count(Formula1Driver.s.get(2).p,5), p1.count(Formula1Driver.s.get(2).p,6), p1.count(Formula1Driver.s.get(2).p,7), p1.count(Formula1Driver.s.get(2).p,8), p1.count(Formula1Driver.s.get(2).p,9), p1.count(Formula1Driver.s.get(2).p,10)));
                System.out.println("        Number of 1 Position -"+ p1.count(Formula1Driver.s.get(2).p,1));
                System.out.println("        Number of 2 Position -"+ p1.count(Formula1Driver.s.get(2).p,2));
                System.out.println("        Number of 3 Position -"+ p1.count(Formula1Driver.s.get(2).p,3));


            }
            if(playerno == 3){
                System.out.println("        Points      - "+ countPoint(p1.count(Formula1Driver.s.get(3).p,1), p1.count(Formula1Driver.s.get(3).p,2), p1.count(Formula1Driver.s.get(3).p,3), p1.count(Formula1Driver.s.get(3).p,4), p1.count(Formula1Driver.s.get(3).p,5), p1.count(Formula1Driver.s.get(3).p,6), p1.count(Formula1Driver.s.get(3).p,7), p1.count(Formula1Driver.s.get(3).p,8), p1.count(Formula1Driver.s.get(3).p,9), p1.count(Formula1Driver.s.get(3).p,10)));
                System.out.println("        Number of 1 Position -"+ p1.count(Formula1Driver.s.get(3).p,1));
                System.out.println("        Number of 2 Position -"+ p1.count(Formula1Driver.s.get(3).p,2));
                System.out.println("        Number of 3 Position -"+ p1.count(Formula1Driver.s.get(3).p,3));

            }
            if(playerno == 4){
                System.out.println("        Points      - "+ countPoint(p1.count(Formula1Driver.s.get(4).p,1), p1.count(Formula1Driver.s.get(4).p,2), p1.count(Formula1Driver.s.get(4).p,3), p1.count(Formula1Driver.s.get(4).p,4), p1.count(Formula1Driver.s.get(4).p,5), p1.count(Formula1Driver.s.get(4).p,6), p1.count(Formula1Driver.s.get(4).p,7), p1.count(Formula1Driver.s.get(4).p,8), p1.count(Formula1Driver.s.get(4).p,9), p1.count(Formula1Driver.s.get(4).p,10)));
                System.out.println("        Number of 1 Position -"+ p1.count(Formula1Driver.s.get(4).p,1));
                System.out.println("        Number of 2 Position -"+ p1.count(Formula1Driver.s.get(4).p,2));
                System.out.println("        Number of 3 Position -"+ p1.count(Formula1Driver.s.get(4).p,3));

            }
            if(playerno == 5){
                System.out.println("        Points      - "+ countPoint(p1.count(Formula1Driver.s.get(5).p,1), p1.count(Formula1Driver.s.get(5).p,2), p1.count(Formula1Driver.s.get(5).p,3), p1.count(Formula1Driver.s.get(5).p,4), p1.count(Formula1Driver.s.get(5).p,5), p1.count(Formula1Driver.s.get(5).p,6), p1.count(Formula1Driver.s.get(5).p,7), p1.count(Formula1Driver.s.get(5).p,8), p1.count(Formula1Driver.s.get(5).p,9), p1.count(Formula1Driver.s.get(5).p,10)));
                System.out.println("        Number of 1 Position -"+ p1.count(Formula1Driver.s.get(5).p,1));
                System.out.println("        Number of 2 Position -"+ p1.count(Formula1Driver.s.get(5).p,2));
                System.out.println("        Number of 3 Position -"+ p1.count(Formula1Driver.s.get(5).p,3));

            }
            if(playerno == 6){
                System.out.println("        Points      - "+ countPoint(p1.count(Formula1Driver.s.get(6).p,1), p1.count(Formula1Driver.s.get(6).p,2), p1.count(Formula1Driver.s.get(6).p,3), p1.count(Formula1Driver.s.get(6).p,4), p1.count(Formula1Driver.s.get(6).p,5), p1.count(Formula1Driver.s.get(6).p,6), p1.count(Formula1Driver.s.get(6).p,7), p1.count(Formula1Driver.s.get(6).p,8), p1.count(Formula1Driver.s.get(6).p,9), p1.count(Formula1Driver.s.get(6).p,10)));
                System.out.println("        Number of 1 Position -"+ p1.count(Formula1Driver.s.get(6).p,1));
                System.out.println("        Number of 2 Position -"+ p1.count(Formula1Driver.s.get(6).p,2));
                System.out.println("        Number of 3 Position -"+ p1.count(Formula1Driver.s.get(6).p,3));

            }
            if(playerno == 7){
                System.out.println("        Points      - "+ countPoint(p1.count(Formula1Driver.s.get(7).p,1), p1.count(Formula1Driver.s.get(7).p,2), p1.count(Formula1Driver.s.get(7).p,3), p1.count(Formula1Driver.s.get(7).p,4), p1.count(Formula1Driver.s.get(7).p,5), p1.count(Formula1Driver.s.get(7).p,6), p1.count(Formula1Driver.s.get(7).p,7), p1.count(Formula1Driver.s.get(7).p,8), p1.count(Formula1Driver.s.get(7).p,9), p1.count(Formula1Driver.s.get(7).p,10)));
                System.out.println("        Number of 1 Position -"+ p1.count(Formula1Driver.s.get(7).p,1));
                System.out.println("        Number of 2 Position -"+ p1.count(Formula1Driver.s.get(7).p,2));
                System.out.println("        Number of 3 Position -"+ p1.count(Formula1Driver.s.get(7).p,3));

            }
            if(playerno == 8){
                System.out.println("        Points      - "+ countPoint(p1.count(Formula1Driver.s.get(8).p,1), p1.count(Formula1Driver.s.get(8).p,2), p1.count(Formula1Driver.s.get(8).p,3), p1.count(Formula1Driver.s.get(8).p,4), p1.count(Formula1Driver.s.get(8).p,5), p1.count(Formula1Driver.s.get(8).p,6), p1.count(Formula1Driver.s.get(8).p,7), p1.count(Formula1Driver.s.get(8).p,8), p1.count(Formula1Driver.s.get(8).p,9), p1.count(Formula1Driver.s.get(8).p,10)));
                System.out.println("        Number of 1 Position -"+ p1.count(Formula1Driver.s.get(8).p,1));
                System.out.println("        Number of 2 Position -"+ p1.count(Formula1Driver.s.get(8).p,2));
                System.out.println("        Number of 3 Position -"+ p1.count(Formula1Driver.s.get(8).p,3));

            }
            if(playerno == 9){
                System.out.println("        Points      - "+ countPoint(p1.count(Formula1Driver.s.get(9).p,1), p1.count(Formula1Driver.s.get(9).p,2), p1.count(Formula1Driver.s.get(9).p,3), p1.count(Formula1Driver.s.get(9).p,4), p1.count(Formula1Driver.s.get(9).p,5), p1.count(Formula1Driver.s.get(9).p,6), p1.count(Formula1Driver.s.get(9).p,7), p1.count(Formula1Driver.s.get(9).p,8), p1.count(Formula1Driver.s.get(9).p,9), p1.count(Formula1Driver.s.get(9).p,10)));
                System.out.println("        Number of 1 Position -"+ p1.count(Formula1Driver.s.get(9).p,1));
                System.out.println("        Number of 2 Position -"+ p1.count(Formula1Driver.s.get(9).p,2));
                System.out.println("        Number of 3 Position -"+ p1.count(Formula1Driver.s.get(9).p,3));

            }
            System.out.println(" ");
            System.out.print("Do you want another player statistic(Y/N) : ");
            String s = in.next();
            if (s.equals("y")){
                this.playerStatistic();
            }
            if (s.equals("n")){
                break;

            }

        }






    }

    @Override
    public void changeTeam() {  // can change players teams
        System.out.println("-------------------Drivers--------------------------------");
        for (int x = 0; x < Formula1Driver.s.size(); x++) {
            if (!Formula1Driver.s.get(x).getName().equals("empty"))
                System.out.println("[" + x + "] " + Formula1Driver.s.get(x).getName() + " - " + Formula1Driver.s.get(x).getTeam());
        }
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your current team number :");
        int s = in.nextInt();
        System.out.println("Enter Your preferred team number :");
        int y = in.nextInt();
        String teamName = Formula1Driver.s.get(y).getTeam();
        String tName = Formula1Driver.s.get(s).getTeam();
        Formula1Driver.s.get(s).setTeam(teamName);
        Formula1Driver.s.get(y).setTeam(tName);


        System.out.println("-------------------Drivers--------------------------------");
        for (int x = 0; x < Formula1Driver.s.size(); x++) {
            if (!Formula1Driver.s.get(x).getName().equals("empty"))
                System.out.println("[" + x + "] " + Formula1Driver.s.get(x).getName() + " - " + Formula1Driver.s.get(x).getTeam());
        }




    }

    @Override
    public void saveData() throws IOException {   // save data
        File f1 = new File("formulaChampionship.txt");
        f1.createNewFile();

        FileOutputStream fout = new FileOutputStream(f1);
        ObjectOutputStream objout = new ObjectOutputStream(fout);

        Iterator it = Formula1Driver.s.iterator();
        while (it.hasNext()){
            Formula1Driver d = (Formula1Driver) it.next();
            objout.writeObject(d);
        }








        objout.close();
        fout.close();
        System.out.println("Data saved");

    }

    @Override
    public void LoadData() throws IOException {  // load data
        FileInputStream fin = new FileInputStream("formulaChampionship.txt");
        ObjectInputStream objin = new ObjectInputStream(fin);


        while (true){
            try {
                Formula1Driver c = (Formula1Driver) objin.readObject();
                pread.add(c);




            } catch (IOException | ClassNotFoundException e) {
                break;
            }


        }
        pread.get(0).p = Formula1Driver.s.get(0).p;
        pread.get(1).p = Formula1Driver.s.get(1).p;
        pread.get(2).p = Formula1Driver.s.get(2).p;
        pread.get(3).p = Formula1Driver.s.get(3).p;
        pread.get(4).p = Formula1Driver.s.get(4).p;
        pread.get(5).p = Formula1Driver.s.get(5).p;
        pread.get(6).p = Formula1Driver.s.get(6).p;
        pread.get(7).p = Formula1Driver.s.get(7).p;
        pread.get(8).p = Formula1Driver.s.get(8).p;
        pread.get(9).p = Formula1Driver.s.get(9).p;




    }

    public int countPoint(int a , int b , int c , int d , int e , int f , int g , int h , int i , int j ){  // count players points

        int points = a*25 + b*18 + c*15 + d*12 + e*10 + f*8 + g*6 + h*4 + i*2 + j*1;
        return points;


    }
    public int countRace(int a , int b , int c , int d , int e , int f , int g , int h , int i , int j ){  // count number of races gone by players

        int points = a + b + c + d + e + f + g + h + i + j;
        return points;


    }


}
