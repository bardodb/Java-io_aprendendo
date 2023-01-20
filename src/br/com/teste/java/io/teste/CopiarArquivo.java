package br.com.teste.java.io.teste;

import java.io.*;

public class CopiarArquivo {

  public static void main(String[] args) throws IOException {


    FileInputStream fis = new FileInputStream("lorem.txt");
    Reader isr = new InputStreamReader(fis);
    BufferedReader br = new BufferedReader(isr);

    OutputStream fos = new FileOutputStream("lorem3.txt");
    Writer osw = new OutputStreamWriter(fos);
    BufferedWriter bw = new BufferedWriter(osw);

    String linha = br.readLine();
    while (linha != null){
      bw.write(linha);
      linha = br.readLine();
    }

    bw.close();
    br.close();

    
  }


}
