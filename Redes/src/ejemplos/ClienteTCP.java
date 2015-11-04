package ejemplos;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClienteTCP {
	public static void main(String[] args) throws IOException {
		Socket s = new Socket("localhost", 7777);
		PrintWriter salida = new PrintWriter(s.getOutputStream());
		salida.println("Hola, esto es un mensaje \r\n");
		salida.flush();
		Scanner entrada = new Scanner(s.getInputStream());
		System.out.println(entrada.nextLine());
		s.close();
		System.out.println("Desconectado");
	}

}
