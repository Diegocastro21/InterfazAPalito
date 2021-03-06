package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class studentInput {

    private JFrame frame;
    private JTextField NameInput;
    private JTextField AgeInput;
    private JTextField EmailInput;
    private JTextField RollNoInput;
    private JTextField PhoneInput;
    private JTextField FathersNameInput;
    private JTextField DOBInput;
    private JTextField XIIInput;
    private JTextField XInput;
    private JTextField AadharInput;

    private JComboBox BranchInput;
    private JComboBox CourseInput;
    private JTextArea AddressInput;

    public static void studentInput() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    studentInput window = new studentInput();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public studentInput() {
        initialize();
    }


    private void initialize() {
        //con = DB.dbconnect() ;
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(240, 230, 140));
        frame.setBounds(100, 100, 863, 510);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Detalles Nuevo Est");
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 34));
        lblNewLabel.setBounds(267, 0, 274, 49);
        frame.getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("NOmbre");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblNewLabel_1.setBounds(36, 109, 51, 14);
        frame.getContentPane().add(lblNewLabel_1);

        NameInput = new JTextField();
        NameInput.setBounds(156, 106, 182, 23);
        frame.getContentPane().add(NameInput);
        NameInput.setColumns(10);

        JLabel lblNewLabel_2 = new JLabel("Edad");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblNewLabel_2.setBounds(36, 145, 46, 14);
        frame.getContentPane().add(lblNewLabel_2);

        AgeInput = new JTextField();
        AgeInput.setBounds(156, 140, 182, 26);
        frame.getContentPane().add(AgeInput);
        AgeInput.setColumns(10);

        JLabel lblNewLabel_3 = new JLabel("Direccion");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblNewLabel_3.setBounds(36, 177, 79, 14);
        frame.getContentPane().add(lblNewLabel_3);

        EmailInput = new JTextField();
        EmailInput.setBounds(156, 277, 182, 26);
        frame.getContentPane().add(EmailInput);
        EmailInput.setColumns(10);

        JLabel lblNewLabel_4 = new JLabel("Email");
        lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblNewLabel_4.setBounds(36, 279, 67, 20);
        frame.getContentPane().add(lblNewLabel_4);

        RollNoInput = new JTextField();
        RollNoInput.setBounds(156, 356, 182, 26);
        frame.getContentPane().add(RollNoInput);
        RollNoInput.setColumns(10);

        JLabel lblNewLabel_5 = new JLabel("Nombre Madre");
        lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblNewLabel_5.setBounds(36, 361, 110, 14);
        frame.getContentPane().add(lblNewLabel_5);

        BranchInput = new JComboBox();
        BranchInput.setBounds(156, 323, 182, 22);
        frame.getContentPane().add(BranchInput);
        BranchInput.addItem("");
        BranchInput.addItem("Ciencia de la computacion");
        BranchInput.addItem("Informatica y Tecnologia");
        BranchInput.addItem("Mecanica");
        BranchInput.addItem("Electronica Y Telecomunicaciones");
        BranchInput.addItem("Ing Industrial");
        BranchInput.addItem("Biotecnologia");
        BranchInput.addItem("Ing Civil");


        JLabel lblNewLabel_6 = new JLabel("Rama");
        lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblNewLabel_6.setBounds(36, 317, 46, 14);
        frame.getContentPane().add(lblNewLabel_6);

        PhoneInput = new JTextField();
        PhoneInput.setBounds(156, 393, 182, 26);
        frame.getContentPane().add(PhoneInput);
        PhoneInput.setColumns(10);

        JLabel lblNewLabel_7 = new JLabel("Telefono No.");
        lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblNewLabel_7.setBounds(36, 398, 79, 14);
        frame.getContentPane().add(lblNewLabel_7);

        JLabel lblNewLabel_8 = new JLabel("Nombre Padre");
        lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblNewLabel_8.setBounds(455, 109, 118, 14);
        frame.getContentPane().add(lblNewLabel_8);

        FathersNameInput = new JTextField();
        FathersNameInput.setBounds(590, 106, 204, 23);
        frame.getContentPane().add(FathersNameInput);
        FathersNameInput.setColumns(10);

        DOBInput = new JTextField();
        DOBInput.setBounds(590, 143, 204, 20);
        frame.getContentPane().add(DOBInput);
        DOBInput.setColumns(10);

        JLabel lblNewLabel_9 = new JLabel("(dd/mm/yyyy)");
        lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblNewLabel_9.setBounds(455, 142, 136, 20);
        frame.getContentPane().add(lblNewLabel_9);

        XIIInput = new JTextField();
        XIIInput.setBounds(590, 178, 204, 22);
        frame.getContentPane().add(XIIInput);
        XIIInput.setColumns(10);

        JLabel lblNewLabel_10 = new JLabel("Clase XII(%)");
        lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblNewLabel_10.setBounds(455, 181, 96, 14);
        frame.getContentPane().add(lblNewLabel_10);

        XInput = new JTextField();
        XInput.setBounds(590, 221, 204, 20);
        frame.getContentPane().add(XInput);
        XInput.setColumns(10);

        JLabel lblNewLabel_11 = new JLabel("Clase X(%)");
        lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblNewLabel_11.setBounds(455, 225, 118, 14);
        frame.getContentPane().add(lblNewLabel_11);

        AadharInput = new JTextField();
        AadharInput.setBounds(590, 252, 204, 30);
        frame.getContentPane().add(AadharInput);
        AadharInput.setColumns(10);

        JLabel lblNewLabel_12 = new JLabel("No.");
        lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblNewLabel_12.setBounds(455, 262, 118, 14);
        frame.getContentPane().add(lblNewLabel_12);

        CourseInput = new JComboBox();
        CourseInput.setBounds(590, 293, 204, 22);
        frame.getContentPane().add(CourseInput);
        CourseInput.addItem("");
        CourseInput.addItem("B.tecno");
        CourseInput.addItem("M.tecno");
        CourseInput.addItem("FUT");



        JLabel lblNewLabel_13 = new JLabel("Curso");
        lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblNewLabel_13.setBounds(455, 297, 86, 14);
        frame.getContentPane().add(lblNewLabel_13);

        JButton SubmitButton = new JButton("Enviar");
        SubmitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {



                try {

                    String name = NameInput.getText();
                    String age = AgeInput.getText();
                    String address = AddressInput.getText();
                    String email = EmailInput.getText();
                    String phone = PhoneInput.getText();
                    String branch = (String)BranchInput.getSelectedItem();
                    String father = FathersNameInput.getText();
                    String DOB = DOBInput.getText();
                    String XIIpercentage = XIIInput.getText();
                    String Xpercentage = XInput.getText();
                    String aadhar = AadharInput.getText();
                    String course = (String)CourseInput.getSelectedItem();
                    String rollNo = RollNoInput.getText();

                    JOptionPane.showMessageDialog(null, "Info Agregada");

                    NameInput.setText("");
                    AgeInput.setText("");
                    AddressInput.setText("");
                    EmailInput.setText("");
                    PhoneInput.setText("");
                    BranchInput.setSelectedIndex(0);
                    FathersNameInput.setText("");
                    DOBInput.setText("");
                    XIIInput.setText("");
                    XInput.setText("");
                    AadharInput.setText("");
                    CourseInput.setSelectedIndex(0);
                    RollNoInput.setText("");


                }catch(Exception e2) {
                    e2.printStackTrace();
                }

            }
        });
        SubmitButton.setBackground(SystemColor.activeCaption);
        SubmitButton.setBounds(452, 395, 89, 23);
        frame.getContentPane().add(SubmitButton);

        JButton CancelButton = new JButton("Cancelar");
        CancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                frame.dispose();
            }
        });
        CancelButton.setBackground(SystemColor.activeCaption);
        CancelButton.setForeground(SystemColor.controlText);
        CancelButton.setBounds(590, 395, 89, 23);
        frame.getContentPane().add(CancelButton);

        AddressInput = new JTextArea();
        AddressInput.setBounds(156, 173, 182, 89);
        frame.getContentPane().add(AddressInput);
    }
}