import java.util.ArrayList;
//import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
//import java.util.Map;
import java.util.Set;

public class PruebaPokemon {
    public static void main(String[] args) {
        Pokemon p1 = new Pokemon("Xerneas","Quispe",73,"Fuerza Lunar,Carantoña,Esfera Aural,Testarazo",735);
        Pokemon p2 = new Pokemon("Camerupt","El Chepas",56,"Terremoto,Antiaereo,Lanzallamas,Golpe Cuerpo",543);
        Pokemon p3 = new Pokemon("Arceus","Arceus",89,"Hiperrayo,Sentencia,A Bocajarro,Danza Espada",389);
        Pokemon p4 = new Pokemon("Bidoof","Jesucristo",78,"Golpe Roca,Corte,Fuerza,Surf",245);
        Pokemon p5 = new Pokemon("Yveltal","Mandangon",73,"Fuerza Lunar,Carantoña,Esfera Aural,Testarazo",736);
        Pokemon p6 = new Pokemon("Yveltal","Mandangon",73,"Golpe Bajo,Pulso Umbrio,Hiperrayo,Pajaro Osado",736);
        Pokemon p7 = new Pokemon("Yveltal","Mandangon",73,"Fuerza Lunar,Carantoña,Esfera Aural,Testarazo",736);

        List<Pokemon> equipo = new ArrayList<Pokemon>();
        Set<Pokemon> equipo2 = new LinkedHashSet<Pokemon>();
//        Map<String,ArrayList<Pokemon>> equipo3 = new HashMap<String,ArrayList<Pokemon>>();
        MapaPokemon mapa = new MapaPokemon();

        equipo.add(p1);
        equipo.add(p2);
        equipo.add(p3);
        equipo.add(p4);
        equipo.add(p5);

        equipo2.add(p1);
        equipo2.add(p2);
        equipo2.add(p3);
        equipo2.add(p4);
        equipo2.add(p5);
        equipo2.add(p6);

//        equipo3.put("Xerneas",new ArrayList<Pokemon>());
//        equipo3.put("Camerupt",new ArrayList<Pokemon>());
//        equipo3.put("Arceus",new ArrayList<Pokemon>());
//        equipo3.put("Bidoof",new ArrayList<Pokemon>());
//        equipo3.put("Yveltal",new ArrayList<Pokemon>());

//        equipo3.get("Xerneas").add(p1);
//        equipo3.get("Camerupt").add(p2);
//        equipo3.get("Arceus").add(p3);
//        equipo3.get("Bidoof").add(p4);
//        equipo3.get("Yveltal").add(p5);
//        equipo3.get("Yveltal").add(p6);

        mapa.añadirPokemon(p1);
        mapa.añadirPokemon(p2);
        mapa.añadirPokemon(p3);
        mapa.añadirPokemon(p4);
        mapa.añadirPokemon(p5);
        mapa.añadirPokemon(p6);
        mapa.añadirPokemon(p7);

        System.out.println(equipo);
        System.out.println("\n\n");

        System.out.println(equipo2);
        System.out.println("\n\n");

        equipo.sort(null);
        System.out.println("\n\n");

        System.out.println(equipo);
        System.out.println("\n\n");

//        System.out.println(equipo3);
//        System.out.println("\n\n");

//        System.out.println(equipo3.get("Yveltal"));
//        System.out.println("\n\n");

        System.out.println(mapa);

    }
}