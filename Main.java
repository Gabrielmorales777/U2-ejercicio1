
public class Main {
    public static void main(String[] args) {

        CentroMensajeria centro = new CentroMensajeria();

        SistemaSeguridad seguridad = new SistemaSeguridad(centro);

        seguridad.enviarAlerta(
                "Se detectó un intento de acceso no autorizado.",
                1
        );

        seguridad.enviarAlerta(
                "Se registró un movimiento fuera del horario habitual.",
                2
        );
    }
}
