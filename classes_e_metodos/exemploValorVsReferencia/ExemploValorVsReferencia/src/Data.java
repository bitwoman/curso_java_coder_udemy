public class Data {
    //Atributos
    public int dia, mes, ano;

    //Construtor Default
    Data(){
        //dia = 01;
        //mes = 01;
        //ano = 1970;
        //this(1,1,1998); //pode ser usado como uma função. é como chamar o outro construtor
    }

    //Construtor personalizado - Assinaturas diferentes (esses parâmetros estão visíveis apenas dentro do escopo de construção do objeto)
    //a menos que você salve nas variáveis de instância
    Data(int dia, int mes, int ano){
        //this.dia = dia;
        //this.mes = mes;
        //this.ano = ano;
        this(); //ou dessa forma, que está chamando o primeiro construtor

        //o this pode ser utilizado para conflito de nome, caso sejam idênticos
        //ele referência a instância atual
    }

    //Método que pertence à instância. Então, também pode ser acessado a partir do this
    String getDataFormatada(){
        //não pode chamar o this dentro de um método, apenas no construtor
        String dataFormatada = String.format("%d/%d/%d", this.dia, mes, ano);

        return dataFormatada;
    }


    String getDataFormatada2(){
        final String formato = "%d/%d/%d"; //constante local, dentro do escopo do método
        String dataFormatada = String.format(formato, this.dia, mes, ano);

        return dataFormatada;
    }

    //Em um método estático, não é possível ser acessado através do this, pois o this é para instância, e o estático pertence à classe.
    static void teste(){
        //this.dia; - erro
    }
}

/* ##Comentário do professor na aula
 * Quando você define uma variável fora do método e dentro da classe ela pode ser uma variável de instância
 * e pode ser uma variável de classe N ou um membro estático ou um atributo estático ou um atributo de instância 
 * e a gente sabe que instância é sinônimo de objeto, então também posso dizer que um atributo
 * é objeto quando você define um valor variável dentro de um método, e a gente chama essa de variável
 *  local, pois se uma variável não constante proposta é variável de instância constante de instância variável 
 * de classe constante de classe contra mim posso ter uma variável local ou uma constante local o que vai definir o "final".
 */
