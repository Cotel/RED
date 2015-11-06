package pract4;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) throws IOException {
		Socket s = new Socket("smtp.upv.es", 25);
		Scanner input = new Scanner(s.getInputStream());
		PrintWriter output = new PrintWriter(s.getOutputStream(), true);
		String msg = "";
		
		msg = input.nextLine();
		System.out.println(msg);
		output.println("HELO smtp.upv.es");
		msg = input.nextLine();
		if(!msg.substring(0,3).equals("250")){
			output.println("Quit");
			msg = input.nextLine();
			System.out.println(msg);
			s.close();
			input.close();
			output.close();
			System.exit(1);
		}
		
		System.out.println(msg);
		output.println("Mail from: xxxxx@xxxx.xx");
		msg = input.nextLine();
		if(!msg.substring(0,3).equals("250")){
			output.println("Quit");
			msg = input.nextLine();
			System.out.println(msg);
			s.close();
			input.close();
			output.close();
			System.exit(1);
		}
		
		System.out.println(msg);
		output.println("Rcpt to: xxxxx@xxxxx.xx");
		msg = input.nextLine();
		if(!msg.substring(0,3).equals("250")){
			output.println("Quit");
			msg = input.nextLine();
			System.out.println(msg);
			s.close();
			input.close();
			output.close();
			System.exit(1);
		}
		
		System.out.println(msg);
		output.println("Data");
		msg = input.nextLine();
		if(!msg.substring(0,3).equals("354")){
			output.println("Quit");
			msg = input.nextLine();
			System.out.println(msg);
			s.close();
			input.close();
			output.close();
			System.exit(1);
		}
		
		output.println();
		output.println("Prueba del Socket");
		output.println();
		output.println(".");
		
		System.out.println(msg);
		msg = input.nextLine();
		System.out.println(msg);
		output.println("Quit");
		msg = input.nextLine();
		System.out.println(msg);
		s.close();
		input.close();
		output.close();
		System.exit(1);
		

	}

}
