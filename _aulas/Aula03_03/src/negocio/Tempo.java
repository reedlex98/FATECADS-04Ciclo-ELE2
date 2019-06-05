
package negocio;

/**
 *
 * @author dreis
 */
abstract class Tempo {
    private int unidade;

    public int getUnidade() { return unidade; }
    public void setUnidade(int unidade) { this.unidade = unidade; }
    
    public void incrementar(){
        unidade++;
    }
    
    public void decrementar(){
        unidade--;
    }
    
    public void adicionar(int n){
        unidade += n;
    }
    
    public void remover(int n){
        unidade -= n;
    }
}
