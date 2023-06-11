
package calcularvelocidadedistancia;

import java.util.Scanner;

public class CalcularVelocidadeDIstancia {

    public static void main(String[] args) throws Exception {

        
        try (Scanner scan = new Scanner(System.in)){
            double tempo;
            double distancia;


            System.out.println("Coloque a distancia percorrida");
            distancia = scan.nextDouble();
            System.out.println("Coloque o tempo percorrido ");
            tempo = scan.nextDouble();
            System.out.println("A velocidade media é de " + calcularVelocidadeMedia(tempo, distancia) +"km/h");

            
        }



    }


    static double calcularVelocidadeMedia (double tempo, double distancia) {

        double calculoVelociadeMedia = distancia / tempo;
        return calculoVelociadeMedia;
    }



}



