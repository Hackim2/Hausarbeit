import javax.swing.*;
import java.awt.*;
import java.sql.Time;
import java.util.Date;
import java.time.*;

 class Mitarbeiter implements Comparable {

    private static final int total=0;
    public String name;
    public String berufsbezeichnung;
    public Date einstellungsdatum;
    public double jahresgehalt;


    Mitarbeiter(String name, String berufsbezeichnung, double jahresgehalt, Date einstellungsdatum){
        this.name = name;
        this.berufsbezeichnung = berufsbezeichnung;
        this.jahresgehalt = jahresgehalt;
        this.einstellungsdatum = einstellungsdatum;
    }
    Mitarbeiter(String name, String berufsbezeichnung, double jahresgehalt){
        this.name = name;
        this.berufsbezeichnung = berufsbezeichnung;
        this.jahresgehalt = jahresgehalt;
        this.einstellungsdatum = new Date();
    }


    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getBerufsbezeichnung(){
        return this.berufsbezeichnung;
    }
    public void setBerufsbezeichnung(String berufsbezeichnung){
        this.berufsbezeichnung = berufsbezeichnung;
    }
    public Date getEinstellungsdatum(){
        return this.einstellungsdatum;
    }
    public void setEinstellungsdatum(Date einstellungsdatum){
        this.einstellungsdatum = einstellungsdatum;
    }
    public double getJahresgehalt(){
        return this.jahresgehalt;
    }
    public void setJahresgehalt(double jahresgehalt){
        this.jahresgehalt = jahresgehalt;
    }

     @Override
     public int compareTo(Object o) {
         return 0;
     }

     // Mitarbeiteranzahl wiedergeben
     public static int total() {
         return total;
     }

 }
