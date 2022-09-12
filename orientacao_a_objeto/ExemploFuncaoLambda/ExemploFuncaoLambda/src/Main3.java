public class Main3 {
    public static void main(String[] args) {
        
        //Forma mais extensa da função lambda
        Calculo calc = (x,y) -> {
            return x+y;
        };

        System.out.println(calc.executar(3, 4));

        //Forma mais enchuta da função lambda (existe um return implicitamente)
        Calculo multiplicacao = (x,y) -> x*y;
        System.out.println(multiplicacao.executar(1, 2));

        //É possível usar a mesma instancia
        calc = (x,y) -> x*y;
        System.out.println(calc.executar(5, 5)); 

    }
}
