public class Ferrari extends Carro implements Esportivo, Luxo{
    
    private boolean ligarTurbo = false;
    private boolean ligarAr = false;

    //Aqui faremos uma herança da Classe Carro, e Ferrari terá os mesmos atributos e métodos de Carro. Todavia, faremos a sobrecarga dos métodos de forma personalizada, pois Ferrari é
    // diferente de Civic e outros carros.

    //Construtor
    Ferrari(){
        super(300);
        setDelta(15);
    }

    //Método para acelerar o carro 
     void acelerar(){
        velocidadeAtual += 15;
    }

    //Método para frear o carro
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

    //São públicos por padrão
    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false; 
    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr = false;
    }


    @Override
    public int getDelta() {
        if(ligarTurbo && !ligarAr){
            return 35;
        }else if(ligarTurbo && ligarAr){
            return 30;
        }else if(!ligarTurbo && !ligarAr){
            return 20;
        }else{
            return 15;
        }
    }
}
