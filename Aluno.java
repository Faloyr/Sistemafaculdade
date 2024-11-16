package parte1;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private String matricula;
    private String Nome;
    private Curso Curso;
    private String Endereco;
    private List<String> Contato = new ArrayList<String>();
    private String Cpf;

    public Aluno(String nome,String cpf,Curso Curso,String Endereco,String Contato,String matricula){

        this.Nome =nome;
        this.Cpf = cpf;
        this.Endereco = Endereco;
        this.Contato.add(Contato);
        this.Curso = Curso;
        this.matricula = matricula;
    }

    public void setCurso(Curso curso) {
        Curso = curso;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public void setContato(String contato) {
        this.Contato.add(contato);
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return Nome;
    }

    public Curso getCurso() {
        return Curso;
    }

    public String getEndereco() {
        return Endereco;
    }

    public List<String> getContato() {
        return Contato;
    }

    public String getCpf() {
        return Cpf;
    }
}
