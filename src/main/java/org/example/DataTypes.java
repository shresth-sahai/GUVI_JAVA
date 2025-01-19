package org.example;

// types pf variables - > primitive type -> char,byte,short,int,long,float,double,boolean
//non primitve -> class ,interface,array,string enum

// Widening / automatic conversion -> lower data type to higher data type ->
// byte , short , int , long
public class DataTypes {
    char c='A';// ASCII Values - > 65 -> A , 66-> B ...... Z a-> 97 ......122
    // 2 bytes -> 16 bits -> range of values -> 0 to 65535
    // default value is NULL
    byte a; // 1 byte -> 8bits range -> -128 to 127 , default value is zero
    short x; // 2 bytes , -32768 to 32768 default value is 0
    int b;// 4 bytes default value -> 0, range -> -2^31 to 2^31-1
    long t;// 8 bytes deafult value -> 0 -2^63 to 2^63-1
    boolean r; // 1 bit and value is true / false
// widening concept
int var=10;
long varLong=var;// automatically converted into long
    // narrowing // downcasting
    int integerVariable =10;
    byte byteVaribale=(byte) integerVariable;

//    int num = 130;   -128 to 127
//    byte b = (byte) num;
//        System.out.println(b);
    // 125 126 127 .... -128 -127 -126 ....
    // 130 -> 1000010
    // 130 / 2 -> q -> 65 rem -> 0
    // 65/2 -> q-> 32  rem 1
    // 32/2 ->q 16 rem 0
    // 16/2 -> q 8 rem 0
    // 8/2 ->q 4 rem ->0
    // 4/2 ->q ->2 rem ->0
    //2/2 ->q 1 rem -> -0
    // 1/2 -> 0 , 1
    // byte -> -128 to 127
    //  byte   1000010
int num=130 ; //  00000000    00000000   00000000   1000010
    //   byte b1=130 ; // 1000010
    // byte uses 2's complement ->  signed number
    // MSB 0 -> postive     1 negetive
    // here is 1 no will be -
    // 1000010   invert bits -> 0111101
    // 0111101+1 = 0111110 -> 126
    // -126
    // 127 ->      00000000    00000000   00000000   01111111
    // byte ->       01111111 msb -> 0 -> positive
    // range -> -128 to 127 no chnage


    // -> trick -> byte -> -128 to 127 -> 256
    // result = orignal val mod 256
    // num = - 130 mod 256 - > -126
    // num -> 127 % 256 -> 127
    // num -> 300 % 256 -> 44
    // -130
    // trick fr not fitting the range
    // 1000 -> 232
    // 232 -256 = -24

// 200 % 256 -> 200
    // 200- 256 = -56

    // promotion during expression
    byte b11=1;
    byte b12=127;
//    byte sum= b11 + b12; outsied the range
    int sum=b11+b12;



}
