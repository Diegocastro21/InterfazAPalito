package project;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.JFrame;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ScrollPaneConstants;

public class StudentDisplay {

    private JFrame frame;
    private JTable table;
    private Connection conn;
    private JLabel NewStudentLabel;
    private JButton NewStudent;


    public static void StudentDisplay() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    StudentDisplay window = new StudentDisplay();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public StudentDisplay() {
        initialize();
    }


    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 866, 510);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setBounds(10, 11, 818, 349);
        frame.getContentPane().add(scrollPane);

        table = new JTable();
        table.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        scrollPane.setViewportView(table);
        table.setForeground(new Color(0, 0, 0));
        table.setModel(new DefaultTableModel(
                new Object[][] {
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                },
                new String[] {
                        "bnal", "X", "XII", "NTN", "Phone", "Email", "Nombre", "Nombre Padre", "Nombre Madre ", "Rama", "Direccion", "Edad", "Curso"
                }
        ));
        table.getColumnModel().getColumn(0).setPreferredWidth(120);
        table.getColumnModel().getColumn(3).setPreferredWidth(125);
        table.getColumnModel().getColumn(4).setPreferredWidth(115);
        table.getColumnModel().getColumn(5).setPreferredWidth(225);
        table.getColumnModel().getColumn(6).setPreferredWidth(205);
        table.getColumnModel().getColumn(7).setPreferredWidth(205);
        table.getColumnModel().getColumn(8).setPreferredWidth(205);
        table.getColumnModel().getColumn(9).setPreferredWidth(175);
        table.getColumnModel().getColumn(10).setPreferredWidth(375);

        NewStudentLabel = new JLabel("Agregar nuevo estudiante");
        NewStudentLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
        NewStudentLabel.setBounds(123, 395, 145, 14);
        frame.getContentPane().add(NewStudentLabel);

        NewStudent = new JButton("Agregar");
        NewStudent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                studentInput hs=new studentInput();
                hs.studentInput();
            }
        });
        NewStudent.setBounds(314, 391, 89, 23);
        frame.getContentPane().add(NewStudent);

    }
}