import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
public class AuftragTablemode extends AbstractTableModel implements Auftragiface {
    SimpleDateFormat format;
    Auftrag tempAuftr;
    ArrayList<Auftrag> aList;
    String[] col;

    /**
     * @param list
     * @param col
     */
    AuftragTablemode(ArrayList<Auftrag> list, String[] col) throws ParseException {
        this.aList = list;
        this.col = col;
        format = new SimpleDateFormat("dd.MM.yyyy");


        Auftrag auftr1 = new Auftrag("Timo ", "klingunstraße 27, Westhof 08754", "sehr viel Arbeit", format.parse("15.05.2022"), format.parse("28.05.2022"));
        Auftrag auftr2 = new Auftrag("Khalil", "Falastin", "er brauch eine Senzubohne", format.parse("23.07.2013"), format.parse("24.07.2022"));
        Auftrag auftr3 = new Auftrag("Halim", "Hagen", "er verkackt wd Klausur", format.parse("15.05.2021"), format.parse("24.07.2022"));
        Auftrag auftr4 = new Auftrag("Hakim", "Hagen", "er kriegt Halluzinationen", format.parse("24.07.2013"));
        Auftrag auftr5 = new Auftrag("Hakim", "Hagen", "er ist fertig", format.parse("24.07.2013"));

        aList.add(auftr1);
        aList.add(auftr2);
        aList.add(auftr3);
        aList.add(auftr4);
        aList.add(auftr5);


    }

    public int getRowCount() {
        return col.length;
    }

    public int getColumnCount() {
        return col.length;
    }

    public String getColumnName(int columnIndex) {
        return col[columnIndex];
    }


    public Class<?> getColumnClass(int columnIndex) {
        return getValueAt(0, columnIndex).getClass();
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        tempAuftr = aList.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> tempAuftr.auftraggeber;
            case 1 -> tempAuftr.adresse;
            case 2 -> tempAuftr.beschreibung;
            case 3 -> tempAuftr.startDatum;
            case 4 -> tempAuftr.endDatum;
            default -> null;
        };
    }
    public void add(Auftrag tempAuftr) {
        aList.add(tempAuftr);
        int row = aList.indexOf(tempAuftr);
        fireTableRowsInserted(row, row);
    }
    public void remove(Auftrag tempAuftr){
        if (aList.contains(tempAuftr)){
            int row = aList.indexOf(tempAuftr);
            aList.remove(row);
            fireTableRowsDeleted(row,row);
        }
    }
        public void addTableModelListener (TableModelListener l){


        }


        public void removeTableModelListener (TableModelListener l){

        }
    }

