package patterns.AbstractFactory.pattern;

public class LivroPostgres implements AbstractLivroBancoDeDados {

    @Override
    public String getTitle() {
        return "Postgres";
    }

    @Override
    public String getAuthor() {
        return "Autor Postgres";
    }
    
}
