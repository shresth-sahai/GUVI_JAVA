package org.example;

import java.lang.foreign.GroupLayout;

// kind of varibles ->
// 1 member / instance variable ->  it is a variable of the class
// local variable -> defined inside a fucntion/method , if method finishes it get destroyed
// static varible -> only 1 copy exist All objects can access it
// method paramater -> passed into methods
// constructor variables
public class VariableTypes {
    int a; double f;  // instance variables
    // static
    static String name="ABC";
    static int rollNo=123;

    // constructor -> used to initialize the class
    public VariableTypes(int a ,double f){
        a=1;
        f=3.1;
        rollNo= rollNo+1;
    }
    // method variable
    public void add(int a ,int b ){
        int res=a+b+rollNo; // local variables
        System.out.println(res);
    }

    public void sub(int a ,int b ){
        int res=a-b+rollNo; // local variables
        System.out.println(res);
    }
//static int rollNo=123; -> err
    static int i=9;


}
