public class _06_Ternary_Operator {
    public static void  ternary_operator() {
        char trafic_light_color  = 'R';
        String action = (trafic_light_color == 'R') ? "Stop" 
                        :(trafic_light_color == 'Y') ? "Get ready for the green light" 
                        : "Go";

        System.out.println("Action: " + action);
    }

    public static void main(String[] args)  {
        ternary_operator();
    }
}

//*! Ternary_Operator
//* Used the preform the conditional operation in a single line of code. It is a shorthand for the if-else statement.
//* The syntax of the ternary operator is as follows:
//* (condition) ? expression1 : expression2 In expresion 2 we normally dont write  any condition because it leads to the else part of the if-else statement.

//* If more than two conditions are to be checked then the syntax of the ternary operator is as follows:
//* (condition1) ? (expression1) : (condition2) ? (expression2) : (expression3)

//*! Difference between if-else and ternary operator
//* In an if-else statement, we can execute multiple statements.
//* A ternary operator is mainly used to select one value or result.

//*! Example of if-else statement
//*    if (a > b) {
//*        System.out.println("A is greater");
//*        a++;
//*        b--;
//*    } else {
//*        System.out.println("B is greater");
//*        a--;
//*        b++;
//*    }

//*! Example of ternary operator
// This is invalid because we cannot perform multiple operations in ternary operator
//*    (a > b) ? {
//*        a++;
//*        b--;
//*    } : {
//*        a--;
//*        b++;
//*    };

//*! What to use and when?
//* If you have a simple conditional assignment with a single expression, use the ternary operator for concise code.
//* If you need to execute multiple operations or have complex logic, use the if-else statement.

//* A ternary operator is mainly used to select one value or result. 

//* Use the if-else statement to  preform task that will lead to run large amount of code or any complex operations 
//* To bring the attention of the coder by showing the code in large space  and to write code clean for multiple conditions and actions.