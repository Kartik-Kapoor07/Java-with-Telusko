public class _07_Switch_Statement {

    // In this break will end the  execution of switch statement whenever any condition is met and perform its action.
    public static void switch_statement() {
        int difficulty_level = 2;
        switch (difficulty_level) {
            case 1:
                System.out.println("Easy");
                break;
            case 2:
                System.out.println("Medium");
                break;
            case 3:
                System.out.println("Hard");
                break;
            default:
                System.out.println("Invalid difficulty level");
        }
    }

    // This is modern way of writing switch statement it allows us to multiple conditions in a single case.
    public  static void alarm_1(){
        String day = "Monday";
        switch (day) {
            case "Monday","Tuesday","Wednesday","Thursday","Friday":
                System.out.println("Wake up at 7:00 AM");
                break;
            case "Saturday","Sunday":
                System.out.println("Wake up at 9:00 AM");
                break;
            default:
                System.out.println("Invalid day");
        }
    }

    // This  is also modern way of writing switch statement and instead  of using the break we can use the arrow operator to perform the action and it will automatically break the switch statement.
    public  static void alarm_2(){
        String day = "Not monday";
        switch (day) {
            case "Monday","Tuesday","Wednesday","Thursday","Friday" -> System.out.println("Wake up at 7:00 AM");
            case "Saturday","Sunday" -> System.out.println("Wake up at 9:00 AM");
            default -> System.out.println("Invalid day");
        }
    }

    // We can also use switch statement in this way it helps to assign the value to a variable based on the condition and it will automatically break the switch statement.
    public  static void alarm_3(){
        String day = "Sunday";
        String result = "";
        switch (day) {
            case "Monday","Tuesday","Wednesday","Thursday","Friday" -> result = "Wake up at 7:00 AM";
            case "Saturday","Sunday" -> result = "Wake up at 9:00 AM";
            default -> result = "Invalid day";
        }

        System.out.println(result);
    }

    // yield provides a value from a switch expression.
    // After yielding the value, that switch expression finishes. 
    // We can also  store the values of statement by saying variable = switch statement + conditions + actions
    public  static void alarm_4(){
        String day = "Saturday"; 
        String result = switch (day) {
            case "Monday","Tuesday","Wednesday","Thursday","Friday" : yield "Wake up at 7:00 AM";
            case "Saturday","Sunday" : yield "Wake up at 9:00 AM";
            default : yield "Invalid day";
        };
        System.out.println(result);
    }

    public static void main(String[] args) {
        switch_statement();
        alarm_1();
        alarm_2();
        alarm_3();
        alarm_4();
    }
}

//*! Switch_Statement
//* It is used to perform multiple conditional checks on a single variable. 
//* If any one condition get true then all the remaining conditions will be executed  without checking the other conditions if we dont use break.
//* The switch condition will only run when 100% value match for condition is matched
//* A switch cannot directly check ranges or conditions such as >, <, >=, or <=.
//* However, we can perform calculations and other operations inside a case during action time. 
//* If no conditions gets true then the default block will be executed and if we dont add break it will also  run default like other cases.

//* additionally added we can also write more than one condition in a single case block. For example check the alarm method above. 

//*! Example of switch statement
// String color =  user_input_color;
// switch (color) {
//     case "Red":
//         System.out.println("Stop");
//         break;
//     case "Yellow":
//         System.out.println("Get ready for the green light");
//         break;
//     case "Green":
//         System.out.println("Go");
//         break;
//     default:
//         System.out.println("Invalid color");
// }

//* It is better than if else because in this case when user enters the color then we can use exact wording to match the condition.
//* It might look unreasonable because it can be done using the if else statement but it is better to use switch statement because it is more readable and easy to understand and it is more efficient for multiple conditions when we dont need to perform or execute any code based on the operations.