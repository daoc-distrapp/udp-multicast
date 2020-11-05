
package udpmulticast;

/**
 * https://github.com/dordonez-ute-apdist/udp-multicast
 * @author dordonez@ute.edu.ec
 */
public class Constantes {
    //Una direcci�n multicast debe ser IP clase D: estar en el rango ]224.0.0.0 - 239.255.255.255]
    public static final String DIRECCION = "224.0.0.1";
    //Un puerto UDP v�lido: estar en el rango [1024 - 65535] https://tools.ietf.org/html/rfc6335
    public static final int PUERTO = 9797;
    //Tama�o del datagrama
    public static final int TALLA_BUFFER = 256;
    //Cadena para avisar el fin de la comunicaci�n
    public static final String FIN_MENSAJES = "EXIT";
}
