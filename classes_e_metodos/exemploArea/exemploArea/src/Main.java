public class Main {
    public static void main(String[] args) throws Exception {
        
        AreaCirculo a1 = new AreaCirculo(10);
        //a1.PI = 10;
        System.out.println(a1.area());

        AreaCirculo a2 = new AreaCirculo(5);
        //a2.PI = 5;
        System.out.println(a2.area());

        //Dá pra utilizar o método estático, ao invés de criar mais de 1a instância
        System.out.println(AreaCirculo.area(100));
    }
}
