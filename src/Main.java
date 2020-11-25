public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.displayMainMenu();
        int choice;
        choice = menu.getInput();
        menu.executeAction(choice);

    }
}
