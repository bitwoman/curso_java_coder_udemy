public class Jantar {
    public static void main(String[] args) {
        //Instância de Pessoa
        Pessoa pessoa1 = new Pessoa("Nathxa", 45.0);

        //Instância de Comida
        Comida comida1 = new Comida("Lasanha", 1.0);
        
        //Mostrar peso anterior da pessoa
        System.out.printf("A %s pesava %.1f kg.", pessoa1.nomePessoa, pessoa1.pesoPessoa);

        pessoa1.comer(comida1); //Método (com um parâmetro) comer que aumenta o peso da pessoa

        //Peso atual depois de comer
        System.out.printf("\nA %s comeu %s e agora pesa %.1f kg.", pessoa1.nomePessoa, comida1.nomeComida, pessoa1.pesoPessoa);    
    }
}
