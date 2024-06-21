/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyect.wallet;

/**
 *
 * @author fing.labcom
 */
public class Main {
    public static void main(String[] args){
        Person personObject = new Person();
        Person personObject2 = new Person("Kevin",5);
        Person personObject3 = new Person("Leidy");
        Main mainObject=new Main();
        mainObject.exampleMethod();
        exampleStaticMethod();
    }
    public static String exampleStaticMethod(){
        return "Hi";
    }
    public void exampleMethod(){
        
    }
}
