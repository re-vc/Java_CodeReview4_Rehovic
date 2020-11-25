import java.util.Scanner;

public class Menu {

    public void printHeader() {
        System.out.println(" ---------------------");
        System.out.println("|       WELCOME       |");
        System.out.println("|     to the Shop     |");
        System.out.println(" ---------------------");
    }

    public void printMenu() {
        System.out.println("Make a selection:");
        System.out.println("1.Display all products");
        System.out.println("2.Display all products of category x");
        System.out.println("3.Display all products where stock is under minimum");
        System.out.println("4.Display all products out of stock");
        System.out.println();
        System.out.println("0.Exit");
    }

    public void printCategorySubMenu() {
        System.out.println("Make a selection:");
        System.out.println("1.Display all TROUSERS");
        System.out.println("2.Display all SHIRTS");
        System.out.println("3.Display all JACKETS");
        System.out.println("4.Display all SOCKS");
        System.out.println("5.Display all GLOVES");
        System.out.println();
        System.out.println("0.Exit");
    }

    public void printSubMenu() {
        System.out.println("Do you want to go back to the Main Menu?");
        System.out.println("1: Yes");
        System.out.println("2: No");
    }

    public void displayMainMenu() {
        printHeader();
        printMenu();
    }

    public void displaySubMenu() {
        printSubMenu();
    }

    public void displayCategorySubMenu(){
        printCategorySubMenu();
    }

    // user input

    public int getInput(){
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice: ");
        while (choice < 0 || choice > 5) {
            try {
                choice = sc.nextInt();
            } catch (NumberFormatException e) {
                System.out.println("Wrong input, can only be numeric.");
            }

            if (choice < 0 || choice > 5){
                System.out.println("Wrong input, try it again!");
                choice = -1;
            }
        }
        return choice;
    }

    public void executeAction(int choice){
        boolean exit = false;
        while (!exit){
            switch (choice){
                case 1: {
                    // display all products.
                    System.out.println("case 1");
                    exit = true;
                    break;
                }
                case 2: {
                    // display all products of category x.
                    System.out.println("case 2");
                    exit = true;
                    break;
                }
                case 3: {
                    // display all products where stock < 5.
                    System.out.println("case 3");
                    exit = true;
                    break;
                }
                case 4: {
                    // display all products out of stock.
                    System.out.println("case 4");
                    exit = true;
                    break;
                }
                case 0: {
                    // Exit.
                    System.out.println("case 0");
                    exit = true;
                    break;
                }
            }
        }
    }

    public void executeCategorySubAction(int choice){
        boolean exit = false;
        while (!exit){
            switch (choice){
                case 1: {
                    // display all products.
                    System.out.println("case 1");
                    exit = true;
                    break;
                }
                case 2: {
                    // display all products of category x.
                    System.out.println("case 2");
                    exit = true;
                    break;
                }
                case 3: {
                    // display all products where stock < 5.
                    System.out.println("case 3");
                    exit = true;
                    break;
                }
                case 4: {
                    // display all products out of stock.
                    System.out.println("case 4");
                    exit = true;
                    break;
                }
                case 5: {
                    // display all products out of stock.
                    System.out.println("case 5");
                    exit = true;
                    break;
                }
                case 0: {
                    // Exit.
                    System.out.println("case 0");
                    exit = true;
                    break;
                }
            }
        }
    }

    public void executeSubAction(int choice){
        boolean exit = false;
        while (!exit){
            switch (choice){
                case 1: {
                    // go back to main menu
                    System.out.println("case 1");
                    exit = true;
                    break;
                }
                case 2: {
                    // close app.
                    System.out.println("case 2");
                    exit = true;
                    break;
                }

            }
        }
    }

}
