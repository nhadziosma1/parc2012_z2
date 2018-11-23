package ba.unsa.etf.rpr.tutorijal1;

import java.util.*;

public abstract class Knjiga
{
    private String naziv;
    private String autor;
    private int godina_izdavanja;
    private int id_knjge;

    public Knjiga(String naz, String aut, int god_izd, Integer id_knj)
    {
        naziv=naz;
        autor=aut;
        godina_izdavanja=god_izd;
        id_knjge=id_knj;
    }

    public boolean equals(Knjiga k2)
    {
        if(this.naziv.equals(k2.naziv) && this.autor.equals(k2.autor) && this.godina_izdavanja==k2.godina_izdavanja && this.id_knjge==k2.id_knjge)
            return true;

        return false;
    }

    public abstract double zaPlatiti(int br_dana, int starosna_dob ) throws IlegalanBrojDana;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv)
    {
        this.naziv = naziv;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getGodina_izdavanja() {
        return godina_izdavanja;
    }

    public void setGodina_izdavanja(int godina_izdavanja) {
        this.godina_izdavanja = godina_izdavanja;
    }

    public Integer getId_knjge() {
        return id_knjge;
    }

    public void setId_knjge(Integer id_knjge) {
        this.id_knjge = id_knjge;
    }

}
