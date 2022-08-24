import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        
        //Recebe dois tipos, como chave e valor
        Map<Integer,String> usuarios = new HashMap<>();

        //O put adiciona se não existir, e se já existe, ele substitui
        usuarios.put(1, "Brenda");
        usuarios.put(2, "Rogério");
        usuarios.put(3, "Rafaela");
        usuarios.put(4, "Rebeca");  

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());
        System.out.println(usuarios.keySet()); //retorna apenas as chaves
        System.out.println(usuarios.values()); //retorna apenas os valores
        System.out.println(usuarios.entrySet()); //retorna chave e valor
        System.out.println(usuarios.containsKey(20)); //retorna o valor de acordo com a chave passada por parâmetro
        System.out.println(usuarios.containsValue("Brenda")); //retorna a chave de acordo com o valor passada por parâmetro
        System.out.println(usuarios.get(1)); //retorna o valor de acordo com a chave passada por parâmetro

        //Percorrendo chaves
        for(int chave:usuarios.keySet()){
            System.out.println(chave);
        }

        //Percorrendo valores
        for(String valor:usuarios.values()){
            System.out.println(valor);
        }

        //Percorrendo chave e valor
        for(java.util.Map.Entry<Integer, String> registro: usuarios.entrySet()){
            System.out.println(registro.getKey() + " ==> " + registro.getValue());
        }

        //Removendo por chave, e chave e valor
        System.out.println(usuarios.remove(1));
        System.out.println(usuarios.remove(1, "Brenda"));
    }
}
