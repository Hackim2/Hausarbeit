package Klassen;

import javax.swing.*;
import java.awt.*;
import java.sql.Time;
import java.util.Date;
import java.time.*;

public class Mitarbeiter extends JFrame {

    private String name;
    private String berufsbezeichnung;
    private Date einstellungsdatum;
    private double jahresgehalt;

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
}
