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
    public Integer IdDaDisciplina(){
        return this.id_disciplina;
    }

    public void AdicionaAluno(Aluno aluno){
        this.lista_alunos_na_disciplina.add(aluno);
    }
    
    public void RemoveAluno(int aluno){
        int posicao = ProcuraAluno(aluno);
        this.lista_alunos_na_disciplina.remove(posicao);
    }
    
    private int ProcuraAluno(Integer ID){
        int posicao = -1;
        
        for (int i = 0; i < lista_alunos_na_disciplina.size(); i++){
            if (lista_alunos_na_disciplina.get(i).getMatricula().equals(ID)){
                posicao = i;
            }
        }    
        return posicao;
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

    public void setNumeroAulasDisciplina() {
        this.numero_aulas = numero_aulas + 1;
    }
    
    public void AdicionaHorario (String horario){
        this.lista_horarios_disciplina.add(horario);
    }
    
    public int NumeroAlunos(){
        return this.lista_alunos_na_disciplina.size();
    }

}

