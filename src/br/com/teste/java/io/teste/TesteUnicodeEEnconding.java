package br.com.teste.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEnconding {
  public static void main(String[] args) throws UnsupportedEncodingException {

    String s = "C";
    System.out.println(s.codePointAt(0));


    Charset charset = Charset.defaultCharset();
    System.out.println(charset.displayName());

    byte[] bytes = s.getBytes("windows-1252");
    System.out.println(bytes.length + ", windows-1252 ");

    bytes = s.getBytes(StandardCharsets.UTF_16);
    System.out.println(bytes.length + ", UTF-16");


  }
}
