package com.company;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class GenerateRace extends JFrame {   // show players ranking and generate race
    String[] columnNames = {"Name","Team","first Positions", "Second Positions" , "Third Positions" , "Points"};
    Formula1Driver p1 = new Formula1Driver();
    Formula1ChampionshipManager s1 = new Formula1ChampionshipManager();
    Grace s = new Grace();
    public static int[] points = new int[10];




    JTable jtable;
    public GenerateRace()  {
        s1.generateRace();
        setLayout(new FlowLayout());





        for (int d = 0; d<10; d++){
            if (ascendingOrder.s[d] == null){
                ascendingOrder.s[d] = "empty";
            }
            if (ascendingOrder.team[d] == null){
                ascendingOrder.team[d] = "empty";
            }

        }




        Object data[][] = {
                {ascendingOrder.s[0],ascendingOrder.team[0],First.firstposition[0],First.secondposition[0],First.thirdtposition[0],points[0]},
                {ascendingOrder.s[1],ascendingOrder.team[1],First.firstposition[1],First.secondposition[1],First.thirdtposition[1],points[1]},
                {ascendingOrder.s[2],ascendingOrder.team[2],First.firstposition[2],First.secondposition[2],First.thirdtposition[2],points[2]},
                {ascendingOrder.s[3],ascendingOrder.team[3],First.firstposition[3],First.secondposition[3],First.thirdtposition[3],points[3]},
                {ascendingOrder.s[4],ascendingOrder.team[4],First.firstposition[4],First.secondposition[4],First.thirdtposition[4],points[4]},
                {ascendingOrder.s[5],ascendingOrder.team[5],First.firstposition[5],First.secondposition[5],First.thirdtposition[5],points[5]},
                {ascendingOrder.s[6],ascendingOrder.team[6],First.firstposition[6],First.secondposition[6],First.thirdtposition[6],points[6]},
                {ascendingOrder.s[7],ascendingOrder.team[7],First.firstposition[7],First.secondposition[7],First.thirdtposition[7],points[7]},
                {ascendingOrder.s[8],ascendingOrder.team[8],First.firstposition[8],First.secondposition[8],First.thirdtposition[8],points[8]},
                {ascendingOrder.s[9],ascendingOrder.team[9],First.firstposition[9],First.secondposition[9],First.thirdtposition[9],points[9]},









        };


        jtable = new JTable(data,columnNames);
        jtable.setPreferredScrollableViewportSize(new Dimension(500,140));
        jtable.setFillsViewportHeight(true);
        JScrollPane js = new JScrollPane(jtable);
        add(js);
    }



    public static void GUI() {
        GenerateRace gui = new GenerateRace();
        gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        gui.setSize(600,400);
        gui.setVisible(true);
        gui.setTitle("Generate Race");

    }

}



