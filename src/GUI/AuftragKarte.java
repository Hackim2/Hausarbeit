import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class AuftragKarte implements ActionListener {
    private Auftrag newAuftr;
    private Aufträgeliste aufträgeliste;
    private DateFormat format;
    private JButton erstellen;
    private JPanel panel;
    private JLabel adresse_l;
    private JLabel startDatum_l;
    private JLabel endDatum_l;
    private JLabel beschreibung_l;
    private JLabel auftraggeber_l;


    private JFrame f;
    private Aufträgeliste liste;
    AuftragTablemode tablemode;
    ArrayList<Auftrag> aList;
    String[] col;
    private JTextField auftraggeber_t;
    private JTextField adresse_t;
    private JFormattedTextField startDatum_t;
    private JFormattedTextField endDatum_t;

    private JTextField beschreibung_t;

    AuftragKarte(Aufträgeliste aufträgeliste) throws ParseException {
        this.aufträgeliste = aufträgeliste;
        tablemode = new AuftragTablemode(aList, col);
        format = new SimpleDateFormat("dd.MM.yyyy");

        buildUI();
    }

    public void buildUI(){
        f = new JFrame("Auftrag hinzufügen");

        panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        auftraggeber_l  = new JLabel("Auftraggeber:");
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(10,0,5,0);
        panel.add(auftraggeber_l,c);

        adresse_l = new JLabel("Adresse:");
        c.gridy = 1;
        c.insets = new Insets(5,0,0,0);
        panel.add(adresse_l,c);

        startDatum_l = new JLabel("Startdatum:");
        c.gridy = 2;
        c.insets = new Insets(5, 10, 0, 0);
        panel.add(startDatum_l,c);

        endDatum_l = new JLabel("Enddatum:");
        c.gridy = 2;
        c.insets = new Insets(5, 10, 0, 0);
        panel.add(endDatum_l,c);

        beschreibung_l = new JLabel("Auftragbeschreibung:");
        c.gridy = 3;
        c.insets = new Insets(5,0,10,0);
        panel.add(beschreibung_l,c);



        auftraggeber_t = new JTextField();
        auftraggeber_t.setPreferredSize(new Dimension(100,20));
        c.gridx = 2;
        c.gridy = 0;
        c.insets = new Insets(5,20,0,20);
        panel.add(auftraggeber_t,c);

        adresse_t = new JTextField();
        adresse_t.setPreferredSize(new Dimension(100,20));
        c.gridy = 1;
        panel.add(adresse_t,c);



        startDatum_t = new JFormattedTextField(format);
        startDatum_t.setPreferredSize(new Dimension(100,20));
        c.gridy = 2;
        panel.add(startDatum_t,c);

        endDatum_t = new JFormattedTextField(format);
        endDatum_t.setPreferredSize(new Dimension(100,20));
        c.gridy = 2;
        panel.add(endDatum_t);

        beschreibung_t = new JTextField();
        beschreibung_t.setPreferredSize(new Dimension(100,20));
        c.gridy = 1;
        panel.add(beschreibung_t,c);

        erstellen = new JButton("Eintrag hinzufügen");
        erstellen.addActionListener(this);
        c.gridy = 4;
        c.gridx = 2;
        panel.add(erstellen,c);



        f.setContentPane(panel);
        f.setSize(450, 400);
        f.setResizable(false);
        f.pack();
        f.setLocationRelativeTo(aufträgeliste.getFrame());
        f.setVisible(true);
    }

    public void actionPerformed( ActionEvent e) {
        if (e.getSource() == erstellen) {
            try {
                readAndCreateAuftrag();
            } catch (ParseException ex) {
                throw new RuntimeException(ex);
            }
            f.dispose();
        }
    }
    public void readAndCreateAuftrag() throws ParseException {
        newAuftr = new Auftrag(getauftraggeber_t(),getadresse_t(),getbeschreibung_t(),formatStartdatum(getstartDatum_t()),formatEndDatum(getendDatum_t()));
        tablemode.add(newAuftr);
    }

    /*
    public Object[] object() throws ParseException {
        return new Object[]{mList.get(0),mList.get(1),mList.get(2),mList.get(3)};
    }
    */
    public Auftrag getAuftrag(){ return newAuftr; }

    public String getauftraggeber_t() {
        return auftraggeber_t.getText();
    }
    public String getadresse_t() {
        return adresse_t.getText();
    }
    public String getbeschreibung_t() {
        return beschreibung_t.getText();
    }
    public String getstartDatum_t() {
        return startDatum_t.getText();
    }
    public String getendDatum_t() {
        return endDatum_t.getText();
    }
    public Date formatStartdatum(String Startdatum) throws ParseException {
        Date datum = new Date();
        try {
            datum = format.parse(Startdatum);
        } catch (ParseException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(f,
                    "Geben Sie ein gültiges Datum ein.",
                    "Ungültige Eingabe",
                    JOptionPane.ERROR_MESSAGE);
        }
        return datum;
    }
    public Date formatEndDatum(String EndDatum) throws ParseException {
        Date datum = new Date();
        try {
            datum = format.parse(EndDatum);
        } catch (ParseException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(f,
                    "Geben Sie ein gültiges Datum ein.",
                    "Ungültige Eingabe",
                    JOptionPane.ERROR_MESSAGE);
        }
        return datum;
    }

}

