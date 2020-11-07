/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

/**
 *
 * @author Willyane
 */
public class BooksData {

    private int id = 0;
    private String title;
    private String author;

    //The constructor will initialize the Book object
    public BooksData(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }
    
    public boolean equals(Object ref) {
        BooksData other = (BooksData) ref;

        if ((this.id == other.id) && (this.title.equalsIgnoreCase(other.title))
                && (this.author.equalsIgnoreCase(other.author))) {
            return true;
        } else {
            return false; //If the loop ends and didn't find anything, then return false.
        }
    }

    @Override
    public String toString() { //This method will get a String object representing the value of the Number Object
        return "Id: " + getId() + "\n"
                + "Title: " + getTitle() + "\n"
                + "Author: " + getAuthor() + "\n";
    }

    //This method will return the Id of book
    public int getId() {
        return id;
    }

    //This method is a setter for the Id
    public void setId(int id) {
        this.id = id;
    }

    //This method will return the title of book
    public String getTitle() {
        return title;
    }

    //This method is a setter for the title
    public void setTitle(String title) {
        this.title = title;
    }

    //This method will return the author of book
    public String getAuthor() {
        return author;
    }

    //This method is a setter for the author
    public void setAuthor(String author) {
        this.author = author;
    }
}
