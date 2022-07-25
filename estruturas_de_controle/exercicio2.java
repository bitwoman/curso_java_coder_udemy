import java.util.Scanner;

/*
 * 2. Criar um programa informa se o ano atual é um ano bissexto;
 */

public class exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int ano = input.nextInt();

        if(ano % 4 == 0){
            if(ano % 100 == 0){
                if(ano % 400 == 0){
                    System.out.println("O ano é bissexto");    
                }else{
                    System.out.println("O ano não é um ano bissexto (tem 365 dias)");
                }
            }else{
                System.out.println("O ano é bissexto");
            }
        } else{
            System.out.println("O ano não é um ano bissexto (tem 365 dias)");
        }

        input.close();
    }
}
