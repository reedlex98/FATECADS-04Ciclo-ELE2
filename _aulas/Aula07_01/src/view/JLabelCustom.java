
package view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

/**
 *
 * @author dreis
 */
public class JLabelCustom extends JLabel{
    private final int TAMANHO_FONTE = 14;

    public JLabelCustom() {
        setForeground(Color.BLUE);
        setFont(new Font("Arial", Font.PLAIN, TAMANHO_FONTE));
    }
    
    public JLabelCustom(Color cor) {
        setForeground(cor);
        setFont(new Font("Arial", Font.PLAIN, TAMANHO_FONTE));
    }
    
    public JLabelCustom(Color cor, String texto) {
        setForeground(cor);
        setTextNormal(texto);
        setFont(new Font("Arial", Font.PLAIN, TAMANHO_FONTE));
    }
    
    @Override
    public void setText(String texto){
        super.setText(texto.toUpperCase());
    }
    
    private void setTextNormal(String texto){
        super.setText(texto);
    }
}
