package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {
        Formula1Driver p1 =  new Formula1Driver();
        Formula1ChampionshipManager s1 = new Formula1ChampionshipManager();
        Race r1 =new Race();
        s1.addPlayers();
        while (true){


            System.out.println("******************** Welcome ***************************");
            System.out.println(" ");
            System.out.println("    1 - Create a driver");
            System.out.println("    2 - Delete a driver");
            System.out.println("    3-  Change team ");
            System.out.println("    4 - Add a Race");
            System.out.println("    5 - Player Statistics");
            System.out.println("    6 - Driver table");
            System.out.println("    7 - Save Data");
            System.out.println("    8 - Load Data");
            System.out.println("    9 - GUI");
            System.out.println("    10 - Exit");
            System.out.println("*********************************************************");

            Scanner in = new Scanner(System.in);
            System.out.print("Choose Option : ");
            String input = in.next();


            switch (input){
                case "1":
                    s1.addDriver();
                    break;
                case "2":
                    s1.deleteDriver();
                    break;
                case "3":
                    s1.changeTeam();
                    break;
                case "4" :
                    s1.addRace();
                    break;
                case "5" :
                    s1.playerStatistic();;
                    break;
                case "6":
                    s1.driverTable();
                    break;
                case "7":
                    s1.saveData();
                    break;
                case "8":
                    s1.LoadData();
                    break;
                case "9":
                    r1.gui();


                    break;


            }

        }
    }
}
