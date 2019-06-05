
package negocio;

/**
 *
 * @author dreis
 */
public class Quadrado extends Figura{

    private float lado;

    public float getLado() { return lado; }
    public void setLado(float lado) { this.lado = lado; }
    
    @Override
    public float calcularArea() {
        return lado * lado;
    }
    
}
