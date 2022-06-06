package project;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetMetaData;*/

import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Teacher_Display {

    private JFrame frame;
    private JTable table;
    private Connection conn;

    /**
     * Launch the application.
     */
    public static void Teacher_Display() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Teacher_Display window = new Teacher_Display();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Teacher_Display() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        //conn = DB.dbconnect();
        frame = new JFrame();
        frame.setBounds(100, 100, 866, 510);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 11, 818, 349);
        frame.getContentPane().add(scrollPane);

        table = new JTable();
        scrollPane.setViewportView(table);
        table.setForeground(new Color(0, 0, 0));
        table.setModel(new DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                        "bnal", "X", "XII", "NTN", "Phone", "Email", "Nombre", "Nombre Padre", "Nombre Madre ", "Rama", "Direccion", "Edad", "Curso"
                }
        ));

        JLabel NewTeacherlabel = new JLabel("Agrega Nuevo Profe");
        NewTeacherlabel.setFont(new Font("Tahoma", Font.BOLD, 13));
        NewTeacherlabel.setBounds(126, 387, 202, 14);
        frame.getContentPane().add(NewTeacherlabel);

        JButton NewTeacher = new JButton("Agregar");
        NewTeacher.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                teacherInput hs=new teacherInput();
                hs.teacherInput();
            }
        });
        NewTeacher.setBounds(301, 384, 89, 23);
        frame.getContentPane().add(NewTeacher);

    }
}