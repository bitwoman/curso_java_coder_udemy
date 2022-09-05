package outropacote;
public class Heroi extends Jogador {
    //extends significa reuso de código através da herança


    public Heroi(int x, int y){
        super(x,y);
    }

    //Sobrescrevi o código que está na classe pai Jogador
    //Método para o jogador atacar
    @Override
    public boolean atacar(Jogador oponente){
        int deltaX = Math.abs(x - oponente.x); //valor absoluto, não importa se é positivo ou negativo
        int deltaY = Math.abs(y - oponente.y); //valor absoluto, não importa se é positivo ou negativo
        
        // se tem o mesmo X, ta na mesma coluna, e mesmo y é na mesma linha
        if(deltaX == 0 && deltaY ==1){
            oponente.vida -= 20;
            return true;
        }else if(deltaX == 1 && deltaY == 0){
            oponente.vida -= 10;
            return true;
        }else{
            return false;
        }        
    }

    //Ou, chamar a super classe
    // boolean atacar(Jogador oponente){
    //     boolean ataque1 = super.atacar(oponente);
    //     boolean ataque2 = super.atacar(oponente);
    //     return ataque1 || ataque2;
    // }
}
