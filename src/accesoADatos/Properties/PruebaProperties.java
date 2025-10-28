package accesoADatos.Properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

public class PruebaProperties {
    public static void main(String[] args) {

        Properties propertie = new Properties();

        /*Para usar el properties importamos la clase que esta en el util, y la 
         * empezamos a usar
         */

        //Para agregar valores al properties usamos el metodo setProperty el cual resive dos
        //parametros, el primero es la clave y el segundo el valor y ambos son String
        propertie.setProperty("firulais", "Labrador" + ", " + 12);
        propertie.setProperty("max", "Pastor_Aleman" + ", " + 10);
        propertie.setProperty("rocky", "Bulldog" + ", " + 2);
        propertie.setProperty("luna", "Beagle" + ", " + 9);
        propertie.setProperty("toby", "Golden_Retriever" + ", " + 14);
        propertie.setProperty("daisy", "Chihuahua" + ", " + 5);
        propertie.setProperty("zeus", "Rottweiler" + ", " + 4);

        try {
            FileOutputStream archivo = new FileOutputStream("Perros.properties");

            propertie.store(archivo, "Razas de Perros");
            System.out.println("Archivo creado properties creado correctamente");

            System.out.println("-----Archivo XML-----");

            FileOutputStream archivoXML = new FileOutputStream("Perros.xml");

            propertie.storeToXML(archivoXML, "Razas de Perros");
            System.out.println("Archivo creado xml creado correctamente");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
