package br.com.teste.java.io.teste;

import java.io.*;

public class TesteEscrita3 {

  public static void main(String[] args) throws IOException {

    // TODO Auto-generated method stub
    //fluxo de entrada com arquivos (FileInputStream)
    //quando eu for fazer um IO, preciso lançar uma exception pra garantir que se der erro, vou ser avisada

/*    OutputStream fos = new FileOutputStream("lorem3.txt");
    Writer osw = new OutputStreamWriter(fos);
    BufferedWriter bw = new BufferedWriter(osw);*/

    //FileWriter fw  = new FileWriter("lorem3.txt");
    //BufferedWriter bw = new BufferedWriter(fw);

    PrintStream ps = new PrintStream(new File("arquivo2.txt"));

    ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
    ps.println();
    ps.println();
    ps.println("asdouhasoidhiopas asdiuhdosaihas adsuhaosih ");


    ps.close();


  }


}
