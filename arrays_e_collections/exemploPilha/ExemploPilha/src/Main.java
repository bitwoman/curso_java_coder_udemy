import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Deque<String> livros = new ArrayDeque<>();
        livros.add("O Pequeno Príncipe");
        livros.push("Dom Quixote"); //
        livros.push("O Hobbit");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        System.out.println(livros.poll());
        System.out.println(livros.remove());
        System.out.println(livros.pop()); //também gera erro
    

        // livros.size();
        // livros.clear();
        // livros.contains();
        
    }
}
