/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package N50481611009;

/**
 *
 * @author elder
 */
public class Retangulo implements IFigura{
    private float base;
    private float altura;

    public Retangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public float retornarArea() {
        return base*altura;
    }
    
}
