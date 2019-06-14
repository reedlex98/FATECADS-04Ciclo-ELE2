/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import N50481611009.Circulo;
import N50481611009.Retangulo;
import N50481611009.Trapezio;
import N50481611009.Triangulo;
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

/**
 *
 * @author elder
 */
public class formulario {
    private JFrame form;
    private JLabel lblAltura, lblBaseMenor, lblBaseMaior, lblRaio, lblResultado;
    private JTextField txtAltura, txtBaseMenor, txtBaseMaior, txtRaio;
    private JButton btnRetangulo, btnTriangulo, btnTrapezio, btnCirculo;
    
    public formulario() {
        inicializarComponentes();
    }
    
    private void inicializarComponentes() {
        form = new JFrame("Calculadora JFrame");
        form.setBounds(400, 300, 500, 300);
        form.setLayout(null);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container painelDeConteudo = form.getContentPane();
        
        Font fonteCustomizada = new Font("Arial", Font.BOLD, 16);
        
        lblAltura = new JLabel("Altura:");
        lblAltura.setBounds(40, 30, 60, 25);
        painelDeConteudo.add(lblAltura);
        
        txtAltura = new JTextField("0");
        txtAltura.setBounds(110, 30, 60, 25);
        painelDeConteudo.add(txtAltura);
        
        lblBaseMaior = new JLabel("Base maior: ");
        lblBaseMaior.setBounds(40, 90, 60, 25);
        painelDeConteudo.add(lblBaseMaior);
        
        txtBaseMaior = new JTextField("0");
        txtBaseMaior.setBounds(110, 90, 60, 25);
        painelDeConteudo.add(txtBaseMaior);
        
        lblBaseMenor = new JLabel("Base menor: ");
        lblBaseMaior.setBounds(40, 150, 60, 25);
        painelDeConteudo.add(lblBaseMenor);
        
        txtBaseMenor = new JTextField("0");
        txtBaseMaior.setBounds(110, 150, 60, 25);
        painelDeConteudo.add(txtBaseMenor);
        
        lblRaio = new JLabel("Raio: ");
        lblRaio.setBounds(40, 210, 60, 25);
        painelDeConteudo.add(lblRaio);
        
        txtRaio = new JTextField("0");
        txtBaseMaior.setBounds(110, 210, 60, 25);
        painelDeConteudo.add(txtRaio);
        
        lblResultado = new JLabel("");
        lblBaseMaior.setBounds(40, 270, 60, 25);
        painelDeConteudo.add(lblResultado);
        
        btnCirculo = new JButton("AreaCirculo");
        btnCirculo.setBounds(270, 25, 70, 40);
        btnCirculo.setFont(fonteCustomizada);
        btnCirculo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Circulo c = new Circulo(Float.parseFloat(txtRaio.getText()));
                lblResultado.setText(String.format("Resultado: %.2f", c.retornarArea()));
            }
        });
        painelDeConteudo.add(btnCirculo);
        
        btnTriangulo = new JButton("AreaTriangulo");
        btnTriangulo.setBounds(360, 25, 70, 40);
        btnTriangulo.setFont(fonteCustomizada);
        btnTriangulo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Triangulo t = new Triangulo(Float.parseFloat(txtBaseMaior.getText()), Float.parseFloat(txtAltura.getText()));
                lblResultado.setText(String.format("Resultado: %.2f", t.retornarArea()));
            }
        });
        painelDeConteudo.add(btnTriangulo);
        
        btnRetangulo = new JButton("AreaRetangulo");
        btnRetangulo.setBounds(270, 90, 70, 40);
        btnRetangulo.setFont(fonteCustomizada);
        btnRetangulo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Retangulo r = new Retangulo(Float.parseFloat(txtBaseMaior.getText()), Float.parseFloat(txtAltura.getText()));
                lblResultado.setText(String.format("Resultado: %.2f", r.retornarArea()));
            }
        });
        painelDeConteudo.add(btnRetangulo);
        
        btnTrapezio = new JButton("AreaTrapezio");
        btnTrapezio.setBounds(360, 90, 70, 40);
        btnTrapezio.setFont(fonteCustomizada);
        btnTrapezio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Trapezio r = new Trapezio(Float.parseFloat(txtBaseMaior.getText()), Float.parseFloat(txtBaseMenor.getText()), Float.parseFloat(txtAltura.getText()));
                lblResultado.setText(String.format("Resultado: %.2f", r.retornarArea()));
            }
        });
        painelDeConteudo.add(btnTrapezio);
        
        form.setVisible(true);
    }
}
