package ejemplos;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServidorTCP {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(7777);
		String msg;
		while(true) {
			Socket s1 = ss.accept();
			Scanner entrada = new Scanner(s1.getInputStream());
			PrintWriter salida = new PrintWriter(s1.getOutputStream());
			msg = entrada.nextLine();
			System.out.println(s1.getInetAddress() + " " + msg);
			salida.println(msg);
			salida.flush();
			s1.close();
		}

	}

}
