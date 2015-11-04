package ejemplos;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class ClienteUDP {
	public static void main(String[] args) throws IOException {
		DatagramSocket s = new DatagramSocket();
		InetAddress dir = InetAddress.getByName("localhost");
		String msg = "Hola, esto es un mensaje \r\n";
		byte[] buf = new byte[256];
		buf = msg.getBytes();
		DatagramPacket p = new DatagramPacket(buf, buf.length, dir, 7777);
		s.send(p);
		s.receive(p);
		String ans = new String(p.getData(), 0, p.getLength());
		System.out.println(ans);
		s.close();
	}

}
