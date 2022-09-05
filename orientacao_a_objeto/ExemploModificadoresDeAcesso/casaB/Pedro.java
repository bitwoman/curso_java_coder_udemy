
public class Pedro extends Ana{
	
	void testeAcessos() {
	
		Ana mae = new Ana();
		
		System.out.println(mae.segredo); //private - apenas a classe enxerga
		System.out.println(mae.facoDentroDeCasa); //default ou pacote > dentro do pacote é possível ver - não enxerga por ser outro pacote
		System.out.println(formaDeFalar); //protected -> pode ser visível pela classe e via herança dentro do mesmo pacote. acessando a partir da herança, não é necessário usar a instância
		System.out.println(todosSabem); //público -> todos podem ver 
		
		//via herança pode ser acessado diretamente
	}

}
