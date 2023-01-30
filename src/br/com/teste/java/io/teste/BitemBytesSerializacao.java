package br.com.teste.java.io.teste;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class BitemBytesSerializacao {
  public static void main(String[] args) throws IOException  {
    // TODO Auto-generated method stub

    Cliente cliente = new Cliente();
    cliente.setNome("Braia");
    cliente.setProfissao("suporte técnico");
    cliente.setCpf("12312312312");


    ObjectOutputStream aos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));

    aos.writeObject(cliente.getNome());

    aos.close();


  }

}
