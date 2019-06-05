
package negocio;

/**
 *
 * @author dreis
 */
public abstract class Calculo implements ICalculo{
    protected float valor1, valor2, resultado;

    public float getValor1() { return valor1; }
    public void setValor1(float valor1) { this.valor1 = valor1; }

    public float getValor2() { return valor2; }
    public void setValor2(float valor2) { this.valor2 = valor2; }

    public float getResultado() { return resultado; }

}
