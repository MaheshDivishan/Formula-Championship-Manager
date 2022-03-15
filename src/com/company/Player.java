package com.company;

import javax.swing.*;
import javax.swing.text.FlowView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public  class Player extends JFrame {

    public static JTextArea text = new JTextArea();
    public static JButton btn = new JButton("Click");
    public static JLabel lbla = new JLabel();
    public static JLabel lblb = new JLabel();
    public static JLabel lblc = new JLabel();
    public static JLabel lbld = new JLabel();
    public static JPanel panel = new JPanel();




    public static class Click implements ActionListener {
        public void actionPerformed(ActionEvent event){
            Formula1Driver p1 = new Formula1Driver();
            Formula1ChampionshipManager s1 = new Formula1ChampionshipManager();
            String a = text.getText();
            if (a.equals(Formula1Driver.s.get(0).getName())){
                lbla.setText("Name"+"="+" "+Formula1Driver.s.get(0).getName());
                lblb.setText("Team"+"="+" "+Formula1Driver.s.get(0).getTeam());
                lblc.setText("Points"+"="+" "+s1.countPoint(p1.count(Formula1Driver.s.get(0).p, 1), p1.count(Formula1Driver.s.get(0).p, 2), p1.count(Formula1Driver.s.get(0).p, 3), p1.count(Formula1Driver.s.get(0).p, 4), p1.count(Formula1Driver.s.get(0).p, 5), p1.count(Formula1Driver.s.get(0).p, 6), p1.count(Formula1Driver.s.get(0).p, 7), p1.count(Formula1Driver.s.get(0).p, 8), p1.count(Formula1Driver.s.get(0).p, 9), p1.count(Formula1Driver.s.get(0).p, 10)));
                lbld.setText("Races"+"="+" "+s1.countRace(p1.count(Formula1Driver.s.get(0).p, 1), p1.count(Formula1Driver.s.get(0).p, 2), p1.count(Formula1Driver.s.get(0).p, 3), p1.count(Formula1Driver.s.get(0).p, 4), p1.count(Formula1Driver.s.get(0).p, 5), p1.count(Formula1Driver.s.get(0).p, 6), p1.count(Formula1Driver.s.get(0).p, 7), p1.count(Formula1Driver.s.get(0).p, 8), p1.count(Formula1Driver.s.get(0).p, 9), p1.count(Formula1Driver.s.get(0).p, 10)));


            }
            if (a.equals(Formula1Driver.s.get(1).getName())){
                lbla.setText("Name"+"="+" "+Formula1Driver.s.get(1).getName());
                lblb.setText("Team"+"="+" "+Formula1Driver.s.get(1).getTeam());
                lblc.setText("Points"+"="+" "+s1.countPoint(p1.count(Formula1Driver.s.get(1).p, 1), p1.count(Formula1Driver.s.get(1).p, 2), p1.count(Formula1Driver.s.get(1).p, 3), p1.count(Formula1Driver.s.get(1).p, 4), p1.count(Formula1Driver.s.get(1).p, 5), p1.count(Formula1Driver.s.get(1).p, 6), p1.count(Formula1Driver.s.get(1).p, 7), p1.count(Formula1Driver.s.get(1).p, 8), p1.count(Formula1Driver.s.get(1).p, 9), p1.count(Formula1Driver.s.get(1).p, 10)));
                lbld.setText("Races"+"="+" "+s1.countRace(p1.count(Formula1Driver.s.get(1).p, 1), p1.count(Formula1Driver.s.get(1).p, 2), p1.count(Formula1Driver.s.get(1).p, 3), p1.count(Formula1Driver.s.get(1).p, 4), p1.count(Formula1Driver.s.get(1).p, 5), p1.count(Formula1Driver.s.get(1).p, 6), p1.count(Formula1Driver.s.get(1).p, 7), p1.count(Formula1Driver.s.get(1).p, 8), p1.count(Formula1Driver.s.get(1).p, 9), p1.count(Formula1Driver.s.get(1).p, 10)));

            }
            if (a.equals(Formula1Driver.s.get(2).getName())){
                lbla.setText("Name"+"="+" "+Formula1Driver.s.get(2).getName());
                lblb.setText("Team"+"="+" "+Formula1Driver.s.get(2).getTeam());
                lblc.setText("Points"+"="+" "+s1.countPoint(p1.count(Formula1Driver.s.get(2).p, 1), p1.count(Formula1Driver.s.get(2).p, 2), p1.count(Formula1Driver.s.get(2).p, 3), p1.count(Formula1Driver.s.get(2).p, 4), p1.count(Formula1Driver.s.get(2).p, 5), p1.count(Formula1Driver.s.get(2).p, 6), p1.count(Formula1Driver.s.get(2).p, 7), p1.count(Formula1Driver.s.get(2).p, 8), p1.count(Formula1Driver.s.get(2).p, 9), p1.count(Formula1Driver.s.get(2).p, 10)));
                lbld.setText("Races"+"="+" "+s1.countRace(p1.count(Formula1Driver.s.get(2).p, 1), p1.count(Formula1Driver.s.get(2).p, 2), p1.count(Formula1Driver.s.get(2).p, 3), p1.count(Formula1Driver.s.get(2).p, 4), p1.count(Formula1Driver.s.get(2).p, 5), p1.count(Formula1Driver.s.get(2).p, 6), p1.count(Formula1Driver.s.get(2).p, 7), p1.count(Formula1Driver.s.get(2).p, 8), p1.count(Formula1Driver.s.get(2).p, 9), p1.count(Formula1Driver.s.get(2).p, 10)));

            }
            if (a.equals(Formula1Driver.s.get(3).getName())){
                lbla.setText("Name"+"="+" "+Formula1Driver.s.get(3).getName());
                lblb.setText("Team"+"="+" "+Formula1Driver.s.get(3).getTeam());
                lblc.setText("Points"+"="+" "+s1.countPoint(p1.count(Formula1Driver.s.get(3).p, 1), p1.count(Formula1Driver.s.get(3).p, 2), p1.count(Formula1Driver.s.get(3).p, 3), p1.count(Formula1Driver.s.get(3).p, 4), p1.count(Formula1Driver.s.get(3).p, 5), p1.count(Formula1Driver.s.get(3).p, 6), p1.count(Formula1Driver.s.get(3).p, 7), p1.count(Formula1Driver.s.get(3).p, 8), p1.count(Formula1Driver.s.get(3).p, 9), p1.count(Formula1Driver.s.get(3).p, 10)));
                lbld.setText("Races"+"="+" "+s1.countRace(p1.count(Formula1Driver.s.get(3).p, 1), p1.count(Formula1Driver.s.get(3).p, 2), p1.count(Formula1Driver.s.get(3).p, 3), p1.count(Formula1Driver.s.get(3).p, 4), p1.count(Formula1Driver.s.get(3).p, 5), p1.count(Formula1Driver.s.get(3).p, 6), p1.count(Formula1Driver.s.get(3).p, 7), p1.count(Formula1Driver.s.get(3).p, 8), p1.count(Formula1Driver.s.get(3).p, 9), p1.count(Formula1Driver.s.get(3).p, 10)));

            }
            if (a.equals(Formula1Driver.s.get(4).getName())){
                lbla.setText("Name"+"="+" "+Formula1Driver.s.get(4).getName());
                lblb.setText("Team"+"="+" "+Formula1Driver.s.get(4).getTeam());
                lblc.setText("Points"+"="+" "+s1.countPoint(p1.count(Formula1Driver.s.get(4).p, 1), p1.count(Formula1Driver.s.get(4).p, 2), p1.count(Formula1Driver.s.get(4).p, 3), p1.count(Formula1Driver.s.get(4).p, 4), p1.count(Formula1Driver.s.get(4).p, 5), p1.count(Formula1Driver.s.get(4).p, 6), p1.count(Formula1Driver.s.get(4).p, 7), p1.count(Formula1Driver.s.get(4).p, 8), p1.count(Formula1Driver.s.get(4).p, 9), p1.count(Formula1Driver.s.get(4).p, 10)));
                lbld.setText("Races"+"="+" "+s1.countRace(p1.count(Formula1Driver.s.get(4).p, 1), p1.count(Formula1Driver.s.get(4).p, 2), p1.count(Formula1Driver.s.get(4).p, 3), p1.count(Formula1Driver.s.get(4).p, 4), p1.count(Formula1Driver.s.get(4).p, 5), p1.count(Formula1Driver.s.get(4).p, 6), p1.count(Formula1Driver.s.get(4).p, 7), p1.count(Formula1Driver.s.get(4).p, 8), p1.count(Formula1Driver.s.get(4).p, 9), p1.count(Formula1Driver.s.get(4).p, 10)));

            }
            if (a.equals(Formula1Driver.s.get(5).getName())){
                lbla.setText("Name"+"="+" "+Formula1Driver.s.get(5).getName());
                lblb.setText("Team"+"="+" "+Formula1Driver.s.get(5).getTeam());
                lblc.setText("Points"+"="+" "+s1.countPoint(p1.count(Formula1Driver.s.get(5).p, 1), p1.count(Formula1Driver.s.get(5).p, 2), p1.count(Formula1Driver.s.get(5).p, 3), p1.count(Formula1Driver.s.get(5).p, 4), p1.count(Formula1Driver.s.get(5).p, 5), p1.count(Formula1Driver.s.get(5).p, 6), p1.count(Formula1Driver.s.get(5).p, 7), p1.count(Formula1Driver.s.get(5).p, 8), p1.count(Formula1Driver.s.get(5).p, 9), p1.count(Formula1Driver.s.get(5).p, 10)));
                lbld.setText("Races"+"="+" "+s1.countRace(p1.count(Formula1Driver.s.get(5).p, 1), p1.count(Formula1Driver.s.get(5).p, 2), p1.count(Formula1Driver.s.get(5).p, 3), p1.count(Formula1Driver.s.get(5).p, 4), p1.count(Formula1Driver.s.get(5).p, 5), p1.count(Formula1Driver.s.get(5).p, 6), p1.count(Formula1Driver.s.get(5).p, 7), p1.count(Formula1Driver.s.get(5).p, 8), p1.count(Formula1Driver.s.get(5).p, 9), p1.count(Formula1Driver.s.get(5).p, 10)));

            }
            if (a.equals(Formula1Driver.s.get(6).getName())){
                lbla.setText("Name"+"="+" "+Formula1Driver.s.get(6).getName());
                lblb.setText("Team"+"="+" "+Formula1Driver.s.get(6).getTeam());
                lblc.setText("Points"+"="+" "+s1.countPoint(p1.count(Formula1Driver.s.get(6).p, 1), p1.count(Formula1Driver.s.get(6).p, 2), p1.count(Formula1Driver.s.get(6).p, 3), p1.count(Formula1Driver.s.get(6).p, 4), p1.count(Formula1Driver.s.get(6).p, 5), p1.count(Formula1Driver.s.get(6).p, 6), p1.count(Formula1Driver.s.get(6).p, 7), p1.count(Formula1Driver.s.get(6).p, 8), p1.count(Formula1Driver.s.get(6).p, 9), p1.count(Formula1Driver.s.get(6).p, 10)));
                lbld.setText("Races"+"="+" "+s1.countRace(p1.count(Formula1Driver.s.get(6).p, 1), p1.count(Formula1Driver.s.get(6).p, 2), p1.count(Formula1Driver.s.get(6).p, 3), p1.count(Formula1Driver.s.get(6).p, 4), p1.count(Formula1Driver.s.get(6).p, 5), p1.count(Formula1Driver.s.get(6).p, 6), p1.count(Formula1Driver.s.get(6).p, 7), p1.count(Formula1Driver.s.get(6).p, 8), p1.count(Formula1Driver.s.get(6).p, 9), p1.count(Formula1Driver.s.get(6).p, 10)));

            }
            if (a.equals(Formula1Driver.s.get(7).getName())){
                lbla.setText("Name"+"="+" "+Formula1Driver.s.get(7).getName());
                lblb.setText("Team"+"="+" "+Formula1Driver.s.get(7).getTeam());
                lblc.setText("Points"+"="+" "+s1.countPoint(p1.count(Formula1Driver.s.get(7).p, 1), p1.count(Formula1Driver.s.get(7).p, 2), p1.count(Formula1Driver.s.get(7).p, 3), p1.count(Formula1Driver.s.get(7).p, 4), p1.count(Formula1Driver.s.get(0).p, 5), p1.count(Formula1Driver.s.get(7).p, 6), p1.count(Formula1Driver.s.get(7).p, 7), p1.count(Formula1Driver.s.get(7).p, 8), p1.count(Formula1Driver.s.get(7).p, 9), p1.count(Formula1Driver.s.get(7).p, 10)));
                lbld.setText("Races"+"="+" "+s1.countRace(p1.count(Formula1Driver.s.get(7).p, 1), p1.count(Formula1Driver.s.get(7).p, 2), p1.count(Formula1Driver.s.get(7).p, 3), p1.count(Formula1Driver.s.get(7).p, 4), p1.count(Formula1Driver.s.get(0).p, 5), p1.count(Formula1Driver.s.get(7).p, 6), p1.count(Formula1Driver.s.get(7).p, 7), p1.count(Formula1Driver.s.get(7).p, 8), p1.count(Formula1Driver.s.get(7).p, 9), p1.count(Formula1Driver.s.get(7).p, 10)));

            }
            if (a.equals(Formula1Driver.s.get(8).getName())){
                lbla.setText("Name"+"="+" "+Formula1Driver.s.get(8).getName());
                lblb.setText("Team"+"="+" "+Formula1Driver.s.get(8).getTeam());
                lblc.setText("Points"+"="+" "+s1.countPoint(p1.count(Formula1Driver.s.get(8).p, 1), p1.count(Formula1Driver.s.get(8).p, 2), p1.count(Formula1Driver.s.get(8).p, 3), p1.count(Formula1Driver.s.get(8).p, 4), p1.count(Formula1Driver.s.get(0).p, 5), p1.count(Formula1Driver.s.get(8).p, 6), p1.count(Formula1Driver.s.get(8).p, 7), p1.count(Formula1Driver.s.get(8).p, 8), p1.count(Formula1Driver.s.get(8).p, 9), p1.count(Formula1Driver.s.get(8).p, 10)));
                lbld.setText("Races"+"="+" "+s1.countRace(p1.count(Formula1Driver.s.get(8).p, 1), p1.count(Formula1Driver.s.get(8).p, 2), p1.count(Formula1Driver.s.get(8).p, 3), p1.count(Formula1Driver.s.get(8).p, 4), p1.count(Formula1Driver.s.get(0).p, 5), p1.count(Formula1Driver.s.get(8).p, 6), p1.count(Formula1Driver.s.get(8).p, 7), p1.count(Formula1Driver.s.get(8).p, 8), p1.count(Formula1Driver.s.get(8).p, 9), p1.count(Formula1Driver.s.get(8).p, 10)));

            }
            if (a.equals(Formula1Driver.s.get(9).getName())){
                lbla.setText("Name"+"="+" "+Formula1Driver.s.get(9).getName());
                lblb.setText("Team"+"="+" "+Formula1Driver.s.get(9).getTeam());
                lblc.setText("Points"+"="+" "+s1.countPoint(p1.count(Formula1Driver.s.get(9).p, 1), p1.count(Formula1Driver.s.get(9).p, 2), p1.count(Formula1Driver.s.get(9).p, 3), p1.count(Formula1Driver.s.get(9).p, 4), p1.count(Formula1Driver.s.get(0).p, 5), p1.count(Formula1Driver.s.get(9).p, 6), p1.count(Formula1Driver.s.get(9).p, 7), p1.count(Formula1Driver.s.get(9).p, 8), p1.count(Formula1Driver.s.get(9).p, 9), p1.count(Formula1Driver.s.get(9).p, 10)));
                lbld.setText("Races"+"="+" "+s1.countRace(p1.count(Formula1Driver.s.get(9).p, 1), p1.count(Formula1Driver.s.get(9).p, 2), p1.count(Formula1Driver.s.get(9).p, 3), p1.count(Formula1Driver.s.get(9).p, 4), p1.count(Formula1Driver.s.get(0).p, 5), p1.count(Formula1Driver.s.get(0).p, 6), p1.count(Formula1Driver.s.get(9).p, 7), p1.count(Formula1Driver.s.get(9).p, 8), p1.count(Formula1Driver.s.get(9).p, 9), p1.count(Formula1Driver.s.get(9).p, 10)));

            }



        }
    }




    public static void GUI(){
        JFrame frame = new JFrame();
        frame.setTitle("Player");
        frame.setVisible(true);
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        panel.add(text);
        panel.add(btn);
        panel.add(lbla);
        panel.add(lblb);
        panel.add(lblc);
        panel.add(lbld);
        frame.add(panel);

        ActionListener lst = new Player.Click();
        btn.addActionListener(lst);


    }

}


