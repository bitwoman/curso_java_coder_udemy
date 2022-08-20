import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
       
        //Array é um objeto

        //Atributos
        double[] notasAlunoA = new double[4]; 
        //Outros exemplos:
        //double [] notasAlunoA = new double[3];
        //double notasAlunoA[] = new double[3];

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 9.7;
        
        //Usar classe Arrays para mostrar na tela os valores
        System.out.println(Arrays.toString(notasAlunoA));

        double totalAlunoA = 0;

        //Para percorrer o array
        for(int i=0; i<notasAlunoA.length; i++){
            totalAlunoA += notasAlunoA[i];
        }

        System.out.println(totalAlunoA/notasAlunoA.length); //double/inteiro é sempre double


        //Outra forma de inicializar o array - valores literais
        double[] notasAlunoB = {6.9, 8.9, 5.5, 10}; //o 10 será convertido para double. 10.0
        //menos comum os dados fixos dessa forma

        double totalAlunoB = 0;

        for(int i=0; i<notasAlunoB.length; i++){
            totalAlunoB += notasAlunoB[i];
        }

        System.out.println(totalAlunoB/notasAlunoB.length);
    }
}
