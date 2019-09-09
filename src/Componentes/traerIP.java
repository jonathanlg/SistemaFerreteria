package Componentes;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class traerIP {

    static InetAddress addr;

    public static String getIP() {
        try {
            addr = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            System.out.println("No se puede saber la IP");
        }
        return String.valueOf(addr.getHostAddress());
    }

    public static String getHostname() {
        String hostname = addr.getHostName();
        try {
            System.out.println("HostName: " + hostname);
        } catch (Exception e) {
            System.out.println("No se puede saber el Hostname");
        }
        return hostname;
    }

}
