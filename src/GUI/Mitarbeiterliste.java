import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.ArrayList;

public class Mitarbeiterliste {
    JFrame frame = new JFrame("Mitarbeiter");

    JPanel panel = new JPanel(new BorderLayout());
    JPanel toppanel= new JPanel();

    JToolBar menu = new JToolBar();
    ArrayList<Mitarbeiter> mList;
    MitarbeiterKarte mitAKarte;
    JTable mitarbeiterTabelle;




    Mitarbeiterliste() {

    panel.setBackground(Color.gray);

        /*Mitarbeiter hinzufügen
        mList = new ArrayList<Mitarbeiter>();
        //hinzufuegen();
        panel.add(mitarbeiterTabelle,BorderLayout.CENTER);
*/

        //Name, Titel, Einstellungsdatum, Gehalt


        //Buttons
        JButton hinzufügen = new JButton("Mitarbeiter hinzufügen");
        JButton bearbeiten = new JButton("Mitarbeiter bearbeiten");
        JButton entfernen = new JButton("Mitarbeiter löschen");


        /*
        button hinzufügen(){
            MitarbeiterKarte mitAKarte = new Mitarbeietrkarte();
            if mitAKarte.getMitAerstellt then
                liste.add(mitaKarte.getMitarbeiter);
        }
        */
        
        //JTable > Mitarbeiter
        String[] Spaltennamen = {"Name", "Berufsbezeichnung", "Einstellungsdatum", "jahresgehalt"};
        String[][] MitA = {
                {"Thomas", "Bauingenieur", "24/06/2016","52000.0"},
                {"Khalil", "Programmierer", "20/07/2022", "20.0"},
                {"Hakim","Hausmeister","15/06/2022","30.0"},
        };



        JTable mitarbeiterTabelle = new JTable(MitA,Spaltennamen);
        JScrollPane tabellenhalter = new JScrollPane(mitarbeiterTabelle);
        mitarbeiterTabelle.setFillsViewportHeight(true);

        panel.add(tabellenhalter, BorderLayout.CENTER);

        //Toolbar
        menu.add(hinzufügen);
        menu.add(bearbeiten);
        menu.add(entfernen);
        menu.setRollover(true);// highlighted die toolbar
        panel.add(menu, BorderLayout.PAGE_END);


        //JFrame
            frame.setVisible(true);
            frame.setSize(1000, 700);
            frame.setTitle("Mitarbeiterliste:");
            frame.setContentPane(panel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    

    private void hinzufuegen(){
    }
}

