import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) throws Exception {
       
        //Interface bem simples
        //Supplier -> fornece algo, mas não recebe parâmetro
        //Pode retornar qualquer tipo
        Supplier<List<String>> umaLista = 
            () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
        //quando não tem parâmetro ou 2+, é obrigatório colocar o parenteses 

        System.out.println(umaLista.get());
    }
}
