public class Produto {
    
    //Atributos
    String nome;
    double preco;
    static double desconto = 0.25; //valor default será 0.25, mas não será final, portanto, é mutável para instâncias

    //Construtor padrão
    Produto(){

    }

    //Construtor personalizado com outra assinatura
    Produto(String nomeInicial, double precoInicial){
        nome = nomeInicial;
        preco = precoInicial;
        //desconto = descontoInicial;
    }

    //Método personalizado sem parâmetro
    double precoComDesconto(){
        return preco * (1 - desconto);
    }

    //Método personalizado com outra assinatura, que necessita de parâmetro quando a classe é instânciada e irá utilizá-lo
    double precoComDesconto(double descontoDoGerente){
        return preco * (1 - desconto + descontoDoGerente);
    }

}
