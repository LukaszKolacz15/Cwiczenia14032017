package pl.akademiakodu;

/**
 * Created by Moody on 2017-03-14.
 */
public class Zad14Metody {

    public int NWD (int a, int b){
        while(a != b){
            if(a>b){
                a = a - b;
            }else {
                b = b - a;
            }
        }
        return a;
    }

}
