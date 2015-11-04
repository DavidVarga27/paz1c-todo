package sk.upjs.ics.todo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Uloha {
    private Long id;
    
    private String nazov;
    
    private Date datum;
    
    private SimpleDateFormat dateFormat = new SimpleDateFormat("d.M.yyyy");    
    
    private boolean splnena;

    public SimpleDateFormat getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(SimpleDateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }

    public boolean isSplnena() {
        return splnena;
    }

    public void setSplnena(boolean splnena) {
        this.splnena = splnena;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    @Override
    public String toString() {
        return this.nazov + " (termín " + dateFormat.format(this.datum) + ")";
    }
    
    
}
