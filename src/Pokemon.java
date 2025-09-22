import java.util.Objects;

public class Pokemon implements Comparable<Pokemon> {

    private int nivel;
    private String nombre;
    private String apodo;
    private String movimientos;
    private int numPokedex;

    public Pokemon() {}

    public Pokemon(String nombre, String apodo, int nivel, String movs, int numPokedex) {

        this.apodo = apodo;
        this.nombre = nombre;
        this.nivel = nivel;
        this.numPokedex = numPokedex;
        this.movimientos = movs;

    }

    @Override
    public String toString() {
        return "Pokemon: Nivel: " + nivel + ", Nombre: " + nombre + ", Apodo: " + apodo +", Movimientos: "+movimientos+", Numero Pokedex: " + numPokedex+"\n";
    }

    @Override
    public int compareTo(Pokemon o) {
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

    public boolean equals(Pokemon p) {
        return ((this.nombre.equals(p.nombre)) && (this.apodo.equals(p.apodo)) && (this.nivel == p.nivel) && (this.movimientos.equals(p.movimientos)) && (this.numPokedex == p.numPokedex));
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
