
package negocio;

/**
 *
 * @author dreis
 */
public class Temperatura {

    private float grausCelsius;

    public float getGrausCelsius() { return grausCelsius; }
    public float getGrausFahrenheit() { 
        return grausCelsius * 1.8f + 32; 
    }

    public void setGrausCelsius(float grausCelsius) { this.grausCelsius = grausCelsius; }
    
}