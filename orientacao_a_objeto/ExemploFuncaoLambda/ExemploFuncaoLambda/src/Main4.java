import java.util.function.BinaryOperator;

public class Main4 {
    
    public static void main(String[] args) {
        
        //Exemplo para mostrar que, neste caso, não seria necessário criar uma interface funcional
        //pois o java possui essa interface que pode ser utilizada


        //dá pra converter um double primitivo para Double classe
        
        //Especificar qual o tipo de parâmetro. não é possível usar tipo primitivo
        BinaryOperator<Double> calculo = (x,y) -> {return x + y;};
        System.out.println(calculo.apply(2.0, 3.0));
        
        //Como ambas implementam a interface, é possível usar o polimorfimso
        calculo = (x,y) -> {return x * y;};
        System.out.println(calculo.apply(2.0, 3.0));


        BinaryOperator<Integer> calculo2 = (x,y) -> {return x + y;};
        System.out.println(calculo2.apply(2, 3));
        
        //Como ambas implementam a interface, é possível usar o polimorfimso
        calculo = (x,y) -> {return x * y;};
        System.out.println(calculo2.apply(2, 3));
    }


}
