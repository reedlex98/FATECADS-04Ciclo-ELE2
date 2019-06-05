
package view;

import negocio.CamaraTermica;

/**
 *
 * @author dreis
 */
public class Principal {

    public static void main(String[] args) {
        // instancia objeto CamaraTermica, que contém, em seus 
        // atributos, a classe Temperatura
        CamaraTermica objCamaraFria = new CamaraTermica(-5, -1);
        // exibe os valores mínimos e máximos de temperatura, em Celsius e em Fahrenheit
        System.out.println(String.format(
                "[Câmara fria] temp. mínima (ºC): %.2f; temp. máxima (ºC): %.2f. ",
                objCamaraFria.getTemperaturaMinima().getGrausCelsius(),
                objCamaraFria.getTemperaturaMaxima().getGrausCelsius()));
        System.out.println(String.format(
                "[Câmara fria] temp. mínima (ºF): %.2f; temp. máxima (ºF): %.2f. ",
                objCamaraFria.getTemperaturaMinima().getGrausFahrenheit(),
                objCamaraFria.getTemperaturaMaxima().getGrausFahrenheit()));

    }
    
}
