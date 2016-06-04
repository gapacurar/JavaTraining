/*
 * a-sti.ro
 */
package ioxml;


import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
/**
 *
 * @author gheorgheaurelpacurar
 */


public class ParseXMLUsingDOM {
   public static void main(String[] args){

      try {	
         File inputFile = new File("/Users/gheorgheaurelpacurar/Desktop/Training Java 8/JavaProjects/GheorgheAurelPacurar/JavaTraining/JavaTraining/src/ioxml/bookstore.xml");
         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.parse(inputFile);
         doc.getDocumentElement().normalize();
         System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
         NodeList nList = doc.getElementsByTagName("bookstore");
         System.out.println("----------------------------");
         for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            System.out.println("\nCurrent Element :" + nNode.getNodeName());
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
               Element eElement = (Element) nNode;
               System.out.println("Book ISBN : " + eElement.getAttribute("isbn"));
               System.out.println("Book title : " 
               + eElement
                  .getElementsByTagName("title")
                  .item(0)
                  .getTextContent());
               System.out.println("Book list of authors : " 
               + eElement
                  .getElementsByTagName("authors")
                  .item(0)
                  .getTextContent());
               System.out.println("Book formats available : " 
               + eElement
                  .getElementsByTagName("formats")
                  .item(0)
                  .getTextContent());
               System.out.println("Book price : " 
               + eElement
                  .getElementsByTagName("price")
                  .item(0)
                  .getTextContent());
            }
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}
