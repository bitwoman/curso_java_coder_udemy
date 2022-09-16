import java.util.Arrays;
import java.util.List;

import javax.swing.event.SwingPropertyChangeSupport;

public class Main {
    public static void main(String[] args) throws Exception {
        
        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
    

        System.out.println("Forma tradicional do Foreach: ");
        
        for(String nome: aprovados){
            System.out.println(nome);
        }

        System.out.println("\nForma Lambda Foreach #01: ");
        aprovados.forEach(nome -> System.out.println(nome + "!!!"));
        
        System.out.println("\nForma Lambda Foreach #02: ");
        aprovados.forEach(nome -> meuImprimir(nome));

        System.out.println("\nMethod Reference... #01");
        aprovados.forEach(System.out::println);


        System.out.println("\nMethod Reference... #02");
        aprovados.forEach(Main::meuImprimir);
    }   

    //Função personalizada dentro do lambda
    static void meuImprimir(String nome){
        System.out.println("Meu nome é " + nome);
    }

}
