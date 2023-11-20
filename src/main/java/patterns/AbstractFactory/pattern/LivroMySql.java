package patterns.AbstractFactory.pattern;

public class LivroMySql implements AbstractLivroBancoDeDados {

    @Override
    public String getTitle() {
        return "MySql";
    }

    @Override
    public String getAuthor() {
        return "Autor MySQL";
    }
    
}
