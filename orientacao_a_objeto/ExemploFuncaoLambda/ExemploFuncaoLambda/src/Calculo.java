
//Notation - interface funcional possui um único método
@FunctionalInterface
public interface Calculo {
    
    //public e abstract não é obrigatório colocar, porque ele já é por padrão
    double executar(double a, double b); 

    //método como default ainda será executado, pois, por padrão, o executar é abstrato
    default String legal(){
        return "legal";
    }

    //funciona da mesma forma para estático
    static String muitoLegal(){
        return "muito legal";
    }
}
