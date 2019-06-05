
package negocio;

/**
 *
 * @author dreis
 */
abstract class Pessoa {
    // declaração de atributos
    protected String nome, email;

    // encapsulamento de atributos
    public String getNome() { return nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    // construtor não-default para receber o nome da Pessoa
    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    // método(s) contendo regras de negócio
    public String saudar(){
        return String.format("Olá, %s, seja bem-vindo(a)!", nome);
    }
    
}
