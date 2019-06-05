
package negocio;

/**
 *
 * @author dreis
 */
public class Circulo extends Figura{

    private float raio;

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public Circulo(float raio) {
        this.raio = raio;
    }
    
    @Override
    public float calcularArea() {
        return (float)(Math.PI * Math.pow(raio, 2));
    }
}
