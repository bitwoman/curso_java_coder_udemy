
public class Paulo {
	
	Ana esposa = new Ana();
	
	void testeAcessos() {
		
		System.out.println(esposa.segredo); //private - apenas a classe enxerga
		System.out.println(esposa.facoDentroDeCasa); //default ou pacote > dentro do pacote é possível ver
		System.out.println(esposa.formaDeFalar); //protected -> pode ser visível pela classe e via herança dentro do mesmo pacote
		System.out.println(esposa.todosSabem); //público -> todos podem ver
		
	}

}
