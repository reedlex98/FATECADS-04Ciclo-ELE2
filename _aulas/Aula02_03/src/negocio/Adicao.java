package negocio;

/**
 *
 * @author dreis
 */
public class Adicao extends Calculo{

    @Override
    public void calcular() {
        resultado = valor1 + valor2;
    }
    
}
