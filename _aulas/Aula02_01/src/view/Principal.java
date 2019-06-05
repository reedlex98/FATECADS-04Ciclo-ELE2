
package view;

import negocio.Aluno;
import negocio.Professor;

/**
 *
 * @author dreis
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instancia objeto da classe Aluno
        Aluno objAluno1 = new Aluno("Branco");
        // dá valor a um atributo
        objAluno1.setEmail("branco@fatecrl.edu.br");
        // executa um dos métodos da regra de negócio
        System.out.println(objAluno1.saudar());
        
        // instancia objeto da classe Professor
        Professor objProfessor1 = new Professor("Rubens Lara");
        // dá valor a um atributo
        objProfessor1.setEmail("rubens@fatecrl.edu.br");
        // executa um dos métodos da regra de negócio
        System.out.println(objProfessor1.saudar("Dr."));

    }
    
}
