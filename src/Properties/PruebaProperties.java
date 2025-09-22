package Properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PruebaProperties {
    public static void main(String[] args) {

        Properties propertie = new Properties();

        /*Para usar el properties importamos la clase que esta en el util, y la 
         * empezamos a usar
         */

        //Para agregar valores al properties usamos el metodo setProperty el cual resive dos
        //parametros, el primero es la clave y el segundo el valor y ambos son String
        propertie.setProperty("firulais", "Labrador");
        propertie.setProperty("max", "Pastor_Aleman");
        propertie.setProperty("rocky", "Bulldog");
        propertie.setProperty("luna", "Beagle");
        propertie.setProperty("toby", "Golden_Retriever");
        propertie.setProperty("daisy", "Chihuahua");
        propertie.setProperty("zeus", "Rottweiler");

        try {
            FileOutputStream archivo = new FileOutputStream("Perros.properties");
            /* */

            propertie.store(archivo, "Razas de Perros");
            System.out.println("Archivo creado properties creado correctamente");

            //Archivo xml

            FileOutputStream archivoXML = new FileOutputStream("Perros.xml");

            propertie.storeToXML(archivoXML, "Razas de Perros");
            System.out.println("Archivo creado xml creado correctamente");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
