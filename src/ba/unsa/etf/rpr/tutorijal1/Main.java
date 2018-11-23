package ba.unsa.etf.rpr.tutorijal1;

import java.awt.*;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Knjizara knjiz= new Knjizara();
        int odabir1;
        Scanner unos= new Scanner(System.in);
        double suma=0;

        while(true)
        {
            do {

                System.out.println("Unesite: 1-za unos podataka o knjigama u knjizari, 2- za iznajmljivanje knjige, 0- za zavrsetak programa");

                odabir1 = unos.nextInt();

                if(odabir1!=1 && odabir1!=2  && odabir1!=0)
                    System.out.println("Unijeli ste pogresnu naredbu, unesite ponovo");

            }while(odabir1!=1 && odabir1!=2 && odabir1!=0);

            if(odabir1==0)
            {
                System.out.println("Morate platiti: "+ suma+ ", hvala na posjeti");
                break;
            }

            unos.nextLine(); // da pokupi enter

            if(odabir1==1)
            {
                while(true)
                {
                    int odabir2=-1;

                    do{
                        System.out.println("Unesite: 1- za unos zabavne knjige, 2- za unos naucne knjige, 0- za kraj unosa");
                        odabir2 = unos.nextInt();
                    }while(odabir2!=1 && odabir2!=2 && odabir2!=0);

                    if(odabir2==0)
                    {
                        System.out.println("Zavrsili ste sa unosom podataka o knjizari");
                        break;
                    }

                    unos.nextLine(); // pokupi enter

                    System.out.println("Uneiste ime knjige");
                    String ime_knjige = unos.nextLine();
                    System.out.println("Uneiste ime autora knjige");
                    String ime_autora = unos.nextLine();

                    int god_izd=-1;
                    do{
                        System.out.println("Uneiste godinu izdavanja knjige");
                        god_izd= unos.nextInt();

                        if(god_izd<0 || god_izd>2018)
                            System.out.println("Unijeli ste pogresnu godinu izdavanja");

                    }while(god_izd<0 || god_izd>2018);


                    System.out.println("Uneiste id knjige");
                    int id_knjige = unos.nextInt();

                    unos.nextLine(); // pokupi enter

                    Knjiga k= null;
                    if(odabir2==1)
                    {
                        int pr_dob=-1;

                        do{
                            System.out.println("Unesite preporucenu dob citaca zabavne knjige");
                            pr_dob= unos.nextInt();

                            if(pr_dob<0 || pr_dob>150)
                                System.out.println("Unijeli ste pogresnu preporucenu dob, unesite ponovo");

                        }while(pr_dob<0 || pr_dob>200);

                        k = new ZabavnaKnjiga(ime_knjige, ime_autora, god_izd, id_knjige, pr_dob);

                    }
                    else if(odabir2==2)
                    {
                        System.out.println("Unesite granu nauke kojoj ova naucna knjiga pripada");

                        String grana_nauke = unos.nextLine();

                        k =  new NaucnaKnjiga(ime_knjige, ime_autora, god_izd, id_knjige, grana_nauke);
                    }

                    try
                    {
                        if(knjiz.posjedujeLiJe(k)==false)
                        knjiz.dodaj(k);
                        else
                            System.out.println("Knjiga vec postoji u knjizari");
                    }
                    catch(Exception e)
                    {
                        e.getMessage();
                    }

                }
            }
            else if(odabir1==2)
            {
                System.out.println("Odlucili ste se za iznajmljivanje knjige");

                int odabir3=-1;

                do{
                    System.out.println("Unesite: 1-ako zelite iznajmiti zabavnu knjigu, 2- ako zelite izabrati, 3- ako ste zavrsili sa odabirom");

                    odabir3 = unos.nextInt();

                    if(odabir3!=1 && odabir3!=2 && odabir3!=0)
                        System.out.println("Unijeli ste pogresnu komandu, unesite ponovo!");

                }while(odabir3!=1 && odabir3!=2 && odabir3!=0);

                if(odabir3==0)
                {
                    System.out.println("Suma koju morate platiti je: "+ suma);
                    break;
                }

                unos.nextLine();

                System.out.println("Uneiste ime knjige");
                String ime_knjige = unos.nextLine();
                System.out.println("Uneiste ime autora knjige");
                String ime_autora = unos.nextLine();

                int god_izd=-1;
                do{
                    System.out.println("Uneiste godinu izdavanja knjige");
                    god_izd= unos.nextInt();

                    if(god_izd<0 || god_izd>2018)
                        System.out.println("Unijeli ste pogresnu godinu izdavanja");

                }while(god_izd<0 || god_izd>2018);


                System.out.println("Uneiste id knjige");
                int id_knjige = unos.nextInt();

                unos.nextLine(); // pokupi enter

                Knjiga k= null;

                if(odabir3==1)
                {
                    int pr_dob=-1;

                    do{
                        System.out.println("Unesite preporucenu dob citaca zabavne knjige");
                        pr_dob= unos.nextInt();

                        if(pr_dob<0 || pr_dob>150)
                            System.out.println("Unijeli ste pogresnu preporucenu dob, unesite ponovo");

                    }while(pr_dob<0 || pr_dob>200);

                    k = new ZabavnaKnjiga(ime_knjige, ime_autora, god_izd, id_knjige, pr_dob);

                }
                else if(odabir3==2)
                {
                    System.out.println("Unesite granu nauke kojoj ova naucna knjiga pripada");

                    String grana_nauke = unos.nextLine();

                    k =  new NaucnaKnjiga(ime_knjige, ime_autora, god_izd, id_knjige, grana_nauke);
                }

                int str_dob=-1;
                do{
                    System.out.println("Unesite svoju starosnu dob:");
                    str_dob = unos.nextInt();

                    if(str_dob<=0 && str_dob<150)
                        System.out.println("Unijeli ste dob koja je pogresna, unesite ponovo!");

                }while(str_dob<=0 && str_dob<150);

                int br_dana=-1;
                do{
                    System.out.println("Unesite na koliko dana zelite iznajmiti knjigu:");
                    br_dana = unos.nextInt();

                    if(br_dana<=0)
                        System.out.println("Morate knjigu iznajmiti barem na dan, unesite ponovo!");

                }while(br_dana<=0);


                try
                {
                    if(knjiz.posjedujeLiJe(k)==true)
                        suma= suma + k.zaPlatiti(br_dana, str_dob);
                    else
                        System.out.println("Unijeta knjiga ne postoji u knjizari");
                }
                catch(Exception e)
                {
                    e.getMessage();
                }
            }

        }
    }
}
