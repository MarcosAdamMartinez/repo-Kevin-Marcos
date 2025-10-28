package PracticaTriangulos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Scanner tecladoInt = new Scanner(System.in);
        boolean asignarPriroidad;

        System.out.println("Porfavor ingresa cauntos traingulos quieres calcular: ");
        int triangulos = tecladoInt.nextInt();

        System.out.println("Quieres asignar prioridad al calculo de areas? (s/n)");
        String confirmarPrioridad = teclado.nextLine();

        if (confirmarPrioridad.toLowerCase().equals("s")){
            asignarPriroidad = true;
        } else {
            asignarPriroidad = false;
        }

        List<TriangulosHilos> listaTriangulos = new ArrayList<>();

        for (int i = 0; i < triangulos; i++) {

            System.out.println("Triangulo: " + (i + 1));

            System.out.println("Porfavor introduce la base");
            double base = teclado.nextDouble();

            System.out.println("Porfavor introduce la altura");
            double altura = teclado.nextDouble();

            if (asignarPriroidad == true){
                System.out.println("Porfavor introduce la prioridad del 1 al 10");
                int prioridad = teclado.nextInt();
                listaTriangulos.add( new TriangulosHilos(i+1, altura, base, prioridad));
            } else {
                listaTriangulos.add( new TriangulosHilos(i+1, altura, base, 5));
            }

        }

        for(TriangulosHilos th : listaTriangulos){
            th.start();
            try {
                th.join();
            } catch (Exception e){
                e.printStackTrace();
            }
        }


    }
}
