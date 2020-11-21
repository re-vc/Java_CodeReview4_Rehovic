public class Main {
    public static void main(String[] args) {

        // objects
        Menu menu = new Menu();
        Product pants = new Product(1, "pants","blue",14.99, 9, Product.Category.TROUSERS);
        Product shirt = new Product(2, "shirt","blue",9.99, 9, Product.Category.SHIRTS);
        Product socks = new Product(3, "socks","blue",4.99, 9, Product.Category.SOCKS);
        Product jacket = new Product(4, "jacket","blue",49.99, 9, Product.Category.JACKETS);
        Product gloves = new Product(5, "gloves","blue",4.99, 9, Product.Category.GLOVES);

        User user = new User(1,"Joe","Bill","joebill@mail.com","B-Street",1020,"123 456 7 89");

        Shop shopHM = new Shop("H & M","A-Street");

        shopHM.addProduct(pants);
        shopHM.addProduct(shirt);
        shopHM.addProduct(socks);
        shopHM.addProduct(jacket);
        shopHM.addProduct(gloves);

        System.out.println(shopHM.getProducts().get(0).getProductName() + " stocked: " + shopHM.getProducts().get(0).getProductStock());

        // User X buys product Y from the shop.
        user.userPurchase(shopHM, pants);

        // Stock gets reduced.
        System.out.println(shopHM.getProducts().get(0).getProductName() + " stocked: " + shopHM.getProducts().get(0).getProductStock());

        System.out.println("user owns: " + user.getUserInventory().get(0).getProductName());
        user.userPurchase(shopHM, pants);

        //menu.displayMainMenu();
        //menu.getUserInput();


    }
}
