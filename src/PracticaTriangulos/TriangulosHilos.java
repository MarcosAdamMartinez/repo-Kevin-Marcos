package PracticaTriangulos;

public class TriangulosHilos extends Thread{

    private int id;
    private double altura;
    private double base;
    private int prioridad;

    public TriangulosHilos(int id,double altura, double base, int prioridad) {
        this.id = id;
        this.altura = altura;
        this.base = base;
        this.prioridad = prioridad;


    }

    @Override
    public void run(){
        double area = 0;
        int i;

        for ( i = 1; i <= altura; i++) {
            area += base;
        }

        area += ( altura - ( i - 1 ) ) * base;

        area /= 2;

        System.out.println("El area del triangulo "+id+" es: "+area);
    }
}

