
package view;

import negocio.Aluno;
import negocio.Aula;
import negocio.Disciplina;
import negocio.Materia;
import negocio.Professor;

/**
 *
 * @author DaviS.M.dos
 */
public class Principal {

    public static void main(String[] args) {
        
        // instancia objetos das classes que formam uma aula
        Professor prof1 = new Professor("Rubens Lara", "0001");
        Disciplina disciplina1 = new Disciplina("LPG");
        Materia materia1 = new Materia("Revisão de POO");
        // instancia a aula em si
        Aula aula1 = new Aula(prof1, disciplina1);
        aula1.setMateria(materia1);
        // instancia "n" alunos
        Aluno aluno1 = new Aluno("José", "001");
        Aluno aluno2 = new Aluno("Maria", "002");
        Aluno aluno3 = new Aluno("João", "003");
        Aluno aluno4 = new Aluno("Madalena", "004");
        Aluno aluno5 = new Aluno("Penelope", "005");
        // adiciona alunos à aula
        aula1.incluirAluno(aluno1);
        aula1.incluirAluno(aluno2);
        aula1.incluirAluno(aluno3);
        aula1.incluirAluno(aluno4);
        aula1.incluirAluno(aluno5);
        // exibe informações
        System.out.println(aula1.retornarInfoAula());
        
    }
    
}
