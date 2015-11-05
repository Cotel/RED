package pract4;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;

public class Ejercicio2 {

	public static void main(String[] args) throws IOException {		
		ServerSocket ss = new ServerSocket(7777);
		while(true) {
			Calendar cal = Calendar.getInstance();
			Socket s = ss.accept();
			PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
			int hour = cal.get(Calendar.HOUR_OF_DAY);
			int minute = cal.get(Calendar.MINUTE);
			int sec = cal.get(Calendar.SECOND);
			String msg = "La hora actual es: "+hour+":"+minute+":"+sec;
			pw.println(msg);
			s.close();
		}

	}

}
