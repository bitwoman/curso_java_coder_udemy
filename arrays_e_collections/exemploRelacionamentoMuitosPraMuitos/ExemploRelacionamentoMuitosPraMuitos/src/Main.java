public class Main {
    public static void main(String[] args) throws Exception {
       
        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Pedro");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("Python Completo");
        Curso curso3 = new Curso("MySQL Completo");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);
        
        for(Aluno aluno: curso3.alunos){
            System.out.println("Estou matriculado no curso " + curso3.nomeCurso + "...");
            System.out.println("...e o meu nome é " + aluno.nomeAluno);
            System.out.println();
        }

        System.out.println(aluno1.cursos.get(0).alunos); //vai pegar todos os alunos do primeiro curso que o aluno1 está inscrito
    
        Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo");
        
        if(cursoEncontrado != null){
            System.out.println(cursoEncontrado.nomeCurso);
            System.out.println(cursoEncontrado.alunos);
        }
    }
}