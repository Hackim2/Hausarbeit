import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Mitarbeiterliste implements ActionListener {

    tablemode tablemode = new tablemode();
    static JFrame frame = new JFrame("Mitarbeiter");
    JPanel panel = new JPanel(new BorderLayout());
    JToolBar menu = new JToolBar();
    MitarbeiterKarte mitAKarte;
    //Buttons
    JButton hinzufügen = new JButton("Mitarbeiter hinzufügen");
    JButton bearbeiten = new JButton("Mitarbeiter bearbeiten");
    JButton entfernen = new JButton("Mitarbeiter löschen");

    static JTable mitarbeiterTabelle;
    JScrollPane tabellenhalter;


    Mitarbeiterliste() {

    panel.setBackground(Color.gray);

        /*Mitarbeiter hinzufügen
        mList = new ArrayList<Mitarbeiter>();
        //hinzufuegen();
        panel.add(mitarbeiterTabelle,BorderLayout.CENTER);
*/

        //Name, Titel, Einstellungsdatum, Gehalt





        /* TODO : Methode erstellen :
            hinzufuegen();{
            MitarbeiterKarte mitAKarte = new Mitarbeietrkarte();
            if mitAKarte.getMitAerstellt then
                mlist.add(mitaKarte.getMitarbeiter);

         */
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
}