import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MitarbeiterKarte implements ActionListener   {
    DateFormat format = new SimpleDateFormat("dd.MM.yyyy");
    JButton erstellen;
    Mitarbeiter newMitA;
    boolean mitAerstellt;

    JFrame f;
    JTextField name_t;
    JTextField beruf_t;
    JFormattedTextField einstellungsdatum_t;
    JTextField jahresgehalt_t;

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

        JButton erstellen = new JButton("Eintrag hinzufügen");
        c.gridy = 4;
        c.gridx = 2;
        panel.add(erstellen,c);



        f.setContentPane(panel);
        f.setSize(450, 400);
        f.setResizable(false);
        f.pack();
        f.setLocationRelativeTo(Mitarbeiterliste.frame);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() ==erstellen ) {

            getMitarbeiter();
            mitAerstellt=true;
            eintragen();

        }
    }
    public Mitarbeiter getMitarbeiter() {
        newMitA.name = name_t.getText();
        newMitA.berufsbezeichnung = beruf_t.getText();
        try {
            newMitA.einstellungsdatum = getdatumeins();
        } catch (ParseException ex) {
            throw new RuntimeException(ex);
        }
        try {
            newMitA.jahresgehalt = Double.parseDouble(jahresgehalt_t.getText());
        } catch (NumberFormatException h) {
            h.printStackTrace();
            JOptionPane.showMessageDialog(f,
                    "Geben Sie eine Zahl ein.",
                    "Ungültige Eingabe",
                    JOptionPane.ERROR_MESSAGE);
            // handle the error
        }
        return newMitA;
    }
    public void eintragen() {
        new Mitarbeiterliste();
        Mitarbeiterliste.frame.setVisible(false);
       //TODO: Mitarbeiter (newMitA) in JTable hinzufügen
        // Mitarbeiterliste.m

    }
        public JTextField getName_t() {
        return name_t;
    }

    public void setName_t(JTextField name_t) {
        this.name_t = name_t;
    }
    public JTextField getBeruf_t() {
        return beruf_t;
    }

    public void setBeruf_t(JTextField beruf_t) {
        this.beruf_t = beruf_t;
    }

    public JFormattedTextField getEinstellungsdatum_t() {
        return einstellungsdatum_t;
    }
    public Date getdatumeins() throws ParseException {
        Date datum = format.parse(getEinstellungsdatum_t().getText());
        return datum;
    }
    public void setEinstellungsdatum_t(JFormattedTextField einstellungsdatum_t) {
        this.einstellungsdatum_t = einstellungsdatum_t;
    }

    public JTextField getJahresghelat_t() {
        return jahresgehalt_t;
    }

    public void setJahresghelat_t(JTextField jahresghelat_t) {
        this.jahresgehalt_t = jahresghelat_t;
    }

    public boolean getMitAerstellt(){
        return mitAerstellt;
    }



}
