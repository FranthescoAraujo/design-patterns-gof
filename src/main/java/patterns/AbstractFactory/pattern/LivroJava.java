package patterns.AbstractFactory.pattern;

public class LivroJava implements AbstractLivroLinguagem {

    @Override
    public String getTitle() {
        return "Java";
    }

    @Override
    public String getAuthor() {
        return "Autor Java";
    }

    @Override
    public String getPages() {
        return "500 páginas";
    }
    
}
