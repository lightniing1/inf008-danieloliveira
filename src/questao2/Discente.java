package questao2;

import java.util.ArrayList;

public class Discente extends Pessoa {
    
    private ArrayList<String> lista_horarios = new ArrayList<String>();
    Integer matricula;
	
    Discente (String nome){
	super(nome);
	//this.matricula = matricula;
    }
    
    public void setMatricula (Integer matricula){
        this.matricula = matricula;
    }
    
    public Integer getMatricula (){
        return this.matricula;
    }
    
    public void AdicionarHorario(String horario){
        this.lista_horarios.add(horario);
    }

}
