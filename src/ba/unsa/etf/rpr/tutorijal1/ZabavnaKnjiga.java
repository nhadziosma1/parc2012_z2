package ba.unsa.etf.rpr.tutorijal1;

public class ZabavnaKnjiga extends Knjiga
{
    int preporuceno_za_dob;

    ZabavnaKnjiga(String naz, String aut, int god_izd, Integer id_knj, int prep_za_dob )
    {
        super(naz, aut,god_izd, id_knj);
        preporuceno_za_dob=prep_za_dob;
    }

    @Override
    public double zaPlatiti(int br_dana, int starosna_dob) throws IlegalanBrojDana
    {
        if(br_dana<=0)
            throw new IlegalanBrojDana("Nepravila unos broja dana!");

        double suma= 4;

        if(br_dana>5)
        {
            br_dana-=5;

            if(starosna_dob>18)
            {
                while(br_dana>0)
                {
                    suma= suma + 4*(2./100);

                    br_dana--;
                }
            }
        }

        return suma;
    }

}
