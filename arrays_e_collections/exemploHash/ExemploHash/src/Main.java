import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws Exception {
        
        HashSet<Usuario> usuarios = new HashSet<Usuario>();

        usuarios.add(new Usuario("Pedro"));
        usuarios.add(new Usuario("Ana"));
        usuarios.add(new Usuario("Guilherme"));

        //Busca de forma rápida e retorna true, pois o hashcode e o equals está implementado
        //Hashcode forma rápida de busca - Equals forma lenta de busca 
        boolean resultado = usuarios.contains(new Usuario("Guilherme"));
        System.out.println(resultado);
    }   
}
