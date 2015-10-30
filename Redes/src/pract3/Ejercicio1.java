package pract3;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
 
public class Ejercicio1 {
 
    public static void ejercicio2() {
        Socket s;
        try {
            s = new Socket("www.upv.es", 80);
            System.out.println("Conectado de nuevo!");
            s.close();
        } catch (IOException e ) {
            e.printStackTrace();
        }
    }
 
    public static void ejercicio3() {
        Socket s;        
        BufferedReader br; 
        try {
            s = new Socket("smtp.upv.es", 25);
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            System.out.println(br.readLine());
            br.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
 
    }
 
    public static void ejercicio4() {
        Socket s;
        BufferedReader br;
        try {
            s = new Socket("ntp.upv.es", 13);
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            System.out.println(br.readLine());
            br.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    public static void ejercicio5() {
        Socket s;
        BufferedReader br;
        DataOutputStream dos;
        String res;
        try {
            s = new Socket("www.upv.es", 80);
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            dos = new DataOutputStream(s.getOutputStream());
            dos.writeBytes("GET / HTTP/1.0\r\n\r\n");
            do {
                res = br.readLine();
                System.out.println(res);
            } while (res != null);
            br.close();
            dos.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    public static void ejercicio6() {
    	Socket s;
    	try {
			s = new Socket("smtp.upv.es", 25);
			System.out.println("Puerto local: " + s.getLocalPort());
			System.out.println("Puerto remoto: " + s.getPort());
			System.out.println("Direccion IP: " + s.getInetAddress());
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    } 
  
    public static void main(String[] args) throws Exception {
        final String HOST = "www.upv.es";
        final int PORT = 80;
        Socket s = new Socket(HOST, PORT);
        System.out.println("Conectado!");
        s.close();
         
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
 
    }
 
}