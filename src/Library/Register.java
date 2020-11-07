/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Willyane
 */
public class Register {
    //will register that a reader has borrowed a book
    public String registerBorrow(String[] borrows) throws IOException {

        try {
            BufferedWriter writeBorrow = new BufferedWriter(new FileWriter("borrows.txt", true));
            writeBorrow.write(borrows[0] + "," + borrows[1] + "," + borrows[2] + "\n");
            writeBorrow.close();
        } catch (IOException e) {
            System.out.println("An error has ocurred");
            e.printStackTrace();
        }
        
        return "Sucessful Borrow";
    }
    //will register that a reader has returned a book
    public String registerReturn(String[] retArrray) throws IOException {

        try {
            BufferedWriter writeReturn = new BufferedWriter(new FileWriter("returns.txt", true));
            writeReturn.write(retArrray[0] + "," + retArrray[1] + "," + retArrray[2] + "\n");
            writeReturn.close();
        } catch (IOException e) {
            System.out.println("An error has ocurred");
            e.printStackTrace();
        }
        
        return "Sucessful Return";
    }
    //Will list the books that a specific reader have borrowed
    public ArrayList<Borrows> borrowList(int id) throws IOException {

        FileInputStream file = new FileInputStream("borrows.txt");
        String strLine = ""; 

        ArrayList<Borrows> borrows = new ArrayList<Borrows>();
        ArrayList<Borrows> newList = new ArrayList<Borrows>();

        //BufferedReader will read the text files
        try (BufferedReader br = new BufferedReader(new InputStreamReader(file))) {
            strLine = br.readLine();//Read the next line
            while (strLine != null) { //Add data from borrows.txt
                String[] parts = strLine.split(","); //Separate the data in small parts
                borrows.add(new Borrows(Integer.parseInt(parts[0]), parts[1], parts[2]));
                strLine = br.readLine();//Read the next line
        }
         for (int i = 0; i < borrows.size(); i++) {
                if (id == borrows.get(i).readerId) {//if the informed data exist in borrows.txt they will be added to the new list
                    newList.add(borrows.get(i));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return newList;
    }
}
