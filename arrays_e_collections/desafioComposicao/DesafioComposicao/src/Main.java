import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        
        //Instanciando as classes
        //Cliente
        Cliente cliente1 = new Cliente("Bitwoman");

        //Produto
        Produto produto1 = new Produto("CD Justin Bieber", 50.00);
        Produto produto2 = new Produto("CD Taylor Swift", 80.00); //Taylor Swift é absurda

        //Item
        Item item1 = new Item(produto1, 1); 
        Item item2 = new Item(produto2, 2); //50 + (80*2) > 50 + 160 = 210
        
        //Criando uma lista para juntar os itens
        ArrayList<Item> itens = new ArrayList<>();
        
        //Adicionando os itens à lista criada
        itens.add(item1);
        itens.add(item2);    

        //Compras
        Compra compra1 = new Compra(1, itens); //Passando a lista como parâmetro, pois, no construtor de Compra, é necessário passar o id e os itens dela
        Compra compra2 = new Compra(2, itens);

        //Adicionando compras ao cliente respectivo
        cliente1.fazerCompras(compra1);

        System.out.println(cliente1.obterValorTotalGasto()); //Apenas o valor retornado pelo método
        System.out.println(cliente1.toString()); //Retorna o nome do cliente e o valor total da compra
    }
}
