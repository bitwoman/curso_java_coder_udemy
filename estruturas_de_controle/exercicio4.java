import java.util.Scanner;

/*
 * 4. Criar um programa que receba um número e diga se ele é um número primo.
 */

public class exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero = input.nextInt();
        int contador = 0;

        for(int i = 2; i < numero-1; i++){
            if(numero % i == 0){
                contador++;
            }
        }

        if(contador > 0){
            System.out.printf("%d não é um número primo!", numero);
        } else{
            System.out.printf("%d é um número primo!");
        }

        input.close();
    }
}
