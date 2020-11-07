/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

import java.util.Date;

/**
 *
 * @author Willyane
 */
public class Borrows {
    int readerId;
    String bookTitle;
    String date;
    
    //The constructor will initialize Borrow object
    public Borrows(int readerId, String bookTitle, String date){
        this.readerId = readerId;
        this.bookTitle = bookTitle;
        this.date = date;
    }
    @Override //
    public String toString(){//This method will get a String object representing the value of the Number Object
        return "Reader Id: "+readerId+"\n"+
               "Book: "+bookTitle+"\n"+
               "Borrow Date: "+date+"\n";
    }
    
}
