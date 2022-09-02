public class Carro {
    
    //Atributos
    final int VELOCIDADE_MAXIMA;
    int velocidadeAtual = 0;
    int delta = 5;

    //Construtor
    Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    //Método para acelerar o carro
    void acelerar(){
        if(velocidadeAtual + delta > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }else{
            velocidadeAtual += delta;
        }
    }

    //Método para frear o carro
    void frear(){
        if(velocidadeAtual != 0){
            if(velocidadeAtual >= delta){
                velocidadeAtual -= delta;
            }else{
                velocidadeAtual = 0;
            }
        }else{
            System.out.println("Carro parado");
        }
    }

}
