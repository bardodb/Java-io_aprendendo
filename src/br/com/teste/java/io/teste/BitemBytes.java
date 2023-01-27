package br.com.teste.java.io.teste;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class BitemBytes {
  public static void main(String[] args) throws IOException {
    // TODO Auto-generated method stub

    String nome = "braian";

    ObjectOutputStream aos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));

    aos.writeObject(nome);


  }

}
