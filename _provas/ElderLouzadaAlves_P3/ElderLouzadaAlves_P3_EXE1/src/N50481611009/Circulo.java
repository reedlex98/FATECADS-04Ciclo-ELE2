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
public class Circulo implements IFigura{
    private float raio;

    public Circulo(float raio) {
        this.raio = raio;
    }
    @Override
    public float retornarArea() {
        return (float)(Math.PI*Math.pow(raio, raio));
    }
    
}
