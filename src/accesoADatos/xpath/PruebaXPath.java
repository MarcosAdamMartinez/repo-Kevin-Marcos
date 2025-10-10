package accesoADatos.xpath;

import java.net.MalformedURLException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

public class PruebaXPath {

	final static String URL_XML_TIEMPO = "https://www.aemet.es/xml/municipios/localidad_28079.xml";
	final static String URL_FICHERO = "/home/alumno/git/repo-Kevin-Marcos/tiempo.xml";
	
	public static void main(String[] args) throws MalformedURLException{
		
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true); // never forget this!
		
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(URL_XML_TIEMPO);
			XPathFactory xpathfactory = XPathFactory.newInstance();
			XPath xpath = xpathfactory.newXPath();
			
			XPathExpression expr = xpath.compile("//dia[1]/temperatura/*/text()");
			Object result = expr.evaluate(doc, XPathConstants.NODESET);
			NodeList nodes = (NodeList) result;

			for (int i = 0; i < nodes.getLength(); i++) {

			  System.out.println(nodes.item(i).getParentNode().getNodeName() + ":" + nodes.item(i));
			}
		    
			expr = xpath.compile("//dia[1]/viento[@periodo='18-24']/*/text()");
			result = expr.evaluate(doc, XPathConstants.NODESET);
			nodes = (NodeList) result;
			
			for (int i = 0; i < nodes.getLength(); i++) {

				  System.out.println(nodes.item(i).getParentNode().getNodeName() + ":" + nodes.item(i));
				}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
