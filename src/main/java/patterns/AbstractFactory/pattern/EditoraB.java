package patterns.AbstractFactory.pattern;

public class EditoraB implements AbstractFactory {

    private LivroJava livroJava;
    private LivroPostgres livroPostgres;

    public EditoraB() {
        livroJava = new LivroJava();
        livroPostgres = new LivroPostgres();
    }

    @Override
    public AbstractLivroLinguagem makeLivroLinguagem() {
        return livroJava;
    }

    @Override
    public AbstractLivroBancoDeDados makeLivroBancoDeDados() {
        return livroPostgres;
    }    

}
