/*

 */
package Libro;

import Libro.Libro;
import java.util.Scanner;

/**
 *
 * @author chuPac
 */
public class Book {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        Libro libro1 = new Libro();
        
        System.out.print("Ingrese el ISBN del libro: ");
        libro1.setISBN(leer.nextLine());
        
        System.out.print("Ingrese el título del libro: ");
        libro1.setTitulo(leer.nextLine());
        
        System.out.print("Ingrese el autor del libro: ");
        libro1.setAutor(leer.nextLine());
        
        System.out.print("Ingrese el número de páginas del libro: ");
        libro1.setNumPaginas(leer.nextInt());
        
      
        
        System.out.println("ISBN: " + libro1.getISBN());
        System.out.println("Título: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Número de páginas: " + libro1.getNumPaginas());
        
    }


}
