package com.company;

import javax.swing.*;
import java.awt.*;

public class ascendingOrder extends JFrame {   // show player ranking ascending order
    String[] columnNames = {"Name","Team","first Positions", "Second Positions" , "Third Positions" , "Points"};
    Formula1Driver p1 = new Formula1Driver();
    Formula1ChampionshipManager s1 = new Formula1ChampionshipManager();
    public static int[] points = new int[10];
    public static String[] s = new String[10];
    public static String[] team = new String[10];





    JTable jtable;
    public ascendingOrder()  {


        setLayout(new FlowLayout());

        for (int d = 0; d<10; d++){
            if (s[d] == null){
                s[d] = "empty";
            }
            if (team[d] == null){
                team[d] = "empty";
            }

        }





        Object data[][] = {
                {s[9],team[9],First.firstposition[9],First.secondposition[9],First.thirdtposition[9],points[9]},
                {s[8],team[8],First.firstposition[8],First.secondposition[8],First.thirdtposition[8],points[8]},
                {s[7],team[7],First.firstposition[7],First.secondposition[7],First.thirdtposition[7],points[7]},
                {s[6],team[6],First.firstposition[6],First.secondposition[6],First.thirdtposition[6],points[6]},
                {s[5],team[5],First.firstposition[5],First.secondposition[5],First.thirdtposition[5],points[5]},
                {s[4],team[4],First.firstposition[4],First.secondposition[4],First.thirdtposition[4],points[4]},
                {s[3],team[3],First.firstposition[3],First.secondposition[3],First.thirdtposition[3],points[3]},
                {s[2],team[2],First.firstposition[2],First.secondposition[2],First.thirdtposition[2],points[2]},
                {s[1],team[1],First.firstposition[1],First.secondposition[1],First.thirdtposition[1],points[1]},
                {s[0],team[0],First.firstposition[0],First.secondposition[0],First.thirdtposition[0],points[0]},









        };


        jtable = new JTable(data,columnNames);
        jtable.setPreferredScrollableViewportSize(new Dimension(500,140));
        jtable.setFillsViewportHeight(true);
        JScrollPane js = new JScrollPane(jtable);
        add(js);
    }



    public static void GUI(){
        ascendingOrder gui = new ascendingOrder();
        gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        gui.setSize(600,400);
        gui.setVisible(true);
        gui.setTitle("ascending Order");

    }


}


