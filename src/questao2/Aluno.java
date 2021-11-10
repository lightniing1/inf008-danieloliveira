package questao2;

import java.util.ArrayList;
import java.util.HashMap;

public class Aluno extends Pessoa {
    
    private HashMap<Integer, Float> Disciplinas = new HashMap<Integer, Float>();
    private ArrayList<String> lista_horarios = new ArrayList<String>();
    private Integer matricula = 0;
    private String curso;
    
    Aluno (String nome) {
    	super(nome);
	//this.matricula = matricula;
    }
    
    public void setMatricula(Integer matricula){
        this.matricula = matricula;
    }
    
    public Integer getMatricula(){
        return this.matricula;
    }
    
    public void setCurso(String curso){
        this.curso = curso;
    }
    
    public String getCurso(){
        return this.curso;
    }
    
    public void AdicionaDisciplina(Integer IDDisciplina){
        this.Disciplinas.put(IDDisciplina, null);
    }
    
    public void AdicionaNotaAluno (Integer IdDisciplina, float nota){
        
        this.Disciplinas.put(IdDisciplina, nota);
    }
    
    public void AdicionarHorario(String horario){
        this.lista_horarios.add(horario);
    }
    
    public Integer QtdDisciplinas(){
        return this.Disciplinas.size();
    }
    
    public Boolean VerificaMatriculaDisciplina(Integer IdDisciplina){
        return this.Disciplinas.containsKey(IdDisciplina);
    }
    
}
