package pract4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Ejercicio1 {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(7777);
		Socket s = ss.accept();
		System.out.println("Se ha conectado un cliente al servidor");
		s.close();
		ss.close();

	}

}
