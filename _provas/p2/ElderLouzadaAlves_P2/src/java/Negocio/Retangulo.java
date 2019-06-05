/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author elder
 */
public class Retangulo extends Figura {

    public Retangulo(double height, double base) {
        this.height = height;
        this.base = base;
    }
    
    @Override
    public double calculateArea() {
        return height*base;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(height+base);
    }
    
}
