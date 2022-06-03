package diegocastrooliveros.torneounisinu;

import diegocastrooliveros.torneounisinu.AgregarEventos;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class HostAdministrador extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    diegocastrooliveros.torneounisinu.HostAdministrador frame = new diegocastrooliveros.torneounisinu.HostAdministrador();
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
    public HostAdministrador() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("/Users/macbookprom1/Downloads/Universidad_del_Sinu-Elias_Bechara_Zainum.jpeg"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        //setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setBounds(0, 0, 1010, 26);
        contentPane.add(menuBar);

        JMenu mnAddEvents = new JMenu("Agregar Eventos");
        mnAddEvents.setFont(new Font("Segoe UI", Font.BOLD, 16));
        menuBar.add(mnAddEvents);

        JMenu mnNewMenu = new JMenu("Add Tenis");
        mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        mnAddEvents.add(mnNewMenu);

        JMenuItem mntmAddOdi = new JMenuItem("Agregar KOF");
        mntmAddOdi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AgregarEventos ae=new AgregarEventos();
                setIconImage(Toolkit.getDefaultToolkit().getImage("/Users/macbookprom1/Downloads/Universidad_del_Sinu-Elias_Bechara_Zainum.jpeg"));
                ae.setTitle("Add_events");
                ae.setVisible(true);
            }
        });
        mnNewMenu.add(mntmAddOdi);

        JMenuItem mntmNewMenuItem = new JMenuItem("Agregar Ajedrez");
        mntmNewMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AgregarEventos ae=new AgregarEventos();
                setIconImage(Toolkit.getDefaultToolkit().getImage("/Users/macbookprom1/Downloads/Universidad_del_Sinu-Elias_Bechara_Zainum.jpeg"));
                ae.setTitle("Add_events");
                ae.setVisible(true);
            }
        });
        mnNewMenu.add(mntmNewMenuItem);

        JMenuItem mntmAddT = new JMenuItem("Agregar Fifa");
        mntmAddT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AgregarEventos ae=new AgregarEventos();
                setIconImage(Toolkit.getDefaultToolkit().getImage("/Users/macbookprom1/Downloads/Universidad_del_Sinu-Elias_Bechara_Zainum.jpeg"));
                ae.setTitle("Add_events");
                ae.setVisible(true);
            }
        });
        mnNewMenu.add(mntmAddT);

        JMenuItem mntmAddRanji = new JMenuItem("Agregar BalonPie");
        mntmAddRanji.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AgregarEventos ae=new AgregarEventos();
                ae.setVisible(true);
            }
        });
        mnNewMenu.add(mntmAddRanji);

        JMenuItem mntmAddFootball = new JMenuItem("Agregar Futbol");
        mntmAddFootball.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AgregarEventos ae=new AgregarEventos();
                ae.setVisible(true);
            }
        });
        mntmAddFootball.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        mnAddEvents.add(mntmAddFootball);

        JMenuItem mntmAddOthers = new JMenuItem("Agregar Otros");
        mntmAddOthers.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AgregarEventos ae=new AgregarEventos();
                ae.setVisible(true);
            }
        });
        mntmAddOthers.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        mnAddEvents.add(mntmAddOthers);

        JMenu mnShowBookings = new JMenu("Mostrar Equipos");
        mnShowBookings.setFont(new Font("Segoe UI", Font.BOLD, 16));
        mnShowBookings.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        menuBar.add(mnShowBookings);

        JMenu mnManageBookings = new JMenu("Administrar Equipos");
        mnManageBookings.setFont(new Font("Segoe UI", Font.BOLD, 16));
        menuBar.add(mnManageBookings);

        JButton btnLogout = new JButton("Cerrar Sesion");
        btnLogout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a=JOptionPane.showConfirmDialog(btnLogout,"Estas seguro?");
                //JOptionPane.setRootFrame(null);
                if(a==JOptionPane.YES_OPTION){
                    dispose();
                    PrincipalMuestra ms=new PrincipalMuestra();
                    ms.setTitle(" SISTEMA DE GESTION TORNEO UNISINU CARTAGENA ");
                    ms.setVisible(true);
                }
            }
        });
        btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnLogout.setBounds(887, 40, 97, 25);
        contentPane.add(btnLogout);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("/Users/macbookprom1/Downloads/Universidad_del_Sinu-Elias_Bechara_Zainum.jpeg"));
        lblNewLabel.setBounds(0, 25, 1010, 574);
        contentPane.add(lblNewLabel);

    }
}