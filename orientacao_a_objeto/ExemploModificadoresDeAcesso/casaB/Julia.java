
public class Julia {

	void testeAcessos() {
		
		Ana sogra = new Ana();
		
		System.out.println(sogra.segredo); //private - apenas a classe enxerga
		System.out.println(sogra.facoDentroDeCasa); //default ou pacote > dentro do pacote é possível ver - não enxerga por ser outro pacote
		System.out.println(sogra.formaDeFalar); //protected -> pode ser visível pela classe e via herança dentro do mesmo pacote. acessando a partir da herança, não é necessário usar a instância
		//não é possível enxergar pois a classe não está no mesmo pacote e nem herdou da classe Ana.
		
		System.out.println(sogra.todosSabem); //público -> todos podem ver 
	}
}
