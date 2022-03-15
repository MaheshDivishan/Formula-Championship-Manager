package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Random;

public class Race  {  // GUI
    Grace s = new Grace();
    Formula1ChampionshipManager p1 = new Formula1ChampionshipManager();
    public static class ClickListener implements ActionListener {
        public void actionPerformed(ActionEvent event){
            jtable.GUI();


        }
    }
    public static class Click implements ActionListener {
        public void actionPerformed(ActionEvent event){
            First.GUIS();



        }
    }
    public static class Clicks implements ActionListener {
        public void actionPerformed(ActionEvent event){
            ascendingOrder.GUI();



        }
    }
    public static class race implements ActionListener {
        public void actionPerformed(ActionEvent event){

                GenerateRace.GUI();


        }
    }
    public static class raced implements ActionListener {
        public void actionPerformed(ActionEvent event){

            Grace.GUI();


        }
    }
    public static class sposition implements ActionListener {
        public void actionPerformed(ActionEvent event){

            StartingPosition.GUI();


        }
    }
    public static class player implements ActionListener {
        public void actionPerformed(ActionEvent event){
            Player.GUI();



        }
    }

    public void gui(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton("Player Details descending");
        JButton buttonFirst = new JButton("First Count");
        JButton buttonTwo = new JButton("Generate Race");
        JButton buttons = new JButton("Player Details ascending");
        JButton btn = new JButton("Date");
        JButton btns = new JButton("Starting Position");
        JButton btnss = new JButton("Player Statistics");
        panel.add(button);
        panel.add(buttons);
        panel.add(buttonTwo);
        panel.add(buttonFirst);
        panel.add(btn);
        panel.add(btns);
        panel.add(btnss);

        frame.add(panel);
        ActionListener listener = new Race.ClickListener();
        ActionListener listene = new Race.Click();
        ActionListener listeners = new Race.Clicks();
        ActionListener list = new Race.race();
        ActionListener lst = new Race.raced();
        ActionListener lsts = new Race.sposition();
        ActionListener lstss = new Race.player();
        buttonFirst.addActionListener(listene);
        button.addActionListener(listener);
        buttonTwo.addActionListener(list);
        buttons.addActionListener(listeners);
        btn.addActionListener(lst);
        btns.addActionListener(lsts);
        btnss.addActionListener(lstss);
        frame.setSize(300,400);
        frame.setTitle("Formula 1 Championship");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);

    }




}
