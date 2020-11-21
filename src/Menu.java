import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public void printHeader(){
        writeMSG("+----------------------+");
        writeMSG("|       Welcome        |");
        writeMSG("|       to the         |");
        writeMSG("|       Shop           |");
        writeMSG("+----------------------+");
    }
    public void printMenu(){
        writeMSG("Make a selection:");
        writeMSG("1) Display all products.");
        writeMSG("2) Display all products of category x.");
        writeMSG("3) Display all products where stock < 5.");
        writeMSG("4) Display all products out of stock");
        writeMSG("0) Exit.");
    }

    public void displayMainMenu() {
        printHeader();
        printMenu();
    }

    // method to get user input
    public int getUserInput() {
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice: ");
        while (choice < 0 || choice > 4) {
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Wrong input, can only be numeric.");
                break;
            }
        }
        return choice;
    }
    public void printProducts(Shop shop){
        System.out.println(shop.getProducts());
    }
/*
    public void executeAction(int choice, Shop shop){

        boolean exit = false;
        while(!exit){
            switch (choice){
                case 1: {
                    printProducts(shop);
                }
            }
        }
    }

 */

    public void writeMSG(String msg) {
        System.out.println(msg);
    }

}
