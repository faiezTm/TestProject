package projSys;
import java.io.*;
import java.net.*;

public class Serveur {
	public static void main (String[] args)
	{
		try 
		{
		   ServerSocket ss=new ServerSocket(1234);
		   System.out.println("j'attend la connection d'un client ");
		    Socket clientSocket=ss.accept();
		    System.out.println("Nouveau client connect� ");
		    System.out.println("Generation input et output");
		    InputStream is =clientSocket.getInputStream();
		    OutputStream os=clientSocket.getOutputStream();
		    System.out.println("j'attend le nb");
		    int nb =is.read();
		    System.out.println("j'envoie la r�ponce");
		    os.write(nb*5);
		    System.out.println("D�connection du client");
		    clientSocket.close();
		}
		catch (IOException e) {e.printStackTrace();}
	}
	

}
