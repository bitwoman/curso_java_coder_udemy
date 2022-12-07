import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) throws Exception {
    
        Produto p = new Produto("iPad", 3235.89, 0.13);

        //1. A partir do produto, calcular o preço real (com desconto)
        BinaryOperator<Double> valorProdutoComDesconto = 
                (precoProduto, desconto) -> precoProduto - (precoProduto * desconto);

        System.out.println("\nTeste BinaryOperator: valor com desconto: R$ " + valorProdutoComDesconto.apply(p.preco, p.desconto));

        //2. Imposto Municipal: >= 2500 (8,5%)/<2500 (Isento)
        UnaryOperator<Double> impostoMunicipal = (precoProduto) -> precoProduto >= 2500 ? precoProduto * 8.5 : precoProduto; 

        System.out.println("\nTeste UnaryOperator: valor do imposto municipal: R$ " + impostoMunicipal.apply(p.preco));

        //3. Frete: >= 3000 (100)/ <3000 (50)
        UnaryOperator<Double> frete = precoProduto -> precoProduto >= 3000 ? precoProduto + 100 : precoProduto + 50;
        
        System.out.println("\nTeste UnaryOperator: valor do imposto municipal: R$ " + impostoMunicipal.apply(p.preco));
        
        //4. Arredondar: deixar duas casas decimais
        double precoFinalProduto = valorProdutoComDesconto.andThen(impostoMunicipal).andThen(frete).apply(p.preco, p.desconto);
        double precoFinalProdutoArredondado = Math.round(precoFinalProduto);

        
        //5. Formatar R$ 1234,56
        String precoFinalProdutoFormatado = String.format("%,.2f", precoFinalProduto);

        System.out.println("\n" + precoFinalProdutoFormatado);
    }

}
