public class Main {
    public static void main(String[] args) throws Exception {
        
        String s1 = ""; //Válido
        System.out.println(s1.concat("!!!"));

        String s2;
        System.out.println(s2.concat("???")); //Erro de compilação, porque a variável não foi inicializada

        String s3 = null;
        System.out.println(s3.concat("...")); //Erro de execução, null pointer exception, não dá para apontar para algo não real na memória

        //Solução para não gerar erro de execução
        if(s3 == null){
            s3 = "deu certo!";
        }
        
        System.out.println(s3.concat("!!!!!"));
        //Erro de compilação não permite que seu código execute
    }
}
