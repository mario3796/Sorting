/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgorithmProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
/**
 *
 * @author Dell
     */
public class ArrayAfterSorting extends JFrame{
    
    JButton btn;
    
    public ArrayAfterSorting(int[]a){
        int x=90,y=100;
        setSize(1000, 600);
        setLayout(null);
        setResizable(false);
        
        JLabel title=new JLabel("Array after sorting");
        title.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
        title.setForeground(Color.WHITE);
        title.setBounds(370, 20, 300, 100);
        add(title);
        
        JLabel[]labels=new JLabel[a.length];
        for (int i = 0; i < a.length; i++) {
            labels[i]=new JLabel(""+i);
            labels[i].setFont(new Font("Comic Sans MS", Font.BOLD, 24));
            labels[i].setForeground(Color.WHITE);
            labels[i].setBounds(x, y, 50, 50);
            add(labels[i]);
            x+=200;
            if(x>900){
                x=90;
                y=300;
            }
        }
        x=70;
        y=150;
        
        JTextField[]fields=new JTextField[a.length];
        for (int i = 0; i < a.length; i++) {
            fields[i]=new JTextField();
            fields[i].setFont(new Font("Comic Sans MS", Font.BOLD, 24));
            fields[i].setBounds(x, y, 60, 50);
            fields[i].setEditable(false);
            fields[i].setText(""+a[i]);
            add(fields[i]);
            x+=200;
            if(x>900){
                x=70;
                y=350;
            }
            
        }
        this.btn=new JButton("Restart");
        this.btn.setBounds(450, 490, 150, 50);
        this.btn.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
        this.btn.setBackground(new Color(204, 204, 204));
        this.btn.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnActionPerformed(e);
            }
        });
        add(this.btn);
        
        
        JLabel background=new JLabel();
        background.setIcon(new ImageIcon(getClass().getResource("/AlgorithmProject/dark-wood.jpg")));
        background.setBounds(0, 0, 1000, 600);
        add(background);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void btnActionPerformed(java.awt.event.ActionEvent event){
        setVisible(false);
        new SizeOfArray().setVisible(true);
    }
    
}
