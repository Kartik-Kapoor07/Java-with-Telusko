public class _05_Conditional_Statement {
    public static void if_statement() {
        int num1 = 30;
        int num2 = 10;
        int num3 = 20;

        // Using if statement to compare numbers
        if(num1==num2 && num1==num3) {
            System.out.println(num1 + " = " + num2 + " = " + num3);
        }
        else if (num1 == num2){
            if (num1 > num3) {
                System.out.println(num1 + "=" + num2 + " > " + num3);
            } else {
                System.out.println(num3 + " > " + num2 + " = " + num1);
            }
        }
        else if (num2 == num3){
            if (num2 > num1) {
                System.out.println(num2 + "=" + num3 + " > " + num1);
            } else {
                System.out.println(num1 + " > " + num3 + " = " + num2);
            }
        }
        else if (num1 == num3){
            if (num1 > num2) {
                System.out.println(num1 + "=" + num3 + " > " + num2);
            } else {
                System.out.println(num2 + " > " + num3 + " = " + num1);
            }
        }
        else if (num1>num2){
            if (num1>num3){
                if (num2>num3){
                    System.out.println(num1 + " > " + num2 + " > " + num3);
                } else {
                    System.out.println(num1 + " > " + num3 + " > " + num2);
                }
            }
            else if (num3>num1){
                if (num2>num1){
                    System.out.println(num3 + " > " + num2 + " > " + num1);
                } else {
                    System.out.println(num3 + " > " + num1 + " > " + num2);
                }
            }
        }
        else if (num2>num1){
            if (num2>num3){
                if (num1>num3){
                    System.out.println(num2 + " > " + num1 + " > " + num3);
                } else {
                    System.out.println(num2 + " > " + num3 + " > " + num1);
                }
            }
            else if (num3>num2){
                if (num1>num2){
                    System.out.println(num3 + " > " + num1 + " > " + num2);
                } else {
                    System.out.println(num3 + " > " + num2 + " > " + num1);
                }
            }
        }
        else if (num3>num1){
            if (num3>num2){
                if (num1>num2){
                    System.out.println(num3 + " > " + num1 + " > " + num2);
                } else {
                    System.out.println(num3 + " > " + num2 + " > " + num1);
                }
            }
            else if (num2>num3){
                if (num1>num3){
                    System.out.println(num2 + " > " + num1 + " > " + num3);
                } else {
                    System.out.println(num2 + " > " + num3 + " > " + num1);
                }
            }
        }
        else {
            System.out.println("Cannot Determine!");
        }
        }
    public static void main(String[] args){
            if_statement();
        }
    }

//*! Conditional Statements(Used for the comparision of values and to perform different actions based on the comparison results)
//* if:Used to execute first block for the compasion of values and need to write comparison condition in the brackets only one time in a comparion
//* else if:Used to execute second block for the compasion of values and need to write comparison condition in the brackets and can be written as  many times as per the requirement in a comparion
//* else:Used to execute last block for the compasion of values and need not to write comparison condition in the brackets and can be written only once in a comparion

//*! Raw Example
//* Assume we have two numercial values which are x and y and we need to compare them and print the result of the comparision:

//*     for this normally we can use if, else if and else statements to compare the values of x and y and print the result of the comparision
//*     comparsion can include the following instructions:

//*         •x == y in the if statement because we dont need to go further if this condition is true and we can print the result of the comparision
//*         •x > y in the else if statement because we need to check this condition if the first condition is false and we can print the result of the comparision
//*         •now the only last possible condition that is remaining is x < y:so in this case when we know there is no other things remaining then we can simply write the else statement without any conditionand print or perform the action that we want to perform.