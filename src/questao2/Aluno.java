package questao2;

import java.util.ArrayList;
import java.util.HashMap;

public class Aluno extends Pessoa {
    
    HashMap<String, Float> Notas = new HashMap<String, Float>();
    private ArrayList<String> lista_horarios = new ArrayList<String>();
    
    Aluno (String nome) {
    	super(nome);
	//this.matricula = matricula;
    }
    
    public void AdicionaNotaAluno (String NomeDisciplina, float nota){
        this.Notas.put(NomeDisciplina, nota);
    }
    
    public void AdicionarHorario(String horario){
        this.lista_horarios.add(horario);
    }
    
}
