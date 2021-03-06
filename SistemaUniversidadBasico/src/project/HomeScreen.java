package project;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomeScreen {

    private JFrame frmCollegeManagementSystem;


    public static void homeScreen() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    HomeScreen window = new HomeScreen();
                    window.frmCollegeManagementSystem.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public HomeScreen() {
        initialize();
    }


    private void initialize() {
        frmCollegeManagementSystem = new JFrame();
        frmCollegeManagementSystem.setResizable(false);
        frmCollegeManagementSystem.setTitle("Sistema De Manejo Universitario");
        frmCollegeManagementSystem.setBounds(100, 100, 1000, 600);
        frmCollegeManagementSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmCollegeManagementSystem.getContentPane().setLayout(null);

        JLabel bgimage = new JLabel("");
        bgimage.setBounds(0, 0, 1000, 600);
        frmCollegeManagementSystem.getContentPane().add(bgimage);

        JMenuItem mntmNewMenuItem = new JMenuItem(" ");
        mntmNewMenuItem.setBounds(0, 30, 137, 26);
        frmCollegeManagementSystem.getContentPane().add(mntmNewMenuItem);

        JMenuBar menubar= new JMenuBar();
        frmCollegeManagementSystem.setJMenuBar(menubar);

        JMenu add=new JMenu("Agregar");
        menubar.add(add);
        JMenuItem nf= new JMenuItem("Nueva Facultad");
        nf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                teacherInput hs=new teacherInput();
                hs.teacherInput();
            }
        });
        add.add(nf);
        JMenuItem ns= new JMenuItem("Nuevo Estudiante");
        ns.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                studentInput hs=new studentInput();
                hs.studentInput();

            }
        });
        add.add(ns);

        JMenu det=new JMenu("Detalles");
        menubar.add(det);
        JMenuItem td= new JMenuItem("Detalles de Profesores");
        td.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                Teacher_Display hs=new Teacher_Display();
                hs.Teacher_Display();

            }
        });
        det.add(td);
        JMenuItem sd= new JMenuItem("Detalles de Estudiantes");
        sd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                StudentDisplay hs=new StudentDisplay();
                hs.StudentDisplay();

            }
        });
        det.add(sd);

        JMenu exam=new JMenu("Examinar");
        menubar.add(exam);
        JMenuItem ed= new JMenuItem("Detalles");
        ed.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                Result hs=new Result();
                hs.Result();
            }
        });
        exam.add(ed);
        JMenuItem em= new JMenuItem("Marcas");
        em.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                ExamInput hs=new ExamInput();
                hs.ExamInput();
            }
        });
        exam.add(em);



        JMenu mu = new JMenu("Salir");

        menubar.add(mu);
        JMenuItem m= new JMenuItem("Salir");
        m.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        mu.add(m);


    }
}