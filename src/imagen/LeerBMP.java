package imagen;
import java.io.RandomAccessFile;
import java.io.IOException;

public class LeerBMP {
    public static void main(String[] args) {
        String ruta = "Dibujazo.bmp";

        try (RandomAccessFile raf = new RandomAccessFile(ruta, "rw")) {
            raf.seek(18);
            int ancho = Integer.reverseBytes(raf.readInt());

            raf.seek(22);
            int alto = Integer.reverseBytes(raf.readInt());

            System.out.println("Dimensiones originales:");
            System.out.println("Ancho: " + ancho + " px");
            System.out.println("Alto: " + alto + " px");

            int nuevoAncho = ancho * 2;
            int nuevoAlto = alto * 2;

            raf.seek(18);
            raf.writeInt(Integer.reverseBytes(nuevoAncho));
            raf.seek(22);
            raf.writeInt(Integer.reverseBytes(nuevoAlto));

            System.out.println("Nuevas dimensiones escritas:");
            System.out.println("Ancho: " + nuevoAncho + " px");
            System.out.println("Alto: " + nuevoAlto + " px");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}