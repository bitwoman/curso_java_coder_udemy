import java.util.ArrayList;

public class Curso {
    
    //Atributos
    final String nomeCurso;
    final ArrayList<Aluno> alunos = new ArrayList<>(); //Lista constante, é uma lista instanciada e aponta para um objeto na memória e não mudará o endereço (ou seja, por exemplo: cursos = new ArrayList<>(), não pode ser instanciado novamente)

    //Construtor
    Curso(String nomeCurso){
        this.nomeCurso = nomeCurso;
    }

    //Método de relação bidirecional. Ele tanto adiciona um aluno a um curso, como um curso para um aluno
    void adicionarAluno(Aluno aluno){
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }
}
