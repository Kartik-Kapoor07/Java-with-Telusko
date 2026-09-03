public class _08_Loop {
    public static void while_loop() {
        int i = 1;
        while (i<=4){
            System.out.println(i + ") Outer loop");
            int j = 1;
            while (j<=2){
                System.out.println("•Inner loop");
                j++;
            }
            i++;
        }
    }

    public  static void do_while_loop() {
        do {
            System.out.println("Do while loop");
        } while (false);
    }

    public static void for_loop() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Day" + i);
            for (int j = 1; j <= 8; j++) {
                System.out.println("    " + (j + 8) + " - " + (j + 9));
            }
        }
    } 

    public static void main(String[] args) {
        while_loop();
        do_while_loop();
        for_loop();
    }
}

//*! Comparison of while loop, do-while loop, and for loop
//* Feature              while loop                  do-while loop               for loop

//* Condition            Checked before              Checked after               Checked before
//*                      executing the loop body     executing the loop body     executing the loop body

//* Minimum executions   0 times                     At least 1 time             0 times

//* Best used when       Number of iterations        Code must execute           Number of iterations
//*                      is unknown                  at least once               is known

//* Initialization       Usually outside             Usually outside             Usually inside
//*                      the loop                    the loop                    the loop

//* Update               Usually inside              Usually inside              Usually inside
//*                      the loop body               the loop body               the loop header

//* Syntax               while(condition)            do { } while(condition);    for(initialization;
//*                                                                              condition; update)

//*! Above comment from GPT

//*! Example for while loop  Taken from my Student Portal System(SPS) Project

// while True:
//         print("\n--- Student Portal System ---")
//         print("1. Sign up")
//         print("2. Login")
//         print("3. Exit")
// 
//         choice = input("Enter your choice: ")
// 
//         if choice == "1":
//             student_id = sign_in()
//             if student_id is not None:
//                 print(f"Your student ID is {student_id}")
//                 Student(student_id)
// 
//         elif choice == "2":
//             student_id = log_in()
//             if student_id is not None:
//                 student_dashboard(student_id)
// 
//         elif choice == "3":
//             print("Goodbye!")
//             break
// 
//         else:
//             print("Invalid choice.")

// In the above example we use while loop becuase we dont know how many time the use the  system  
