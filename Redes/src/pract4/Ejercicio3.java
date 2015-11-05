package pract4;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(7777);
		while(true) {
			Socket s = ss.accept();
			Scanner input = new Scanner(s.getInputStream());
			PrintWriter output = new PrintWriter(s.getOutputStream(), true);
			String msg = ".";
			String header = "";
			while(!msg.equals("")) {
				msg = input.nextLine();
				header += msg + "\n";
			}			
			output.println("HTTP/1.0 200 OK");
			output.println("Content-Type: text/plain");
			output.println();
			output.println(header);
			input.close();
			output.close();
			s.close();
		}

	}

}
