import java.util.function.Function;

public class Main {
    public static void main(String[] args) throws Exception {
        

        //Interface funcional (resulta em String)
        Function <Integer, String> parOuImpar =
            numero -> numero % 2 == 0 ? "Par" : "Ímpar";

        //Interface funcional - Resultado em String
        Function <String, String> oResultadoE =
            valor -> "O resultado é: " + valor;
    
        //Interface funcional - Resultado em String
        Function <String, String> empolgado =
            valor -> valor + "!!!";
        
        //Como os resultados são do mesmo tipo, não há erro. Composição de funções
        String resultadoFinal =  parOuImpar
                                .andThen(oResultadoE)
                                .andThen(empolgado)
                                .apply(32);

        System.out.println(resultadoFinal);

        //Resultado dela Function<Integer, String>
        System.out.println(parOuImpar.apply(33));
    }
}
