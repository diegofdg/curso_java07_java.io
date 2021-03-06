package ar.com.java.io.test;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TestUnicodeEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "C";
        System.out.println(s.codePointAt(0));

        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());

        byte[] bytes = s.getBytes("windows-1252");
        System.out.print(bytes.length + ", windows-1252, ");
        String sNuevo = new String(bytes, "windows-1252");
        System.out.println(sNuevo);

        bytes = s.getBytes("UTF-16");
        System.out.print(bytes.length + ", UTF-16, ");
        sNuevo = new String(bytes, "UTF-16");
        System.out.println(sNuevo);

        bytes = s.getBytes(StandardCharsets.US_ASCII);
        System.out.print(bytes.length + ", US_ASCII, ");
        sNuevo = new String(bytes, "US-ASCII");
        System.out.println(sNuevo);
	}
}