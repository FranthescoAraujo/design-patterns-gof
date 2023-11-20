package patterns.AbstractFactory.pattern;

public class LivroPHP implements AbstractLivroLinguagem {

    @Override
    public String getTitle() {
        return "PHP";
    }

    @Override
    public String getAuthor() {
        return "Autor PHP";
    }

    @Override
    public String getPages() {
        return "300 páginas";
    }

}
