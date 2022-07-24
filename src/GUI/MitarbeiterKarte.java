import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MitarbeiterKarte implements ActionListener   {
    private Mitarbeiter newMitA;
    private Mitarbeiterliste mitarbeiterliste;
    private DateFormat format;
    private JButton erstellen;
    private JPanel panel;
    private JLabel beruf_l;
    private JLabel einstellungsdatum_l;
    private JLabel jahresgehalt_l;
    private JLabel name_l;


    private JFrame f;
    private JTextField name_t;
    private JTextField beruf_t;
    private JFormattedTextField einstellungsdatum_t;
    private JTextField jahresgehalt_t;

    /*
    Button OK
    mitAerstellt = true;
    newMitA = new Mitarbeietr(..);

    */

    MitarbeiterKarte() {
        buildUI();
    }

    public void buildUI(){
        JFrame f = new JFrame("Mitarbeiter hinzufügen");

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        JLabel name_l  = new JLabel("Name:");
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(10,0,5,0);
        panel.add(name_l,c);

        JLabel beruf_l = new JLabel("Beruf:");
        c.gridy = 1;
        c.insets = new Insets(5,0,0,0);
        panel.add(beruf_l,c);

        JLabel einstellungsdatum_l = new JLabel("Einstellungsdatum:");
        c.gridy = 2;
        c.insets = new Insets(5, 10, 0, 0);
        panel.add(einstellungsdatum_l,c);

        JLabel jahresgehalt_l = new JLabel("Jahresgehalt:");
        c.gridy = 3;
        c.insets = new Insets(5,0,10,0);
        panel.add(jahresgehalt_l,c);

        JTextField name_t = new JTextField();
        name_t.setPreferredSize(new Dimension(100,20));
        c.gridx = 2;
        c.gridy = 0;
        c.insets = new Insets(5,20,0,20);
        panel.add(name_t,c);

        JTextField beruf_t = new JTextField();
        beruf_t.setPreferredSize(new Dimension(100,20));
        c.gridy = 1;
        panel.add(beruf_t,c);

        JFormattedTextField einstellungsdatum_t = new JFormattedTextField(format);
        einstellungsdatum_t.setPreferredSize(new Dimension(100,20));
        c.gridy = 2;

        panel.add(einstellungsdatum_t,c);

        JTextField jahresgehalt_t   = new JTextField();
        jahresgehalt_t.setPreferredSize(new Dimension(100,20));
        c.gridy = 3;
        c.insets = new Insets(5, 20, 10, 20);
        panel.add(jahresgehalt_t,c);

        erstellen = new JButton("Eintrag hinzufügen");
        erstellen.addActionListener(this);
        c.gridy = 4;
        c.gridx = 2;
        panel.add(erstellen,c);



        f.setContentPane(panel);
        f.setSize(450, 400);
        f.setResizable(false);
        f.pack();
        f.setLocationRelativeTo(mitarbeiterliste.getFrame());
        f.setVisible(true);
    }

    public void actionPerformed( ActionEvent e) {
        if (e.getSource() == erstellen) {
            try {
                readAndCreateMitarbeiter();
            } catch (ParseException ex) {
                throw new RuntimeException(ex);
            }
            f.dispose();
        }
    }
    public synchronized void readAndCreateMitarbeiter() throws ParseException {
        newMitA = new Mitarbeiter(getName_t(),getBeruf_t(),formatJahresgehalt_t(getJahresgehalt_t()),formatEinstellungsdatum(getEinstellungsdatum_t()));

    }

    /*
    public Object[] object() throws ParseException {
        return new Object[]{mList.get(0),mList.get(1),mList.get(2),mList.get(3)};
    }
    */
    public Mitarbeiter getMitarbeiter(){ return newMitA; }
    public String getName_t() {
        return name_t.getText();
    }
    public String getBeruf_t() {
        return beruf_t.getText();
    }
    public String getEinstellungsdatum_t() {
        return einstellungsdatum_t.getText();
    }
    public String getJahresgehalt_t() {
        return jahresgehalt_t.getText();
    }
    public Date formatEinstellungsdatum(String einstellungsdatum) throws ParseException {
        Date datum = new Date();
        try {
            datum = format.parse(einstellungsdatum);
        } catch (ParseException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(f,
                    "Geben Sie ein gültiges Datum ein.",
                    "Ungültige Eingabe",
                    JOptionPane.ERROR_MESSAGE);
        }
        return datum;
    }

    public double formatJahresgehalt_t(String jahresgehalt) {
        double gehalt = 0;
        try {
            gehalt = Double.parseDouble(jahresgehalt);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(f,
                    "Geben Sie eine Zahl ein.",
                    "Ungültige Eingabe",
                    JOptionPane.ERROR_MESSAGE);

        }
        return gehalt;
    }




}

