package com.company;


import java.io.Serializable;
import java.util.ArrayList;

import java.util.Scanner;

public class Formula1Driver  extends Driver implements Serializable {

    public static ArrayList<Formula1Driver> s = new ArrayList<Formula1Driver>(10);

    public  ArrayList<Integer> p = new ArrayList<Integer>();      // include player name,team and positions
    public static int[] positions = new int[10];

    public static   int[] points = new int[10];           // include players points

    private String driverName;              // name of the driver
    private int driverAge;                  // age of the driver
    private String driverTeam;              // team of the driver
    private int driverLocation;
    private int startingPosition;


    public void setTeam(String team){
        this.driverTeam = team;
    }             // set team to driver
    public String getTeam(){
        return driverTeam;
    }                           //get team of driver


    @Override
    void setName(String driverName) {
        this.driverName = driverName;
    }       // set driver name

    @Override
    String getName() {
        return driverName;
    }                                 // get driver name

    @Override
    void setAge(int driverAge) {
        this.driverAge = driverAge;
    }

    @Override
    int getAge() {
        return driverAge;
    }

    void setPosition(int startingPosition){
        this.startingPosition = startingPosition;
    }

    int getPosition(){
        return startingPosition;
    }

    public int count(ArrayList<Integer> n,int position){                 // count positions of players
        int occ = 0;
        for (int i =0 ; i<n.size();i++){
            if (position == n.get(i))
                occ++;



        }
        return occ;
    }




}
