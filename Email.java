/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.emailapp;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity=500;
    private int defaultPasswordLength=10;
    private String alternateEmail;
    private String companysufix="company.com";
    
    //constructor to recieve firstname and lastename
    public Email(String firstName, String lasteName)
    {
        this.firstName=firstName;
        this.lastName=lasteName;
        
        //call a method asking for department--return the department
        this.department=setDepartment();
        
        //call a method that returns a random password
        this.password=randomPassword(defaultPasswordLength);
        System.out.println("Your Password is="+this.password);
        
        //combite elements to generate email
        email=firstName.toLowerCase()+"."+lasteName.toLowerCase()+"@"+department+"."+companysufix;
       }
    //ask for the department
    
    private String setDepartment(){
        System.out.println("New Worker:"+firstName+ " .Department Code\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n Enter Department CODE");
        Scanner in =new Scanner(System.in);
        int depChoice=in.nextInt();
        
        if(depChoice==1)
        {
            return "sales";
        }
        else if(depChoice==2)
        {
            return "dev";
        }
        else if(depChoice==3)
        {
            return "acct";
        }
        else
        {
            return "";
        }
    }
    
    //generate a random password
    
    private String randomPassword(int length){
        String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password=new char[length];
        for(int i=0;i<length;i++)
        {
            int rand=(int) (Math.random()*passwordSet.length());
            password[i]=passwordSet.charAt(rand);
        }
        return new String(password);
    }
    
    //set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity=capacity;
    }
    
    //set the alternet email
    public void setAlternateEmail(String AltEmail){
        this.alternateEmail=AltEmail;
    }
    
    //change the password
    public void changePassword(String password){
        this.password=password;
    }
    public int getMailboxCapacity(){
    return mailboxCapacity;
    }
    
    public String getAlternateEmail(){
        return alternateEmail;
    }
    public String getPassword(){
        return password;
    

}
    public String showInfo(){
        return "DISPLAY NAME:"+firstName +" "+lastName+
                "\nCOMPANY EMAIL:"+email+
                "\nMAILBOX CAPACITY:"+mailboxCapacity+"mb";
    }
    
}
