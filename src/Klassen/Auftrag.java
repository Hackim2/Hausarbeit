
import javax.swing.*;
import java.util.Date;

public class Auftrag extends JFrame {

    private String auftraggeber;
    private String adresse;
    private Date startDatum;
    private Date endDatum;
    private String beschreibung;

    Auftrag(String auftraggeber, String adresse, String beschreibung, Date startDatum, Date endDatum){
        this.auftraggeber=auftraggeber;
        this.adresse = adresse;
        this.startDatum = startDatum;
        this.endDatum = endDatum;
        this.beschreibung = beschreibung;
    }


    public String GetAuftraggeber(){
        return this.auftraggeber;
    }
    public void setAuftraggeber(String auftraggeber){
        this.auftraggeber = auftraggeber;
    }
    public String getAdresse(){
        return this.adresse;
    }
    public void setAdresse(String adresse){
        this.adresse = adresse;
    }
    public Date getStartDatum(){
        return this.startDatum;
    }
    public void setStartDatum(Date startDatum){
        this.startDatum = startDatum;
    }
    public Date getEndDatum(){
        return this.endDatum;
    }
    public void setEndDatum(Date endDatum){
        this.endDatum = endDatum;
    }

    public String getBeschreibung(){
        return this.beschreibung;
    }
    public void setBeschreibung(String beschreibung){
        this.beschreibung = beschreibung;
    }

}
