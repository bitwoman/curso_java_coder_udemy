public class AreaCirculo {
    //Atributos
    double raio;
    final static double PI = 3.14; //pertence à classe e não à instância
    //final torna uma constante, não é possível alterar o valor 

    //Construtor com assinatura diferente do padrão
    AreaCirculo(double raioInicial){
        //pi = 3.14;
        raio = raioInicial;
    }

    //Método personalizado
    double area(){
        return PI * Math.pow(raio, 2); //pow é um método estático, acessado diretamente pela classe
    }

    //Método estático
    static double area(double raio){
        return PI * Math.pow(raio, 2); //pow é um método estático, acessado diretamente pela classe
    }
}
