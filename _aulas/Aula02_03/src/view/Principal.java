
package view;

import javax.swing.JOptionPane;
import negocio.Adicao;
import negocio.Calculo;
import negocio.Divisao;
import negocio.Multiplicacao;
import negocio.Subtracao;

/**
 *
 * @author dreis
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // solicita, também, a operação desejada
        int operacao = Integer.parseInt(JOptionPane.showInputDialog(
                "Informe a operação desejada: \n\n" +
                "1 - somar\n2 - subtrair\n3 - multiplicar\n4 - dividir"));

        // solicita ao usuário que informe os 2 valores a serem trabalhados
        float v1 = Float.parseFloat(
                JOptionPane.showInputDialog("Informe o 1º. valor:"));
        float v2 = Float.parseFloat(
                JOptionPane.showInputDialog("Informe o 2º. valor:"));

        // declara objeto da classe pai (abstrata)
        Calculo objCalc = null;
        switch(operacao){
            case 1: objCalc = new Adicao(); break;
            case 2: objCalc = new Subtracao(); break;
            case 3: objCalc = new Multiplicacao(); break;
            case 4: objCalc = new Divisao(); break;
        }
        // atribui valores a objeto gerado acima
        objCalc.setValor1(v1);
        objCalc.setValor2(v2);
        // executa regra de negócio
        objCalc.calcular();
        // apresenta resultado
        JOptionPane.showMessageDialog(null, 
                String.format("Resultado: %.2f", objCalc.getResultado()));

        
    }
    
}
