package questao2;

import java.util.ArrayList;

public class Curso {
	
    private String nome;
    private String codigo_curso;
    private Integer horarios_curso;
    private Disciplina disciplina;
    private ArrayList<Aluno> lista_alunos_no_curso = new ArrayList<Aluno>();
    private ArrayList<String> lista_horarios_curso = new ArrayList<String>();
    private ArrayList<Disciplina> lista_disciplina_no_curso = new ArrayList<Disciplina>();

    public Curso (String nome) {
            this.nome = nome;
            codigo_curso = nome.toUpperCase().substring(0, 2);
    }
    
    public String NomeCurso (){
        return this.nome;
    }

    public void AdicionaAluno (Aluno aluno) {
        this.lista_alunos_no_curso.add(aluno);
    }

    public void AdicionaDisciplina (Disciplina disciplina){
        this.lista_disciplina_no_curso.add(disciplina);
    }

    public void AdicionaHorario (String horario){
        this.lista_horarios_curso.add(horario);
    }
        
}
