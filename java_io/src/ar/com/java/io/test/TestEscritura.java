package ar.com.java.io.test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TestEscritura {

	public static void main(String[] args) throws IOException {
		// Generar el archivo
		OutputStream fileOutputStream = new FileOutputStream("texto-generado.txt");
		
		// Procesar el archivo
		Writer outputStreamWriter = new OutputStreamWriter(fileOutputStream);
		
		// Escribir el archivo
		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
		
		bufferedWriter.write("Primera linea de mi archivo generado");
		bufferedWriter.newLine();
		bufferedWriter.write("Segunda linea de mi archivo generado");
		
		bufferedWriter.close();
	}
}