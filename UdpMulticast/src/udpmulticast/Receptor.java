
package udpmulticast;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/**
 *
 * @author dordonez@ute.edu.ec
 */
public class Receptor {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        final InetAddress mcGroupDir = InetAddress.getByName(Constantes.DIRECCION);
        final MulticastSocket mcSocket = new MulticastSocket(Constantes.PUERTO);
        
        mcSocket.joinGroup(mcGroupDir);

        System.out.println("RECIBE MULTICAST EN " + mcSocket.getLocalSocketAddress());
        
        while(true) {
            byte[] buffer = new byte[Constantes.TALLA_BUFFER];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            mcSocket.receive(packet);
            
            String received = new String(packet.getData()).trim();
            System.out.println(
                String.format("Mensaje=%s; Desde=%s", received, packet.getSocketAddress())
            );
            if(received.equals(Constantes.FIN_MENSAJES)) break;
        }
        
        mcSocket.leaveGroup(mcGroupDir);
        mcSocket.close();
        
    }
    
}
