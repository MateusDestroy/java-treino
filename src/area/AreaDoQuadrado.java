package area;

import java.util.Scanner;

public class AreaDoQuadrado {

    public static void main(String [] args) throws Exception {

        try (Scanner scan = new Scanner(System.in)){
              

            int baseQuarado;
            int alturaQuadrado;

            

           System.out.println("Coloque a base do seu quadrado"); 
           baseQuarado = scan.nextInt();
           System.out.println("Coloque a altura do seu quadrado");
           alturaQuadrado = scan.nextInt();

           System.out.println("O resultado é " + calcularAreaDoQuadrado(baseQuarado, alturaQuadrado));

              

        }
        
           
        
        
        }

    

    static int calcularAreaDoQuadrado(int base, int altura) {
        int x = base * altura;
        return x;
    }
}
