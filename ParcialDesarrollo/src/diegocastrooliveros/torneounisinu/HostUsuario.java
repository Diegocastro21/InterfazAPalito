package diegocastrooliveros.torneounisinu;

import java.util.*;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.net.InetAddress;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class HostUsuario extends JFrame {

    private JPanel contentPane;
    JButton btnLogout ;
    private String date;
    private JComboBox seatcb;
    private JTextField textField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    HostUsuario frame = new HostUsuario();
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
    public HostUsuario() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("/Users/macbookprom1/Downloads/Universidad_del_Sinu-Elias_Bechara_Zainum.jpeg"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);


        btnLogout = new JButton("cerrar sesión");
        btnLogout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a=JOptionPane.showConfirmDialog(btnLogout,"Estas seguro?");
                if(a==JOptionPane.YES_OPTION){
                    dispose();
                    PrincipalMuestra ms=new PrincipalMuestra();
                    ms.setTitle(" SISTEMA DE GESTION TORNEO UNISINU CARTAGENA ");
                    ms.setVisible(true);
                }
            }
        });
        btnLogout.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        btnLogout.setBounds(901, 13, 97, 25);
        contentPane.add(btnLogout);

        JLabel lblNewLabel = new JLabel("Evento");
        JComboBox<String> tktcb = new JComboBox();
        JLabel lblNewLabel_1 = new JLabel("Ticket");
        JComboBox<String> eventcb = new JComboBox();
        JComboBox<String> seatcb = new JComboBox();
        JLabel lblSeat = new JLabel("Cupo");
        JComboBox agecb = new JComboBox();
        JLabel lblNewLabel_2 = new JLabel("Edad");
        JCheckBox chckbxTcApplied = new JCheckBox("Estoy de acuerdo con los términos y condiciones");
        JButton btnNewButton = new JButton("Proceso");
        btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 28));

        JLabel lblPromo = new JLabel("Promo");
        lblPromo.setEnabled(false);
        JTextArea textArea = new JTextArea();
        textArea.setEnabled(false);

        JComboBox<String> datecb = new JComboBox();
        datecb.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        datecb.setSelectedItem(null);
        //datecb.setSelectedIndex(-1);
        datecb.addItem("(none)");
        datecb.addItem("02-06-2022");
        datecb.addItem("05-06-2022");
        datecb.addItem("07-06-2022");
        datecb.addItem("09-06-2022");
        datecb.addItem("11-06-2022");
        datecb.addItem("19-06-2022");
        datecb.addItem("23-06-2022");
        datecb.addItem("27-06-2022");
        datecb.addItem("29-06-2022");
        datecb.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e)
            {
                if((date=datecb.getItemAt(datecb.getSelectedIndex()))!=null)
                {
                    eventcb.setEnabled(true);
                    lblNewLabel.setEnabled(true);
                    tktcb.setEnabled(true);
                    lblNewLabel_1.setEnabled(true);
                    seatcb.setEnabled(true);
                    lblSeat.setEnabled(true);
                    agecb.setEnabled(true);
                    lblNewLabel_2.setEnabled(true);
                    chckbxTcApplied.setEnabled(true);
                    lblPromo.setEnabled(true);
                    textArea.setEnabled(true);

                }
                else if((date=datecb.getItemAt(datecb.getSelectedIndex()))!="none")
                {
                    eventcb.setEnabled(false);
                    lblNewLabel.setEnabled(false);

                }
            }
        });
        datecb.setBounds(139, 85, 166, 37);
        contentPane.add(datecb);

        eventcb.setEnabled(false);
        eventcb.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        eventcb.addItem("Participante1 vs Participante7");
        eventcb.addItem("Participante2 vs Participante8");
        eventcb.addItem("Participante3 vs Participante9");
        eventcb.addItem("Participante4 vs Participante10");
        eventcb.addItem("Participante5 vs Participante11");
        eventcb.addItem("Participante6 vs Participante12");
        eventcb.setBounds(451, 85,  166, 37);
        contentPane.add(eventcb);


        JLabel lblDate = new JLabel("Fecha");
        lblDate.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        lblDate.setBounds(74, 87, 43, 28);
        contentPane.add(lblDate);

        JLabel lblHi = new JLabel("Bienvenido");
        lblHi.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 18));
        lblHi.setBounds(45, 14, 85, 24);
        contentPane.add(lblHi);




        lblNewLabel.setEnabled(false);
        lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        lblNewLabel.setBounds(383, 94, 56, 16);
        contentPane.add(lblNewLabel);


        lblSeat.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        lblSeat.setEnabled(false);
        lblSeat.setBounds(74, 184,56, 22);
        contentPane.add(lblSeat);


        lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        lblNewLabel_1.setEnabled(false);
        lblNewLabel_1.setBounds(383, 184, 56, 22);
        contentPane.add(lblNewLabel_1);


        seatcb.setEnabled(false);
        seatcb.setBounds(139, 174, 166, 37);
        seatcb.addItem("Regular (6,000 COP)");
        seatcb.addItem("Super (8,000 COP)");
        seatcb.addItem("Sencillo (7,550 COP)");
        seatcb.addItem("Premium (9,450 COP)");
        seatcb.addItem("VIP Box (15,500 COP)");


        seatcb.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        contentPane.add(seatcb);


        tktcb.setEnabled(false);
        tktcb.addItem("1");
        tktcb.addItem("2");
        tktcb.addItem("3");
        tktcb.addItem("4");
        tktcb.addItem("5");
        tktcb.addItem("10");
        tktcb.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        tktcb.setBounds(451, 178,  166, 37);
        contentPane.add(tktcb);


        agecb.setEnabled(false);
        agecb.addItem("Mas de 16 años");
        agecb.addItem("Menos 16 años");
        agecb.addItem("Mayor 18 años ");

        agecb.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        agecb.setBounds(139, 273, 166, 37);
        contentPane.add(agecb);


        lblNewLabel_2.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        lblNewLabel_2.setEnabled(false);
        lblNewLabel_2.setBounds(74, 271, 43, 37);
        contentPane.add(lblNewLabel_2);


        chckbxTcApplied.setEnabled(false);
        chckbxTcApplied.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        chckbxTcApplied.setBounds(285, 367, 266, 25);
        contentPane.add(chckbxTcApplied);
        chckbxTcApplied.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e)
            {
                if(e.getStateChange()==1)
                    btnNewButton.setEnabled(true);
                else
                    btnNewButton.setEnabled(false);
            }
        });


        JLabel lblNewLabel_3 = new JLabel();
        lblNewLabel_3.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        lblNewLabel_3.setBounds(797, 83, 201, 37);


        JLabel lblNewLabel_4 = new JLabel();
        lblNewLabel_4.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        lblNewLabel_4.setBounds(797, 111, 201, 37);

        contentPane.add(lblNewLabel_3);
        contentPane.add(lblNewLabel_4);


        btnNewButton.setEnabled(false);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a=JOptionPane.showConfirmDialog(btnNewButton,"Estas Seguro?");
                if(a==JOptionPane.YES_OPTION){


                    String promo=textArea.getText();
                    String tkt=tktcb.getItemAt(tktcb.getSelectedIndex());
                    String date=datecb.getItemAt(datecb.getSelectedIndex());
                    String event=eventcb.getItemAt(eventcb.getSelectedIndex());
                    String age=(String) agecb.getItemAt(agecb.getSelectedIndex());
                    String seatb= seatcb.getItemAt(seatcb.getSelectedIndex());
                    Random rand=new Random();

                    int i=rand.nextInt(9999999);
                    String tktno=String.valueOf(i);
                    tktno+="\n";
                    String n="\n";
                    seatb+=")\n";


                    lblNewLabel_3.setText("Tu ticket es:-");
                    lblNewLabel_4.setText(tktno);
                    JOptionPane.showMessageDialog(btnNewButton,"Felicidades,"+n+"Su reserva está confirmada"+n+"Tu ticket no.  "+tktno+"( "+tkt+ " de "+seatb+"Gracias.");


                }
            }
        });
        btnNewButton.setBounds(311, 424, 200, 60);
        contentPane.add(btnNewButton);



        lblPromo.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        lblPromo.setBounds(383, 285, 70, 25);
        contentPane.add(lblPromo);

        textArea.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        textArea.setBounds(451, 279, 166, 37);
        contentPane.add(textArea);

        JLabel ipfld = new JLabel("");
        ipfld.setBounds(862, 51, 201, 37);
        String ipa="";
        try{
            InetAddress ip=InetAddress.getLocalHost();
            ipa+=ip.getHostAddress();
        }
        catch(Exception e){
            System.out.println(e);
        }
        ipfld.setText(ipa);
        ipfld.setFont(new Font("Segoe UI", Font.BOLD, 20));
        contentPane.add(ipfld);

        JLabel label = new JLabel("");
        label.setIcon(new ImageIcon("/Users/macbookprom1/Downloads/Universidad_del_Sinu-Elias_Bechara_Zainum.jpeg"));
        label.setBounds(0, 0, 1031, 562);
        contentPane.add(label);





    }
}