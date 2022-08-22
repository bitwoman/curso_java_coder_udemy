import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos alunos? ");
        int qtdeAlunos = input.nextInt();

        System.out.println("Quantas notas por aluno? ");
        int qtdeNotasPorAluno = input.nextInt();

        double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotasPorAluno];
        double total = 0;

        for(int a=0; a<notasDaTurma.length; a++){
            for(int n=0; n<notasDaTurma[a].length; n++){
                System.out.printf("Informe a nota %d do aluno %d: ", n+1, a+1);

                notasDaTurma[a][n] = input.nextDouble();
                total += notasDaTurma[a][n];
            }
        }

        double media = total/(qtdeAlunos * qtdeNotasPorAluno);
        System.out.printf("Média da turma: %.2f", media);

        input.close();
    }
}
