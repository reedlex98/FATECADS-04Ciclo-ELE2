
package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import negocio.Adicao;
import negocio.Divisao;
import negocio.Multiplicacao;
import negocio.Subtracao;

/**
 *
 * @author dreis
 */
public class Formulario {

    private JFrame form;
    private JLabel lblValor1, lblValor2, lblResultado;
    private JTextField txtValor1, txtValor2;
    private JButton btnSomar, btnSubtrair, btnMultiplicar, btnDividir;
    
    public Formulario() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        form = new JFrame("Calculadora JFrame");
        form.setBounds(400, 250, 500, 300);
        form.setLayout(null);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container painelDeConteudo = form.getContentPane();
        
        Font fonteCustomizada = new Font("Arial", Font.BOLD, 16);
        
        lblValor1 = new JLabel("Valor 1:");
        lblValor1.setBounds(40, 30, 60, 25);
        painelDeConteudo.add(lblValor1);
        
        txtValor1 = new JTextField("0");
        txtValor1.setBounds(110, 30, 60, 25);
        txtValor1.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                validarCaracteresPermitidos(e);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                lblResultado.setText("Resultado:");
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        painelDeConteudo.add(txtValor1);
        
        lblValor2 = new JLabel("Valor 2:");
        lblValor2.setBounds(40, 90, 60, 25);
        painelDeConteudo.add(lblValor2);
        
        txtValor2 = new JTextField("0");
        txtValor2.setBounds(110, 90, 60, 25);
        txtValor2.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                validarCaracteresPermitidos(e);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                lblResultado.setText("Resultado:");
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        painelDeConteudo.add(txtValor2);
        
        lblResultado = new JLabel("Resultado: ");
        lblResultado.setBounds(150, 180, 150, 25);
        lblResultado.setForeground(Color.BLUE);
        lblResultado.setFont(fonteCustomizada);
        painelDeConteudo.add(lblResultado);
        
        btnSomar = new JButton("+");
        btnSomar.setBounds(270, 25, 70, 40);
        btnSomar.setFont(fonteCustomizada);
        btnSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float v1 = Float.parseFloat(txtValor1.getText());
                float v2 = Float.parseFloat(txtValor2.getText());
                // instancia objeto da classe Adicao
                Adicao objAdicao = new Adicao();
                // declara variável que receberá (para exibir) o resultado da operação
                float resultado = 0;
                // executa a operação da regra de negócio
                resultado = objAdicao.calcular(v1, v2);
                // exibe o valor
                lblResultado.setText(String.format("Resultado: %.2f", resultado));
            }
        });
        painelDeConteudo.add(btnSomar);

        btnSubtrair = new JButton("-");
        btnSubtrair.setBounds(360, 25, 70, 40);
        btnSubtrair.setFont(fonteCustomizada);
        btnSubtrair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float v1 = Float.parseFloat(txtValor1.getText());
                float v2 = Float.parseFloat(txtValor2.getText());
                lblResultado.setText(String.format("Resultado: %.2f", 
                    new Subtracao().calcular(v1, v2)));
            }
        });
        painelDeConteudo.add(btnSubtrair);
        
        btnMultiplicar = new JButton("x");
        btnMultiplicar.setBounds(270, 90, 70, 40);
        btnMultiplicar.setFont(fonteCustomizada);
        btnMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float v1 = Float.parseFloat(txtValor1.getText());
                float v2 = Float.parseFloat(txtValor2.getText());
                lblResultado.setText(String.format("Resultado: %.2f", 
                    new Multiplicacao().calcular(v1, v2)));
            }
        });
        painelDeConteudo.add(btnMultiplicar);

        btnDividir = new JButton("/");
        btnDividir.setBounds(360, 90, 70, 40);
        btnDividir.setFont(fonteCustomizada);
        btnDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float v1 = Float.parseFloat(txtValor1.getText());
                float v2 = Float.parseFloat(txtValor2.getText());
                lblResultado.setText(String.format("Resultado: %.2f", 
                    new Divisao().calcular(v1, v2)));
            }
        });
        painelDeConteudo.add(btnDividir);
        
        
        form.setVisible(true);
    }

    private void validarCaracteresPermitidos(KeyEvent e) {
        String caracteresPermitidos = "0123456789.";
        // se o caractere digitado não estiver na lista de caracteres 
        // permitidos, não deixa incluí-lo na caixa de texto
        if(!caracteresPermitidos.contains(String.valueOf(e.getKeyChar())))
            e.consume();
//         outra forma de validar se são somente dígitos segue abaixo
//        if(!Character.isDigit(e.getKeyChar()) && e.getKeyChar() != '.')
//            e.consume();
        
    }
    
}
