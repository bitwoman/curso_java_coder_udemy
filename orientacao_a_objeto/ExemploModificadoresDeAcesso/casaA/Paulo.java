
public class Paulo {
	
	Ana esposa = new Ana();
	
	void testeAcessos() {
		
		System.out.println(esposa.segredo); //private - apenas a classe enxerga
		System.out.println(esposa.facoDentroDeCasa); //default ou pacote > dentro do pacote � poss�vel ver
		System.out.println(esposa.formaDeFalar); //protected -> pode ser vis�vel pela classe e via heran�a dentro do mesmo pacote
		System.out.println(esposa.todosSabem); //p�blico -> todos podem ver
		
	}

}
