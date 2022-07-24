import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;

public class Aufträgeliste implements ActionListener {

    private JFrame frame;
    private JPanel panel;
    private JToolBar menu;

    static AuftragTablemode tablemode;
    private JTable aufträgeTabelle;
    private JScrollPane tabellenhalter;

    //Buttons
    private JButton hinzufügen;
    private JButton bearbeiten;
    private JButton entfernen;

    private AuftragKarte aKarte;
    private ArrayList<Auftrag> aList;
    private String[] col;
    boolean status = false;

    public Aufträgeliste() throws ParseException {
        createButtons();
        initialize();
        setConfig();

    }


    public void initialize() throws ParseException {

        aList = new ArrayList<Auftrag>();
        col = new String[]{"Auftraggeber", "Beschreibung", "Ort", "Anfangsdatum","Abschlussdatum"};
        tablemode = new AuftragTablemode(aList, col);
        aufträgeTabelle = new JTable(tablemode);
        aufträgeTabelle.setFillsViewportHeight(true);
        tabellenhalter = new JScrollPane(aufträgeTabelle);
        menu = new JToolBar();
        panel = new JPanel(new BorderLayout());
        frame = new JFrame("Aufträge");


    }

    public void setConfig() {
        // Toolbar
        panel.add(tabellenhalter, BorderLayout.CENTER);
        menu.add(hinzufügen);
        menu.add(bearbeiten);
        menu.add(entfernen);
        menu.setFloatable(true);
        menu.setRollover(true);// highlighted die toolbar
        panel.add(menu, BorderLayout.PAGE_END);


        //JFrame
        frame.setSize(650, 400);
        frame.setTitle("Aufträge");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setContentPane(panel);
        frame.setVisible(true);

    }

    public void createButtons() {

        // hinzufügen button
        hinzufügen = new JButton("Auftrag hinzufügen");
        hinzufügen.setFocusable(false);
        hinzufügen.addActionListener(this);

        // bearbeiten button
        bearbeiten = new JButton("Auftrag bearbeiten");
        bearbeiten.setFocusable(false);
        bearbeiten.addActionListener(this);

        // entfernen button
        entfernen = new JButton("Auftrag löschen");
        entfernen.setFocusable(false);
        entfernen.addActionListener(this);
    }

    public Frame getFrame() {
        return this.frame;
    }

    public void weiter() {
        synchronized (aList) {
            this.status = true;
            notifyAll();
        }
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == hinzufügen) {
            try {
                aKarte = new AuftragKarte(this);
            } catch (ParseException ex) {
                throw new RuntimeException(ex);
            }
        } else if (e.getSource() == bearbeiten) ;
        else if (e.getSource() == entfernen) ;
    }
}