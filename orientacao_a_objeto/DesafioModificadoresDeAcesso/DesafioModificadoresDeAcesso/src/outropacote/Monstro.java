package outropacote;
public class Monstro extends Jogador{
    //extends significa reuso de código através da herança

    //Construtor
    public Monstro(){
        this(0,0);
    }

    public Monstro(int x, int y){
        super(x,y);
    }
}
