import java.util.ArrayList;

public class Cliente {

    //Atributos
    final String nomeCliente;
    final ArrayList<Compra> compras = new ArrayList<>(); //um cliente pode ter várias compras

    //Construtor com assinatura diferente da padrão
    Cliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }

    //Método para adicionar compras
    void fazerCompras(Compra compra){
        compras.add(compra);
    }

    //Método que retorna ao usuário o total que foi gasto
    double obterValorTotalGasto(){
        double valorTotal = 0;

        if(compras != null && !compras.isEmpty()){
            for(Compra compra: compras){
                for(Item item: compra.itens){
                    valorTotal += (item.quantidadeProduto * item.produto.precoProduto); 
                }
            }
        }
        return valorTotal;
    }

    //Método toString, que retorna o nome do cliente o quanto ele gastou
    @Override
    public String toString() {
        return "Cliente [" + nomeCliente + "]\n" + "Total gasto [R$ " + obterValorTotalGasto() + "]";
    }    
}
