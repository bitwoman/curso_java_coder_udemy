public class Pessoa {
    //Atributos
    private int idade; //acessado dentro da própria classe
    private String nome;
    private String sobrenome;
    
    //Construtor
    public Pessoa(String nome, String sobrenome, int idade){
        setNome(nome);
        setSobrenome(sobrenome);
        setIdade(idade);
    }

    //Método Get
    public int getIdade(){
        return idade; 
    }

    //Método Set
    public void setIdade(int novaIdade){

        novaIdade = Math.abs(novaIdade); //valor negativo passa a ser positivo

        if(novaIdade >= 0 && novaIdade <=120){
            this.idade = novaIdade;
        } 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa [idade=" + getIdade() + ", nome=" + getNome() + "]";
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }


    //Possível criar um método get personalizado, sem necessariamente ter um atributo. Chamado de atributo calculado
    public String getNomeCompleto(){
        return getNome() + " " + getSobrenome();
    }

}
