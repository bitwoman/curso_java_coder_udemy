public class Main2 {
    public static void main(String[] args) {
        
        Calculo calculo = new Soma();
        System.out.println(calculo.executar(2, 3));
        
        //Como ambas implementam a interface, é possível usar o polimorfimso
        calculo = new Multiplicar();
        System.out.println(calculo.executar(2, 3));
        
    }
}
