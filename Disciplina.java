package parte1;

import java.awt.*;

public class Disciplina {

    private String nome,cargaH,professor;
    private Double preco;

    public Disciplina(String nome, String cargaH, String professor, Double preco) {
        this.nome = nome;
        this.cargaH = cargaH;
        this.professor = professor;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getCargaH() {
        return cargaH;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public void setCargaH(String cargaH) {
        this.cargaH = cargaH;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

}
