
package com.mycompany.libraryandbooks;

/**
 *
 * @author dmacp
 */
import java.util.*;
import java.io.*;

public class Library {


    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
       
        System.out.println("Enter author:");
        String bookAauthor = scan.nextLine();
        System.out.println("Enter book title:");
        String bookATitle = scan.nextLine();
        System.out.println("Enter genre:");
        String bookAGenre = scan.nextLine();
        System.out.println("Enter year published:");
        int bookAYearPublished = scan.nextInt();
        
         Books bookA = new Books(bookAauthor,  bookATitle, bookAGenre,  bookAYearPublished);
       String z= bookA.toString();
        System.out.println("\n"+bookA.toString()+"\n");
        
        System.out.println("");
        
         System.out.println("Enter 2nd Book Title:");
        String bookBTitle = scan.nextLine();
        
        System.out.println("Enter 2nd Author:");
        String bookBauthor = scan.nextLine();
        
        System.out.println("Enter 2nd Book Genre:");
        String bookBGenre =scan.nextLine();
        
        System.out.println("Enter 2nd Book Year Published:");
        int bookBYearPublished = scan.nextInt();
        
          Books bookB = new Books(bookBauthor,  bookBTitle, bookBGenre,  bookBYearPublished);
       String x = bookB.toString();
        System.out.println("\n"+bookB.toString()+"\n");
        
        
           System.out.println("");
           
                System.out.println("Enter author:");
        String bookCauthor = scan.nextLine();
        System.out.println("Enter book title:");
        String bookCTitle = scan.nextLine();
        System.out.println("Enter genre:");
        String bookCGenre = scan.nextLine();
        System.out.println("Enter year published:");
        int bookCYearPublished = scan.nextInt();
        
         Books bookC = new Books(bookCauthor,  bookCTitle, bookCGenre,  bookCYearPublished);
       String q= bookC.toString();
        System.out.println("\n"+bookC.toString()+"\n");
        
        System.out.println("");
        
        
   
        
        try{ BufferedWriter writer = new BufferedWriter (new FileWriter("src/books.txt"));
        writer.write(x);
        
        System.out.println("Books saved successfully to books.txt!");
        writer.write(z);
        writer.write(q);
        writer.close();
        }catch(IOException e){
    e.printStackTrace();
    }
        }
             
    }

    

