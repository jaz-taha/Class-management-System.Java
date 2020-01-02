/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

/**
 *
 * @author userJT
 */


public class Identifiant extends JFrame implements ActionListener{
    
    JFrame a;
    JPanel p,p1,p2;
    JLabel l;
    JButton b;
    public Identifiant(){
        
        a=new JFrame("YOUR ID");
        p=(JPanel)a.getContentPane();
        p.setLayout(new GridLayout(2,1));
        
        p1=new JPanel();
        p2=new JPanel();
        l=new JLabel();
        b=new JButton("Done!");
        b.addActionListener(this);
        
        p1.setLayout(new FlowLayout());
        p2.setLayout(new FlowLayout());
        int r = new Random().nextInt(100);
        l.setText("0000"+ String.valueOf(r));
        
        p1.add(l, BorderLayout.CENTER);
        p2.add(b);
        p.add(p1);
        p.add(p2);
        
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setVisible(true);
        int frameWidth = 800;
        int frameHeight = 160;
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        a.setBounds((int) screenSize.getWidth() -frameWidth, (int) screenSize.getHeight() -frameHeight*3, frameWidth, frameHeight);
        a.setResizable(false);
        a.setSize(250,100);
        
    }
    
    public void actionPerformed(ActionEvent e){
        if((JButton)e.getSource()==b){
            a.setVisible(false);
        }
    }
    public static void main(String[] args){
        Identifiant a=new Identifiant();
    }    
}
