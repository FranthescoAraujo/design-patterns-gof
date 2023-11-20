package patterns.AbstractFactory.client;

import patterns.AbstractFactory.pattern.AbstractFactory;
import patterns.AbstractFactory.pattern.EditoraA;
import patterns.AbstractFactory.pattern.EditoraB;

public class Main {
    
    public static void main(String[] args) {
        
        AbstractFactory factory = new EditoraA();

        System.out.println(factory.makeLivroLinguagem().getTitle());
        System.out.println(factory.makeLivroBancoDeDados().getAuthor());
        System.out.println(factory.makeLivroLinguagem().getPages());

        factory = new EditoraB();

        System.out.println(factory.makeLivroLinguagem().getTitle());
        System.out.println(factory.makeLivroBancoDeDados().getAuthor());
        System.out.println(factory.makeLivroLinguagem().getPages());

    }

}
