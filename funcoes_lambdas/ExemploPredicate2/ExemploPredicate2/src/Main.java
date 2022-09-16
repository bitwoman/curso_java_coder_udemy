import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) throws Exception {
        
        //Predicado utilizando composição
        Predicate<Integer> isPar = numero -> numero % 2 == 0; //Verdadeiro
        Predicate<Integer> isTresDigitos = 
                numero -> numero >= 100 && numero <= 999; 


        System.out.println(isPar.and(isTresDigitos).test(122));
        System.out.println(isPar.or(isTresDigitos).test(122));
    }
}
