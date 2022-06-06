package project;

import java.awt.EventQueue;
import java.sql.Connection;


import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;



import javax.swing.ScrollPaneConstants;
import javax.swing.JLabel;
import java.awt.Font;

public class Result {

    private JFrame frame;
    private JTable table;
    private JScrollPane scrollPane;
    private Connection conn;


    public static void Result() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Result window = new Result();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public Result() {
        initialize();
    }


    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 854, 482);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        scrollPane = new JScrollPane();
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setBounds(10, 73, 818, 359);
        frame.getContentPane().add(scrollPane);

        table = new JTable();
        table.setModel(new DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                        "Roll No.", "Sujeto 1", "Sujeto 2", "Sujeto 3", "Sujeto 4", "Sujeto 5", "Sujeto 6", "Total"
                }
        ));
        scrollPane.setViewportView(table);

        JLabel lblNewLabel = new JLabel("Resultado");
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
        lblNewLabel.setBounds(325, 11, 103, 40);
        frame.getContentPane().add(lblNewLabel);

    }
}