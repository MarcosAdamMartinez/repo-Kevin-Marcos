package accesoADatos.pokemon;

import java.util.ArrayList;
//import java.util.HashMap;
import java.util.List;
//import java.util.Map;


public class PruebaPokemon {
    public static void main(String[] args) {
        Pokemon p1 = new Pokemon("Xerneas","Quispe",73,"Fuerza Lunar,Carantoña,Esfera Aural,Testarazo",735);
        Pokemon p2 = new Pokemon("Camerupt","El Chepas",56,"Terremoto,Antiaereo,Lanzallamas,Golpe Cuerpo",543);
        Pokemon p3 = new Pokemon("Arceus","Arceus",89,"Hiperrayo,Sentencia,A Bocajarro,Danza Espada",389);
        Pokemon p4 = new Pokemon("Bidoof","Jesucristo",78,"Golpe Roca,Corte,Fuerza,Surf",245);
        Pokemon p5 = new Pokemon("Yveltal","Mandangón",73,"Fuerza Lunar,Carantoña,Esfera Aural,Testarazo",736);
        Pokemon p6 = new Pokemon("Yveltal","Mandangon",73,"Golpe Bajo,Pulso Umbrio,Hiperrayo,Pajaro Osado",736);
        Pokemon p7 = new Pokemon("Yveltal","Mandangon",73,"Fuerza Lunar,Carantoña,Esfera Aural,Testarazo",736);

        List<Pokemon> equipo = new ArrayList<Pokemon>();
//        Set<Pokemon> equipo2 = new LinkedHashSet<Pokemon>();
//        MapaPokemon mapa = new MapaPokemon();

        equipo.add(p1);
        equipo.add(p2);
        equipo.add(p3);
        equipo.add(p4);
        equipo.add(p5);

//        Pokemon.escribir(equipo);
//        Pokemon.leer();

        PokemonSerializable ps1 = new PokemonSerializable("Xerneas","Quispe",73,"Fuerza Lunar,Carantoña,Esfera Aural,Testarazo",735);
        PokemonSerializable ps2 = new PokemonSerializable("Camerupt","El Chepas",56,"Terremoto,Antiaereo,Lanzallamas,Golpe Cuerpo",543);
        PokemonSerializable ps3 = new PokemonSerializable("Arceus","Arceus",89,"Hiperrayo,Sentencia,A Bocajarro,Danza Espada",389);
        PokemonSerializable ps4 = new PokemonSerializable("Bidoof","Jesucristo",78,"Golpe Roca,Corte,Fuerza,Surf",245);
        PokemonSerializable ps5 = new PokemonSerializable("Yveltal","Mandangón",73,"Fuerza Lunar,Carantoña,Esfera Aural,Testarazo",736);

        List<PokemonSerializable> equipo3 = new ArrayList<PokemonSerializable>();

        equipo3.add(ps1);
        equipo3.add(ps2);
        equipo3.add(ps3);
        equipo3.add(ps4);
        equipo3.add(ps5);

//        PokemonSerializable.escribir(equipo3);
        PokemonSerializable.leer();

//        Reflexión: ¿mejoraría en algo usar ficheros binarios bien sea con DataOutputStream o con ObjectOutputStream (e Input) Razonad la respuesta.
//        Usar ficheros binarios podria mejorar eficiencia, evitando errores de parseo y ficheros grandes como en CSV.
//        DataOutputStream permite control y portabilidad, mientras que ObjectOutputStream es rápido y cómodo en Java pero frágil
//        ante cambios de clase. La desventaja principal es que los binarios no son legibles ni fáciles de depurar manualmente.


//        equipo2.add(p1);
//        equipo2.add(p2);
//        equipo2.add(p3);
//        equipo2.add(p4);
//        equipo2.add(p5);
//        equipo2.add(p6);
//
//        mapa.añadirPokemon(p1);
//        mapa.añadirPokemon(p2);
//        mapa.añadirPokemon(p3);
//        mapa.añadirPokemon(p4);
//        mapa.añadirPokemon(p5);
//        mapa.añadirPokemon(p6);
//        mapa.añadirPokemon(p7);

//        System.out.println(equipo);
//        System.out.println("\n\n");
//
//        System.out.println(equipo2);
//        System.out.println("\n\n");
//
//        equipo.sort(null);
//        System.out.println("\n\n");
//
//        System.out.println(equipo);
//        System.out.println("\n\n");

//        System.out.println(equipo3);
//        System.out.println("\n\n");

//        System.out.println(equipo3.get("Yveltal"));
//        System.out.println("\n\n");

//        System.out.println(mapa);

    }
}