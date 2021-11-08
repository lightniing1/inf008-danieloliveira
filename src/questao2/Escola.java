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
       
       System.out.println(this.lista_cursos.indexOf(curso));
    }
    
   
    
    public void AdicionaDisciplinaAoCurso (String NomeDoCurso, String NomeDaDisciplina){
        
        int curso = this.lista_cursos.indexOf(NomeDoCurso);
        int disciplina = this.lista_disciplinas.indexOf(NomeDaDisciplina);
        
        System.out.println(curso);
        
        if(curso == -1){
            System.out.println("Curso nao encontrado");
        } else if (disciplina == -1){
            System.out.println("Disciplina nao encontrado");
        } else {
           this.lista_cursos.get(curso).AdicionaDisciplina(this.lista_disciplinas.get(disciplina)); 
        }
    }
    
    public void AdicionaAlunoAoCurso (String NomeDoCurso, String NomeDoAluno){
        
        int curso = this.lista_cursos.indexOf(NomeDoCurso);
        int aluno = this.lista_alunos.indexOf(NomeDoAluno);
        
        if(curso == -1){
            System.out.println("Curso nao encontrado");
        } else if (aluno == -1){
            System.out.println("Aluno nao encontrado");
        } else {
           this.lista_cursos.get(curso).AdicionaAluno(this.lista_alunos.get(aluno)); 
        }
        
    }
    
    public void AdicionaHorarioCurso (String NomeDoCurso, Integer horario){
        int curso = this.lista_cursos.indexOf(NomeDoCurso);
        
        this.lista_cursos.get(curso).AdicionaHorario(horario);
    }
    
    //Disciplina***********************************************************************
    public void AdicionaDisciplina (String nome){
        this.lista_disciplinas.add(new Disciplina(nome));
    }
    
    public void AdicionaProfessorADisciplina (String NomeDaDisciplina, String NomeDoProfessor){
        
        int disciplina = this.lista_disciplinas.indexOf(NomeDaDisciplina);
        int professor = this.lista_professores.indexOf(NomeDoProfessor);
        
        this.lista_disciplinas.get(disciplina).setDicenteDisciplina(this.lista_professores.get(professor));
        
    }
    
    public void AdicionaAlunoADisciplina (String NomeDoAluno, String NomeDaDisciplina){
        int disciplina = this.lista_disciplinas.indexOf(NomeDaDisciplina);
        int aluno = this.lista_alunos.indexOf(NomeDoAluno);
        
        this.lista_disciplinas.get(disciplina).AdicionaAluno(this.lista_alunos.get(aluno));
    }
    
    public void AdicionaHorarioADisciplina (int horario){
        
        
    }
    
    public void ListaAlunosDaDisciplina (){
        
        
    }
    
    //Professor***********************************************************************
    public void AdicionaProfessor (String nome){
        lista_professores.add(new Discente(nome));
    }
    
    //Aluno***********************************************************************
    public void AdicionaAluno (String nome){
        lista_alunos.add(new Aluno(nome));
    }
    
    public void AdicionaNotaAoAlunoNaDisciplina (String NomeDoAluno, String NomeDaDisciplina, float nota){
        
        //int disciplina = this.lista_disciplinas.indexOf(NomeDaDisciplina);
        int aluno = this.lista_alunos.indexOf(NomeDoAluno);
        
        this.lista_alunos.get(aluno).AdicionaNotaAluno(NomeDaDisciplina, nota);
        
    };
    
    
    public void RemoveAlunoDoCurso (String NomeDoAluno, String NomeDoCurso){
        
    }
    
    
    public void RemoverAlunoDaDisciplina (String NomeDoAluno, String NomeDaDisciplina){
        
    }
    
    public void AlunoFormado(){
        
    }
}
