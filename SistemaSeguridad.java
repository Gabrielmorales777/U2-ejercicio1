public class SistemaSeguridad {
    private CentroMensajeria centro;

    public SistemaSeguridad(CentroMensajeria centro){
        this.centro = centro;
    }
    public void enviarAlerta(String texto, int prioridad){
        Mensaje mensaje = new Mensaje("Sistema de Seguridad", texto, prioridad);
   System.out.println("Enviando alerta");
   centro.recibirMensaje(mensaje);
    }

}
