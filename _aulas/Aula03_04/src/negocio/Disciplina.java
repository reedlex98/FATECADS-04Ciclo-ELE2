
package negocio;

/**
 *
 * @author dreis
 */
public class Disciplina {
    private String codigo, ementa;

    public String getCodigo() { return codigo; }

    public String getEmenta() { return ementa; }
    public void setEmenta(String ementa) { this.ementa = ementa; }
    
    public Disciplina(String codigo) {
        this.codigo = codigo;
    }
    
}
