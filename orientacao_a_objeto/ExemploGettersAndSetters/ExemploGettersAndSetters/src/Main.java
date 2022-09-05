public class Main {
    public static void main(String[] args) throws Exception {
        
        //Controle de atributos/variáveis

        Pessoa p1 = new Pessoa("Brenda", "Leite", 30);
        // p1.idade = -30; //a variável em modo público, é exposta, e qualquer um pode alterá-la indevidamente. Acessada diretamente
        p1.setIdade(30);


        System.out.println(p1.getIdade()); //método de leitura
        System.out.println(p1); //método toString
        System.out.println(p1.getNomeCompleto()); //Get personalizado
    }
}
