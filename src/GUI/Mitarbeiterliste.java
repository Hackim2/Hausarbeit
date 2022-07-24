import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Mitarbeiterliste implements ActionListener {

    private JFrame frame;
    private JPanel panel;
    private JToolBar menu;

    private MitarbeiterTablemode tablemode;
    private JTable mitarbeiterTabelle;
    private JScrollPane tabellenhalter;


    Mitarbeiterliste() {

    panel.setBackground(Color.gray);

    public Mitarbeiterliste() {
        createButtons();
        initialize();
        setConfig();

    }

    public void hinzufuegen() {
        hinzufügen.setFocusable(false);
        hinzufügen.addActionListener(this);
    }

    public void bearbeiten() {
        bearbeiten.setFocusable(false);
        bearbeiten.addActionListener(this);
    }

    public void entfernen() {
        entfernen.setFocusable(false);
        entfernen.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() ==hinzufügen ) {
            new MitarbeiterKarte();


        } else if (e.getSource() == bearbeiten) {
        } else if (e.getSource() == entfernen) {



        }

    }
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == hinzufügen) {mKarte = new MitarbeiterKarte(this);}
            else if (e.getSource() == bearbeiten) ;
            else if (e.getSource() == entfernen) ;




            /*
            mList.add(mKarte.getMitarbeiter());
            tablemode.fireTableRowsInserted(mList.size() -1, mList.size() -1);
            frame.repaint();*/



    }
}