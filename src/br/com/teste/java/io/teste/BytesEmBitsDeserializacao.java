package br.com.teste.java.io.teste;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class BytesEmBitsDeserializacao {

  public static void main(String[] args) throws IOException, ClassNotFoundException {




    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
    String nome = (String) ois.readObject();
      ois.close();

    System.out.println(nome);
  }
}
