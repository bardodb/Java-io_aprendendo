package br.com.teste.java.io.teste;

import java.io.*;
import java.net.Socket;

public class CopiarArquivo {

  public static void main(String[] args) throws IOException {


    Socket s = new Socket();



      InputStream fis = System.in;//aqui eu digito
      //s.getInputStream(); //forma de conversa por rede
    //FileInputStream fis = new FileInputStream("lorem.txt");
    Reader isr = new InputStreamReader(fis);
    BufferedReader br = new BufferedReader(isr);

    OutputStream fos =  System.out;//aqui recebo oq digitei
      //s.getOutputStream();//aqui eu recebo a conversa
      // new FileOutputStream("funcionou.txt"); se eu colocar essa linha com in, vou escrever e vai gerar um arquivo txt

    Writer osw = new OutputStreamWriter(fos);
    BufferedWriter bw = new BufferedWriter(osw);

    String linha = br.readLine();
    while (linha != null && !linha.isEmpty()){
      bw.write(linha);
      bw.newLine();
      bw.flush();
      linha = br.readLine();
    }

    bw.close();
    br.close();

    
  }


}
