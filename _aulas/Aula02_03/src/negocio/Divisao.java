package negocio;

/**
 *
 * @author dreis
 */
public class Divisao extends Calculo{

    @Override
    public void calcular() {
        resultado = valor1 / valor2;
    }
    
}
