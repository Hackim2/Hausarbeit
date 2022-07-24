import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class MitarbeiterTablemode extends AbstractTableModel {
    Mitarbeiter tempMitA ;
    ArrayList<Mitarbeiter> mList;
    String[] col;

    /**
     * @param list
     * @param col
     */
    MitarbeiterTablemode(ArrayList<Mitarbeiter> list, String[] col) {
        this.mList = list;
        this.col = col;


        Mitarbeiter mit1 = new Mitarbeiter("Hakim","beruf",30.000);
        Mitarbeiter mit2 = new Mitarbeiter("Khalil","beruf",30.000);
        Mitarbeiter mit3 = new Mitarbeiter("Hakim","beruf",30.000);
        Mitarbeiter mit4 = new Mitarbeiter("Khalil","Programmierer",30.000);
        mList.add(mit1);
        mList.add(mit2);
        mList.add(mit3);
        mList.add(mit4);
    }

        public int getRowCount(){
            return col.length;
        }

        public int getColumnCount() {
            return col.length;
        }

        public String getColumnName( int columnIndex){
            return col[columnIndex];
        }


        public Class<?> getColumnClass( int columnIndex){
            return getValueAt(0, columnIndex).getClass();
        }

        public boolean isCellEditable( int rowIndex, int columnIndex){
            return false;
        }

        public Object getValueAt ( int rowIndex, int columnIndex){
            tempMitA = mList.get(rowIndex);
            return switch (columnIndex) {
                case 0 -> tempMitA.name;
                case 1 -> tempMitA.berufsbezeichnung;
                case 2 -> tempMitA.einstellungsdatum;
                case 3 -> tempMitA.jahresgehalt;
                default -> null;
            };
        }

        public void setValueAt (Object aValue,int rowIndex, int columnIndex){
            switch (columnIndex){
                case 0:
                    aValue=tempMitA.name;
                case 1:
                    aValue=tempMitA.berufsbezeichnung;
                case 2:
                    aValue=tempMitA.einstellungsdatum;
                case 3:
                    aValue=tempMitA.jahresgehalt;
            }

            fireTableCellUpdated(rowIndex, columnIndex);
        }
        /*
        public void add(ArrayList<Mitarbeiter> mList){
            int row = mList.size() -1;
            fireTableRowsInserted(row, row);
        }
        */
        public void addTableModelListener (TableModelListener l){


        }


        public void removeTableModelListener (TableModelListener l){

        }
    }

