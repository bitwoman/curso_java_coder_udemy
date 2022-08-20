public class Pessoa {
    //Atributos
    String nomePessoa;
    double pesoPessoa;

    //Construtor padrão
    Pessoa(String nomePessoa, double pesoComida){
        this.nomePessoa = nomePessoa;
        this.pesoPessoa = pesoComida;
    }
    
    //Método personalizado
    void comer(Comida alimento){
        pesoPessoa = pesoPessoa + alimento.pesoComida;
    }
}
