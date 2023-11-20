package patterns.AbstractFactory.pattern;

public class EditoraA implements AbstractFactory {

    private LivroPHP livroPHP;
    private LivroMySql livroMySql;

    public EditoraA() {
        livroPHP = new LivroPHP();
        livroMySql = new LivroMySql();
    }

    @Override
    public AbstractLivroLinguagem makeLivroLinguagem() {
        return livroPHP;
    }

    @Override
    public AbstractLivroBancoDeDados makeLivroBancoDeDados() {
        return livroMySql;
    }
    
}
