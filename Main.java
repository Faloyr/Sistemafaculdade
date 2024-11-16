package parte1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Main {

    public static int ContadorMatricula=1;
    public static  List<Aluno> Alunos = new ArrayList<>();
    public static   List<Disciplina> Disciplinas = new ArrayList<>();
    public static  List<Curso> Cursos = new ArrayList<>();

    public static void main(String[] args) {

        menuprincipal();

    }


    static void menuprincipal() {
        boolean verificar = true;
        int escolha;
        while (verificar) {
            System.out.println("1- Gerenciar Alunos ");
            System.out.println("2- Gerenciar Disciplinas ");
            System.out.println("3- Gerenciar Cursos ");
            System.out.println("4- Sair");
            escolha = lerint();

            switch (escolha) {
                case 1:
                    menuAluno();
                    break;
                case 2:
                    menuDisciplinas();
                    break;
                case 3:
                    menuCursos();
                    break;
                case 4:
                    verificar = false;
                    break;
                default:
                    System.out.println("Escolha uma das opções.");
            }
        }
    }

    static void menuAluno() {
        boolean verificar = true;
        int escolha;
        while (verificar) {
            System.out.println("1-Cadastrar ALUNO ");
            System.out.println("2-Consultar ALUNO ");
            System.out.println("3-Remover ALUNO");
            System.out.println("4-Atualizar ALUNO");
            System.out.println("5-Voltar ao MENU INICIAL");
            escolha = lerint();

            switch (escolha) {
                case 1:
                    CadastroAluno();
                    break;
                case 2:
                    ConsultarAluno();
                    break;
                case 3:
                    RemoverAluno();
                    break;
                case 4:
                    AtualizarAluno();
                    break;
                case 5:
                    verificar = false;
                    break;
                default:
                    System.out.println("Escolha uma das opções.");
            }
        }
    }

    static void menuDisciplinas() {
        boolean verificar = true;
        int escolha;
        while (verificar) {
            System.out.println("1-Cadastrar DISCIPLINA ");
            System.out.println("2-Consultar DISCIPLINA ");
            System.out.println("3-Remover DISCIPLINA");
            System.out.println("4-Atualizar DISCIPLINA");
            System.out.println("5-Voltar ao MENU INICIAL");
            escolha = lerint();

            switch (escolha) {
                case 1:
                    CadastroDisciplina();
                    break;
                case 2:
                    ConsultarDisciplina();
                    break;
                case 3:
                    RemoverDisciplina();
                    break;
                case 4:
                    AtualizarDisciplina();
                    break;
                case 5:
                    verificar = false;
                    break;
                default:
                    System.out.println("Escolha uma das opções.");
            }
        }
    }

    static void menuCursos() {
        boolean verificar = true;
        int escolha;
        while (verificar) {
            System.out.println("1-Cadastrar CURSO ");
            System.out.println("2-Consultar CURSO ");
            System.out.println("3-Remover CURSO");
            System.out.println("4-Atualizar CURSO");
            System.out.println("5-Voltar ao MENU INICIAL");
            escolha = lerint();

            switch (escolha) {
                case 1:
                    CadastroCurso();
                    break;
                case 2:
                    ConsultarCurso();
                    break;
                case 3:
                    RemoverCurso();
                    break;
                case 4:
                    AtualizarCurso();
                    break;
                case 5:
                    verificar = false;
                    break;
                default:
                    System.out.println("Escolha uma das opções.");
            }
        }
    }


    static void CadastroAluno(){

        if(Cursos.isEmpty()){
            System.out.println("Crie um curso antes de cadastrar um aluno");
            CadastroCurso();

        }

        System.out.println("Digite o nome do aluno: ");
        String nome = ler();
        System.out.println("Digite o cpf do aluno: ");
        String cpf = ler();
        System.out.println("Digite o endereço do aluno: ");
        String Endereco = ler();
        System.out.println("Digite um contato para a lista de contatos: ");
        String Contato =  ler();

        System.out.println("Selecione o curso desejado: ");
        int percorrer = 0;
        for (Curso a : Cursos
        ) {
            System.out.println(percorrer++ +"- " + a.getNome());
        }

        int cursodesejado = lerint();

        String matricula = ""+ ContadorMatricula++;
        Aluno a = new Aluno(nome,cpf,Cursos.get(cursodesejado),Endereco,Contato,matricula);
        Alunos.add(a);
        System.out.println("Aluno criado com sucesso:");
        System.out.println("Nome: " + a.getNome());
        System.out.println("Matricula: " + a.getMatricula());
        System.out.println("Curso: " +a.getCurso().getNome());

    }
    static void CadastroCurso(){

        if(Disciplinas.isEmpty()){
            System.out.println("Crie uma Disciplina antes de cadastrar um curso");
            CadastroDisciplina();

        }

        System.out.println("Digite o nome do Curso: ");
        String nomeC = ler();
        System.out.println("Digite o turno do curso: ");
        String turno = ler();
        System.out.println("Digite quantos periodos tera este curso: ");
        String periodo = ler();
        List<Disciplina> DisciplinasCurso = new ArrayList<>();
        int sair=1;
        while(sair !=77) {
            int percorrer = 0;
            System.out.println("Selecione uma disciplina que o seu curso tera: (77 para sair) ");
            for (Disciplina a : Disciplinas
            ) {
                System.out.println(percorrer++ +"- "+ a.getNome());
            }
            System.out.println("77- sair;");
            sair = lerint();
            if(sair != 77){
                DisciplinasCurso.add(Disciplinas.get(sair));
                System.out.println("Disciplina adicionado com sucesso.");
            }

        }
        Curso a = new Curso(nomeC,turno,periodo,DisciplinasCurso);
        Cursos.add(a);

        System.out.println("Curso criado com sucesso:");
        System.out.println("Nome: " + a.getNome());
        System.out.println("Periodos: " + a.getPeriodos());
        System.out.println("Turno: " +a.getTurno());


    }
    static void CadastroDisciplina(){

        System.out.println("Digite o nome da disciplina: ");
        String nome = ler();
        System.out.println("Digite a carga horaria da disciplina: ");
        String ch = ler();
        System.out.println("Digite o professor que ira ditar esta disciplina: ");
        String professor = ler();
        System.out.println("Digite o preco da disciplina: ");
        double preco = lerdouble();

        Disciplina a = new Disciplina(nome,ch,professor,preco);
        Disciplinas.add(a);
    }
    static Aluno ConsultarAluno(){

        System.out.print("Informe o Cpf do Aluno desejado: ");
        String Cpf = ler();

        Aluno aluno = Alunos.stream().filter(c -> c.getCpf().equals(Cpf)).findFirst().orElse(null);

        if (aluno != null) {

            System.out.println("Aluno encontrado: " + aluno.getNome());
            System.out.println("Matricula: " + aluno.getMatricula() );
            System.out.println("CPF: " + aluno.getCpf());

        } else {
            System.out.println("Aluno não encontrado");
            ConsultarAluno();
        }
        return aluno;

    }
    static Disciplina ConsultarDisciplina(){


        System.out.print("Informe o nome da disciplina desejada: ");
        String nome = ler();

        Disciplina disciplina = Disciplinas.stream().filter(c -> c.getNome().equals(nome)).findFirst().orElse(null);

        if (disciplina != null) {

            System.out.println("Disciplina encontrada " + disciplina.getNome());


        } else {
            System.out.println("Disciplina não encontrada");
            ConsultarDisciplina();
        }
        return disciplina;

    }
    static Curso ConsultarCurso(){

        System.out.print("Informe o nome do Curso desejado: ");
        String nome = ler();

        Curso curso = Cursos.stream().filter(c -> c.getNome().equals(nome)).findFirst().orElse(null);

        if (curso != null) {

            System.out.println("Disciplina encontrada " + curso.getNome());

        } else {
            System.out.println("Disciplina não encontrada");
            ConsultarCurso();
        }
        return curso;

    }

    static void RemoverAluno(){

       Aluno a = ConsultarAluno();

       if(a != null) {
           Alunos.remove(a);
           System.out.println("Aluno removido com sucesso");
       }
       else
       {
           ConsultarAluno();
       }
    }
    static void RemoverDisciplina(){

        Disciplina a = ConsultarDisciplina();

        if(a != null) {
            Disciplinas.remove(a);
            System.out.println("Disciplina removida com sucesso");
        }
        else
        {
            ConsultarDisciplina();
        }

    }
    static void RemoverCurso(){

        Curso a = ConsultarCurso();

        if(a != null) {
            Cursos.remove(a);
            System.out.println("Curso removido com sucesso");
        }
        else
        {
            ConsultarCurso();
        }

    }

    static void AtualizarAluno() {
        Aluno aluno = ConsultarAluno();
        System.out.println("1- Para atualizar o curso do Aluno");
        System.out.println("2- Para atualizar os contatos do Aluno");
        System.out.println("3- Para atualizar o endereco do Aluno");
        int escolha = lerint();

        switch (escolha) {
            case 1:
                Curso a = ConsultarCurso();
                if (a != null) {
                    aluno.setCurso(a);
                    System.out.println("Curso de aluno alterado com sucesso");
                }
                break;
            case 2:
                System.out.println("Informe o novo contato: ");
                aluno.setContato(ler());
                break;
            case 3:
                System.out.println("Informe o novo endereco: ");
                aluno.setEndereco(ler());
                break;
            default:
                System.out.println("Escolha uma das opções.");
        }
    }
    static void AtualizarDisciplina() {
        Disciplina disciplina = ConsultarDisciplina();
        System.out.println("1- Para atualizar A carga horaria da Disciplina");
        System.out.println("2- Para atualizar o professor da Disciplina");
        System.out.println("3- Para atualizar o preco da Disciplina");
        int escolha = lerint();

        switch (escolha) {
            case 1:
                System.out.println("Informe a nova carga horaria: ");
                disciplina.setCargaH(ler());
                break;
            case 2:
                System.out.println("Informe o nome do novo professor: ");
                disciplina.setProfessor(ler());
                break;
            case 3:
                System.out.println("Informe o novo preco: ");
                disciplina.setPreco(lerdouble());
                break;
            default:
                System.out.println("Escolha uma das opções.");
        }
    }
    static void AtualizarCurso() {
        Curso a = ConsultarCurso();
        System.out.println("1- Para remover uma Disciplina do curso");
        System.out.println("2- Para adicionar uma Disciplina ao curso");
        System.out.println("3- Para atualizar o preco do Curso");
        int escolha = lerint();

        switch (escolha) {
            case 1:
                Disciplina disciplina = ConsultarDisciplina();
                a.removeDisciplina(disciplina);
                break;
            case 2:
                disciplina = ConsultarDisciplina();
                if (disciplina != null) {
                    System.out.println("Disciplina adicionada com sucesso ao curso");
                    a.setDisciplina(disciplina);
                }
                break;
            case 3:
                System.out.println("Informe o novo preco: ");
                a.setPreco(lerdouble());
                break;
            default:
                System.out.println("Escolha uma das opções.");
        }
    }



    static String ler(){

        Scanner Ler = new Scanner(System.in);
        return Ler.nextLine();
    }
    static int lerint(){
        return parseInt(ler());
    }
    static double lerdouble(){

        return   parseDouble(ler());
    }
}
