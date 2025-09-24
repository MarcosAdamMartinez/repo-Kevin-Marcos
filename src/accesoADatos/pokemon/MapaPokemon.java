package accesoADatos.pokemon;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapaPokemon {

    Map<String, ArrayList<Pokemon>> equipo3;

    public MapaPokemon(){
        equipo3 = new LinkedHashMap<String,ArrayList<Pokemon>>();
    }

    public void añadirPokemon(Pokemon p){

        if(!equipo3.containsKey(p.getNombre())){
            equipo3.put(p.getNombre(), new ArrayList<Pokemon>());
        }

        if(!contiene(equipo3.get(p.getNombre()),p)) {
            equipo3.get(p.getNombre()).add(p);
        }

    }

    private boolean contiene(ArrayList<Pokemon> lista, Pokemon p){

        boolean result = false;

        for(Pokemon pok: lista){

            if(pok.equals(p)){
                result = true;
            }

        }
        return result;
    }

    @Override
    public String toString(){

        return equipo3.toString();

    }

}
