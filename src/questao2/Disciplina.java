package questao2;

public class Disciplina {
	
	private String sigla_disciplina;
	private String nome_disciplina;
	private int numero_aulas = 0;
	private Discente discente;
	private Aluno lista_aluno[] = new Aluno[60];
	
	public Disciplina (String nome_disciplina) {
		this.nome_disciplina = nome_disciplina;
		this.sigla_disciplina = nome_disciplina.toUpperCase().substring(0, 2);
	}
	
	
	public void getNomeDisciplina() { 
		System.out.println(nome_disciplina); 
	}
	
	public void getNomesAlunosDisciplina() {
		
	}
	
	public void getDiscenteDisciplina() {
		System.out.println(discente);
	}
	
    public void setNomeDisciplina(String nome_disciplina) { 
    	this.nome_disciplina = nome_disciplina; 
    }
    
	
	public void setDicenteDisciplina(Discente discente) {
		this.discente = discente;
	}
	
	public void AdicionaAlunoDisciplina (Aluno aluno) {
		for (int i = 0; i < lista_aluno.length; i++) {
			this.lista_aluno[i] = aluno;
			//aluno.cursos_matriculados += 1;
		}
	}
	
	//Verificar depois se vai ser necessário trocar a logica para numero de horarios da disciplina
	public void setNumeroAulasDisciplina () {
		this.numero_aulas = numero_aulas + 1;
	}
	
}

