
package udpmulticast;

/**
 * https://github.com/dordonez-ute-apdist/udp-multicast
 * @author dordonez@ute.edu.ec
 */
public class Constantes {
    //Una direcciÓn multicast debe ser IP clase D: estar en el rango ]224.0.0.0 - 239.255.255.255]
    public static final String DIRECCION = "224.0.0.1";
    //Un puerto UDP válido: estar en el rango [1024 - 65535] https://tools.ietf.org/html/rfc6335
    public static final int PUERTO = 9797;
    //Tamaño del datagrama
    public static final int TALLA_BUFFER = 256;
    //Cadena para avisar el fin de la comunicación
    public static final String FIN_MENSAJES = "EXIT";
}
