package ar.com.java.io.test;

import java.io.File;
import java.util.Scanner;

public class TestLectura3 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(new File("cuentas.csv"));

        while (scanner.hasNextLine()) {
            String linea = scanner.nextLine();
            System.out.println(linea);

            Scanner lineaScanner = new Scanner(linea);
            lineaScanner.useDelimiter(",");

            String tipoCuenta = lineaScanner.next();
            String agencia = lineaScanner.next();
            String numero = lineaScanner.next();
            String titular = lineaScanner.next();
            String saldo = lineaScanner.next();
        }

        scanner.close();
	}
}