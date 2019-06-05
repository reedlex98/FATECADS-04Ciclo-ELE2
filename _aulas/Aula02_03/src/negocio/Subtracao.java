package negocio;

/**
 *
 * @author dreis
 */
public class Subtracao extends Calculo{

    @Override
    public void calcular() {
        resultado = valor1 - valor2;
    }
    
}
