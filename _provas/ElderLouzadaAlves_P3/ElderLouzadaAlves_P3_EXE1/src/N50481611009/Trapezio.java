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
public class Trapezio implements IFigura {
    private float baseMaior;
    private float baseMenor;
    private float altura;

    public Trapezio(float baseMaior, float baseMenor, float altura) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }
    
    @Override
    public float retornarArea() {
        return (float)( ((baseMaior + baseMenor)*altura)/2 );
    }
    
}
