/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author sejal
 */
public class Community {
    public String comm;
    public String street;
    public ArrayList<House> houseDirectory;
    public Object City;

    public ArrayList<House> getHouseDirectory() {
        return houseDirectory;
    }

    public void setHouseDirectory(ArrayList<House> houseDirectory) {
        this.houseDirectory = houseDirectory;
    }
    
    public String getComm() {
        return comm;
    }

    public void setComm(String comm) {
        this.comm = comm;
    }
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
    @Override
    public String toString(){
        return comm;
        
    }

    public Object getCity() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setCity(String city) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
