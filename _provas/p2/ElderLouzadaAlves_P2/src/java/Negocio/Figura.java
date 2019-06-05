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
public abstract class Figura implements IFigura{
    public double height;
    public double base;
    
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}
