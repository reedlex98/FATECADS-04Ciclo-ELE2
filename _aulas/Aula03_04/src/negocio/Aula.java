
package negocio;

import java.util.ArrayList;

/**
 *
 * @author dreis
 */
public class Aula {
    private Professor professor;
    private Materia materia;
    private Disciplina disciplina;
    private ArrayList<Aluno> alunos;

    public void setMateria(Materia materia) { this.materia = materia; }

    public Aula(Professor professor, Disciplina disciplina) {
        this.professor = professor;
        this.disciplina = disciplina;
        // instancia arraylist de Alunos
        alunos = new ArrayList<Aluno>();
    }

    public void incluirAluno(Aluno a){
        // adiciona aluno recebido
        alunos.add(a);
    }
    
    public String retornarInfoAula(){
        String dadosAula = "INFORMAÇÕES DA AULA\n\n";
        
        dadosAula += "Disciplina: " + disciplina.getCodigo() + ";\n";
        dadosAula += "Professor: " + professor.getNome() + ";\n";
        if (materia != null)
            dadosAula += "Matéria: " + materia.getTopico() + ";\n";

        dadosAula += "Alunos presentes: \n";
        // monta "foreach" para percorrer a lista inteira de alunos
        for(Aluno alunoDoArray: alunos){
            dadosAula += " - " + alunoDoArray.getNome() + ";\n";
        }

        return dadosAula;
    }
}
