public class Main {
    public static void main(String[] args) throws Exception {
        
        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 10;

        //Exemplo Heroi j1 = new Heroi();
        //Exemplo Monstro j2 = new Monstro();
        Heroi heroi = new Heroi();
        heroi.x = 10;
        heroi.y = 11;

        // j1.andar(Direcao.NORTE);
        // j1.andar(Direcao.LESTE);
        // j1.andar(Direcao.NORTE);
        // j1.andar(Direcao.LESTE);

        System.out.println("Monstro tem => " + monstro.vida);
        System.out.println("Heroi tem => " + heroi.vida);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.andar(Direcao.NORTE);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("Monstro tem => " + monstro.vida);
        System.out.println("Heroi tem => " + heroi.vida);
    }
}
