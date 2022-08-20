public class Pessoa {
    //Atributos
    String nomePessoa;
    double pesoPessoa;

    //Construtor padrão
    Pessoa(){

    }
    
    //Método personalizado
    void comer(Comida alimento){
        pesoPessoa = pesoPessoa + alimento.pesoComida;
    }
}
