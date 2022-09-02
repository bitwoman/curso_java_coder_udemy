public class Jogador {
    
    //Atributos
    int x, y, vida = 100;


    //Método para o jogador atacar
    boolean atacar(Jogador oponente){
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
    boolean andar(Direcao direcao){
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
