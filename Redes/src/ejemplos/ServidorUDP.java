package ejemplos;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ServidorUDP {
	public static void main(String[] args) throws IOException {
		String msg;
		DatagramSocket s = new DatagramSocket(7777);
		DatagramPacket p = new DatagramPacket(new byte[512], 512);
		while(true) {
			s.receive(p);
			msg = new String(p.getData(), 0, p.getLength());
			System.out.println(p.getAddress() + ": " + msg);
			s.send(p);
		}
	}
}
