import java.util.*;

public class Turma {

    private String nome;
    private List<Aluno> alunos;
    private Map<Integer, Aluno> mapAlunos = new HashMap<>();

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
        mapAlunos.put(aluno.getCodigo(), aluno);
    }


    public Aluno buscaMatriculaDoAluno(Integer numeroMatricula){
        //tratar e lançar excecao de null aqui, uma boa pratica
        return mapAlunos.get(numeroMatricula);
    }

    @Override
    public String toString() {
        return "Turma{" +
                "nome='" + nome + '\'' +
                ", alunos=" + alunos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Turma turma = (Turma) o;
        return Objects.equals(nome, turma.nome) && Objects.equals(alunos, turma.alunos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, alunos);
    }
}
