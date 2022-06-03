package diegocastrooliveros.torneounisinu;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JLabel;

public class AgregarEventos extends JFrame {

    private JPanel contentPane;
    private JTextField textPromo;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AgregarEventos frame = new AgregarEventos();
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
    public AgregarEventos() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("/Users/macbookprom1/Downloads/Universidad_del_Sinu-Elias_Bechara_Zainum.jpeg"));
        setBounds(458, 319, 1000, 460);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Fecha");
        lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        lblNewLabel.setBounds(104, 79, 53, 39);
        contentPane.add(lblNewLabel);

        JTextArea textArea = new JTextArea();
        ///textArea.setText("DD-MM-YY");
        textArea.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        textArea.setBounds(169, 78,166, 37);
        contentPane.add(textArea);

        JLabel lblNewLabel_1 = new JLabel("Evento");
        lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        lblNewLabel_1.setBounds(584, 76, 56, 34);
        contentPane.add(lblNewLabel_1);


        JLabel lblNewLabel_2 = new JLabel("(dd-mm-yy)");
        lblNewLabel_2.setBounds(93, 111, 68, 16);
        contentPane.add(lblNewLabel_2);

        JTextArea textEvents = new JTextArea();
        textEvents.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        textEvents.setBounds(657, 78,166, 37);
        contentPane.add(textEvents);

        JLabel lblSeats = new JLabel("Cupos");
        lblSeats.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        lblSeats.setBounds(104, 196, 56, 36);
        contentPane.add(lblSeats);

        JTextArea textSeats = new JTextArea();
        textSeats.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        textSeats.setBounds(169, 196, 166, 37);
        contentPane.add(textSeats);

        JTextArea textTime = new JTextArea();
        textTime.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        textTime.setBounds(657, 199, 166, 37);
        contentPane.add(textTime);

        JLabel lblTime = new JLabel("Tiempo");
        lblTime.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        lblTime.setBounds(584, 200, 56, 29);
        contentPane.add(lblTime);

        JRadioButton rdbtnAddPromo = new JRadioButton("Añadir Promocion");
        rdbtnAddPromo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (rdbtnAddPromo.isSelected()) {
                    textPromo.setEnabled(true);
                } else {
                    textPromo.setEnabled(false);
                }

            }
        });
        rdbtnAddPromo.setBounds(412, 226, 127, 25);
        contentPane.add(rdbtnAddPromo);

        textPromo = new JTextField();
        textPromo.setEnabled(false);
        textPromo.setBounds(412, 254, 116, 29);
        //textField.setEnabled(false);
        contentPane.add(textPromo);
        textPromo.setColumns(10);

        JButton btnNewButton = new JButton("Agregar\r\n\r\n");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a=JOptionPane.showConfirmDialog(btnNewButton,"Estas seguro?");
                if(a==JOptionPane.YES_OPTION){
                    String date=textArea.getText();
                    String seats=textSeats.getText();
                    String time=textTime.getText();
                    String event=textEvents.getText();
                    if(rdbtnAddPromo.isSelected())
                    {
                        String promo=textPromo.getText();
                    }

                }
            }
        });
        btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 27));
        btnNewButton.setBounds(412, 309, 127, 61);
        contentPane.add(btnNewButton);
    }
}
