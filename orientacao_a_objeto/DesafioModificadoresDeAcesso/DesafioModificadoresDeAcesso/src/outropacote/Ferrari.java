package outropacote;
public class Ferrari extends Carro {
    
    //Aqui faremos uma herança da Classe Carro, e Ferrari terá os mesmos atributos e métodos de Carro. Todavia, faremos a sobrecarga dos métodos de forma personalizada, pois Ferrari é
    // diferente de Civic e outros carros.

    //Construtor 
    public Ferrari(){
        this(315);
    }

    //Construtor
    public Ferrari(int velocidadeMaxima){
        super(300);
        delta = 350;
    }

    //Método para acelerar o carro 
     public void acelerar(){
        velocidadeAtual += 15;
    }

    //Método para frear o carro
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
