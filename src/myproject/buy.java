/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

import java.math.BigDecimal;

/**
 *
 * @author User
 */
public class buy {
    public BigDecimal id;
    private String name,author,status,type;
    private byte[] picture;
    public buy(  BigDecimal id,String name,String author,String type,String status){
    this.id=id;
    this.name=name;
    this.author=author;
    this.type=type;
    this.status=status;
    
    
    }
public buy(){
 
}

    
   
    public BigDecimal getId(){
            return id;}
     
     public String getname(){
            return name;} 
     public String getauthor(){
            return author;} 
     public String gettype(){
            return type;} 
    public String getstatus(){
            return status;} 
}
