package area;

import java.util.Scanner;

public class AreaDoTriangulo {

    public static void main(String[] args) throws Exception {

        try (Scanner scan = new Scanner(System.in)) {
            double baseTriangulo;
            double alturaTriangulo;

            System.out.println("Coloque a base do seu triângulo");
            baseTriangulo = scan.nextDouble();

            System.out.println("Coloque a altura do seu Trinagulo");
            alturaTriangulo = scan.nextDouble();


            System.out.println("O valor da área do triangulo é " + calcularAreaTriangulo(baseTriangulo, alturaTriangulo));

        }

    }

    static double calcularAreaTriangulo(double base, double altura) {
        double x  =  (base * altura) / 2;
        return x;

    }

}
