package questao2;

public class Curso {
	
	private String nome;
	private String codigo_curso;
	private Integer horarios_curso;
	
	private Disciplina lista_disciplina[] = new Disciplina[10]; 
	private Aluno lista_aluno_disciplina[] = new Aluno[20];
	
	public Curso (String nome) {
		this.nome = nome;
		codigo_curso = nome.toUpperCase().substring(0, 2);
	}
	
	//Cadastrar disciplina
	public void AdicionaDisciplina (Disciplina disciplina, int index) {
		this.lista_disciplina[index] = disciplina;
	}
	
	//Cadastrar aluno
	public void AdicionaAluno (Aluno aluno) {
		for (int i = 0; i < lista_aluno_disciplina.length; i++) {
			this.lista_aluno_disciplina[i] = aluno;
		}
	}
}
