package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Grace extends JFrame {          // show date and players participant
    String[] columnNames = {"Date", "Participants","Ranking 1 player", "team","Points"};
    Formula1Driver p1 = new Formula1Driver();
    Formula1ChampionshipManager s1 = new Formula1ChampionshipManager();
    public static int[] points = new int[10];






    JTable jtable;
    public Grace()  {
        setLayout(new FlowLayout());

        for (int d = 0; d<10; d++) {
            if (Date.date[d] == null) {
                Date.date[d] = "empty";
            }
        }


        Object data[][] = {
                {Date.date[1],Date.participants[1],Date.player[1],Date.playerteam[1],Date.playerPoint[1]},
                {Date.date[2],Date.participants[2],Date.player[2],Date.playerteam[2],Date.playerPoint[2]},
                {Date.date[3],Date.participants[3],Date.player[3],Date.playerteam[3],Date.playerPoint[3]},
                {Date.date[4],Date.participants[4],Date.player[4],Date.playerteam[4],Date.playerPoint[4]},
                {Date.date[5],Date.participants[5],Date.player[5],Date.playerteam[5],Date.playerPoint[5]},
                {Date.date[6],Date.participants[6],Date.player[6],Date.playerteam[6],Date.playerPoint[6]},
                {Date.date[7],Date.participants[7],Date.player[7],Date.playerteam[7],Date.playerPoint[7]},
                {Date.date[8],Date.participants[8],Date.player[8],Date.playerteam[8],Date.playerPoint[8]},
                {Date.date[9],Date.participants[9],Date.player[9],Date.playerteam[9],Date.playerPoint[9]},

        };


        jtable = new JTable(data,columnNames);
        jtable.setPreferredScrollableViewportSize(new Dimension(500,140));
        jtable.setFillsViewportHeight(true);
        JScrollPane js = new JScrollPane(jtable);
        add(js);
    }



    public static void GUI(){
        Grace gui = new Grace();
        gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        gui.setSize(600,400);
        gui.setVisible(true);
        gui.setTitle("Date and Participants");

    }


}



