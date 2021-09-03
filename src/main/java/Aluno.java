import java.util.Objects;

public class Aluno {
    private int codigo;
    private String nome;

    public Aluno(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Aluno() {
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Aluno aluno = (Aluno) o;
        return this.nome.equals(nome);
    }

    public boolean equalsByNome(String nome) {
        return this.nome.equals(nome);
    }


    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }
}
