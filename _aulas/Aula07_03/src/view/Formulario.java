
package view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author dreis
 */
public class Formulario {

    private JFrame form;
    private JLabel lblPaises;
    private JCheckBox chkEua, chkArgentina, chkFranca;
    private JButton btnExibirMsg;
    
    public Formulario() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        form = new JFrame("Outros componentes - JCheckBox");
        form.setBounds(300, 250, 450, 200);
        form.setLayout(null);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container painel = form.getContentPane();
        
        lblPaises = new JLabel("Em quais países você moraria?");
        lblPaises.setBounds(50, 25, 180, 25);
        painel.add(lblPaises);
        
        chkEua = new JCheckBox("EUA");
        chkEua.setBounds(50, 60, 60, 20);
        painel.add(chkEua);

        chkFranca = new JCheckBox("França");
        chkFranca.setBounds(150, 60, 80, 20);
        painel.add(chkFranca);

        chkArgentina = new JCheckBox("Argentina");
        chkArgentina.setBounds(250, 60, 80, 20);
        painel.add(chkArgentina);

        btnExibirMsg = new JButton("Exibir mensagem");
        btnExibirMsg.setBounds(100, 100, 200, 25);
        btnExibirMsg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // exibe mensagem sobre o país selecionado
                String msg = "Informação sobre o(s) país(es) selecionado(s):\n\n";
                if (chkArgentina.isSelected())
                    msg += "País: Argentina; continente: América do Sul; idioma: espanhol\n";
                if (chkEua.isSelected())
                    msg += "País: EUA; continente: América do Norte; idioma: inglês\n";
                if (chkFranca.isSelected())
                    msg += "País: França; continente: Europa; idioma: francês\n";
                
                JOptionPane.showMessageDialog(null, msg);
            }
        });        
        painel.add(btnExibirMsg);
        
        form.setVisible(true);
    }
    
}

