/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

import java.util.ArrayList;

/**
 *
 * @author Willyane
 */
public class Search {
    //Will search a book by Author
    public boolean searchBookByAuthor(ArrayList<BooksData> book, String author) {

        boolean found = false;

        for (BooksData b : book) {
            if (b.getAuthor().equalsIgnoreCase(author)) {
                System.out.println(b);
                found = true;
            }
        }
        if (found == false) {
            System.out.println("Book not found in the Library");
        }
        return found;
    }
    //Will search a book by Title
    public boolean searchBookByTitle(ArrayList<BooksData> book, String info) {

        boolean found = false;

        for (BooksData b : book) {
            if (b.getTitle().equalsIgnoreCase(info)) {
                System.out.println(b);
                found = true;
            }
        }
        if (found == false) {
            System.out.println("Book not found in the Library");
        }
        return found;
    }
    //Will search a reader by name
    public boolean searchReaderByName(ArrayList<ReadersData> reader, String name) {

        boolean found = false;

        for (ReadersData r : reader) {
            if (r.getName().equalsIgnoreCase(name)) {
                System.out.println(r);
                found = true;
            }
        }
        if (found == false) {
            System.out.println("Reader not found in the System");
        }
        return found;
    }
    //Will search a reader by Id
    public boolean searchReaderById(ArrayList<ReadersData> reader, int id) {

        boolean found = false;

        for (ReadersData r : reader) {
            if (r.getId() == id) {
                System.out.println(r);
                return  found = true;
            }
        }
        if (found == false) {
            System.out.println("Reader not found in the System");
        }
        return found;
    }
}
