import java.util.*;

public class TestandoHashSet {

    public static void main(String[] args) {
        Set<Aluno> alunos = new HashSet<>();

        Aluno alun1 = new Aluno(1, "aluno 1");
        Aluno alun2 = new Aluno(2, "aluno 2");
        Aluno alun3 = new Aluno(3, "aluno 3");
        Aluno alun4 = new Aluno(4, "aluno 4");
        Aluno alun5 = new Aluno(5, "aluno 5");

        alunos.add(alun1);
        alunos.add(alun2);
        alunos.add(alun3);
        alunos.add(alun4);
        alunos.add(alun5);


        System.out.println(alunos);

        //criar uma List de alunos e ordenar fazer oq ue quiser
        List<Aluno> alunosList = new ArrayList<>(alunos);

        System.out.println(alunos.contains(alun1));

    }

}
