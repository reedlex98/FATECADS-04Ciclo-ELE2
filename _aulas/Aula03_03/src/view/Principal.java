
package view;

import negocio.Horario;

/**
 *
 * @author DaviS.M.dos
 */
public class Principal {
    
    public static void main(String[] args) {
        // instancia objeto da classe Horario
        Horario objHorario1 = new Horario(20, 55);
        // exibe a hora atual
        System.out.println("Agora são: " + objHorario1.informarHorario());
        // incrementa o horário
        objHorario1.incrementar();
        System.out.println("Agora são: " + objHorario1.informarHorario());
        objHorario1.incrementar();
        System.out.println("Agora são: " + objHorario1.informarHorario());
        objHorario1.incrementar();
        System.out.println("Agora são: " + objHorario1.informarHorario());
        objHorario1.incrementar();
        System.out.println("Agora são: " + objHorario1.informarHorario());
        objHorario1.incrementar();
        System.out.println("Agora são: " + objHorario1.informarHorario());
        objHorario1.incrementar();
        System.out.println("Agora são: " + objHorario1.informarHorario());
        objHorario1.incrementar();
        System.out.println("Agora são: " + objHorario1.informarHorario());
    }
    
}
