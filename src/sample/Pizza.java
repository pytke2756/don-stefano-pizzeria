package sample;

import com.sun.nio.sctp.AbstractNotificationHandler;

public class Pizza {
    private String azonosito;
    private String nev;
    private int egyseg_ar;
    private int eladott_db;
    private boolean akcios;

    public Pizza(String sor) {
        String[] sorSplit = sor.split(";");
        this.azonosito = sorSplit[0];
        this.nev = sorSplit[1];
        this.egyseg_ar = Integer.parseInt(sorSplit[2]);
        this.eladott_db = Integer.parseInt(sorSplit[3]);
        this.akcios = Boolean.parseBoolean(sorSplit[4]);
    }

    public String getAzonosito() {
        return azonosito;
    }

    public String getNev() {
        return nev;
    }

    public int getEgyseg_ar() {
        return egyseg_ar;
    }

    public int getEladott_db() {
        return eladott_db;
    }

    public boolean isAkcios() {
        return akcios;
    }

    public String getAkciosSzovegesen(){
        if (this.akcios){
            return "Igen";
        }
        else {
            return "Nem";
        }
    }
}
