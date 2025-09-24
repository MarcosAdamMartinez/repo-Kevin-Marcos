package imagen;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class LeerImageIO {
    public static void main(String[] args) throws Exception {
        BufferedImage imagen = ImageIO.read(new File("Dibujazo.bmp"));
        System.out.println("Ancho: " + imagen.getWidth());
        System.out.println("Alto: " + imagen.getHeight());
    }
}
