import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos alunos? ");
        int qtdeAlunos = input.nextInt();

        System.out.println("Quantas notas por aluno? ");
        int qtdeNotasPorAluno = input.nextInt();

        double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotasPorAluno];

        for(int i=0; i<notasDaTurma.length; i++){
            for(int j=0; j<notasDaTurma[i].length; j++){
                
            }
        }


        input.close();
    }
}
