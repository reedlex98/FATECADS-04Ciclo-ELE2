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
public class Multiplicacao implements ICalculo {
    private float val1;
    private float val2;

    public Multiplicacao(float val1, float val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    @Override
    public float calcular() {
        return val1*val2;
    }
    
    
}
