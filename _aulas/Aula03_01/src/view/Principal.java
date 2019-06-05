
package view;

import javax.swing.JOptionPane;
import negocio.Carro;
import negocio.Moto;
import negocio.Veiculo;

/**
 *
 * @author dreis
 */
public class Principal {

    public static void main(String[] args) {
        // permite ao usuário selecionar o veículo e seus parâmetros
        int tipoVeiculo = Integer.parseInt(
                JOptionPane.showInputDialog("Qual tipo de veículo deseja " + 
                    "utilizar?\n\n1 - Carro\n2 - Moto"));
        
        // solicita dados do veículo
        String nome = JOptionPane.showInputDialog("Modelo do veículo:");
        String fabricante = JOptionPane.showInputDialog("Fabricante do veículo:");
        int anoFabricacao = Integer.parseInt(JOptionPane.showInputDialog("Ano de fabricação:"));
        
        // declara objeto da classe Veiculo
        Veiculo objVeiculo = null;
        switch(tipoVeiculo){
            case 1:
                int qtdePortas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de portas:"));
                objVeiculo = new Carro(nome, fabricante, anoFabricacao, qtdePortas);
                break;        
            case 2:
                objVeiculo = new Moto(nome, fabricante, anoFabricacao);
                break;        
        }
        
        System.out.println(objVeiculo.informarDados());
        
    }
    
}
