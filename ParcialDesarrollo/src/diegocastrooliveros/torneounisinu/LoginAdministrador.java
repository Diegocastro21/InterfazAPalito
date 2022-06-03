package diegocastrooliveros.torneounisinu;

import javax.swing.*;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class LoginAdministrador extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JPasswordField passwordField;
    private JButton btnNewButton;
    private JButton btnNewButton_1;
    private String user[]={"Soumyadip","Soumya"};
    private String pass[]={"abcd","abcde"};
    private JLabel lblNewLabel_1;
    private JLabel label;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    diegocastrooliveros.torneounisinu.LoginAdministrador frame = new diegocastrooliveros.torneounisinu.LoginAdministrador();
                    frame.setTitle(" SISTEMA DE GESTION TORNEO UNISINU CARTAGENA ");
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public LoginAdministrador() {



        setIconImage(Toolkit.getDefaultToolkit().getImage("/Users/macbookprom1/Downloads/Universidad_del_Sinu-Elias_Bechara_Zainum.jpeg"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Login Admin");
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 46));
        lblNewLabel.setBounds(364, 60, 273, 93);
        contentPane.add(lblNewLabel);

        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.PLAIN, 32));
        textField.setBounds(481, 170, 281, 68);
        contentPane.add(textField);
        textField.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 32));
        passwordField.setBounds(481, 286, 281, 68);
        contentPane.add(passwordField);

        JLabel lblUsername = new JLabel("Usuario:");
        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 31));
        lblUsername.setBounds(250, 166, 193, 52);
        contentPane.add(lblUsername);

        JLabel lblPassword = new JLabel("Contrasena:");
        lblPassword.setBackground(Color.CYAN);
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 31));
        lblPassword.setBounds(250, 286, 193, 52);
        contentPane.add(lblPassword);

        btnNewButton = new JButton("LOGIN");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 26));
        btnNewButton.setBounds(545, 392, 162, 73);
        btnNewButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                int i=0,j=0;
                String ustr=textField.getText();
                String pstr=passwordField.getText();


                if( ustr.equals("Diego") && pstr.equals("1234")) {
                    dispose();
                    HostAdministrador ah=new HostAdministrador();
                    ah.setTitle(" SISTEMA DE GESTION TORNEO UNISINU CARTAGENA ");
                    ah.setVisible(true);
                    JOptionPane.showMessageDialog(btnNewButton, "HAS INICIADO SESION CORRECTAMENTE");
                } else {
                    JOptionPane.showMessageDialog(btnNewButton, " USUARIO Y CONTRASEÑA ERRADOS");
                }
            }
        });

        contentPane.add(btnNewButton);

        btnNewButton_1 = new JButton("Login Usuario");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                LoginUsuario us=new LoginUsuario();
                us.setTitle(" SISTEMA DE GESTION TORNEO UNISINU CARTAGENA ");
                us.setVisible(true);
            }
        });
        btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
        btnNewButton_1.setBounds(250, 387, 193, 83);
        contentPane.add(btnNewButton_1);



    }

}