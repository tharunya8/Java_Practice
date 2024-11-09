//import java.util.Scanner;
//
//public class SwithExample {
//    public static void main(String[] args) {  // Correct method signature
//        Scanner scanner = new Scanner(System.in);
//        double balance = 500.00; // Starting balance
//
//        System.out.println("Welcome to the Simple Bank!");
//        System.out.println("Select an option:");
//        System.out.println("1. Check Balance");
//        System.out.println("2. Exit");
//
//        int choice = scanner.nextInt();
//
//        switch (choice) {
//            case 1:
//                System.out.println("Your current balance is: $" + balance);
//                break;
//            case 2:
//                System.out.println("Goodbye!");
//                break;
//            default:
//                System.out.println("Invalid option. Please choose 1 or 2.");
//                break;
//        }
//
//        scanner.close();
//    }
//}
//
//public class SwithExample {
//    public static void main(String[] args) {
//        int count = 10; // Starting count
//
//        while (count > 0) {
//            System.out.println(count); // Print the current count
//            count--; // Decrement the count by 1
//        }
//
//        System.out.println("Happy New Year!"); // Final message
//    }
//}

//import java.util.Scanner;
//
//public class SwithExample {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int number;
//
//        do {
//            System.out.println("Enter a number greater than or equal to 10:");
//            number = scanner.nextInt();
//        } while (number < 10);
//
//        System.out.println("Thank you, the number " + number + " is valid!");
//        scanner.close();
//    }
//}


//public class SwithExample {
//    public static void main(String[] args) {
//        // Loop from 1 to 5
//        System.out.println("Resulted Numbers are: "); // Print the current numbe
//        for (int i = 1; i <= 3; i++) {
//            System.out.println(i); // Print the current numbe
//        }
//    }
//}

//public class SwithExample {
//    public static void main(String[] args) {
//        String[] items = {"apple", "banana", "orange", "mango"};
//        String searchItem = "orange";
//
//        for (String item : items) {
//            if (item.equals(searchItem)) {
//                System.out.println(searchItem + " found! Stopping the search.");
//                break;  // Exit the loop as the item is found
//            }
//            System.out.println("Checking " + item);
//        }
//    }
//}

//public class SwithExample {
//    public static void main(String[] args) {
//        int[] numbers = {1, -2, 3, -4, 5};
//
//        for (int num : numbers) {
//            if (num < 0) {
//                System.out.println("Skipping negative number: " + num);
//                continue;  // Skip the rest of the loop for negative numbers
//            }
//            System.out.println("Processing number: " + num);
//        }
//    }
//}


//public class SwithExample {
//    public static void main(String[] args) {
//        // Declare an array to store employee names
//        String[] employeeNames = {"John", "Emily", "Sophia", "Daniel"};
//
//        // Display the names of all employees
//        System.out.println("Employee names:");
//        for (int i = 0; i < employeeNames.length; i++) {
//            System.out.println(employeeNames[i]);
//        }
//
//        // Access a specific employee by index
//        System.out.println("\nSecond employee is: " + employeeNames[1]);  // Output: Emily
//    }
//}



//public class SwithExample {
//    public static void main(String[] args) {
//        // Step 1: Declare and initialize an array with 5 student marks (integers)
//        int[] studentMarks = {85, 90, 78, 88, 92};
//
//        // Step 2: Calculate total marks
//        int totalMarks = 0;
//        for (int i = 0; i < studentMarks.length; i++) {
//            totalMarks += studentMarks[i]; // Add each student's marks to total
//        }
//
//        // Step 3: Calculate average marks (no decimals)
//        int averageMarks = totalMarks / studentMarks.length;
//
//        // Step 4: Display total and average marks
//        System.out.println("Total marks: " + totalMarks);
//        System.out.println("Average marks: " + averageMarks);
//    }
//}

 public class SwitchExample {   // Corrected class name
    private String trainName;
    // Getter for trainName
    public String getName() {
        return trainName;
    }
    // Setter for trainName
    public void setName(String name) {
        this.trainName = name;
    }
    public static void main(String[] args) {
        Train t = new Train(); // Creating a Train object
        t.setName("Vaigai Express"); // Setting the train name
        // Printing the trainName using the getter method
        System.out.println(t.getName());
    }
}
// Assuming you have a Train class
class Train {
    private String trainName;
    public String getName() {
        return trainName;
    }
    public void setName(String name) {
        this.trainName = name;
    }
}
