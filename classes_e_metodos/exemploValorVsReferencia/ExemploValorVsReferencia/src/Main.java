public class Main {
    public static void main(String[] args) throws Exception {
       
        double a = 2;
        double b = a; //Atribuição por valor, ou seja, uma cópia do valor de a para b

        a++;
        b--;

        System.out.println(a + " " + b);

        Data d1 = new Data(1,6,2022);
        Data d2 = d1; //Atribuição por referência, pois é um objeto. Se localizam em endereços diferentes, mas apontam para o mesmo endereço onde está o valor

        d1.dia = 31;
        d2.mes = 12;
        d1.ano = 2025;

        System.out.println(d1.getDataFormatada());
        System.out.println(d2.getDataFormatada());

        voltarDataParaValorPadrao(d1); //Quando você passa um objeto como parâmetro de um método, ele causa alteração no valor em que o endereço está apontando

        System.out.println(d1.getDataFormatada());
        System.out.println(d2.getDataFormatada());

        int c = 5;
        alterarPrimitivo(c); //é passado como uma cópia do valor que será criado na memória. não causa impacto fora, apenas no método
        System.out.println(c);
    }

    //Um método estático consegue acessar outro método estático
    static void voltarDataParaValorPadrao(Data d){
        d.dia = 31;
        d.mes = 12;
        d.ano = 2025;
    }

    static void alterarPrimitivo(int a){
        a++;
    }
}
