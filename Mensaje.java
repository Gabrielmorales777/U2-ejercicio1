public class Mensaje {
    private String remitente;
    private String texto;
    private int prioridad;

    public Mensaje(String remitente, String texto, int prioridad){
        this.remitente = remitente;
        this.texto = texto;
        this.prioridad = prioridad;
    }

    public String getRemitente(){
        return remitente;
    }

    public String getTexto(){
        return texto;
    }

    public int getPrioridad(){
        return prioridad;
    }
}
