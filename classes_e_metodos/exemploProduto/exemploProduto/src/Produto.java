public class Produto {
    //Atributos - pertencem ao objeto
    public String nome;
    public double preco, desconto;


    //Forma explícita do construtor padrão
    Produto(){}

    //Construtor com outra assinatura
    Produto(String nomeInicial){
       nome = nomeInicial;
    }

    //Construtor com outra assinatura
    Produto(String nomeInicial, double precoInicial){
       nome = nomeInicial;
       preco = precoInicial;
    }

    //Construtor com outra assinatura
    Produto(String nomeInicial, double precoInicial, double descontoInicial){
       nome = nomeInicial;
       preco = precoInicial;
       desconto = descontoInicial;
    }

    //Método para retornar desconto
    double precoComDesconto(){
        double precoComDesconto;

        precoComDesconto = preco * desconto;
        precoComDesconto = preco - precoComDesconto;
         
        return precoComDesconto;
    }
}
