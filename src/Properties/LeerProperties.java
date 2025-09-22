package Properties;

import java.io.FileInputStream;
import java.util.Properties;

public class LeerProperties {

    public static void main(String[] args) {
        Properties propertie = new Properties();

        try {
            FileInputStream archivo = new FileInputStream("Perros.properties");
            propertie.load(archivo);

            for (String clave : propertie.stringPropertyNames()) {
                String valor = propertie.getProperty(clave);
                System.out.println(clave + " = " + valor);
            }

            //Archivo XML
            System.out.println("-----Archivo XML-----");

            FileInputStream archivoXML = new FileInputStream("Perros.xml");
            propertie.loadFromXML(archivoXML);

            for (String clave : propertie.stringPropertyNames()) {
                String valor = propertie.getProperty(clave);
                System.out.println(clave + " = " + valor);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
