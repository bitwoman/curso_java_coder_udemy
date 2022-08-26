import java.util.ArrayList;

public class Compra {

    //Atributos
    String nomeCliente;
    ArrayList<Item> itens = new ArrayList<>();

    //Relação bidirecional de forma consistente
    void adicionarItem(String nome, int quantidade, double preco){
        this.adicionarItem(new Item(nome, quantidade, preco));
     }

    void adicionarItem(Item item){
        itens.add(item);
        item.compra = this; //desta compra atual (referência)
    }

    //Método
    double obterValorTotal(){
        double total = 0;

        for(Item item:itens){
            total += item.quantidade * item.preco;
        }

        return total;
    }
}
