package ProjetoJava.src;

public class Main {
    public static void main(String[] args) {
        
        //Construtor padrão
        DataAtual dataConstrutor1 = new DataAtual();
        
        //dataDeHoje.dia = 02;
        //dataDeHoje.mes = 07;
        //dataDeHoje.ano = 2022;

        //Construtor personalizado
        DataAtual dataConstrutor2 = new DataAtual(24, 11, 1998);
        
        System.out.println(dataConstrutor1.getDataFormatada());
        System.out.println(dataConstrutor2.getDataFormatada());
    }
}
