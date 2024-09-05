public class Main {

    public static void main(String[] args) {
        // Exercise Day 4
        //No.1
        showTableN();
        //No.2
        showTreeN();
        // No. 3
        showContinueStop();
        // No.4





        // Self Exercise
        //showPriceMenu();

    }
    public static void showTableN() {
        int option = InputUser.getInt("Please input the size table number would you like to see e.g. 5:");
        for(int n = 1;  n <= option; n++){

            for (int m = 1; m <= option; m++) {

                System.out.print(m * n + " ");
            }
            System.out.println();
        }



    }
    public static void showTreeN() {
        int option = InputUser.getInt("Please input the size tree star number would you like to see e.g. 4:");
        for (int o = 1; o <= option; o++) {

            for (int p = 1; p <= option - o; p++) {
                System.out.print(" ");
            }


            for (int q = 1; q <= 2 * o - 1; q++) {
                System.out.print("*");
            }

            System.out.println();
        }



    }
     public static void showContinueStop() {
         int option = InputUser.getInt("Please input the menu number you would like to order:\n" +
                 "1. Continue\n" +
                 "2. Stop\n" +
                 "Your choice: ");

         if (option == 1) {
             System.out.println("Continue");
         } else if (option == 2) {
             System.out.println("Stop");

         }
         else{
             System.out.println("Your input choice is not available");
         }

     }

    public static void showPriceMenu() {
        int option = InputUser.getInt("Please input the menu number you would like to order:\n" +
                "1. Fried Chicken\n" +
                "2. Pasta\n" +
                "3. Bulgogi\n" +
                "Your choice: ");

        if (option == 1) {
            System.out.println("The price is: 30000 IDR");
        } else if (option == 2) {
            System.out.println("The price is: 40000 IDR");
        } else if (option == 3) {
            System.out.println("The price is: 50000 IDR");
        } else {
            String optionOther = InputUser.getString("You entered an invalid number. Would you like to order something not available in the menu?\n" +
                    "Type 'Yes' or 'No': ");
            if (optionOther.equalsIgnoreCase("Yes")) {
                showNewRequestMenu();
            } else {
                System.out.println("Thank you! Please choose from the available menu.");
            }
        }
    }

    public static void showNewRequestMenu() {
        String newOption = InputUser.getString("Please tell us what food you would like to order (e.g., Kimchi, Sushi, Rujak): ");

        switch (newOption.toLowerCase()) {
            case "kimchi":
                System.out.println("Kimchi price is 34000 IDR");
                break;
            case "sushi":
                System.out.println("Sushi price is 39000 IDR");
                break;
            case "rujak":
                System.out.println("Rujak price is 25000 IDR");
                break;
            default:
                System.out.println("Sorry, we don't serve " + newOption + " right now.");
                showNewDiscountMenu();
                break;
        }
    }

    public static void showNewDiscountMenu() {
        String[] discMenu = {"Siomay", "Asinan", "Ramen"};
        for (int menuD = 0; menuD < discMenu.length; menuD++) {
            System.out.println("We have discount for " + discMenu[menuD] + " right now.");
        }
    }

//    public static void getOrderMenu() {
//        int countMenu  = InputUser.getIntArray()
//    }

    //





}
