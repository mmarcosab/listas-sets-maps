import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestandoBuscaComMap {

    public static void main(String[] args) {

        Aluno alun1 = new Aluno(1, "aluno 1");
        Aluno alun2 = new Aluno(2, "aluno 2");
        Aluno alun3 = new Aluno(3, "aluno 3");
        Aluno alun4 = new Aluno(4, "aluno 4");
        Aluno alun5 = new Aluno(5, "aluno 5");


        Turma turma = new Turma("Turma 1");
        turma.adicionarAluno(alun1);
        turma.adicionarAluno(alun2);
        turma.adicionarAluno(alun3);
        turma.adicionarAluno(alun4);
        turma.adicionarAluno(alun5);

        //Verificar se o aluno esxiste usando um map que atribui um código de matricula a cada aluno
        System.out.println(turma.buscaMatriculaDoAluno(1));
        System.out.println(turma.buscaMatriculaDoAluno(7));

    }
}
