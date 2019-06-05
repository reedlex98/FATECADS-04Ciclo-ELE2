
package view;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;

/**
 *
 * @author dreis
 */
public class Formulario {
    private JFrame form;
    private JLabelCustom lblLabelFormatada;

    public Formulario() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        // instancia objeto JFrame (formulário visual)
        form = new JFrame("Componentes customizados");
        // define propriedades de posição (x, y) e tamanho (largura, altura)
        form.setBounds(450, 250, 400, 200);
        // elimina pré-configurações de layout
        form.setLayout(null);
        // configura operação padrão ao fechar formulário
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // recupera a área do painel de conteúdo do form
        Container painel = form.getContentPane();
        
        lblLabelFormatada = new JLabelCustom(Color.RED);
        lblLabelFormatada.setBounds(50, 40, 150, 30);
        lblLabelFormatada.setText("Label customizada");
        painel.add(lblLabelFormatada);
        
        // apresenta o formulário
        form.setVisible(true);
    }
}


