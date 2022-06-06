package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;


import javax.swing.JButton;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class component {

    private JFrame frmLoginPage;
    private JTextField user;
    private JPasswordField pass;


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    component window = new component();
                    window.frmLoginPage.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public component() {
        initialize();
    }


    private void initialize() {

        frmLoginPage = new JFrame();
        frmLoginPage.setTitle("LOGIN");
        frmLoginPage.getContentPane().setBackground(Color.BLACK);
        frmLoginPage.setBounds(100, 100, 563, 376);
        frmLoginPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmLoginPage.getContentPane().setLayout(null);
        frmLoginPage.setResizable(false);

        JPanel panel = new JPanel();
        panel.setBackground(SystemColor.textHighlight);
        panel.setBounds(10, 11, 527, 315);
        frmLoginPage.getContentPane().add(panel);
        panel.setLayout(null);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(SystemColor.activeCaption);
        panel_1.setBounds(180, 0, 347, 315);
        panel.add(panel_1);
        panel_1.setLayout(null);

        user = new JTextField();
        user.setBounds(165, 114, 159, 20);
        panel_1.add(user);
        user.setColumns(10);

        JLabel lblNewLabel = new JLabel("Usuario:");
        lblNewLabel.setBounds(72, 114, 65, 20);
        panel_1.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Contra:");
        lblNewLabel_1.setBounds(72, 142, 65, 14);
        panel_1.add(lblNewLabel_1);

        JButton btnNewButton = new JButton("Login");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HomeScreen hs=new HomeScreen();
                hs.homeScreen();
            }
        });
        btnNewButton.setBounds(72, 224, 89, 23);
        panel_1.add(btnNewButton);

        pass = new JPasswordField();
        pass.setBounds(165, 139, 159, 20);
        panel_1.add(pass);

        JButton btnNewButton_1 = new JButton("Registrar");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                Registeration hs=new Registeration();
                hs.Registeration();
                frmLoginPage.setVisible(false);
            }
        });
        btnNewButton_1.setBounds(235, 224, 89, 23);
        panel_1.add(btnNewButton_1);


    }
}