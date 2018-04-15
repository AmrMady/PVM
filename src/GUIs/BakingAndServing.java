/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.Timer;

public class BakingAndServing {

    static JProgressBar pb = new JProgressBar();
    static int progress;

    
    
        public BakingAndServing(){
        JFrame frame = new JFrame();
        JTextField t1, t2;
        Boolean check = false;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t1 = new JTextField("Welcome to Javatpoint.");

        t1.setBounds(50, 100, 200, 30);
        pb.setBounds(50, 100, 200, 30);
        //f.add(t1);
        //f.add(pb);

        t2 = new JTextField("kosomk");
        t2.setVisible(false);
        Timer timer = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                progress += 1;
                if (progress >= 100) {
                    progress = 100;
                    ((Timer) e.getSource()).stop();
                }
                pb.setValue(progress);
                    if (progress == 100) {
                    t2.setVisible(true);
                }
            }
        });

        frame.add(t1, BorderLayout.NORTH);
        frame.add(t2, BorderLayout.SOUTH);
        frame.add(pb, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
        timer.start();
    }



    public static void main(String[] args) {
       new BakingAndServing();
    }



}
