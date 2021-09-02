import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestandoRelacionamentoComColecoes {
    public static void main(String[] args) {
        Aluno alun1 = new Aluno(1, "aluno 1");
        Aluno alun2 = new Aluno(2, "aluno 2");
        Aluno alun3 = new Aluno(3, "aluno 3");
        Aluno alun4 = new Aluno(4, "aluno 4");
        Aluno alun5 = new Aluno(5, "aluno 5");

        Turma turma = new Turma("Turma 1");

        turma.adicionarAluno(alun1);
        turma.adicionarAluno(alun3);
        turma.adicionarAluno(alun5);
        turma.adicionarAluno(alun2);
        turma.adicionarAluno(alun4);

        System.out.println(turma);

        //Imprimindo uma unmodifiable list
        List<Aluno> alunos = new ArrayList<>(turma.getAlunos());
        alunos.sort((a1, a2) -> Integer.compare(a1.getCodigo(), a2.getCodigo()));

        System.out.println(alunos);

        //imprimindo ao contrário
        Collections.reverse(alunos);
        System.out.println(alunos);

        //embaralhar uma lista
        Collections.shuffle(alunos);
        System.out.println(alunos);


    }

}
