public class Produto {
	String nome;
	double preco;
	static double desconto = 0;.25;
	
	//valor padr�o 0.25

	//Construtor padr�o
	Produto(){
		
	}
	
	//Construtor personalizado
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
	}
	
	
	//M�todos
	double precoComDesconto() {
		return preco * (1-desconto);
	}
	
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1-desconto + descontoDoGerente);
	}
}
    