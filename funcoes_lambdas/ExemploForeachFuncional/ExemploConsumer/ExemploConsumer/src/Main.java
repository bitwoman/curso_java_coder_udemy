import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) throws Exception {
        
        //Consumer é uma interface que recebe um parâmetro mas não retorna nada, é void
        Consumer<Produto> imprimirNome = 
            p -> System.out.println(p.nome + "!!!!");

        Produto p1 = new Produto("Caneta", 12.34, 0.09);
        imprimirNome.accept(p1);

        Produto p2 = new Produto("Notebook", 12.34, 0.09);
        Produto p3 = new Produto("Caderno", 12.34, 0.09);
        Produto p4 = new Produto("Borracha", 12.34, 0.09);
        Produto p5 = new Produto("Lapis", 12.34, 0.09);

        List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5);

        produtos.forEach(imprimirNome);
        System.out.println();
        
        produtos.forEach(p -> System.out.println(p.preco));
        System.out.println();

        produtos.forEach(System.out::println);
        System.out.println();
    }
}
