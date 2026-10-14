public class CentroMensajeria {
    public void recibirMensaje(Mensaje m) {
        System.out.println("Mensaje recibido en el centro:");
        System.out.println("Remitente: " + m.getRemitente());
        System.out.println("Tecto: " + m.getTexto());
        System.out.println("Prioridad:" + m.getPrioridad());
    }
}
