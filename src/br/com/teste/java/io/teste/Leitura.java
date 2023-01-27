package br.com.teste.java.io.teste;

import java.io.*;

public class Leitura {

  public static void main(String[] args) throws IOException {

    // TODO Auto-generated method stub
    //fluxo de entrada com arquivos (FileInputStream)
    //quando eu for fazer um IO, preciso lançar uma exception pra garantir que se der erro, vou ser avisada

    FileInputStream fis = new FileInputStream("lorem.txt");//estabeleci uma entrada de arquivo
    Reader isr = new InputStreamReader(fis);//aqui trasnformei os bits e os 'bytes' em um caractere, ao invés de usar inputstreamreader posso usar só reader
    BufferedReader br = new BufferedReader(isr);  //se a ideia é ler uma linha inteira, precisamos "guardar" cada caractere até dar para completar uma linha
    //fis = FileInputStream
    //isr = InputStreamReader
    //br = bufferedReader


    String linha = br.readLine();
    while (linha != null) {
      System.out.println(linha);
      linha = br.readLine();
    }

//readline lê a linha até chegar em null, então se eu não quiser que chegue, é só explicar no programa que linha não é null e continua


  }


}
