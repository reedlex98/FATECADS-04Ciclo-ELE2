
package negocio;

/**
 *
 * @author dreis
 */
public class Moto extends Veiculo{
    private boolean apoioAcionado;

    public boolean isApoioAcionado() { return apoioAcionado; }
    
    public Moto(String nome, String fabricante, int ano) {
        super(nome, fabricante, ano);
        configurarApoio();
    }
    
    @Override
    public void acelerar(){
        super.acelerar();
        configurarApoio();
    }
    @Override
    
    public void desacelerar(){
        super.desacelerar();
        configurarApoio();
    }
    
    @Override
    public void parar(){
        super.parar();
        configurarApoio();
    }
    
    private void configurarApoio(){
        apoioAcionado = (velocidade == 0);
    }
    
    
}
