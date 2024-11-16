package parte1;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private  String nome;
    private String turno;
    private  String periodos;
    private Double preco;
    private List<Disciplina> Disciplinas = new ArrayList<>();

    public Curso(String nome,String turno,String periodo,List<Disciplina> Disciplinas){

        this.nome = nome;
        this.turno = turno;
        this.periodos = periodo;
        this.Disciplinas = Disciplinas;


    }


    public String getNome() {
        return nome;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getPeriodos() {
        return periodos;
    }

    public Double getPreco() {
        return preco;
    }

    public void setDisciplina(Disciplina disciplina){
        this.Disciplinas.add(disciplina);
    }

    public void removeDisciplina(Disciplina disciplina){

        Disciplina a  = Disciplinas.stream().filter(c -> c.getNome().equals(disciplina.getNome())).findFirst().orElse(null);

        if(a != null){
            Disciplinas.remove(a);
            System.out.println("Disciplina removida com sucesso.");
        }
        else{
            System.out.println("Disciplina nao encontrada.");
        }

    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public List<Disciplina> getDisciplinas() {
        return Disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        Disciplinas = disciplinas;
    }
}
