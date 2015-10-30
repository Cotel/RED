package pract3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
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
        DataInputStream dis;
        try {
            s = new Socket("smtp.upv.es", 25);
            dis = new DataInputStream(s.getInputStream());
            System.out.println(dis.readLine());
            dis.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
 
    }
 
    public static void ejercicio4() {
        Socket s;
        DataInputStream dis;
        try {
            s = new Socket("ntp.upv.es", 13);
            dis = new DataInputStream(s.getInputStream());
            System.out.println(dis.readLine());
            dis.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    public static void ejercicio5() {
        Socket s;
        DataInputStream dis;
        DataOutputStream dos;
        String res;
        try {
            s = new Socket("www.upv.es", 80);
            dis = new DataInputStream(s.getInputStream());
            dos = new DataOutputStream(s.getOutputStream());
            dos.writeUTF("GET / HTTP/1.0\r\n\r\n");
            do {
                res = dis.readLine();
                System.out.println(res);
            } while (res != null);
            dis.close();
            dos.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    public void ejercicio6() {
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
 
    }
 
}