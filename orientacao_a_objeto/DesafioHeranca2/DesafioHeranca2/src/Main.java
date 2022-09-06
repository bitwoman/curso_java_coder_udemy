public class Main {
    public static void main(String[] args) throws Exception {
       
        //Instancias das classes
        Civic carroCivic = new Civic();
        Ferrari carroFerrari = new Ferrari();
        
        //Setando uma velocidade
        carroCivic.velocidadeAtual = 50;
        carroFerrari.velocidadeAtual = 50;

        System.out.println("Civic está em " + carroCivic.velocidadeAtual + "km");
        System.out.println("Ferrari está em " + carroFerrari.velocidadeAtual + "km\n");
        
        carroCivic.acelerar(); //+5
        carroFerrari.acelerar(); //+15
        carroFerrari.ligarTurbo();

        System.out.println("Civic está em " + carroCivic.velocidadeAtual + "km");
        System.out.println("Ferrari está em " + carroFerrari.velocidadeAtual + "km\n");

        carroCivic.frear();
        carroFerrari.frear();

        System.out.println("Civic está em " + carroCivic.velocidadeAtual + "km");
        System.out.println("Ferrari está em " + carroFerrari.velocidadeAtual + "km\n");

        if(carroCivic.velocidadeAtual == carroFerrari.velocidadeAtual){
            System.out.println("Civic e Ferrari estão na mesma velocidade!");                                
        } else if(carroCivic.velocidadeAtual > carroFerrari.velocidadeAtual){
            System.out.println("Civic está a frente de Ferrari");
        }else{
            System.out.println("Ferrari está a frente de Civic");
        }

    }
}
