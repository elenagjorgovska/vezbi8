package zad2;

import java.util.HashMap;
import java.util.Map;

public class Recnik {
    Map<String, String> recnik = new HashMap<String, String>();

    public void vnesiMapa() {
        recnik.put("Denes", "Today");
        recnik.put("Utre", "Tomorrow");
        recnik.put("Vreme", "Time");
        recnik.put("Cveke", "Flower");
        recnik.put("Slika","Photo");
    }

    public void translate (String s) {
        if (recnik.containsKey(s))
        {
            System.out.println(recnik.get(s));
        }
        else
            System.out.println("Ne postoi takov zbor vo recnikot!");
    }
}

