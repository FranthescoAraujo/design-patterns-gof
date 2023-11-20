package patterns.Decorator2.pattern;

public class EnderecadorComBorda extends EnderecadorDecorator {

    public EnderecadorComBorda(Enderecador enderecador) {
        super(enderecador);
    }

    @Override
    public String preparaEndereco(Endereco endereco) {
        String preparaEndereco = enderecador.preparaEndereco(endereco);
        StringBuilder sb = new StringBuilder();
        sb.append("---------------------\n");
        preparaEndereco.lines().forEach(line -> sb.append("| " + line + "\n"));
        sb.append("---------------------");
        return sb.toString();
    }
    
}
