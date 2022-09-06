public class Carro {
    
    //Atributos
    final int VELOCIDADE_MAXIMA;
    int velocidadeAtual = 0;
    private int delta = 5;

    //Construtor
    Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    //Método para acelerar o carro
    void acelerar(){
        if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }else{
            velocidadeAtual += getDelta();
        }
    }

    //Método para frear o carro
    void frear(){
        if(velocidadeAtual != 0){
            if(velocidadeAtual >= getDelta()){
                velocidadeAtual -= getDelta();
            }else{
                velocidadeAtual = 0;
            }
        }else{
            System.out.println("Carro parado");
        }
    }

    public int getVELOCIDADE_MAXIMA() {
        return VELOCIDADE_MAXIMA;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

}
