/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.emailapp;

/**
 *
 * @author LENOVO
 */
public class EmailApp {

    public static void main(String[] args) {
        Email em1=new Email("John", "Smith");
        
        em1.setAlternateEmail("js@gmail.com");
        System.out.println(em1.getAlternateEmail());
        
        System.out.println(em1.showInfo());
        
    }
}
