public class DemonstrateMain {

    public static void main(String[] args) {

        // Create dummy/test data in your main().
        Product product1 = new Product(9.99,"socks A","they're blue",Category.SOCKS);
        Product product2 = new Product(19.99,"gloves A","they're blue",Category.GLOVES);
        Product product3 = new Product(29.99,"shirt A","its blue",Category.SHIRTS);
        Product product4 = new Product(39.99,"pants A","they're blue",Category.TROUSERS);
        Product product5 = new Product(49.99,"shirt B","its black",Category.SHIRTS);
        Product product6 = new Product(59.99,"jacket A","its black",Category.JACKETS);
        Product product7 = new Product(9.99,"socks Z","they're green",Category.SOCKS);
        Product product8 = new Product(19.99,"gloves Z","they're green",Category.GLOVES);
        Product product9 = new Product(29.99,"shirt Z","its green",Category.SHIRTS);
        Product product10 = new Product(39.99,"pants Z","they're green",Category.TROUSERS);
        Product product11 = new Product(49.99,"shirt Y","its red",Category.SHIRTS);
        Product product12 = new Product(59.99,"jacket Z","its red",Category.JACKETS);

        Shop shop = new Shop("Shop A","A Street");

        User user = new User("Joe","Joestar","mail@mail.com","1234 Street","0909", "1234 456 7 89");

        // Demonstrate the usage of this method.
        try {
            shop.addProduct(product1, 11);
            shop.addProduct(product2, 3);
            shop.addProduct(product3, 5);
            shop.addProduct(product4, 1);
            shop.addProduct(product5, 6);
            shop.addProduct(product6, 1);
            shop.addProduct(product7, 0);
            shop.addProduct(product8, 3);
            shop.addProduct(product9, 5);
            shop.addProduct(product10, 1);
            shop.addProduct(product11, 6);
            shop.addProduct(product12, 1);
        } catch (StockLimitReachedException e){
            System.out.println(e.getMessage());
        }

        shop.addUser(user);

        /*

        shop.displayAllProducts();
        shop.displayCategoryProducts(Category.SHIRTS);
        shop.displayCategoryProducts(Category.JACKETS);
        shop.displayLesserProducts();
        shop.displayOutOfProducts();

         */

        System.out.println("(20) Display the purchase process in the console:");
        shop.displayAllProducts();

        // Display purchase history before and after the purchase.
        System.out.println("user inventory / purchase history: " + user.getPurchaseHistory());

        // Display the stock before and after the purchase.
        System.out.println(product1);

        // User X buys product Y from the shop.
        // Demonstrate usage of Exceptions.
        try {
            shop.purchaseProduct(user, product1, 4);
            shop.purchaseProduct(user, product2, 1);
            shop.purchaseProduct(user, product3, 30);
        } catch (OutOfStockException e){
            System.out.println(e.getMessage());
            System.out.println();
        }

        // Purchase gets added to the purchase history of user X. | Display purchase history before and after the purchase.
        System.out.println("user inventory / purchase history: " + user.getPurchaseHistory());

        // Stock gets reduced by the amount. | Display the stock before and after the purchase.
        System.out.println(product1);

        // users in Shop's user ArrayList
        System.out.println(shop.getUsers());
    }

}
