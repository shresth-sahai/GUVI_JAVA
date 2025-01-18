package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// **** only 1 public class is in java
public class Main { // class dec,
    // public -> access specifier

    // static -> method belong to class itself
    // void  retunr type
    // main -> name of the method
    // string[] args -> array of params
    // JVM -> main method in main class
    public static void main(String[] args) {
// user input
//        Scanner scanner=new Scanner(System.in);
//        System.out.print("Enter a name ");
//        String name= scanner.nextLine();// reads a line of input
//
//        System.out.print(" name " + name + "!");
//
//            scanner.close();

//        System.out.print("Hello world!");

 // buffered reader -> try catch

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a name ");
        try{
            String name=reader.readLine();
            System.out.print(" name " + name + "!");
        }
        catch (IOException e){
            System.out.print("Err detected!");
        }





        // prining statements
//        System.out.println("Hello world!");
//        System.out.print("Hello world!");
//        System.out.print("Hello world!");

    }
}

// java ->  high level oop (classes & objects) -> Sun Microsystems (oracle) 1990s
// Write once run anywhere (WORA)
// Platform independence -> Java Program - >
//Java Program - >  compiled into byte code -> intermediate lang executed by JVM

// 3 components of java -> JVM -> java virtual machine ->  byte code -> machine code
// java program -> compiler -> byte code -> JVM -> Machine Code -> CPU -> Output
// java is platform independent but JVM is platform dependent
// JRE -> java runtime ENV   ->  JVM + lib
// JDK -> JRE + programing lang info + compiler (javac) + debugger
// JDK = JRE +  programing lang info + compiler (javac) + debugger

// .java (source code ) -> javac (byte code + stored in class file ) -> JVM
// versions -> JSE -> java stnd edition -> core java
// JEE -> java enterprise edition -> full stack dev
// JME -> java micro/mobile  edition -> mobile dev




