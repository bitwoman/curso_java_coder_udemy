public class Item {
    
    //Atributos
    String nome;
    int quantidade;
    double preco;
    //Pode ter compra iniciada
    Compra compra;

    //Construtor com parâmetros
    Item(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

}
