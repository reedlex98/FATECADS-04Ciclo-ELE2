
package negocio;

/**
 *
 * @author dreis
 */
public class Aluno extends Pessoa {
    
    private String matricula;

    public String getMatricula() { return matricula; }
    
    public Aluno(String nome, String matricula) {
        super(nome);
        this.matricula = matricula;
    }
    
}
