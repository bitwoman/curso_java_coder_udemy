public class Main {
    public static void main(String[] args) throws Exception {
        //Instância de compra
        Compra compra1 = new Compra();
        compra1.nomeCliente = "Brenda";

        //Não acessando a classe diretamente, através de método
        compra1.adicionarItem(new Item("Caneta", 20, 7.00));
        compra1.adicionarItem(new Item("Caderno", 20, 7.00));
        compra1.adicionarItem(new Item("Borracha", 20, 7.00));

        System.out.println(compra1.itens.size());
        System.out.println(compra1.obterValorTotal());

        //Bidireção
        double total = compra1.itens.get(0).compra.obterValorTotal();
        System.out.println("O total é: " + total);
    }
}
