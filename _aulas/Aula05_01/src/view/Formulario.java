
package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author dreis
 */
public class Formulario {
    private JFrame form;
    private JLabel lblNome;
    private JTextField txtNome;
    private JButton btnSaudar;

    public Formulario() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        // instancia objeto JFrame (formulário visual)
        form = new JFrame("Meu primeiro formulário Swing");
        // define propriedades de posição (x, y) e tamanho (largura, altura)
        form.setBounds(350, 250, 460, 200);
        // elimina pré-configurações de layout
        form.setLayout(null);
        // configura operação padrão ao fechar formulário
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // recupera a área do painel de conteúdo do form
        Container painel = form.getContentPane();
        
        // instancia objeto da classe JLabel
        lblNome = new JLabel("Nome:");
        // define propriedades de posição (x, y) e tamanho (largura, altura)
        lblNome.setBounds(50, 30, 60, 25);
        // configura fonte e cor
        lblNome.setForeground(Color.BLUE);
        Font fontePadrao = new Font("Tahoma", Font.BOLD, 16);
        lblNome.setFont(fontePadrao);
        // adiciona componente à área de conteúdo gráfico do form
        // form.getContentPane().add(lblNome);
        painel.add(lblNome);
        
        // instancia objeto da classe JTextField
        txtNome = new JTextField();
        // define propriedades de posição (x, y) e tamanho (largura, altura)
        txtNome.setBounds(130, 30, 250, 25);
        txtNome.setFont(fontePadrao);
        // adiciona componente à área de conteúdo gráfico do form
        painel.add(txtNome);
        
        // instancia objeto JButton
        btnSaudar = new JButton("Enviar saudação!");
        // define propriedades de posição e tamanho
        btnSaudar.setBounds(100, 80, 220, 30);
        // configura evento para tratar clique no botão
        // (utilizando objeto anônimo)
        btnSaudar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, 
                    String.format("Olá, %s, seja bem-vindo!", txtNome.getText()));
            }
        });
        // adiciona botão ao formulário
        painel.add(btnSaudar);
        
        // apresenta o formulário
        form.setVisible(true);
    }
}


