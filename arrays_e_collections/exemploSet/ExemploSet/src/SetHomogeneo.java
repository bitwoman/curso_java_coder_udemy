import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetHomogeneo {
    public static void main(String[] args) {
        
        Set<String> listaSet = new HashSet<String>(); //não é necessário esse segundo, chamado diamond <>, pode ficar vazio
        listaSet.add("Ana"); //Ele só aceitará String, pois foi especificado o valor no momento de instanciação
        listaSet.add("Carlos");
        listaSet.add("Luca");
        listaSet.add("Pedro");

        for(String candidato:listaSet){
            System.out.println(candidato);
        }

        //Sortedset também faz parte, e tem ordenação

        //TreeSet garante a ordem de inserção dos dados
        Set<String> listaTreeSet = new TreeSet<>();

        for(String candidato:listaTreeSet){
            System.out.println(candidato);
        }
    }
}
