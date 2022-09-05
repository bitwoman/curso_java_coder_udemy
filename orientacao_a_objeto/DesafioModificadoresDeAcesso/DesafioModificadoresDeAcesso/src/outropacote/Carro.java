package outropacote;
public class Carro {
    
    //Atributos
    public final int VELOCIDADE_MAXIMA;
    public int velocidadeAtual;
    public int delta = 5;

    //Construtor
    protected Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    //Método para acelerar o carro
    public void acelerar(){
        if(velocidadeAtual + delta > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }else{
            velocidadeAtual += delta;
        }
    }

    //Método para frear o carro
    public void frear(){
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
