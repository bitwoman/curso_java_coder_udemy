package outropacote;
public class Civic extends Carro {
    
    //Aqui faremos uma herança da Classe Carro, e Civic terá os mesmos atributos e métodos de Carro. Todavia, faremos a sobrecarga dos métodos de forma personalizada, pois Civic é
    // diferente de Ferrari e outros carros.

    //Construtor
    public Civic(){
        super(200);
    }

    //Método para acelerar o carro 
    public void acelerar(){
        velocidadeAtual += 5;
    }

    //Método para frear o carro
    public void frear(){
        if(velocidadeAtual != 0){
            if(velocidadeAtual >= 5){
                velocidadeAtual -= 5;
            }else{
                velocidadeAtual = 0;
            }
        }else{
            System.out.println("Carro parado");
        }
    }

}
