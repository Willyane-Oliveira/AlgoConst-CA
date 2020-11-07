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
public class ReadersData {

    private int id;
    private String name;
    private String address;

    //The constructor will initialize the Reader object
    public ReadersData(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    //This method will return the Id of reader
    public int getId() {
        return id;
    }

    //This method is a setter for the Id
    public void setId(int id) {
        this.id = id;
    }

    //This method will return reader's name
    public String getName() {
        return name;
    }

    //This method is a setter for the name
    public void setName(String name) {
        this.name = name;
    }

    //This method will return reader's address
    public String getAddress() {
        return address;
    }

     //This method is a setter for the address
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() { //This method will get a String object representing the value of the Number Object
        return "Id: " + id + "\n"
                + "Name: " + name + "\n"
                + "Address: " + address + "\n";
    }
}
