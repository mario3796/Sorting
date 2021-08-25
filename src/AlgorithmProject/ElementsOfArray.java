/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgorithmProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

/**
 *
 * @author Dell
 */
public class ElementsOfArray extends JFrame{

    private JTextField[]fields;
    private JLabel[]labels;
    private int[]a;
    private int size;
    private JButton btn;
    
    public ElementsOfArray(int n){
        this.size=n;
        
        int x=90,y=100;
        setSize(1000, 600);
        setLayout(null);
        setResizable(false);
        
        JLabel title=new JLabel("Enter elements of array");
        title.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
        title.setForeground(Color.WHITE);
        title.setBounds(350, 20, 300, 100);
        add(title);
        
        this.labels=new JLabel[n];
        for (int i = 0; i < n; i++) {
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
        
        this.fields=new JTextField[n];
        for (int i = 0; i < n; i++) {
            fields[i]=new JTextField();
            fields[i].setFont(new Font("Comic Sans MS", Font.BOLD, 24));
            fields[i].setBounds(x, y, 60, 50);
//            fields[i].addKeyListener(new java.awt.event.KeyAdapter() {
//                public void keyTyped(java.awt.event.KeyEvent evt){
//                    fieldKeyTyped(evt);
//                }
//            });
            add(fields[i]);
            x+=200;
            if(x>900){
                x=70;
                y=350;
            }
            
        }
        this.btn=new JButton("Next");
        this.btn.setBounds(450, 490, 100, 50);
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
    
    private void fieldKeyTyped(java.awt.event.KeyEvent evt){
        char vchar=evt.getKeyChar();
        if(!(Character.isDigit(vchar))
                ||(vchar==KeyEvent.VK_BACK_SPACE)
                ||(vchar==KeyEvent.VK_DELETE)){
            evt.consume();
    }
        
    }
    
    private void btnActionPerformed(java.awt.event.ActionEvent event){
        this.a=new int [size];
        
        for (int i = 0; i < this.size; i++) {
            if(fields[i].getText().equals("")){
                JOptionPane.showMessageDialog(null, "please fill all the elements", "Wrong", JOptionPane.ERROR_MESSAGE);
                return;
            }
            a[i]=Integer.parseInt(fields[i].getText());
        }
        setVisible(false);
        new TypeOfAlgorithm(a).setVisible(true);
    }
    
}
