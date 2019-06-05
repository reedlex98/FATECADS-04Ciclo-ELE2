
package negocio;

/**
 *
 * @author dreis
 */
public class Carro extends Veiculo{
    private int quantidadePortas;

    public int getQuantidadePortas() { return quantidadePortas; }
    
    public Carro(String nome, String fabricante, int ano, int qtdePortas) {
        super(nome, fabricante, ano);
        this.quantidadePortas = qtdePortas;
    }
    
    @Override
    public void acelerar(){
        velocidade += 10;
        controlarVelocidadeMaxima();
    }
}
