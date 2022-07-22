import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Date;

public class MitarbeiterKarte {

    Mitarbeiter newMitA;
    boolean mitAerstellt;

    JLabel name_l;
    JLabel beruf_l;
    JLabel einstellungsdatum_l;
    JLabel jahresghalt_l;

    JTextField name_t;
    JTextField beruf_t;
    JTextField einstellungsdatum_t;
    JTextField jahresghelat_t;
    /*
    Button OK
    mitAerstellt = true;
    newMitA = new Mitarbeietr(..);

    */

    MitarbeiterKarte() {
        buildUI();
    }

    public void buildUI(){
        JFrame f = new JFrame("Panel Example");

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        JLabel name_l  = new JLabel("Name");
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(5,0,0,0);
        panel.add(name_l,c);

        JLabel beruf_l = new JLabel("Beruf");
        c.gridy = 1;
        panel.add(beruf_l,c);

        JLabel einstellungsdatum_l = new JLabel("Einstellungsdatum");
        c.gridy = 2;
        panel.add(einstellungsdatum_l,c);

        JLabel jahresgehalt_l = new JLabel("Jahresgehalt");
        c.gridy = 3;
        panel.add(jahresgehalt_l,c);

        JTextField name_t = new JTextField();
        name_t.setPreferredSize(new Dimension(100,20));
        c.gridx = 1;
        c.gridy = 0;
        c.insets = new Insets(5,20,0,0);
        panel.add(name_t,c);

        JTextField beruf_t = new JTextField();
        beruf_t.setPreferredSize(new Dimension(100,20));
        c.gridy = 1;
        panel.add(beruf_t,c);

        JTextField einstellungsdatum_t = new JTextField();
        einstellungsdatum_t.setPreferredSize(new Dimension(100,20));
        c.gridy = 2;
        panel.add(einstellungsdatum_t,c);

        JTextField jahresgehalt_t   = new JTextField();
        jahresgehalt_t.setPreferredSize(new Dimension(100,20));
        c.gridy = 3;
        panel.add(jahresgehalt_t,c);


        f.setContentPane(panel);
        f.setSize(400, 400);
        f.setVisible(true);
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

    public JTextField getEinstellungsdatum_t() {
        return einstellungsdatum_t;
    }

    public void setEinstellungsdatum_t(JTextField einstellungsdatum_t) {
        this.einstellungsdatum_t = einstellungsdatum_t;
    }

    public JTextField getJahresghelat_t() {
        return jahresghelat_t;
    }

    public void setJahresghelat_t(JTextField jahresghelat_t) {
        this.jahresghelat_t = jahresghelat_t;
    }

    public Mitarbeiter getMitarbeiter(){
        return newMitA;
    }
    public boolean getMitAerstellt(){
        return mitAerstellt;
    }



}
