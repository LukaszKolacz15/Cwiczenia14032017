package pl.akademiakodu;

/**
 * Created by Moody on 2017-03-14.
 */
public class Zad12Metody {


    public int najwiekszIloscDiel(){

        int iloscDziel = 0;
        int liczba = 0;

        for(int i=2; i <=10000; i++){

            int iloscDzielnikowLocal = iloscDzielnikow(i);

            if(iloscDziel < iloscDzielnikowLocal){
                iloscDziel = iloscDzielnikowLocal;
                liczba = i;
            }
        }
        return liczba;
    }



    public int iloscDzielnikow(int a){

        int dzielniki=0;
        for(int i = 1; i <= a; i++){
            if(a % i == 0){
                dzielniki ++;
            }
        }
        return dzielniki;
    }
}
