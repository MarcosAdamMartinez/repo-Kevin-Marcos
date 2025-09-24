package accesoADatos.Properties;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class LeerClaseEnProperties {

    public static void main(String[] args) {
        //Aqui leeremos el archivo properties que hemos creado en la clase GuardarClaseEnProperties
        //y mostraremos los datos por consola

        //Para leer el archivo properties, usamos la clase accesoADatos.Properties y el metodo load
        //el cual recibe un FileInputStream como parametro

        Properties propertie = new Properties();

        Map <String, String> mapaPokemonRecogidos = new HashMap<String, String>();
        Map <String, String> mapaPokemonRecogidosXML = new HashMap<String, String>();

        /*
         * Aqui creamos un mapa para guardar los pokemones que leemos del archivo properties
         * y otro para guardar los pokemones que leemos del archivo XML
         */

        try {
            FileInputStream archivo = new FileInputStream("Pokemons.properties");
            propertie.load(archivo);

            /*
             * Aqui cargamos el archivo properties y lo leemos con el metodo load
             */

            for (String clave : propertie.stringPropertyNames()) {
                String valor = propertie.getProperty(clave);
                mapaPokemonRecogidos.put(clave, valor);
                //Aqui guardamos los pokemones en el mapa, capturando la clave y el valor y 
                //guardandolos directamente en el mapa
            }

            for (String index : mapaPokemonRecogidos.keySet()) {
                System.out.println("Nombre: " + index + " Apodo: " + mapaPokemonRecogidos.get(index)); 
            }

            //Aqui recorremos el mapa y mostraremos los pokemones por consola

            //Archivo XML
            System.out.println("-----Archivo XML-----");

            FileInputStream archivoXML = new FileInputStream("Pokemons.xml");
            propertie.loadFromXML(archivoXML);

            /*
             * Aqui hicimos exactamente lo mismo que con el archivo properties
             * pero usando el metodo loadFromXML para cargar el archivo XML
             */

            for (String clave : propertie.stringPropertyNames()) {
                String valor = propertie.getProperty(clave);
                mapaPokemonRecogidosXML.put(clave, valor);
            }

            for (String index : mapaPokemonRecogidosXML.keySet()) {
                System.out.println("Nombre: " + index + " Apodo: " + mapaPokemonRecogidosXML.get(index)); 
            }

            /*
             * Un detalle del que nos percatamos es que si leemos los datos del archivo
             * properties, los acentos se muestras correctamente
             */


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
