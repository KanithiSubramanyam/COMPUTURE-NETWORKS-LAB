import java.io.*;
import java.net.*;
class UDPsever
{
public static byte buf[] = new byte[1024];
public static int cport = 789,sport=790;
public static void main(String[] a) throws IOException
{
    DatagramSocket serversocket = new DatagramSocket(sport);
    DatagramPacket dp = new DatagramPacket(buf,buf.length);
    BufferedReader dis = new BufferedReader(new InputStreamReader(System.in));
    InetAddress ia = InetAddress.getLocalHost();
    System.out.println("Server is Running...");
while(true)
{
serversocket.receive(dp);
String str = new String(dp.getData(), 0,dp.getLength());
if(str.equals("STOP"))
{
System.out.println("Terminated...");
break;
}
System.out.println("Client: " + str);
System.out.println("Server: " );
String str1 = new String(dis.readLine());
buf = str1.getBytes();
serversocket.send(new DatagramPacket(buf,str1.length(), ia, cport));
}
 serversocket.close();
}
}