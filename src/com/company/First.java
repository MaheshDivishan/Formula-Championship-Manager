package com.company;

import javax.swing.*;
import java.awt.*;



    public class First extends JFrame {  // show how many first position count
        public static int[] firstposition = new int[10];
        public static int[] secondposition = new int[10];
        public static int[] thirdtposition = new int[10];
        public static  int[] firstPositionCount = new int[10];
        public static String[] c = new String[10];
        public static String[] teams = new String[10];
        String[] columnNames = {"Name","Team","first Position Count"};
        public static int[] points = new int[10];





        JTable jtable;
        public First()  {
            setLayout(new FlowLayout());


            for (int d = 0; d<10; d++){
                if (c[d] == null){
                    c[d] = "empty";
                }
                if (teams[d] == null){
                    teams[d] = "empty";
                }

            }



            Object data[][] = {
                    {c[0],teams[0],firstPositionCount[0]},
                    {c[1],teams[1],firstPositionCount[1]},
                    {c[2],teams[2],firstPositionCount[2]},
                    {c[3],teams[3],firstPositionCount[3]},
                    {c[4],teams[4],firstPositionCount[4]},
                    {c[5],teams[5],firstPositionCount[5]},
                    {c[6],teams[6],firstPositionCount[6]},
                    {c[7],teams[7],firstPositionCount[7]},
                    {c[8],teams[8],firstPositionCount[8]},
                    {c[9],teams[9],firstPositionCount[9]},









            };


            jtable = new JTable(data,columnNames);
            jtable.setPreferredScrollableViewportSize(new Dimension(500,140));
            jtable.setFillsViewportHeight(true);
            JScrollPane js = new JScrollPane(jtable);
            add(js);
        }



        public static void GUIS(){
            First gui = new First();
            gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            gui.setSize(600,400);
            gui.setVisible(true);
            gui.setTitle("First Position Count");

        }


    }

