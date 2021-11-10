/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao2;
import java.util.ArrayList;
import java.util.HashMap;

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
    //private HashMap<Integer, Disciplina> lista_disciplinas = new HashMap<Integer, Disciplina>();
    private ArrayList<Discente> lista_professores = new ArrayList<Discente>();
    private ArrayList<Aluno> lista_alunos = new ArrayList<Aluno>();
    
    int codigo_disciplina = 0;
    int codigo_discente = 0;
    int codigo_aluno = 0;
    
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
    
    public void AdicionaDisciplinaAoCurso (String NomeDoCurso, Integer IdDaDisciplina){
        
        int curso = ProcuraCurso(NomeDoCurso);
        int disciplina = ProcuraDisciplina(IdDaDisciplina);
        
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
    
    public void AdicionaAlunoAoCurso (String NomeDoCurso, Integer IdAluno){
        
        int curso = ProcuraCurso(NomeDoCurso);
        int aluno = ProcuraAluno(IdAluno);
        
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
    
    public void RemoveCurso (String NomeDoCurso){
        int curso = ProcuraCurso(NomeDoCurso);
        
        this.lista_cursos.remove(curso);
    }
    
    public void RemoveDisciplinaDoCurso(String NomeDoCurso, Integer IdDisciplina){
        int curso = ProcuraCurso(NomeDoCurso);
        this.lista_cursos.get(curso).RemoveDisciplina(IdDisciplina);
    }
    
    public String NomeCurso(Integer index){
        return lista_cursos.get(index).NomeCurso();
    }
    
    public Integer QtdCursos (){
        return lista_cursos.size();
    }
    
    //Disciplina***********************************************************************
    public Integer AdicionaDisciplina (String nome){
        
        Disciplina disciplina = new Disciplina(nome);
        disciplina.setIdDisciplina(codigo_disciplina);
        codigo_disciplina += 1;
        
        //this.lista_disciplinas.put(disciplina.IdDaDisciplina(), disciplina);
        this.lista_disciplinas.add(disciplina);
        
        return disciplina.IdDaDisciplina();
    }
    
    public void AdicionaProfessorADisciplina (Integer IdDisciplina, Integer IdProfessor){
        
        int disciplina = ProcuraDisciplina(IdDisciplina);
        int professor = ProcuraProfessor(IdProfessor);
        
        this.lista_disciplinas.get(disciplina).setDicenteDisciplina(this.lista_professores.get(professor));
        
    }
    
    public void AdicionaAlunoADisciplina (Integer IdAluno, Integer IdDisciplina){
        int disciplina = ProcuraDisciplina(IdDisciplina);
        int aluno = ProcuraAluno(IdAluno);
        
        //this.lista_disciplinas.get(disciplina).AdicionaAluno(this.lista_alunos.get(aluno));
        
        this.lista_alunos.get(aluno).AdicionaDisciplina(disciplina);

    }
    
    public void AdicionaHorarioADisciplina (Integer IdDisciplina, String horario){
        int disciplina = ProcuraDisciplina(IdDisciplina);
        
        this.lista_disciplinas.get(disciplina).AdicionaHorario(horario);
    }
    
    public void RemoveHorarioDisciplina (Integer IdDisciplina, String horario){
        int disciplina = ProcuraDisciplina(IdDisciplina);
        
        this.lista_disciplinas.get(disciplina).RemoveHorario(horario);
    }
    
    public int ListaAlunosDaDisciplina (Integer IdDisciplina){
        int disciplina = ProcuraDisciplina(IdDisciplina);
        
        return this.lista_disciplinas.get(disciplina).NumeroAlunos();
    }
    
    public void RemoveDisciplina (Integer IdDisciplina){
        int disciplina = ProcuraDisciplina(IdDisciplina);
        
        this.lista_disciplinas.remove(disciplina);
    }
    
    public Integer QtdDisciplinas(){
        return this.lista_disciplinas.size();
    }
    
    public String NomeDisciplina(Integer index){
        return this.lista_disciplinas.get(index).NomeDisciplina();
    }
    
    public Integer getIdDisciplina(Integer index){
        return this.lista_disciplinas.get(index).IdDaDisciplina();
    }
    
    public Integer DiscenteDaDiciplina (Integer index){
        
        return this.lista_disciplinas.get(index).getMatriculaDiscenteDisciplina();
    }
    
    private int ProcuraDisciplina(Integer ID){   
        
        int posicao = -1;
        
        for (int i = 0; i < lista_disciplinas.size(); i++){
            if (lista_disciplinas.get(i).IdDaDisciplina().equals(ID)){
                posicao = i;
            }
        }    
        return posicao;
    }
 
    
    
    //Professor***********************************************************************
    
    public int AdicionaProfessor (String nome){
        Discente discente = new Discente(nome);
        
        discente.setMatricula(codigo_discente);
        codigo_discente += 1;
        lista_professores.add(discente);
        
        return discente.getMatricula();
    }
    
    public String NomeProfessor(Integer index){
        
        return lista_professores.get(index).Nome();
    }
    
    public Integer MatriculaProfessor(Integer index){
        return lista_professores.get(index).getMatricula();
    }
    
    public void RemoveProfessor(Integer matricula){
        int professor = ProcuraProfessor(matricula);
        
        this.lista_professores.remove(professor);
    }
    
    public Integer QtdProfessores (){
        return lista_professores.size();
    }
    
    public void AdicionaHorarioProfessor(String horario){
        
    }
    
    public void RemoveHorarioProfessor(String horario){
        
    }
    
    //public Integer DisciplinasLecionadas(Integer matricula){
        
    //    this.lista_disciplinas.add(i).
    //    return lista_professores.get(matricula).
    //}
    
    private int ProcuraProfessor(Integer ID){   
        
        int posicao = -1;
        
        for (int i = 0; i < lista_professores.size(); i++){
            if (lista_professores.get(i).getMatricula().equals(ID)){
                posicao = i;
            }
        }    
        return posicao;
    }
    
    //Aluno***********************************************************************
    
    public Integer AdicionaAluno (String nome){
        Aluno aluno = new Aluno(nome);
        aluno.setMatricula(codigo_aluno);
        codigo_aluno += 1;
        
        lista_alunos.add(aluno);
        
        return aluno.getMatricula();
    }
    
    public String NomeAluno(Integer index){
        
        return lista_alunos.get(index).Nome();
    }
    
    public Integer MatriculaAluno(Integer index){
        return lista_alunos.get(index).getMatricula();
    }
    
    public void RemoveAluno(Integer matricula){
        int aluno = ProcuraAluno(matricula);
        
        this.lista_alunos.remove(aluno);
    }
    
    public Integer QtdAlunos (){
        return lista_alunos.size();
    }
    
    private int ProcuraAluno(Integer ID){   
        int posicao = -1;
        
        for (int i = 0; i < lista_alunos.size(); i++){
            if (lista_alunos.get(i).getMatricula().equals(ID)){
                posicao = i;
            }
        }    
        return posicao;
    }
    
    public void AdicionaNotaAoAlunoNaDisciplina (Integer IdAluno, Integer IdDisciplina, float nota){
        
        //int disciplina = this.lista_disciplinas.indexOf(NomeDaDisciplina);
        int aluno = ProcuraAluno(IdAluno);
        
        this.lista_alunos.get(aluno).AdicionaNotaAluno(IdDisciplina, nota);
        
    };
    
    
    public void RemoveAlunoDoCurso (Integer IdAluno, String NomeDoCurso){
        int curso = ProcuraCurso(NomeDoCurso);
        this.lista_cursos.get(curso).RemoveAluno(IdAluno);
    }
    
    
    public void RemoverAlunoDaDisciplina (Integer IdAluno, Integer IdDisciplina){
        int disciplina = ProcuraDisciplina(IdDisciplina);
        this.lista_disciplinas.get(disciplina).RemoveAluno(IdAluno);
    }
    
    public void AlunoFormado(){
        
    }
}
