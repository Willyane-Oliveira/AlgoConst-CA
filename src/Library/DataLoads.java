/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


/**
 *
 * @author Willyane
 */
public class DataLoads {

    public ArrayList<BooksData> loadBookList() throws FileNotFoundException, IOException {

        //This will creates a file input stream to read
        FileInputStream file = new FileInputStream("BookList.txt");
        String strLine = "";

        //Objects that will be used in the creation of the library
        ArrayList<BooksData> books = new ArrayList<BooksData>();

	//BufferedReader will read the text files
        try (BufferedReader br = new BufferedReader(new InputStreamReader(file))) {
            strLine = br.readLine(); //Read the next line
            
            while (strLine != null) {
                String[] parts = strLine.split(","); //Separate the data in small parts
                books.add(new BooksData(Integer.parseInt(parts[0]), parts[1], parts[2]));
        
                strLine = br.readLine(); //Read the next line
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return books;
    }

    public ArrayList<ReadersData> loadReadersList() throws FileNotFoundException, IOException {

        //this will creates a file input stream to read
        FileInputStream file = new FileInputStream("ReadersList.txt");
        String strLine = ""; 

        //Objects that will be used in the creation of the library
        ArrayList<ReadersData> readers = new ArrayList<ReadersData>();

        //BufferedReader will read the text files
        try (BufferedReader br = new BufferedReader(new InputStreamReader(file))) {
            strLine = br.readLine();//Read the next line
            
            while (strLine != null) {
                String[] parts = strLine.split(","); //Separate the data in small parts
                readers.add(new ReadersData(Integer.parseInt(parts[0]), parts[1], parts[2]));

                strLine = br.readLine();//Read the next line
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return readers;
    }
    }