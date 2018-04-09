/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.Timer;
public class BakingAndServing {
     static JProgressBar pb = new JProgressBar();
  static int progress;
  public static void main(String[] args) {
    JFrame f = new JFrame();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.add(pb);
    f.pack();
    f.setVisible(true);

    Timer timer = new Timer(50, new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        progress += 1;
        if (progress >= 100) {
          progress = 100;
          ((Timer) e.getSource()).stop();
        }
        pb.setValue(progress);
      }
    });
    timer.start();
  }
    
}
