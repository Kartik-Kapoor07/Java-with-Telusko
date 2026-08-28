public class _02_Variable {
    public static void variable(String[] args) {
        int num1 = 10;
        int num2 = 15;
        int sum = num1 + num2;
        int subtract = num1 - num2;
        System.out.println(sum);
        System.out.println(subtract);

    }

    public static void datatype(String[] args) {
        byte b = 127; // 1 byte
        short s = 32767; // 2 bytes
        int i = 2147483647; // 4 bytes
        long l = 9223372036854775807L; // 8 bytes
        float f = 3.14f; // 4 bytes
        double d = 3.141592653589793; // 8 bytes
        char c = 'A'; // 2 bytes
        boolean bool = true; // 1 bit (but typically stored as 1 byte)
    }
    
    public static void main(String[] args) { // main is the starting door any any java program will start from main method and it is the entry point of any java program.

        variable(args);   // run variable()
        datatype(args);   // run datatype()

    }

}
//*  public   static   void   main   (String[] args)   {
//*   │        │       │      │          │             │
//*   │        │       │      │          │             └─ start method body
//*   │        │       │      │          └─ input/arguments
//*   │        │       │      └─ method name
//*   │        │       └─ return type
//*   │        └─ can run without creating an object
//*   └─ accessible from outside 


//*! Above comment taken from gpt

//*                 Data types
//* Primitives data types
//* │
//* ├──Integer
//* │  ├──byte --> 1byte
//* │  ├──short --> 2bytes
//* │  ├──int --> 4bytes
//* │  └──long --> 8bytes
//* ├──Floating-point
//* │  ├──float --> 4bytes
//* │  └──double --> 8bytes
//* ├──Character
//* │  └──char --> 2bytes
//* ├──Boolean
//*    └──boolean --> true or false
//*                     Java does not specify a fixed storage size

//*! 1Byte = 8 bits
//*! Formula to  calculate  the range is: -2^(n-1) to 2^(n-1)-1 where n is the number of bits used to store the value.
//*! Note the  char character data type is 2 bytes because it uses Unicode which is a character encoding standard that allows for the representation of a wide range of characters from different languages and scripts. Unicode uses 16 bits (2 bytes) to represent each character, allowing for a total of 65,536 possible characters. This is why the char data type in Java is 2 bytes in size.