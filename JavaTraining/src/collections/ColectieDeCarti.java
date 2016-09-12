/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author gheorgheaurelpacurar
 */
public class ColectieDeCarti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a colection for books
        HashSet pu = new HashSet();
        // create 4 books
        Book b1 = new Book("213123123123123");
        Book b2 = new Book("ertwtrwertwetwet");
        Book b3 = new Book("2345234523452345");
        Book b4 = new Book("erterterterterte");
        //add books to collection
        pu.add(b1);
        pu.add(b2);
        pu.add(b3);
        pu.add(b4);
        //print all books of collection in console
        Iterator iterator = pu.iterator();
        while(iterator.hasNext()){
            Book currentBook = (Book)iterator.next();
            System.out.println("ISBN = "+currentBook.getIsbn());
            
        }
    }
    
}
