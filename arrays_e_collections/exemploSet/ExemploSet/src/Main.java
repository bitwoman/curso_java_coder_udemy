import java.util.HashSet;
import java.util.Set;

public class Main {

    //Para ignorar os warnings/avisos presentes no código (silencia)
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) throws Exception {
        
        //Conjunto Heterogeneo

        //Instanciando HashSet
        HashSet conjunto = new HashSet<>();

        conjunto.add(1.2); //ele converte esse tipo para um objeto Wrapper > Double
        conjunto.add(true); // > Boolean
        conjunto.add("Teste"); // > String
        conjunto.add(1); // > Integer
        conjunto.add('x'); // > String

        //Não aceita repetição
        conjunto.add('x');

        System.out.println("Tamanho é: " + conjunto.size());

        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.remove("x"));
        
        System.out.println("Tamanho é: " + conjunto.size());

        System.out.println(conjunto.contains('x'));
        System.out.println(conjunto.contains(1));
        System.out.println(conjunto.contains(false));
        System.out.println(conjunto.contains(true));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        conjunto.addAll(nums); //união entre dois conjuntos
        System.out.println(conjunto);

        conjunto.retainAll(nums); //Interseção entre dois conjuntos
        System.out.println(conjunto);

        //Limpa o conjunto inteiro
        conjunto.clear();
        System.out.println(conjunto);
    }
}
