package pl.akademiakodu;

/**
 * Created by Moody on 2017-03-14.
 */
public class Zad11Metody {

    public int iloscDzielnikow(int a){

        int dzielniki=0;
        for(int i=1; i <=a; i++){
            if(a%i==0){
                dzielniki ++;
//                System.out.println("Dzielnik: "+ i);

            }
        }
        return dzielniki;
    }
}
