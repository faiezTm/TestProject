package projSys;

import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Client {
	public static void main (String[] args)
	{
		try 
		{
		   Socket s=new Socket("localhost",1234);
		   
		    InputStream is =s.getInputStream();
		    OutputStream os=s.getOutputStream();
		    System.out.println("lire un nombre au client nb :");
		    Scanner clavier =new Scanner(System.in);
		    
		    int nb =clavier.nextInt();
		    System.out.println("envoyer le nombre" +nb +"au serveur");
		    os.write(nb);
		    System.out.println("Attendre la réponce du serveur");
		    int rep = is.read();
		    System.out.println("la réponce du serveur est :"+nb);
		    
		}
		catch (IOException e) {e.printStackTrace();}
	}

}
