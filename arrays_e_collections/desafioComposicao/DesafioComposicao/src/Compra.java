import java.util.ArrayList;

public class Compra {

    //Atributos
    int idCompra;
    final ArrayList<Item> itens = new ArrayList<>();

    //Construtor
    Compra(int idCompra, ArrayList<Item> itens){
        this.idCompra = idCompra;
        this.itens = itens;
    }

    //Método para adicionar itens à compra
    void adicionarItem(Item item){ //o parâmetro pode ser Produto, e instanciar, dentro de itens.add(new Item)
        itens.add(item);
        // item.compra = this; //desta compra atual (referência)
    }

    //Método toString para retornar a compra
    @Override
    public String toString() {
        return "Compra [idCompra=" + idCompra + ", itens=" + itens + "]";
    }    
}
