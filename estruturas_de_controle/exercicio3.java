import java.util.Scanner;

/*
 * 3. Criar um programa que receba duas notas parciais, calcular a média final. 
 * Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", 
 * se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação", 
 * caso contrário imprime no console "Reprovado".
 */

public class exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double nota1 = input.nextDouble();
        double nota2 = input.nextDouble();
        double mediaAluno = (nota1+nota2)/2;

        if(mediaAluno >= 7.0){
            System.out.println("Aprovado");
        }else if(mediaAluno < 7.0 && mediaAluno > 4.0){
            System.out.println("Recuperação");
        } else{
            System.out.println("Reprovado");
        }

        input.close();
    }
}
