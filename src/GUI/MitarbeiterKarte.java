import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class MitarbeiterKarte {

    MitarbeiterKarte() {
        JFrame f = new JFrame("Panel Example");

        JPanel panel = new JPanel(new GridBagLayout());
        //panel.setBounds(400, 800, 800, 800);

        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 2;
        c.gridwidth = 200;

        JLabel name_l  = new JLabel("Name");
        JLabel beruf_l = new JLabel("Beruf");
        JLabel einstellungsdatum_l = new JLabel("Einstellungsdatum");
        JLabel jahresgehalt_l = new JLabel("Jahresgehalt");

        /*
        name_l.setBounds(50, 100, 80, 30);
        beruf_l.setBounds(50, 150, 80, 30);
        einstellungsdatum_l.setBounds(50, 200, 80, 30);
        jahresgehalt_l.setBounds(50, 250, 80, 30);
        */
        JTextField name_t = new JTextField();
        name_t.setColumns(1);

        JTextField beruf_t = new JTextField();
        beruf_t.setColumns(1);

        JTextField einstellungsdatum_t = new JTextField();
        einstellungsdatum_t.setColumns(1);

        JTextField jahresgehalt_t   = new JTextField();
        jahresgehalt_t.setColumns(1);


        panel.add(name_l,c);
        panel.add(beruf_l,c);
        panel.add(einstellungsdatum_l,c);
        panel.add(jahresgehalt_l,c);
        panel.add(name_t,c);
        panel.add(beruf_t,c);
        panel.add(einstellungsdatum_t,c);
        panel.add(jahresgehalt_t,c);

        f.setContentPane(panel);
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
