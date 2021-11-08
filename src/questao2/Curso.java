package questao2;

import java.util.ArrayList;

public class Curso {
	
	private String nome;
	private String codigo_curso;
	private Integer horarios_curso;
	private Disciplina disciplina;
        private ArrayList<Aluno> lista_alunos_na_disciplina = new ArrayList<Aluno>();
        
	public Curso (String nome) {
		this.nome = nome;
		codigo_curso = nome.toUpperCase().substring(0, 2);
	}
	
	//Cadastrar aluno
	public void AdicionaAluno (Aluno aluno) {
            this.lista_alunos_na_disciplina.add(aluno);
	}
        
        public void AdicionaDisciplina (Disciplina disciplina){
            this.disciplina = disciplina;
        }
        
}
