import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) throws Exception {
        
        //mais reutilizavel
        BinaryOperator<Double> media = (n1, n2) -> (n1 + n2)/2; 
        System.out.println(media.apply(5.5, 8.0));

        //2 responsabilidades
        BiFunction<Double, Double, String> statusAluno =
                (n1, n2) -> (n1 + n2)/2 >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(statusAluno.apply(7.0, 5.5));

        //Composição de funções
        Function<Double, String> conceito = 
            m -> m >= 7 ? "Aprovado" : "Reprovado";

            System.out.println(media.andThen(conceito).apply(9.7, 4.1));
    }
}
