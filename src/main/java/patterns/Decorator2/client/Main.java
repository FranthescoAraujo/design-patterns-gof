package patterns.Decorator2.client;

import patterns.Decorator2.pattern.Enderecador;
import patterns.Decorator2.pattern.EnderecadorCaixaAlta;
import patterns.Decorator2.pattern.EnderecadorComBorda;
import patterns.Decorator2.pattern.Endereco;
import patterns.Decorator2.pattern.EnderecoSimples;

public class Main {
    
    public static void main(String[] args) {
        
        Endereco endereco = new Endereco("Logradouro", "Bairro", "Cidade", "UF", "CEP");
        Enderecador enderecoSimples = new EnderecoSimples();
        System.out.println(enderecoSimples.preparaEndereco(endereco));

        Enderecador enderecadorCaixaAlta = new EnderecadorCaixaAlta(enderecoSimples);
        System.out.println(enderecadorCaixaAlta.preparaEndereco(endereco));

        Enderecador enderecadorComBorda = new EnderecadorComBorda(enderecadorCaixaAlta);
        System.out.println(enderecadorComBorda.preparaEndereco(endereco));

    }

}
