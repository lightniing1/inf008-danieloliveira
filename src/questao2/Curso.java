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
    
    public int NumeroAlunos(){
        return this.lista_alunos_no_curso.size();
    }
    
    private int ProcuraAluno(Integer ID){
        int posicao = -1;
        
        for (int i = 0; i < lista_alunos_no_curso.size(); i++){
            if (lista_alunos_no_curso.get(i).getMatricula().equals(ID)){
                posicao = i;
            }
        }    
        return posicao;
    }
    
    public void RemoveAluno(int aluno){
        int posicao = ProcuraAluno(aluno);
        this.lista_alunos_no_curso.remove(posicao);
    }
        
}
