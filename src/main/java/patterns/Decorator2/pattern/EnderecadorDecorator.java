package patterns.Decorator2.pattern;

public abstract class EnderecadorDecorator implements Enderecador {

    protected Enderecador enderecador;

    public EnderecadorDecorator(Enderecador enderecador) {
        this.enderecador = enderecador;
    }
    
}
