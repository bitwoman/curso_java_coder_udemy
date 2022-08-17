public class Main {
    public static void main(String[] args) {
        //Instância 1
        Produto p1 = new Produto("Notebook", 4356.89); //O Java reconhece o tipo do dado de acordo com o seu valor atribuído (nesse caso, tipo Produto)
        //p1.nome = "Notebook";
        //p1.preco = 4356.89;
        //p1.desconto = 0.25;

        //Instância 2
        var p2 = new Produto("Caneta Preta"); //É necessário colocar o nome no parâmetro no momento de instanciar, pois está definido na assinatura do construtor
        //p2.nome = "Caneta preta"; Mas é possível alterá-lo dessa forma.
        p2.preco = 12.56;
        p2.desconto = 0.29;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto();
        double mediaCarrinho = (precoFinal1 + precoFinal2)/2;

        System.out.printf("Média do carrinho = R$%.2f", mediaCarrinho);
    
        System.out.println(p1.precoComDesconto());
    }
}
