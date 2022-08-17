public class DataAtual {
    //Atributos
    public int dia, mes, ano;

    //Construtor Default
    DataAtual(){
        dia = 01;
        mes = 01;
        ano = 1970;
    }

    //Construtor personalizado - Assinaturas diferentes
    DataAtual(int diaAtual, int mesAtual, int anoAtual){
        dia = diaAtual;
        mes = mesAtual;
        ano = anoAtual;
    }

    //Método
    String getDataFormatada(){
        String dataFormatada = String.format("%d/%d/%d", dia, mes, ano);

        return dataFormatada;
    }
}
