import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
       
        ArrayList<Usuario> listaDeUsuarios = new ArrayList<>();

        Usuario usuario1 = new Usuario("Brenda");
        Usuario usuario2 = new Usuario("Nathalia");
        Usuario usuario3 = new Usuario("Monalisa");
        Usuario usuario4 = new Usuario("Eros");
        Usuario usuario5 = new Usuario("Fluff");

        listaDeUsuarios.add(usuario1);
        listaDeUsuarios.add(usuario2);
        listaDeUsuarios.add(usuario3);
        listaDeUsuarios.add(usuario4);
        listaDeUsuarios.add(usuario5);

        for(Usuario u: listaDeUsuarios){
            System.out.println(u.toString());
        }

        System.out.println(">>>> " + listaDeUsuarios.remove(1)); //Remover por índice, mostra na tela o valor removido

        //Sem o equals e o hashcode implementado, ele não pode buscar pois o objeto não está referenciado de fato - não tem endereço na memória
        System.out.println("Tem? " + listaDeUsuarios.contains(new Usuario("Lia")));
        System.out.println("Tem? " + listaDeUsuarios.contains(usuario1));


        //Dá pra pegar por índice
        System.out.println(listaDeUsuarios.get(3)); //acessa pelo índice
    }
}
