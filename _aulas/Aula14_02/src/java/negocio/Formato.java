
package negocio;

/**
 *
 * @author dreis
 */
public class Formato {
    
    public String retornarMinusculo (String texto){
        return texto.toLowerCase();
    }

    public String retornarMaiusculo (String texto){
        return texto.toUpperCase();
    }
}
