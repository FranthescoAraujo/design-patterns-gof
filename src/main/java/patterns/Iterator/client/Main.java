package patterns.Iterator.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import patterns.Iterator.pattern.Iterador;

public class Main {
    
    public static void main(String[] args) {
        List<String> teste = new ArrayList<>();
        teste.add("teste01");
        teste.add("teste02");
        teste.add("teste03");
        teste.add("teste04");
        teste.add("teste05");

        Iterador<String> iterador = new Iterador<>(teste);

        for (Iterator<String> iter = iterador.iterator(); iter.hasNext();) {
            String name = iter.next();
            System.out.println("Name: " + name);
        }

        System.out.println("\n");

        for (String item : iterador) {
            System.out.println(item);
        }

    }

}
