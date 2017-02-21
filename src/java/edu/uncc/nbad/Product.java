package edu.uncc.nbad;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.Serializable;
/**
 *
 * @author lsafarne
 */
public class Product implements Serializable{
    private String name;
    private String brand;
    public Product(){
        this.name=null;
        this.brand=null;
    }
    public String getName(){
        return this.name;
    }
    public String getBrand(){
        return this.brand;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
}
