/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao2;
import java.util.ArrayList;

/**
 *
 * @author dan-
 */
public class Escola {
    
    /*
    private Curso lista_cursos[] = new Curso[20];
    private Disciplina lista_disciplinas[] = new Disciplina[10]; 
    private Aluno lista_aluno_disciplina[] = new Aluno[20];
    */
    
    private ArrayList<Curso> lista_cursos = new ArrayList<Curso>();
    private ArrayList<Disciplina> lista_disciplinas = new ArrayList<Disciplina>();
    private ArrayList<Discente> lista_professores = new ArrayList<Discente>();
    private ArrayList<Aluno> lista_alunos = new ArrayList<Aluno>();
    
    //Curso
    public void AdicionaCurso(String nome){
       
       Curso curso = new Curso(nome);
       this.lista_cursos.add(curso);
       
       //int posicao = this.lista_cursos.indexOf(curso);
       //System.out.println("Posicao = "+ posicao);
       //System.out.println(this.lista_cursos.get(posicao).NomeCurso());
    }
    
    private int ProcuraCurso(String nome){   
        
        int posicao = -1;
        
        for (int i = 0; i < lista_cursos.size(); i++){
            if (lista_cursos.get(i).NomeCurso().equals(nome)){
                posicao = i;
            }
        }    
        return posicao;
    }
    
    public void AdicionaDisciplinaAoCurso (String NomeDoCurso, String NomeDaDisciplina){
        
        int curso = ProcuraCurso(NomeDoCurso);
        int disciplina = ProcuraDisciplina(NomeDaDisciplina);
        
        System.out.println(curso);
        
        if(curso == -1){
            System.out.println("Curso nao encontrado");
        } else if (disciplina == -1){
            System.out.println("Disciplina nao encontrado");
        } else {
            System.out.println("Adicionado");
           this.lista_cursos.get(curso).AdicionaDisciplina(this.lista_disciplinas.get(disciplina)); 
        }
    }
    
    public void AdicionaAlunoAoCurso (String NomeDoCurso, String NomeDoAluno){
        
        int curso = ProcuraCurso(NomeDoCurso);
        int aluno = ProcuraAluno(NomeDoAluno);
        
        if(curso == -1){
            System.out.println("Curso nao encontrado");
        } else if (aluno == -1){
            System.out.println("Aluno nao encontrado");
        } else {
           this.lista_cursos.get(curso).AdicionaAluno(this.lista_alunos.get(aluno)); 
        }
        
    }
    
    public void AdicionaHorarioCurso (String NomeDoCurso, String horario){
        int curso = ProcuraCurso(NomeDoCurso);
        
        this.lista_cursos.get(curso).AdicionaHorario(horario);
    }
    
    public int NumeroAlunosNoCurso (String NomeDoCurso){
        int curso = ProcuraCurso(NomeDoCurso);
        
        return this.lista_cursos.get(curso).NumeroAlunos();
    }
    
    //Disciplina***********************************************************************
    public void AdicionaDisciplina (String nome){
        
        Disciplina disciplina = new Disciplina(nome);
        this.lista_disciplinas.add(disciplina);
    }
    
    public void AdicionaProfessorADisciplina (String NomeDaDisciplina, String NomeDoProfessor){
        
        int disciplina = ProcuraDisciplina(NomeDaDisciplina);
        int professor = ProcuraProfessor(NomeDoProfessor);
        
        this.lista_disciplinas.get(disciplina).setDicenteDisciplina(this.lista_professores.get(professor));
        
    }
    
    public void AdicionaAlunoADisciplina (String NomeDoAluno, String NomeDaDisciplina){
        int disciplina = ProcuraDisciplina(NomeDaDisciplina);
        int aluno = ProcuraAluno(NomeDoAluno);
        
        this.lista_disciplinas.get(disciplina).AdicionaAluno(this.lista_alunos.get(aluno));
    }
    
    public void AdicionaHorarioADisciplina (String NomeDaDisciplina, String horario){
        int disciplina = ProcuraDisciplina(NomeDaDisciplina);
        
        this.lista_disciplinas.get(disciplina).AdicionaHorario(horario);
    }
    
    public int ListaAlunosDaDisciplina (String NomeDaDisciplina){
        int disciplina = ProcuraDisciplina(NomeDaDisciplina);
        
        return this.lista_disciplinas.get(disciplina).NumeroAlunos();
    }
    
    private int ProcuraDisciplina(String nome){   
        
        int posicao = -1;
        
        for (int i = 0; i < lista_disciplinas.size(); i++){
            if (lista_disciplinas.get(i).NomeDisciplina().equals(nome)){
                posicao = i;
            }
        }    
        return posicao;
    }
    
    //Professor***********************************************************************
    public void AdicionaProfessor (String nome){
        Discente discente = new Discente(nome);
        lista_professores.add(discente);
    }
    
    private int ProcuraProfessor(String nome){   
        
        int posicao = -1;
        
        for (int i = 0; i < lista_professores.size(); i++){
            if (lista_professores.get(i).Nome().equals(nome)){
                posicao = i;
            }
        }    
        return posicao;
    }
    
    //Aluno***********************************************************************
    public void AdicionaAluno (String nome){
        Aluno aluno = new Aluno(nome);
        lista_alunos.add(aluno);
    }
    
    private int ProcuraAluno(String nome){   
        int posicao = -1;
        
        for (int i = 0; i < lista_alunos.size(); i++){
            if (lista_alunos.get(i).Nome().equals(nome)){
                posicao = i;
            }
        }    
        return posicao;
    }
    
    public void AdicionaNotaAoAlunoNaDisciplina (String NomeDoAluno, String NomeDaDisciplina, float nota){
        
        //int disciplina = this.lista_disciplinas.indexOf(NomeDaDisciplina);
        int aluno = ProcuraAluno(NomeDoAluno);
        
        this.lista_alunos.get(aluno).AdicionaNotaAluno(NomeDaDisciplina, nota);
        
    };
    
    
    public void RemoveAlunoDoCurso (String NomeDoAluno, String NomeDoCurso){
        
    }
    
    
    public void RemoverAlunoDaDisciplina (String NomeDoAluno, String NomeDaDisciplina){
        
    }
    
    public void AlunoFormado(){
        
    }
}
