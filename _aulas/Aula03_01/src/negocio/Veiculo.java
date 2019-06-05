
package negocio;

/**
 *
 * @author dreis
 */
public abstract class Veiculo {
    private final int VELOCIDADE_MAXIMA = 220;
    private final int VELOCIDADE_MINIMA = 0;
    
    private String nome, fabricante;
    private int ano;
    protected int velocidade;

    public String getNome() { return nome; }
    public String getFabricante() { return fabricante; }
    public int getAno() { return ano; }
    public int getVelocidade() { return velocidade; }

    public Veiculo(String nome, String fabricante, int ano) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.ano = ano;
        this.velocidade = 0;
        controlarVelocidadeMaxima();
        controlarVelocidadeMinima();
    }
    
    public void acelerar(){
        velocidade += 5;
        controlarVelocidadeMaxima();
    }
    
    public void desacelerar(){
        velocidade -= 5;
        controlarVelocidadeMinima();
    }

    public void parar(){
        velocidade = 0;
    }
    
    public String informarDados(){
        return String.format("Veículo: %s; fabricante: %s; velocidade: %d km/h.", nome, fabricante, velocidade);
    }
    
    protected void controlarVelocidadeMaxima(){
        if (this.velocidade > VELOCIDADE_MAXIMA)
            this.velocidade = VELOCIDADE_MAXIMA;
    }
    
    private void controlarVelocidadeMinima(){
        if (this.velocidade < VELOCIDADE_MINIMA)
            this.velocidade = VELOCIDADE_MINIMA;
    }
}