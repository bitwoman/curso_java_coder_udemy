
public class Julia {

	void testeAcessos() {
		
		Ana sogra = new Ana();
		
		System.out.println(sogra.segredo); //private - apenas a classe enxerga
		System.out.println(sogra.facoDentroDeCasa); //default ou pacote > dentro do pacote � poss�vel ver - n�o enxerga por ser outro pacote
		System.out.println(sogra.formaDeFalar); //protected -> pode ser vis�vel pela classe e via heran�a dentro do mesmo pacote. acessando a partir da heran�a, n�o � necess�rio usar a inst�ncia
		//n�o � poss�vel enxergar pois a classe n�o est� no mesmo pacote e nem herdou da classe Ana.
		
		System.out.println(sogra.todosSabem); //p�blico -> todos podem ver 
	}
}
