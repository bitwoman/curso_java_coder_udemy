import java.util.ArrayList;

public class Aluno {
    
    //Atributos (constantes)
    final String nomeAluno;
    final ArrayList<Curso> cursos = new ArrayList<>(); //Lista constante, é uma lista instanciada e aponta para um objeto na memória e não mudará o endereço (ou seja, por exemplo: alunos = new ArrayList<>(), não pode ser instanciado novamente)

    //Construtor
    Aluno(String nomeAluno){
        this.nomeAluno = nomeAluno;
    }

    //Método de relação bidirecional. Ele tanto adiciona um aluno a um curso, como um curso para um aluno
    void adicionarCurso(Curso curso){
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    //Método para retornar curso pela pesquisa
    Curso obterCursoPorNome(String cursoNome){

        for(Curso curso: this.cursos){
            if(curso.nomeCurso.equalsIgnoreCase(cursoNome)){
                return curso;
            }
        }
        return null;
    }

    //Retorna uma string da forma personalizada que você quiser
    public String toString() {
        return nomeAluno;
    }
    
}
