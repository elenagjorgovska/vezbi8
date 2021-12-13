package zad1;

import java.util.HashMap;
import java.util.Map;

public class Glavna {
    public static void main(String[] args) {

        Map<String,String> recnik = new HashMap<String,String>();
        recnik.put("cat", "mace");
        recnik.put("dog", "kuce");
        recnik.put("cow", "krava");
        recnik.put("horse", "konj");
        recnik.put("hi", "zdravo");

        System.out.println("Klucevi se: "+recnik.keySet());
        System.out.println("Vrednosti se: "+recnik.values());

        for(Map.Entry<String,String> entry : recnik.entrySet()){
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }

        if(recnik.containsKey("hi"))
            System.out.println("Vrednosta na 'hi' e :" + recnik.get("hi"));
        else
            System.out.println("Ne postoi zborot 'hi'.");
    }
}
