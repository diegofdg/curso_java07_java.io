package ar.com.java.io.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class TestLectura2 {

	public static void main(String[] args) throws IOException {
		
		// Scanner scanner = new Scanner(new File("archivo.csv"), StandardCharsets.UTF_8);
		Scanner scanner = new Scanner(new File("cuentas.csv"), StandardCharsets.UTF_8);
		String linea;
		while (scanner.hasNextLine() && (linea = scanner.nextLine()) != null) {
			/*			
			// Imprimiendo el contenido
					
			System.out.println(linea);			
			*/
			
			// Usando Split
			
			Object[] lineas = linea.split(",");
			// System.out.println(lineas);
			System.out.println(Arrays.asList(lineas));			
			System.out.println(String.format("%s,%s,%s,%s,%s", lineas));
			System.out.println(lineas[1]);
			
			
			
			/*
			// Usando Scanner
						
			Scanner lineaScanner = new Scanner(linea);
			lineaScanner.useDelimiter(",");
			String valor;
			while (lineaScanner.hasNextLine() && (valor = lineaScanner.nextLine()) != null) {
				System.out.println(valor);
			}
			*/			
			
		}
	}
}