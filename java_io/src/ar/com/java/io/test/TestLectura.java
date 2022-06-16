package ar.com.java.io.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TestLectura {

	public static void main(String[] args) throws IOException {		
		// Obtener el archivo
		InputStream fileInputStream = new FileInputStream("texto.txt");
		
		// Procesar el archivo
		Reader inputStreamReader = new InputStreamReader(fileInputStream);
		
		// Leer el archivo
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		String linea;
		// System.out.println(linea);
		
		// Leer linea por linea
		while ((linea = bufferedReader.readLine()) != null) {
			System.out.println(linea);
		}
	}
}