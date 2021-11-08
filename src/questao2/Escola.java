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
    private ArrayList<Aluno> lista_alunos = new ArrayList<Aluno>();
    
    //Curso
    public void AdicionaCurso(String nome){
       lista_cursos.add(new Curso(nome));
    }
    
    public void AdicionaDisciplinaAoCurso (String NomeDoCurso, String NomeDaDisciplina){
        int curso = lista_cursos.indexOf(NomeDoCurso);
        int disciplina = lista_disciplinas.indexOf(NomeDaDisciplina);
        
        lista_cursos.get(curso).AdicionaDisciplina(lista_disciplinas.get(disciplina));
    }
    
    public void AdicionaAlunoAoCurso (String NomeDoCurso, String NomeDoAluno){
        int curso = lista_cursos.indexOf(NomeDoCurso);
        int aluno = lista_alunos.indexOf(NomeDoAluno);
        
        lista_cursos.get(curso).AdicionaAluno(lista_alunos.get(aluno));
    }
    
    public void SetHorarioCurso (Integer horario){
        lista_cursos[index].SetHorario(horario);
    }
    
    //Disciplina
    public void AdicionaDisciplina (String nome){
        lista_disciplinas[index] = nome;
    }
    
    public void AdicionaProfessorADisciplina (String nome){
        lista_disciplinas[index] = lista_professores[index]
    }
    
    //Professor
    public void AdicionaProfessor (String nome){
        lista_professores.add(nome)
    }
    
    //Aluno
    public void AdicionaAluno (String nome){
        lista_alunos.add(nome);
    }
    
    public void AdicionaAlunoAoCurso (String NomeDoAluno, String NomeDoCurso){
        
    }
    
    public void RemoveAlunoDoCurso (String NomeDoAluno, String NomeDoCurso){
        
    }
    
    public void AdicionaAlunoADisciplina (String NomeDoAluno, String NomeDaDisciplina){
        //Coloca aluno na disciplina indicada
        lista_alunos.add(nome);
    }
    
    public void RemoverAlunoDaDisciplina (String NomeDoAluno, String NomeDaDisciplina){
        
    }
    
    public void AlunoFormado(){
        
    }
}
