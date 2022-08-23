import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws Exception {
        
        //Instanciando fila
        Queue<String> fila = new LinkedList<>();
        
        //Offer e Addd > adicionam elementos na fila
        //A diferença é o comportamento quando a fila está cheia
        fila.add("Ana"); //diferença: dá pra determinar o tamanho da fila, retorna um erro
        fila.offer("Carlos");  //retorna falso se não cabe mais objetos
        fila.offer("Daniel");
        fila.offer("Daniel");
        fila.offer("Rafaela");
        fila.offer("Gui");

        //Peek e Element obteem o próximo elemento da fila (sem remover).
        System.out.println(fila.peek()); //se não há nada na fila, retorna null
        System.out.println(fila.peek());
        System.out.println(fila.element()); //se não há nada na fila, retorna um erro de exceção
    
        //OUTROS MÉTODOS:
        // fila.size();
        // fila.clear();
        // fila.isEmpty();
        //fila.contains();

        System.out.println(fila.poll()); //ele obtém e remove o próximo elemento, e retorna null se não houver mais nada na fila
        System.out.println(fila.remove()); //ele obtém e remove o próximo elemento, e retorna erro de exceção se não houver mais nada na fila
    }
}
