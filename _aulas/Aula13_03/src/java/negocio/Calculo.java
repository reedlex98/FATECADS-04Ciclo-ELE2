
package negocio;

/**
 *
 * @author dreis
 */
public class Calculo implements ICalculo{

    private float v1, v2, resultado;

    public float getResultado() { return resultado; }

    public Calculo(float v1, float v2) {
        this.v1 = v1;
        this.v2 = v2;
    }
    
    @Override
    public void somar() {
        resultado = v1 + v2;
    }

    @Override
    public void subtrair() {
        resultado = v1 - v2;
    }

    @Override
    public void multiplicar() {
        resultado = v1 * v2;
    }

    @Override
    public void dividir() {
        resultado = v1 / v2;
    }
    
}
