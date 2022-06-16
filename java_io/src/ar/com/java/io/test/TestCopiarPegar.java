package ar.com.java.io.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class TestCopiarPegar {

	public static void main(String[] args) throws IOException {
		/*
		
		// Leyendo un archivo externo
		
		InputStream fileInputStream = new FileInputStream("texto.txt");		
		Reader inputStreamReader = new InputStreamReader(fileInputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		OutputStream fileOutputStream = new FileOutputStream("texto-copia.txt");
		Writer outputStreamWriter = new OutputStreamWriter(fileOutputStream);
		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
		
		String linea;
		
		while ((linea = bufferedReader.readLine()) != null) {
			bufferedWriter.write(linea);
			bufferedWriter.newLine();
		}
		
		bufferedWriter.close();
		
		*/
		
		// Leyendo lo que se escribe en consola
		
		InputStream inputStream = System.in;		
		Reader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		OutputStream fileOutputStream = new FileOutputStream("texto-copia.txt");
		Writer outputStreamWriter = new OutputStreamWriter(fileOutputStream);
		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
		
		String linea;
		
		do {
			linea = bufferedReader.readLine();
			bufferedWriter.write(linea);
			bufferedWriter.newLine();			
		} while (!linea.equals("FIN"));
		
		bufferedWriter.close();
		
		/*
		
		// Utilizando WebSocket
		
		Socket socket = new Socket();				
		Reader inputStreamReader = new InputStreamReader(socket.getInputStream());
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		Socket socket2 = new Socket();
		Writer outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
		
		String linea;
		
		while ((linea = bufferedReader.readLine()) != null) {
			bufferedWriter.write(linea);
			bufferedWriter.newLine();
		}
		
		bufferedWriter.close();
		
		*/
	}
}