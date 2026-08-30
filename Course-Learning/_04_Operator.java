public class _04_Operator {
    public static void arithmetic_operators(){
        int a = 10;
        int b = 3;

        // Declaring the values of variables a and b
        System.out.println("Initial values: a = " + a + ", b = " + b);

        // Performing arithmetic operations
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        int preIncrement = ++a; // a becomes 11, then preIncrement is assigned 11
        System.out.println("Pre Increment: " + preIncrement);

        int preDecrement = --b; // b becomes 2, then preDecrement is assigned 2
        System.out.println("Pre Decrement: " + preDecrement);

        int postIncrement = a++; // postIncrement is assigned 11, then a becomes 12
        System.out.println("Post Increment variable  value: " + postIncrement);
        System.out.println("Value of a after Post Increment: " + a);

        int postDecrement = b--; // postDecrement is assigned 2, then b becomes 1
        System.out.println("Post Decrement variable value: " + postDecrement);
        System.out.println("Value of b after Post Decrement: " + b);
    }

    public static void assignment_operators(){
        int x = 5;

        // Declaring the initial value of x
        System.out.println("Initial value of x: " + x);

        // Using assignment operators
        x += 3; // x = x + 3
        System.out.println("After x += 3: " + x);

        x -= 2; // x = x - 2
        System.out.println("After x -= 2: " + x);

        x *= 4; // x = x * 4
        System.out.println("After x *= 4: " + x);

        x /= 3; // x = x / 3
        System.out.println("After x /= 3: " + x);

        x %= 2; // x = x % 2
        System.out.println("After x %= 2: " + x);
    }

    public static void comparison_operators(){
        int x = 10;
        int y = 20;

        // Declaring the values of variables x and y
        System.out.println("Values: x = " + x + ", y = " + y);

        // Performing comparison operations
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y: " + (x > y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x >= y: " + (x >= y));
        System.out.println("x <= y: " + (x <= y));
    }

    public static void logical_operators(){
        boolean a = true;
        boolean b = false;

        // Declaring the values of variables a and b
        System.out.println("Values: a = " + a + ", b = " + b);

        // Performing logical operations
        System.out.println("a && b: " + (a && b));
        System.out.println("a || b: " + (a || b));
        System.out.println("!a: " + (!a));
    }

    public static void main(String[] args) {
        arithmetic_operators();
        assignment_operators();
        comparison_operators();
        logical_operators();
    }
}

//*! Arithmetic  Operator
//*         Operator	        Name	            Description	                                Example 
//*         +                   Addition	        Adds together two values	                x + y
//*         -	                Subtraction	        Subtracts one value from another	        x - y	
//*         *	                Multiplication	    Multiplies two values	                    x * y	
//*         /	                Division	        Divides one value by another	            x / y	
//*         %	                Modulus	            Returns the division remainder	            x % y
//*         ++{variable}	    pre Increment	    Increase value by 1 first, then use	        ++x	 
//*         --{variable}	    pre Decrement	    Decrease value by 1 first, then use	        --x
//*         {variable}++	    post Increment	    Use first, then increase value by 1	        x++
//*         {variable}--	    post Decrement	    Use first, then decrease value by 1	        x--

//*! Assignment Operator(These are used to make life easier and to make the code more readable and shorter)
//*         Operator	    example	            same as	                               
//*         =	            x = 5	            x = 5	
//*         +=	            x += 3	            x = x + 3	
//*         -=	            x -= 3	            x = x - 3	
//*         *=	            x *= 3	            x = x * 3	
//*         /=	            x /= 3	            x = x / 3	
//*         %=	            x %= 3	            x = x % 3		

//*! Comparison Operator
//*         Operator	    Name	                        Example	
//*         ==	            Equal to	                    x == y	
//*         !=	            Not equal	                    x != y	
//*         >	            Greater than	                x > y	
//*         <	            Less than	                    x < y	
//*         >=	            Greater than or equal to	    x >= y	
//*         <=	            Less than or equal to	        x <= y

//*! Logical Operator
//*         Operator	    Name	           Description	                                                       Example
//*         &&	            Logical AND	       Returns true if both statements are true	                           (x < 5 && x < 10)
//*         ||	            Logical OR	       Returns true if one of the statements is true	                   (x < 5 || x < 4)
//*         !	            Logical NOT	       Reverses the result, returns false if the statement is true	       !(x < 5)