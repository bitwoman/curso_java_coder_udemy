public class Motor {

    //Mas pode ser uma relação bidirecional
    final Carro carro;
    
    Motor(Carro carro){
        this.carro = carro;
    }

    //Atributos
    double fatorInjecao = 1;
    boolean ligado = false;

    //Método personalizado
    int giros(){
        if(!ligado){
            return 0;
        }else{
            return (int) Math.round(fatorInjecao * 300);
        }
    }
}
