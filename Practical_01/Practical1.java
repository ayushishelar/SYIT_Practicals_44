/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practical1;

/**
 *
 * @author Ayushi
 */
public class Practical1 {

    public static void main(String[] args) {
        
        Cars c=new Cars(60,"MH04AY1341", 150, "ENG0002"); 
        Bus b=new Bus(3,450, "MH02SH3246", 300, "ENG0001"); 
        Bike k=new Bike("MH05HA3452", 50, "ENG0005"); 
          c.displayDetails(); 
          b.displayDetails(); 
          k.displayDetails();
    }
}
