public abstract class Animal {
    
    //Só é possível ter métodos abstratos se a classe for abstrata

    public String respirar(){
        return "CO2";
    }

    public abstract String mover();
}
