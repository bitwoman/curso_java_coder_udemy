public class Produto {

    //Atributos
    final String nomeProduto;
    final double precoProduto;
    
    //Construtor
    Produto(String nomeProduto, double precoProduto){
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }
    
    //Método toString para retornar o nome e o preço do produto
    @Override
    public String toString() {
        return "Produto [nomeProduto=" + nomeProduto + ", \nprecoProduto=" + precoProduto + "]";
    }
}
