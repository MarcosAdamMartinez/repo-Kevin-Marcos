package pokemon;

import java.io.*;
import java.util.List;
import java.util.Objects;

public class PokemonSerializable implements Comparable<PokemonSerializable>,Serializable{
    private int nivel;
    private String nombre;
    private String apodo;
    private String movimientos;
    private int numPokedex;

    static ObjectOutputStream oos;

    public PokemonSerializable() {}

    public PokemonSerializable(String nombre, String apodo, int nivel, String movs, int numPokedex) {

        this.apodo = apodo;
        this.nombre = nombre;
        this.nivel = nivel;
        this.numPokedex = numPokedex;
        this.movimientos = movs;

    }

    public PokemonSerializable(String nombre, String apodo){
        this.nombre = nombre;
        this.apodo = apodo;
    }

    @Override
    public String toString() {
        return "Pokemon: Nivel: " + nivel + ", Nombre: " + nombre + ", Apodo: " + apodo +", Movimientos: "+movimientos+", Numero Pokedex: " + numPokedex+"\n";
    }

    @Override
    public int compareTo(PokemonSerializable o) {
        if (this.nivel < o.nivel) {
            return -1;
        } else if (this.nivel > o.nivel) {
            return 1;
        } else {
            if (this.numPokedex < o.numPokedex) {
                return -1;
            } else if (this.numPokedex > o.numPokedex) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(nivel, nombre, numPokedex, apodo, movimientos);
    }

    public boolean equals(PokemonSerializable p) {
        return ((this.nombre.equals(p.nombre)) && (this.apodo.equals(p.apodo)) && (this.nivel == p.nivel) && (this.movimientos.equals(p.movimientos)) && (this.numPokedex == p.numPokedex));
    }


    public static void escribir(List<PokemonSerializable> lista){

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("pokemon.dat")));
            for (PokemonSerializable ps: lista){
                oos.writeObject(ps);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try{
                oos.close();
            } catch (Exception e){

            }
        }

    }

    public static void leer(){

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("pokemon.dat")));
            while (true) {
                try {
                    PokemonSerializable ps = (PokemonSerializable) ois.readObject();
                    System.out.print(ps);
                } catch (EOFException e) {
                    break;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(String movimientos) {
        this.movimientos = movimientos;
    }

    public int getNumPokedex() {
        return numPokedex;
    }

    public void setNumPokedex(int numPokedex) {
        this.numPokedex = numPokedex;
    }
}
