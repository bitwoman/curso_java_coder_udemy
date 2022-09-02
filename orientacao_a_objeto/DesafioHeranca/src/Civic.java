public class Civic extends Carro {
    
    //Aqui faremos uma herança da Classe Carro, e Civic terá os mesmos atributos e métodos de Carro. Todavia, faremos a sobrecarga dos métodos de forma personalizada, pois Civic é
    // diferente de Ferrari e outros carros.

    //Método para acelerar o carro 
    void acelerar(){
        velocidadeAtual += 5;
    }

    //Método para frear o carro
    void frear(){
        if(velocidadeAtual != 0){
            velocidadeAtual -= 5;
        }else{
            System.out.println("Carro parado");
        }
    }

}
