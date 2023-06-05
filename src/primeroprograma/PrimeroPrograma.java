package primeroprograma;

import java.util.Scanner;

public class PrimeroPrograma {

  public static void main(String[] args) throws Exception {

    try (Scanner scan = new Scanner(System.in)) {
      int suaData;
      int anoHoje;

      System.out.println("coloque seu nascimento");
      suaData = scan.nextInt();
      System.out.println("coloque seu ano atual ");
      anoHoje = scan.nextInt();


      System.out.println(calcularIdade(suaData, anoHoje));
  }

  }

  static String calcularIdade(int dataDeNascimento, int ano) {


    int calcular = ano - dataDeNascimento;
    String m = "";
    if (calcular >= 18) {
      m = "maior de idade";
  
    } else {
      m = "menor de idade";
      
    }
    return m;

  }

}
