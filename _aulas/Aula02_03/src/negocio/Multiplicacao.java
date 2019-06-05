package negocio;

/**
 *
 * @author dreis
 */
public class Multiplicacao extends Calculo{

    @Override
    public void calcular() {
        resultado = valor1 * valor2;
    }
    
}
