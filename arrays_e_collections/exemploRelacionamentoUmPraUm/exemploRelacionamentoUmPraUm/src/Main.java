public class Main {
    public static void main(String[] args) throws Exception {
        
        //Compor objetos por meio de outros objetos
        //Relação unidirecional
        Carro carro = new Carro();
        System.out.println(carro.estaLigado());

        carro.ligar();
        System.out.println(carro.estaLigado());

        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();

        System.out.println(carro.motor.giros());

        carro.frear();
        carro.frear();
        carro.frear();
        carro.frear();
        carro.frear();
        carro.frear();
        carro.frear();
        carro.frear();
        carro.frear();
        carro.frear();

        //Faltou encapsulamento
        // carro.motor.fatorInjecao = -30;

        //Relação bidirecional - mas não é necessário isso tudo. Só utiliza quando é necessário, o código precisa ser coerente.
        carro.motor.carro.motor.carro.motor.giros();

        System.out.println(carro.motor.giros());
    }
}
