
package negocio;

/**
 *
 * @author dreis
 */
public class Calculo implements ICalculo{

    private float valor1, valor2;

    public Calculo(float valor1, float valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    
    @Override
    public float somar() {
        return valor1 + valor2;
    }

    @Override
    public float subtrair() {
        return valor1 - valor2;
    }

    @Override
    public float multiplicar() {
        return valor1 * valor2;
    }

    @Override
    public float dividir() {
        return valor1 / valor2;
    }
    
}
