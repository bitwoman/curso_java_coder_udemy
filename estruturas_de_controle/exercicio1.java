import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero = input.nextInt();

        if(numero >= 0 && numero <= 10){
            if(numero % 2 == 0){
                System.out.printf("%d está entre 0 e 10 e é par", numero);
            }else{
                System.out.printf("%d está entre 0 e 10 e não é par", numero);
            }
        }else{
            System.out.printf("%d não está entre 0 e 10", numero);
        }

        input.close();
    }
}
