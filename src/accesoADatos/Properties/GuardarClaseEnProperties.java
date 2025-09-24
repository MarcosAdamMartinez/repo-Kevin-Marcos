package accesoADatos.Properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import accesoADatos.pokemon.Pokemon;

public class GuardarClaseEnProperties {

    /*
     * Las clases anterirores nos serviran para guardar una coleccion de objetos
     * Para ello vamos a usar la clase pokemos que ya existe, y usaremos una colleccion
     * que se adapte a lo que necesitemos, y debemos de tener en cuenta que el properties
     * solo guarda String tanto en clave como en valor, asi qu si queremos guardar un objeto
     * debemos adaptarlo para que se guarde en String
     */

    public static void main(String[] args) {

        Map<String, String> mapaPokemon = new HashMap<String, String>();

        Pokemon pikachu = new Pokemon("Pikachu", "Rayo");
        Pokemon charmander = new Pokemon("Charmander", "Llamita");
        Pokemon bulbasaur = new Pokemon("Bulbasaur", "Hoja");
        Pokemon squirtle = new Pokemon("Squirtle", "Aguacito");
        Pokemon jigglypuff = new Pokemon("Jigglypuff", "Canción");
        Pokemon meowth = new Pokemon("Meowth", "Dinero");
        Pokemon psyduck = new Pokemon("Psyduck", "Confusión");
        Pokemon snorlax = new Pokemon("Snorlax", "Dormilón");
        Pokemon eevee = new Pokemon("Eevee", "Evolución");
        Pokemon dragonite = new Pokemon("Dragonite", "Volador");

        /*
         * Aqui creamos varios pokemones y los guardamos en un mapa, donde la clave sera
         * el nombre del accesoADatos.pokemon y el valor sera el apodo del accesoADatos.pokemon, para podeer guardarlos en
         * properties, agreaamos un constructor a la clase accesoADatos.pokemon que solo reciba el nombre y
         * el apodo del accesoADatos.pokemon, y ya con esto guardamos los pokemones en el mapa para despues
         * guardarlos en el properties
         */

        mapaPokemon.put(pikachu.getNombre(), pikachu.getApodo());
        mapaPokemon.put(charmander.getNombre(), charmander.getApodo());
        mapaPokemon.put(bulbasaur.getNombre(), bulbasaur.getApodo());
        mapaPokemon.put(squirtle.getNombre(), squirtle.getApodo()); 
        mapaPokemon.put(jigglypuff.getNombre(), jigglypuff.getApodo());
        mapaPokemon.put(meowth.getNombre(), meowth.getApodo());
        mapaPokemon.put(psyduck.getNombre(), psyduck.getApodo());
        mapaPokemon.put(snorlax.getNombre(), snorlax.getApodo());
        mapaPokemon.put(eevee.getNombre(), eevee.getApodo());
        mapaPokemon.put(dragonite.getNombre(), dragonite.getApodo());

        //Aqui mostramos el mapa
        for (String index : mapaPokemon.keySet()) {
            System.out.println("Nombre: " + index + " Apodo: " + mapaPokemon.get(index));
        }

        //Aqui creamos el properties y guardamos el mapa en el properties

        Properties propertie = new Properties();

        for (String index : mapaPokemon.keySet()) {
                propertie.setProperty(index, mapaPokemon.get(index));
            }

            //Aqui ya creamos el fichero
            
        try {
            FileOutputStream archivo = new FileOutputStream("Pokemons.properties");

            propertie.store(archivo, "Pokemons y sus apodos");

            System.out.println("Archivo creado properties creado correctamente");

            /*
             * Al craer el archivo properties, podemos comprobar que se ha creado correctamente
             * pero los datos no guardan de manera correcta los acentos.
             */

            //Archivo xml
            System.out.println("-----Archivo XML-----");

             FileOutputStream archivoXML = new FileOutputStream("Pokemons.xml");

            propertie.storeToXML(archivoXML, "Pokemons y sus apodos");
            System.out.println("Archivo creado xml creado correctamente");

            /*
             * En cambio al crear el archivo xml, los acentos si se guardan correctamente
             * por lo que si queremos guardar datos con acentos es mejor usar el xml
             */
            
        } catch (IOException e) {
            e.printStackTrace();
        }


       
    }

}
