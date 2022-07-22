import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //Login login = new Login();
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                Mitarbeiterliste log = new Mitarbeiterliste();
            }
        });
    }
}
