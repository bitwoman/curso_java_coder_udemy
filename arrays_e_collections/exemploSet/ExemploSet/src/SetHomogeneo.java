import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetHomogeneo {
    public static void main(String[] args) {
        
        //Generics

        Set<String> listaSet = new HashSet<String>(); //não é necessário esse segundo, chamado diamond <>, pode ficar vazio
        listaSet.add("Ana"); //Ele só aceitará String, pois foi especificado o valor no momento de instanciação
        listaSet.add("Carlos");
        listaSet.add("Luca");
        listaSet.add("Pedro");

        for(String candidato:listaSet){
            System.out.println(candidato);
        }

        //SortedSet também faz parte, e tem ordenação

        //TreeSet garante a ordem de inserção dos dados
        Set<String> listaTreeSet = new TreeSet<>();

        for(String candidato:listaTreeSet){
            System.out.println(candidato);
        }


        //Exemplo com inteiro
        Set<Integer> numeros = new HashSet<>(); //não é necessário esse segundo, chamado diamond <>, pode ficar vazio
        numeros.add(1); //Ele só aceitará Integer, pois foi especificado o valor no momento de instanciação
        numeros.add(2);
        numeros.add(120);
        numeros.add(6);

        for(int n: numeros){
            System.out.println(n);
        }
    }
}
