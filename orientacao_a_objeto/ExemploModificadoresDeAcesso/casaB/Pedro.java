
public class Pedro extends Ana{
	
	void testeAcessos() {
	
		Ana mae = new Ana();
		
		System.out.println(mae.segredo); //private - apenas a classe enxerga
		System.out.println(mae.facoDentroDeCasa); //default ou pacote > dentro do pacote � poss�vel ver - n�o enxerga por ser outro pacote
		System.out.println(formaDeFalar); //protected -> pode ser vis�vel pela classe e via heran�a dentro do mesmo pacote. acessando a partir da heran�a, n�o � necess�rio usar a inst�ncia
		System.out.println(todosSabem); //p�blico -> todos podem ver 
		
		//via heran�a pode ser acessado diretamente
	}

}
