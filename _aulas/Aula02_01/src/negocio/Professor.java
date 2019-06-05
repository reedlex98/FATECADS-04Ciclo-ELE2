
package negocio;

/**
 *
 * @author dreis
 */
public class Professor extends Pessoa{

    public Professor(String nome) {
        super(nome);
    }
    
    @Override
    public String saudar(){
        return String.format("Olá, Prof. %s, seja bem-vindo(a)!", nome);
    }

    public String saudar(String tratamento){
        return String.format("Olá, Prof. %s %s, seja bem-vindo(a)!", tratamento, nome);
    }
}
