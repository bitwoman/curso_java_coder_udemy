public class Usuario {
    
    //Atributos
    String nome;

    //Construtor
    Usuario(String nome){
        this.nome = nome;
    }

    //Método personalizado toString
    @Override
    public String toString() {
        return "Meu nome é " + this.nome + ".";
    }

    //Método hashCode
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    //Método hashCode
    // @Override
    // public int hashCode() {
    //     return this.nome.length();
    // }

    // //Método equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Usuario other = (Usuario) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

}
