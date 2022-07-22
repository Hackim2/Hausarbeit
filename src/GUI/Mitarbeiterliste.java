import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Mitarbeiterliste {
    JFrame frame = new JFrame("Mitarbeiter");
    JPanel panel = new JPanel(new BorderLayout());

    JToolBar menu = new JToolBar();
    JList <String> mitarbeiter;
    JScrollPane scrollPane = new JScrollPane(mitarbeiter);



    Mitarbeiterliste() {

        panel.setBorder(BorderFactory.createLineBorder(Color.black));
        String liste[]= {"Hans", "Peter", "Karim", "Khalil"};
        mitarbeiter = new JList<String>(liste);
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(menu, BorderLayout.PAGE_END);

        //Toolbar
        JButton hinzufügen = new JButton("Mitarbeiter hinzufügen");
        JButton bearbeiten = new JButton("Mitarbeiter bearbeiten");
        JButton entfernen = new JButton("Mitarbeiter löschen");

         createFrame();


    }

        public void createFrame() {
            frame.setTitle("Mitarbeiterliste:");
            frame.add(panel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            frame.setLayout(null);
            frame.setVisible(true);
        }
    }
