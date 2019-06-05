
package negocio;

/**
 *
 * @author dreis
 */
public class Retangulo extends Figura{

    private float base, altura;

    public Retangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public float calcularArea() {
        return base * altura;
    }
    
}
