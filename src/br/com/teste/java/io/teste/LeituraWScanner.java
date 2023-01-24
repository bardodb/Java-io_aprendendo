package br.com.teste.java.io.teste;

import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class LeituraWScanner {
  public static void main(String[] args) throws Exception {

    Scanner scanner = new Scanner(new File("contas.csv"));//scanneando um arquivo (no caso, um csv)

    while (scanner.hasNextLine()){ //"tem uma próxima linha?" já que tem, continua a reproduzir até ser null/false
      String linha = scanner.nextLine();
      System.out.println(linha);
      Scanner linhaScanner = new Scanner(linha);
      linhaScanner.useLocale(Locale.US);
      linhaScanner.useDelimiter(",");//tirei as virgulas

      String valor1 =  linhaScanner.next();
      String valor2 =  linhaScanner.next();
      String valor3 =  linhaScanner.next();
      String valor4 =  linhaScanner.next();
      String valor5 =  linhaScanner.next();

      System.out.println(valor1 + valor2 +valor3 + valor4 + valor5);

      /*
      String[] valores = linha.split(",");
      System.out.println(valores[3]);*/

    }
    scanner.close();


  }

}
