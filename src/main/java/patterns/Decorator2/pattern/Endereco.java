package patterns.Decorator2.pattern;

public class Endereco {

    public String logradouro;
    public String bairro;
    public String cidade;
    public String uf;
    public String cep;

    public Endereco(String logradouro, String bairro, String cidade, String uf, String cep) {
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
    }
    
}
