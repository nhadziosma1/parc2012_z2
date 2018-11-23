package ba.unsa.etf.rpr.tutorijal1;

public class NaucnaKnjiga extends Knjiga
{
    String grana_nauke;

    public NaucnaKnjiga(String naz, String aut, int god_izd, Integer id_knj, String gr_n)
    {
        super(naz, aut, god_izd,id_knj);
        grana_nauke = gr_n;
    }

    @Override
    public double zaPlatiti(int br_dana, int starosna_dob) throws IlegalanBrojDana
    {
        if(br_dana<=0)
            throw new IlegalanBrojDana("Ilegalan broj dana!");

        double suma=5;

        if(br_dana>10)
        {
            br_dana-=10;

            if(this.getGodina_izdavanja() < 1990)
            {
                while(br_dana>0)
                {
                    suma+=0.5;
                    br_dana--;
                }
            }
            else if(this.getGodina_izdavanja() >= 1990)
            {
                while(br_dana>0)
                {
                    suma+=0.3;
                    br_dana--;
                }
            }
        }

        return suma;
    }
}
