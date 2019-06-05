
package negocio;

/**
 *
 * @author dreis
 */
public class Horario {
    
    private Hora hora;
    private Minuto minuto;

    public Horario(int h, int min) {
        // instancia objeto da classe Hora
        this.hora = new Hora();
        // atribui valor inicial de hora
        this.hora.setUnidade(h);
        // instancia objeto da classe Minuto
        this.minuto = new Minuto();
        // atribui valor inicial de minuto
        this.minuto.setUnidade(min);
    }
    
    public void incrementar(){
        minuto.incrementar();
        // TODO: melhorar o controle do "incrementar()"
        if (minuto.getUnidade() > 59){
            minuto.setUnidade(0);
            hora.incrementar();
        }
    }
    
    public void decrementar(){
        minuto.decrementar();
        // TODO: melhorar o controle do "decrementar()"
        if (minuto.getUnidade() < 0){
            minuto.setUnidade(59);
            hora.decrementar();
        }
    }
    
    // TODO: implementar "adicionarMinutos(int minutos)"
    public void adicionarMinutos(int minutos){
    
    }
    
    // TODO: implementar "removerMinutos(int minutos)"
    public void removerMinutos(int minutos){
    
    }
        
    public String informarHorario(){
        // converte os valores de hora e minuto para String
        String horaTemp = String.valueOf(hora.getUnidade());
        String minutoTemp = String.valueOf(minuto.getUnidade());
        // utiliza operador ternário para concatenar (ou não) um 0 na frente da 
        // hora e do minuto para deixá-los com 2 caracteres
        horaTemp = horaTemp.length() == 1 ? "0".concat(horaTemp) : horaTemp;
        minutoTemp = minutoTemp.length() == 1 ? "0".concat(minutoTemp) : minutoTemp;
        // retorna o horário formatado
        return String.format("%sh%s", horaTemp, minutoTemp);
    }
}
