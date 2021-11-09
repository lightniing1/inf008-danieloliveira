package questao2;

import java.util.ArrayList;

public class Disciplina {
	
    private String sigla_disciplina;
    private String nome_disciplina;
    private int id_disciplina;
    private int numero_aulas = 0;
    private Discente discente;
    private ArrayList<Aluno> lista_alunos_na_disciplina = new ArrayList<Aluno>();
    private ArrayList<String> lista_horarios_disciplina = new ArrayList<String>();

    public Disciplina (String nome_disciplina) {
            this.nome_disciplina = nome_disciplina;
            this.sigla_disciplina = nome_disciplina.toUpperCase().substring(0, 2);
    }
    
    public String NomeDisciplina(){
        return this.nome_disciplina;
    }

    public void AdicionaAluno(Aluno aluno){
        this.lista_alunos_na_disciplina.add(aluno);
    }

    public void setNomeDisciplina(String nome_disciplina) { 
        this.nome_disciplina = nome_disciplina; 
    }

    public void setDicenteDisciplina(Discente discente) {
        this.discente = discente;
    }
    
    public void setIdDisciplina (int id){
        this.id_disciplina = id;
    }

    //Verificar depois se vai ser necess�rio trocar a logica para numero de horarios da disciplina
    public void setNumeroAulasDisciplina() {
        this.numero_aulas = numero_aulas + 1;
    }
    
    public void AdicionaHorario (String horario){
        this.lista_horarios_disciplina.add(horario);
    }

}

