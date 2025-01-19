package org.example;

public class OutputINcrement {

//char c='AB';-> err
//String c1="AB";
        int x=5;
  // print(x++); print(x)  -> 5 , 6
// print(++x); print(x)  -> 6 , 6

   // values in variable chnage as well

    // int a=5 ; int b =( a++ ) +  (++a ); print(b) print (a) ; 12 , 7

    // int x=10 ; int y= --x + x++ ; print(x)  print (y) -> 10, 18

    // int i =5; int j= i++ + ++i + ++i + i++ ;

    // int x=0 int y= x++ + x++ + x++

    // int a =5 int b= a++ + ++a + a-- + --a

    // int i=1  i = i++ + ++i * --i - i--;




//    // 1. Pre/Post Increment with chars
//      char ch1 = 'a'; -> 97 -> 98
//        System.out.println("Original ch1: " + ch1);        // a
//        System.out.println("Post-increment: " + ch1++);    // a
//        System.out.println("After post-increment: " + ch1);// b
    // System.out.println("After post-increment: " + (int)ch1);
//
//    char ch2 = 'x';
//        System.out.println("\nOriginal ch2: " + ch2);      // x
//        System.out.println("Pre-increment: " + ++ch2);     // y
//        System.out.println("After pre-increment: " + ch2); // y
//
//    // 2. Pre/Post Decrement with chars
//    char ch3 = 'z';
//        System.out.println("\nOriginal ch3: " + ch3);      // z
//        System.out.println("Post-decrement: " + ch3--);    // z
//        System.out.println("After post-decrement: " + ch3);// y
//
//    char ch4 = 'm';
//        System.out.println("\nOriginal ch4: " + ch4);      // m
//        System.out.println("Pre-decrement: " + --ch4);     // l
//        System.out.println("After pre-decrement: " + ch4); // l
//
//    // 3. Arithmetic operations with chars
//    char ch5 = 'A'; //
//    char ch6 = 'C';  //
//        System.out.println("\nAddition of chars: " + (ch5 + ch6));  // Prints sum of ASCII values
//        System.out.println("Difference of chars: " + (ch6 - ch5));  // Prints difference of ASCII values
//
//    // 4. Complex examples
//    char ch7 = 'E';
//    int value = ch7++ + ++ch7;
//        System.out.println("\nOriginal char: E");
//        System.out.println("Expression ch7++ + ++ch7 = " + value);
//        System.out.println("Final value of ch7: " + ch7);
//
//    // 5. Working with numeric values of chars
//    char ch8 = 65;  // ASCII value for 'A'
//        System.out.println("\nChar from ASCII 65: " + ch8);
//        System.out.println("Increment: " + ++ch8);  // 'B'
//
// 6. Overflow example
//char ch9 = 65535;  // Maximum value for char
//        System.out.println("\nMaximum char value: " + (int)ch9);
//    ch9++;
//        System.out.println("After increment: " + (int)ch9);  // Wraps to 0

}
// char -> 16 bit unsigned integer
// 65535      0 to 65532       1111 1111 1111 1111
// 65536      0 to 65532       0000 0000 0000 0000
// 1 leftmost destroyed


// char z='Z' ch++ char ch2=255 ch2++  [
// char ch1=65536 -> err
// char ch2=(char) 65536 -> 0

// char ch3= 65534 print(int(ch3)) ch3++
// print(int(ch3)) ch3++
// print(int(ch3)) ch3++
//print(int(ch3)) -> 1