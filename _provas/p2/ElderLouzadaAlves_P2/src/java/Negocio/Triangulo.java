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
public class Triangulo extends Figura {

    public Triangulo(double height, double base) {
        this.height =  height;
        this.base =  base;
    }
    
    @Override
    public double calculateArea(){
//        double semiPerimeter = (sideA + sideB + sideC)/2;
//        return Math.sqrt(semiPerimeter*(semiPerimeter - sideA)*(semiPerimeter - sideB)*(semiPerimeter - sideC)) ;
          return (height*base)/2;
    }

    @Override
    public double calculatePerimeter() {
       return height + base + Math.sqrt(Math.pow(base, 2)+Math.pow(height, 2));
    }
}
