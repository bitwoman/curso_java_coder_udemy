public class Main {

    int a = 3; //atributo de instância
    public static void main(String[] args) throws Exception {
        
        Main m2 = new Main(); //Para que um atributo de instância seja acessado em um método estático, é necessário que seja criada uma nova instância da mesma classe
        System.out.println(m2.a);
    }
}
