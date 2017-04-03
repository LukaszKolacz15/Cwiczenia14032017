package pl.akademiakodu;

/**
 * Created by Moody on 2017-03-14.
 */
public class Zad9Metody {

    public boolean jestSzescianem(int a){
        for(int i=0; i <= a; i++){
            if(i*i*i == a){
                return true;
            }
        }
        return false;
    }
}
