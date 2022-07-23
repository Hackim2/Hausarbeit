import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import java.util.ArrayList;

public class tablemode extends AbstractTableModel{

    TableModel model;
    Mitarbeiter tempMitA ;
    ArrayList<Mitarbeiter> mList = new ArrayList<Mitarbeiter>();



    tablemode() {
        mList.add(mit1);
        mList.add(mit2);
        mList.add(mit3);
        mList.add(mit4);


    }
        String[] Spaltennamen = {"Name", "Berufsbezeichnung", "Einstellungsdatum", "jahresgehalt"};


        Mitarbeiter mit1 = new Mitarbeiter("Hakim","beruf",30.000);
        Mitarbeiter mit2 = new Mitarbeiter("Khalil","beruf",30.000);
        Mitarbeiter mit3 = new Mitarbeiter("Hakim","beruf",30.000);
        Mitarbeiter mit4 = new Mitarbeiter("Khalil","Programmierer",30.000);





        public int getRowCount(){
            return Spaltennamen.length;
        }

        public int getColumnCount() {
            return Spaltennamen.length;
        }

        public String getColumnName( int columnIndex){
            return Spaltennamen[columnIndex];
        }


        public Class<?> getColumnClass( int columnIndex){
            return getValueAt(0, columnIndex).getClass();
        }


        public boolean isCellEditable( int rowIndex, int columnIndex){
            return false;
        }

        public Object getValueAt ( int rowIndex, int columnIndex){
            tempMitA = mList.get(rowIndex);
            switch (columnIndex) {
                case 0:
                    return tempMitA.name;
                case 1:
                    return tempMitA.berufsbezeichnung;

                case 2:
                    return tempMitA.einstellungsdatum;

                case 3:
                    return tempMitA.jahresgehalt;


                default:
                    return null;

            }
        }

        public void setValueAt (Object aValue,int rowIndex, int columnIndex){

        }


        public void addTableModelListener (TableModelListener l){

        }


        public void removeTableModelListener (TableModelListener l){

        }
    }

