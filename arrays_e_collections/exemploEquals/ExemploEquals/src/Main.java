public class Main {
    public static void main(String[] args) throws Exception {
        
        //Instanciando a classe Usuario
        Usuario user1 = new Usuario();
        user1.nome = "Pedro Silva";
        user1.email = "pedro.silva@ezemail.com";

        //Instanciando a classe Usuario novamente para a comparação com equals.
        Usuario user2 = new Usuario();
        user2.nome = "Pedro Silva";
        user2.email = "pedro.silva@ezemail.com";

        //Falso, pois são dois objetos distintos na memória. Compara endereço de memória
        System.out.println(user1 == user2);


        //Toda instância criada tem o equals à disposição
        //Sem implementação, será falso, pois fará o mesmo que ==
        System.out.println(user1.equals(user2));
        System.out.println(user2.equals(user1));


        //Retornará true, pois apontam para o mesmo local - mesmo objeto
        System.out.println(user1 == user1);
        System.out.println(user1.equals(user1));
    }
}
