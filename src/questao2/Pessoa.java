package questao2;

public abstract class Pessoa {

    private String nome;
    

    public Pessoa (String nome) {
            this.nome = nome;
    }
    
    public String Nome(){
        return this.nome;
    }
    
    abstract void AdicionarHorario();

}

