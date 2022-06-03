package diegocastrooliveros.torneounisinu;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LoginUsuario extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JPasswordField passwordField;
    private JButton btnNewButton;
    private JButton btnNewButton_1;
    private JButton btnNewButton_2;
    private JButton btnNewButton_3;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    diegocastrooliveros.torneounisinu.LoginUsuario frame = new diegocastrooliveros.torneounisinu.LoginUsuario();

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
    public LoginUsuario() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("/Users/macbookprom1/Downloads/Universidad_del_Sinu-Elias_Bechara_Zainum.jpeg"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Usurio Login");
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 46));
        lblNewLabel.setBounds(373, 42, 273, 93);
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

        JLabel lblUsername = new JLabel("Usuario");
        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 31));
        lblUsername.setBounds(204, 178, 193, 52);
        contentPane.add(lblUsername);

        JLabel lblPassword = new JLabel("Contraseña");
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 31));
        lblPassword.setBounds(204, 294, 193, 52);
        contentPane.add(lblPassword);

        btnNewButton = new JButton("Login");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton.setBounds(481, 387, 113, 52);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int i=0,j=0;
                String ustr=textField.getText();
                String pstr=passwordField.getText();


                if( ustr.equals("Diego") && pstr.equals("1234"))
                {
                    dispose();
                    HostUsuario uh=new HostUsuario();
                    uh.setTitle(" SISTEMA DE GESTION TORNEO UNISINU CARTAGENA ");
                    uh.setVisible(true);
                    JOptionPane.showMessageDialog(btnNewButton, "Has iniciado sesión correctamente");
                }
                else
                {
                    JOptionPane.showMessageDialog(btnNewButton, "Usuario y contraseña invalidos");
                }
            }
        });

        contentPane.add(btnNewButton);

        btnNewButton_1 = new JButton("Admin Login");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                LoginAdministrador al=new LoginAdministrador();
                al.setTitle(" SISTEMA DE GESTION TORNEO UNISINU CARTAGENA ");
                al.setVisible(true);
            }
        });
        btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
        btnNewButton_1.setBounds(204, 419, 216, 83);
        contentPane.add(btnNewButton_1);

        btnNewButton_2 = new JButton("Crear Cuenta Nueva");
        btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                Crear ca = new Crear();
                ca.setTitle(" SISTEMA DE GESTION TORNEO UNISINU CARTAGENA ");
                ca.setVisible(true);
            }
        });
        btnNewButton_2.setBounds(481, 470, 281, 52);
        contentPane.add(btnNewButton_2);

        btnNewButton_3 = new JButton("Reset ");
        btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnNewButton_3.setBounds(649, 387, 113, 52);
        contentPane.add(btnNewButton_3);


    }

}