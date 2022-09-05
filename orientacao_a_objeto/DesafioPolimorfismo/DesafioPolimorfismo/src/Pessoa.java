public class Pessoa {
    
    //Atributos
    private double peso;

    //Construtor
    public Pessoa(double peso) {
        setPeso(peso);
    }

    //Getters and Setters
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso >= 0){
            this.peso = peso;
        }
    }

    //Métodos personalizados de Setters
    public void comer(Comida comida){
        this.peso += comida.getPesoComida();
    }
}
