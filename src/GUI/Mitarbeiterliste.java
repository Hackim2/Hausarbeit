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

        //Mitarbeiter hinzufügen
        mList = new ArrayList<Mitarbeiter>();
        //hinzufuegen();
        panel.add(mitarbeiterTabelle,BorderLayout.CENTER);


        //Name, Titel, Einstellungsdatum, Gehalt

        JLabel name_l  = new JLabel("Name");
        JLabel beruf_l = new JLabel("Beruf");
        JLabel einstellungsdatum_l = new JLabel("Einstellungsdatum");
        JLabel jahresgehalt_l = new JLabel("Jahresgehalt");

        FlowLayout flow = new FlowLayout(FlowLayout.LEFT,50,0);
        toppanel.setLayout(flow);
        toppanel.add(name_l);
        toppanel.add(beruf_l);
        toppanel.add(einstellungsdatum_l);
        toppanel.add(jahresgehalt_l);
        panel.add(toppanel, BorderLayout.PAGE_START);

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
        JTable mitarbeiterTabelle = new JTable();
        
        panel.add(mitarbeiterTabelle, BorderLayout.CENTER);

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

