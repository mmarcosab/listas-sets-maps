import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Turma {

    private String nome;
    private List<Aluno> alunos;

    public Turma(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        //Aqui vira readonly
        return Collections.unmodifiableList(alunos);
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    //disponibilizar esse metodo para adicionar
    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }


    @Override
    public String toString() {
        return "Turma{" +
                "nome='" + nome + '\'' +
                ", alunos=" + alunos +
                '}';
    }
}
