public class Jantar {
    public static void main(String[] args) {
        //Instância de Pessoa
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nomePessoa = "Brenda";
        pessoa1.pesoPessoa = 45.0;

        //Instância de Comida
        Comida comida1 = new Comida();
        comida1.nomeComida = "Lasanha";
        comida1.pesoComida = 1.0;
        
        //Mostrar peso anterior da pessoa
        System.out.printf("A %s pesa %.1f kg.", pessoa1.nomePessoa, pessoa1.pesoPessoa);

        pessoa1.comer(comida1); //Método (com um parâmetro) comer que aumenta o peso da pessoa

        //Peso atual depois de comer
        System.out.printf("\nA %s comeu %s e agora pesa %.1f kg.", pessoa1.nomePessoa, comida1.nomeComida, pessoa1.pesoPessoa);    
    }
}
