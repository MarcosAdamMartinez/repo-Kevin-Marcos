package randomAccessFile;

import java.io.*;
import java.util.*;

    public class randomAccess {
        public static void main(String[] args) {
            File archivo = new File("datos.bin");
            int nums = 20;
            ArrayList<Integer> numeros = new ArrayList<>(nums);
            Scanner teclado = new Scanner(System.in);

            if (archivo.exists()) {
                try (DataInputStream dis = new DataInputStream(new FileInputStream(archivo))) {
                    for (int i = 0; i < nums; i++) {
//                        Añadimos el numero introducido por teclado
                        numeros.add(dis.readInt());
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(archivo))) {
//                    Llenamos con 0 la lista
                    for (int i = 0; i < nums; i++) {
                        dos.writeInt(0);
                        numeros.add(0);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            try {

                RandomAccessFile raf = new RandomAccessFile(archivo, "rwd");
                int posicion;

                do {
                    System.out.println("Contenido actual:");
                    for (int i = 0; i < nums; i++) {
                        System.out.print(numeros.get(i) + " ");
                    }
                    System.out.println();

                    System.out.print("Introduce la posicion para cambiar: 0-19 y negativo para salir: ");
                    posicion = teclado.nextInt();

                    if (posicion < 0) {
                        System.out.println("Adios . . .");
                    } else if (posicion >= 0 && posicion < nums) {
                        System.out.print("Introduce el nuevo numero: ");
                        int numNuevo = teclado.nextInt();

                        numeros.set(posicion, numNuevo);
//                          Busca por posicion y como los int ocupan 4Bytes se mueve de 4 en 4
                        raf.seek(posicion * 4L);
                        raf.writeInt(numNuevo);

                    } else {
                        System.out.println("Posicion introducida no valida .");
                    }
                } while (posicion >= 0);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
