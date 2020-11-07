/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Willyane
 */
public class LibraryManagementSystem {

    public static void main(String[] args) throws FileNotFoundException, IOException {//This exception will be thrown by constructors if the file is inaccessible

        Search search = new Search();
        Sorting sort = new Sorting();
        Register register = new Register();
        
        DataLoads data = new DataLoads();
        ArrayList<BooksData> allBooks = data.loadBookList();
        ArrayList<ReadersData> allReaders = data.loadReadersList();
        
        Scanner sc = new Scanner(System.in);
        Boolean loop = true;
        
        do{
            System.out.println(" \n *** LIBRARY MENU *** \n");
            System.out.println("1: Search Book by Author");
            System.out.println("2: Search Book by Title");
            System.out.println("3: Search Reader by Name");
            System.out.println("4: Search Reader by ID");
            System.out.println("5: Sort Book by Author");
            System.out.println("6: Sort Book by Title");
            System.out.println("7: Sort Reader by ID");
            System.out.println("8: Sort Reader by Name");
            System.out.println("9: Register a Borrow");
            System.out.println("10: Register a Return");
            System.out.println("11: List all books that was borrowed by a reader \n");
            System.out.println("Choose an option from the Menu");
            
            try{
                int entry = Integer.parseInt(sc.nextLine());
                switch(entry){
                    case 1:
                        System.out.println("Entry with the author name \n");
                        String author = sc.nextLine();
                        System.out.println(search.searchBookByAuthor(allBooks, author));
                        break;
                    case 2:
                        System.out.println("Entry with the book title \n");
                        String title = sc.nextLine();
                        System.out.println(search.searchBookByTitle(allBooks, title));
                        break;
                    case 3:
                        System.out.println("Entry with the reader name \n");
                        String reader = sc.nextLine();
                        System.out.println(search.searchReaderByName(allReaders, reader));
                        break; 
                    case 4:
                        System.out.println("Entry with the reader ID \n");
                        String id = sc.nextLine();
                        System.out.println(search.searchReaderById(allReaders, Integer.parseInt(id)));
                        break;
                    case 5:
                        System.out.println("Books are going to be sorted by their Author");
                        System.out.println(sort.sortBooksByAuthor(allBooks));
                        break;
                    case 6:
                        System.out.println("Books are going to be sorted by Title");
                        System.out.println(sort.sortBooksByTitle(allBooks));
                        break;  
                    case 7:
                        System.out.println("Readers are going to be sorted by ID");
                        System.out.println(sort.sortReadersById(allReaders));
                        break;   
                    case 8:
                        System.out.println("Readers are going to be sorted by Name");
                        System.out.println(sort.sortReadersByName(allReaders));
                        break;
                    case 9:
                        System.out.println("Entry with the reader ID");
                        String Id = sc.nextLine();
                        
                        System.out.println("Entry with the book title");
                        String book = sc.nextLine();
                        
                        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); //standardizes the date and time
                        LocalDateTime now = LocalDateTime.now(); //get local information
                        String strDate = dt.format(now); //delivers the converted result
                       
                        String[] array = {Id, book, strDate};
                        
                        System.out.println(register.registerBorrow(array));
                        break;
                    case 10:
                        System.out.println("Entry with the reader ID");
                        String iD = sc.nextLine();
                        
                        System.out.println("Entry with the book title");
                        String bookTitle = sc.nextLine();
                        
                        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); //standardizes the date and time
                        LocalDateTime dateNow = LocalDateTime.now(); //get local information
                        String dateRet = date.format(dateNow); //delivers the converted result
                       
                        String[] returnArray = {iD, bookTitle, dateRet};
                        
                        System.out.println(register.registerReturn(returnArray));
                        break;
                    case 11:
                        System.out.println("Entry with the reader ID");
                        String idBorrow = sc.nextLine();
                        System.out.println(register.borrowList(Integer.parseInt(idBorrow)));
                        break;
                    case 0: //If zero is typed, the loop is interrupted
                        loop = false;
                        break; 
                }
            }catch(NumberFormatException e){
                System.out.println(e);
            }
                
            }while(loop);
            }
    }
