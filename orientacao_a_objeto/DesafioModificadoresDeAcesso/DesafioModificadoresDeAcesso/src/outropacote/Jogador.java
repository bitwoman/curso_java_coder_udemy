package outropacote;
public class Jogador {
    
    //Atributos
    public int x, y;
    public int vida = 100;

    //Construtor
    protected Jogador(int x, int y){
        this.x = x;
        this.y = y;
    }

    //Método para o jogador atacar
    public boolean atacar(Jogador oponente){
        int deltaX = Math.abs(x - oponente.x); //valor absoluto, não importa se é positivo ou negativo
        int deltaY = Math.abs(y - oponente.y); //valor absoluto, não importa se é positivo ou negativo
        
        // se tem o mesmo X, ta na mesma coluna, e mesmo y é na mesma linha
        if(deltaX == 0 && deltaY ==1){
            oponente.vida -= 10;
            return true;
        }else if(deltaX == 1 && deltaY == 0){
            oponente.vida -= 10;
            return true;
        }else{
            return false;
        }        
    }

    //Método para o jogador andar
    public boolean andar(Direcao direcao){
       switch(direcao){
        case NORTE:
            y--;
            break;
        case LESTE:
            x++;
            break;
        case SUL:
            y++;
            break;
        case OESTE:
            x--;
            break;
       }
        return true;
    }

}
