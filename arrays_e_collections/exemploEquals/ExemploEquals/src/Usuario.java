public class Usuario {
    
    //Atributos
    String nome, email;

    //Métodos personalizados: implementando equals()
    //Object é a classe mãe, tudo começa com ela.
    @Override
    public boolean equals(Object obj) {

        //Primeira forma
        Usuario usuario = (Usuario) obj; //Casting, convertendo um object para Usuario

        boolean nomeIgual = usuario.nome.equals(this.nome);
        boolean emailIgual = usuario.email.equals(this.email);

        return nomeIgual && emailIgual;

        // boolean nomeIgual = usuario.nome == this.nome; //não é uma boa prática
        // boolean emailIgual = usuario.email == this.email;

        //Segunda forma, mais segura
        
        // if(obj instanceof Usuario){
        //     Usuario usuario = (Usuario) obj; //Casting, convertendo um object para Usuario

        //     return super.equals(obj);
        // }else{
        //     return false;
        // }       
    }
}
