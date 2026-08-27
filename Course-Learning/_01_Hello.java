// this is a simple Java program that prints "Hello, World!" to the console
// System.out.println("Hello, World!"); when we will try to run this in cmd it  will  work as in cmd we run some small thing to test a thing but  here 
// it will show an error because we have not defined a class and a main method which is the entry point of any Java program. 

// How java works
// in our machine something called JVM (Java Virtual Machine) is installed which is responsible for running the java code.
// we run the java code on jvm and it is platform independent but jvm  is platform dependent because it is installed on our machine and it is responsible for running the java code.

public class _01_Hello { // this is the class name and it should be same as the file name because in java we can have only one public class in a file and the file name should be same as the public class name.
// only inside that this class we can define or write our functions or methods and variables.
    public static void /* return  type is nothing it dont return any value*/ main(String[] args) { // it is like def in python but in java we have to define the return type of the function and the parameters of the function. 
        System.out.println("Hello, World!");// this line is used to  print something we will study about it later
    }
}