import java.io.*;
import java.net.*;
public class DNS_SERVER {
    public static void main(String[] args) throws Exception{
    BufferedReader br = new  BufferedReader(new InputStreamReader(System.in)); 
        System.out.println("enter the hostname");
        String host = br.readLine();
        try {
            InetAddress ip = InetAddress.getByName( host );
            System.out.println("IP address of given Host name:  " + ip.getHostAddress()); 
            System.out.println("Hostname: " + ip.getHostName());
        } catch (Exception e) {
            System.out.println("couldn't connect to " + host);
        }
    }
}