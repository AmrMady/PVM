/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

import com.sun.glass.ui.Size;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import org.antlr.v4.runtime.atn.PlusLoopbackState;
import pvm.Order;
import pvm.Pizza;

public class ReceiptAndPaymentOptions extends JPanel {

    private boolean DEBUG = false;
    // private Order order;
    //private ArrayList<Pizza> PizzaList = order.getPizzaList();
    //private int PLSize = PizzaList.size();
    //private Object[][] fill = new Object[PLSize][2];

    public ReceiptAndPaymentOptions() {
        super(new GridLayout(1, 0));
       /* JRadioButton Cash = new JRadioButton("Cash");
        JRadioButton Card = new JRadioButton("Card");
        ButtonGroup PO = new ButtonGroup();
        PO.add(Cash);
        PO.add(Card);*/
        //Cash.setSelected(true);
        //PO.setVisible(true);
        // Rb j = new Rb();
       // JTextField textField = new JTextField("Enter amount");
        JTable table = new JTable(new MyTableModel());
        table.setPreferredScrollableViewportSize(new Dimension(500, 70));
        table.setFillsViewportHeight(true);
        /*for (int i = 0; i < PLSize; i++) {
            fill[i][0] = PizzaList.get(i).type;
            fill[i][1] = PizzaList.get(i).price;
        }*/
        //Create the scroll pane and add the table to it.
        JScrollPane scrollPane = new JScrollPane(table);

        //Add the scroll pane to this panel.
        add(table);
        // add(PO);
        //   add(textField);
    }

    public class Rb extends JFrame {

        Rb() {
            JRadioButton Cash = new JRadioButton("Cash");
            JRadioButton Card = new JRadioButton("Card");
            ButtonGroup PO = new ButtonGroup();
            PO.add(Cash);
            PO.add(Card);
            this.setSize(100, 200);
            //this.setLayout( new FlowLayout());
            this.add(Cash);
            this.add(Card);
            Cash.setSelected(true);
            this.setVisible(true);
        }
    }

    class MyTableModel extends AbstractTableModel {

        private String[] columnNames = {"Pizza Name",
            "Price"};
        private Object[][] data = {
            {"Kathy", "Smith",
                "Snowboarding"},
            {"John", "Doe",
                "Rowing"},
            {"Sue", "Black",
                "Knitting"}
        };

        // for(int i = 0; i)
        public int getColumnCount() {
            // return 2;
            return columnNames.length;
        }

        public int getRowCount() {
            //return PLSize;
            return data.length;
        }

        public String getColumnName(int col) {
            return columnNames[col];
        }

        public Object getValueAt(int row, int col) {
            return data[row][col];
        }

        /*
         * JTable uses this method to determine the default renderer/
         * editor for each cell.  If we didn't implement this method,
         * then the last column would contain text ("true"/"false"),
         * rather than a check box.
         */
        public Class getColumnClass(int c) {
            return getValueAt(0, c).getClass();
        }

        /*
         * Don't need to implement this method unless your table's
         * editable.
         */
        public boolean isCellEditable(int row, int col) {
            //Note that the data/cell address is constant,
            //no matter where the cell appears onscreen.
            if (col < 2) {
                return false;
            } else {
                return true;
            }
        }

        /*
         * Don't need to implement this method unless your table's
         * data can change.
         */
        public void setValueAt(Object value, int row, int col) {
            if (DEBUG) {
                System.out.println("Setting value at " + row + "," + col
                        + " to " + value
                        + " (an instance of "
                        + value.getClass() + ")");
            }

            data[row][col] = value;
            fireTableCellUpdated(row, col);

            if (DEBUG) {
                System.out.println("New value of data:");
                printDebugData();
            }
        }

        private void printDebugData() {
            int numRows = getRowCount();
            int numCols = getColumnCount();

            for (int i = 0; i < numRows; i++) {
                System.out.print("    row " + i + ":");
                for (int j = 0; j < numCols; j++) {
                    System.out.print("  " + data[i][j]);
                }
                System.out.println();
            }
            System.out.println("--------------------------");
        }
    }

    /**
     * Create the GUI and show it. For thread safety, this method should be
     * invoked from the event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("TableDemo");
        frame.setLayout(new BorderLayout());
        //JTable table = new JTable(new MyTableModel());
        JTextField textField = new JTextField("Enter amount");
        JButton buttonCard = new JButton("Card");
        JButton buttonCash = new JButton("Cash");
        
        JPanel btnPnl = new JPanel(new BorderLayout());
        JPanel topBtnPnl = new JPanel(new FlowLayout(FlowLayout.TRAILING));
        JPanel bottombtnPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        topBtnPnl.add(textField);
        bottombtnPnl.add(buttonCard);
        bottombtnPnl.add(buttonCash);
        
        btnPnl.add(topBtnPnl, BorderLayout.NORTH);
        btnPnl.add(bottombtnPnl, BorderLayout.CENTER);
        
        
        
        
        
        

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        ReceiptAndPaymentOptions newContentPane = new ReceiptAndPaymentOptions();
        newContentPane.setOpaque(true); //content panes must be opaque
        //frame.setContentPane(newContentPane);
     
        
        frame.add(newContentPane, BorderLayout.CENTER);
        
        frame.add(btnPnl, BorderLayout.SOUTH);
        

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
