public class Carro {
    
    //Atributos
    int velocidadeAtual = 0;

    //Método para acelerar o carro
    void acelerar(){
        velocidadeAtual += 5;
    }

    //Método para frear o carro
    void frear(){
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
