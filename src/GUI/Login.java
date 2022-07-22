import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login implements ActionListener {
    JFrame frame = new JFrame();
    JButton mitarbeiter_button = new JButton("Mitarbeiter");
    JButton aufträge_button = new JButton("Aufträge");


    Login() {
        createMitarbeiterButton();
        createAuftragButton();
        createFrame();


        //Frame


    }

    public void createFrame() {
        frame.setTitle("Menü");
        frame.add(mitarbeiter_button);
        frame.add(aufträge_button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public void createMitarbeiterButton() {
        mitarbeiter_button.setBounds(50, 125, 100, 50);
        mitarbeiter_button.setFocusable(false);
        mitarbeiter_button.addActionListener(this);
    }

    public void createAuftragButton() {
        aufträge_button.setBounds(250, 125, 100, 50);
        aufträge_button.setFocusable(false);
        aufträge_button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mitarbeiter_button) {
            frame.dispose();
            Mitarbeiterliste kik = new Mitarbeiterliste();
        } else if (e.getSource() == aufträge_button) {
            frame.dispose();


            // TODO : open Aufträge
        }


    }
}

