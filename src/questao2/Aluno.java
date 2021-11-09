package questao2;

import java.util.ArrayList;
import java.util.HashMap;

public class Aluno extends Pessoa {
    
    HashMap<String, Float> Notas = new HashMap<String, Float>();
    
    Aluno (String nome) {
    	super(nome);
	//this.matricula = matricula;
    }
    
    public void AdicionaNotaAluno (String NomeDisciplina, float nota){
        this.Notas.put(NomeDisciplina, nota);
    }
    
}
