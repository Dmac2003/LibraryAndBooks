
package com.mycompany.libraryandbooks;

/**
 *
 * @author dmacp
 */
import java.util.*;
import java.io.*;
public class Books {
    //variables
    private String author;
    private String  title;   
    private String genre;
    private int  yearPublished;
//construcors
public Books (String author1, String title1, String genre1, int yearPublished1){
setAuthor (author1);
setTitle (title1);
setGenre (genre1);
setYearPublished  (yearPublished1);
}

    
//getters and setters
public String getTitle(){return title;}
public void setTitle(String title1){title= title1;}

public String getAuthor(){return author;}
public void setAuthor(String author1){author = author1;}

    public String getGenre() {return genre; }
    public void setGenre(String genre) { this.genre = genre;}

    public int getYearPublished() {return yearPublished; }
    public void setYearPublished(int yearPublished) { this.yearPublished = yearPublished; }

// to string method
    public String toString(){
        return "Title: "+title+ "\n" + "Author: " + author +"\n" + "Genre: " + genre + "\n" + "year published: " + yearPublished +"\n\n";
    }
public void saveBooksToFile() throws IOException {
        System.out.println(toString());
        PrintWriter fileOut = new PrintWriter(new FileWriter("books.txt"));
        fileOut.println(toString());
        fileOut.close();
}
}