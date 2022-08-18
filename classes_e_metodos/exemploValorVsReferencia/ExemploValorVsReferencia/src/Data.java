public class Data {
    //Atributos
    public int dia, mes, ano;

    //Construtor Default
    Data(){
        dia = 01;
        mes = 01;
        ano = 1970;
    }

    //Construtor personalizado - Assinaturas diferentes
    Data(int diaAtual, int mesAtual, int anoAtual){
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
