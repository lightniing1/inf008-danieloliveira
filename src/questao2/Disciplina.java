package questao2;

public class Disciplina {
	
	private String sigla_disciplina;
	private String nome_disciplina;
	private int numero_aulas = 0;
	private Discente discente;
	
	public Disciplina (String nome_disciplina) {
		this.nome_disciplina = nome_disciplina;
		this.sigla_disciplina = nome_disciplina.toUpperCase().substring(0, 2);
	}
	
        public void setNomeDisciplina(String nome_disciplina) { 
    	this.nome_disciplina = nome_disciplina; 
        }
    
	public void setDicenteDisciplina(Discente discente) {
		this.discente = discente;
	}
	
	//Verificar depois se vai ser necess�rio trocar a logica para numero de horarios da disciplina
	public void setNumeroAulasDisciplina () {
		this.numero_aulas = numero_aulas + 1;
	}
	
}

