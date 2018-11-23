package ba.unsa.etf.rpr.tutorijal1;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public class Knjizara
{
    private ArrayList<Knjiga> knjiz;

    public Knjizara()
    {
        knjiz= new ArrayList<>(0);
    }

    public Knjizara(ArrayList<Knjiga> knj)
    {
        knjiz= new ArrayList<>(0);

        knjiz.addAll(knj);
    }

    public void dodaj(Knjiga k) throws IllegalArgumentException
    {
        Iterator it = knjiz.iterator();

        for(int i=0; i<knjiz.size(); i++)
        {
            Knjiga k2 = (Knjiga) it.next();

            if(k2.getId_knjge() == k.getId_knjge() )
                throw new IllegalArgumentException("Knjiga vec postoji u knjizari");
        }
        knjiz.add(k);
    }

    public boolean posjedujeLiJe(Knjiga k1)
    {
        Iterator it = knjiz.iterator();

        for(int i=0; i<knjiz.size(); i++)
        {
            Knjiga k2= (Knjiga) it.next();

            if(k1.equals(k2))
            return true;
        }

        return false;
    }

}
