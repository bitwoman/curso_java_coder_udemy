import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);    
        
        //Usuário informa quantas notas deseja informar
        System.out.println("Quantas notas você deseja digitar? ");
        int qtdeNotas = input.nextInt();
    
        //Criando o array (por default, os valores são inicializados com 0.0)
        double[] notasAluno = new double[qtdeNotas];

        //Percorrendo o Array para adicionar as notas
        for(int i=0; i<qtdeNotas; i++){
            System.out.printf("Digite a nota[%d]: ", i+1);
            notasAluno[i] = input.nextDouble();
        }

        //Para dar um espaço entre um print e outro
        System.out.println();

        //Total para realizar a média
        double totalNotas = 0, mediaAluno = 0;

         //Percorrendo o Array para apresentar as notas
        for(double nota:notasAluno){
            System.out.println("As notas são: " + nota);
            totalNotas += nota;
        }

        mediaAluno = totalNotas/qtdeNotas;

        System.out.printf("\nA média do aluno é: %.2f", mediaAluno);
        input.close();
    }
}
