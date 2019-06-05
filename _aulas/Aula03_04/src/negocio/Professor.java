
package negocio;

/**
 *
 * @author dreis
 */
public class Professor extends Pessoa{
    
    private String registro;

    public String getRegistro() { return registro; }
    
    public Professor(String nome, String registro) {
        super(nome);
        this.registro = registro;
    }
    
}
