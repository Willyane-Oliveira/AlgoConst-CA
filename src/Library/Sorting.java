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
public class Sorting {
    //Will sort a book by author
    public ArrayList<BooksData> sortBooksByAuthor(ArrayList<BooksData> books) {

        for (int i = 0; i < books.size(); i++) {
            for (int j = 0; j < books.size() -1; j++) {
                if ( books.get(j).getAuthor().compareTo(books.get(j+1).getAuthor())>0 ) {
                    BooksData temp = books.get(j);
                    books.set(j, books.get(j + 1));
                    books.set(j + 1, temp);
                }
            }
        }
        return books;
    }
    //Will sort a book by title
    public ArrayList<BooksData> sortBooksByTitle(ArrayList<BooksData> books) {

        for (int i = 0; i < books.size(); i++) {
            for (int j = 0; j < books.size() -1; j++) {
                if ( books.get(j).getTitle().compareTo(books.get(j+1).getTitle())>0 ) {
                    BooksData temp = books.get(j);
                    books.set(j, books.get(j + 1));
                    books.set(j + 1, temp);
                }
            }
        }
        return books;
    }
    //Will sort a reader by Id
    public ArrayList<ReadersData> sortReadersById(ArrayList<ReadersData> readers) {
        for (int i = 0; i < readers.size(); i++) {
            for (int j = 0; j < readers.size() - 1; j++) {
                if(readers.get(j).getId() > readers.get(j + 1).getId()){
                    ReadersData temp = readers.get(j);
                    readers.set(j, readers.get(j + 1));
                    readers.set(j+1, temp);
                }
                
            }
        }
        return readers;
    }
    //Will sort a reader by name
    public ArrayList<ReadersData> sortReadersByName(ArrayList<ReadersData> readers) {

        for (int i = 0; i < readers.size(); i++) {
            for (int j = 0; j < readers.size() - 1; j++) {
                if (readers.get(j).getName().compareTo(readers.get(j+1).getName()) > 0) {
                    ReadersData temp = readers.get(j);
                    readers.set(j, readers.get(j + 1));
                    readers.set(j + 1, temp);
                }
            }
        }
        return readers;
    }
}
