/*
 * a-sti.ro
 */
package ioxml;


import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;
/**
 *
 * @author gheorgheaurelpacurar
 */


public class ParseXMLUsingDOM {
   public static void main(String[] args){

      try {	
         File inputFile = new File("C:\\Users\\gheor\\OneDrive\\Documents\\NetBeansProjects\\JavaTrainings\\JavaTraining\\src\\ioxml\\bookstore.xml");
         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.parse(inputFile);
         doc.getDocumentElement().normalize();
         System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
         NodeList nList = doc.getElementsByTagName("book");
         System.out.println("----------------------------");
         int length = nList.getLength();
         System.out.println("XML number of elements = "+length);
         for (int temp = 0; temp < length; temp++) 
         {
            Node nNode = nList.item(temp);
            System.out.println("\nCurrent Element :" + nNode.getNodeName());
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
               Element eElement = (Element) nNode;
               System.out.println("Book ISBN : " 
               + eElement.getElementsByTagName("isbn")
                  .item(0)
                  .getTextContent());
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
      } catch (ParserConfigurationException | SAXException | IOException | DOMException e) {
         e.printStackTrace();
      }
   }
}
