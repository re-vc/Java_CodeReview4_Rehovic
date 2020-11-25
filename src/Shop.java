import java.util.ArrayList;

public class Shop {

    private String shopName;
    private String shopAddress;

    private static final int maxProduct = 15;
    private static final int minProduct = 5;

    private ArrayList<Product> products;
    private ArrayList<User> users;

    // constructor

    public Shop(String shopName, String shopAddress) {
        this.shopName = shopName;
        this.shopAddress = shopAddress;
        this.products = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    // method
    public void addUser(User user) {
        users.add(user);
    }

    public void addProduct(Product product, int amount) throws StockLimitReachedException {
        int stock;
        stock = product.getProductStock() + amount;
        if (stock >= maxProduct) {
            System.out.println(product.getProductName() + " stock limit reached. ");
            products.add(product);
            product.setProductStock(maxProduct);
            throw new StockLimitReachedException();
        } else {
            products.add(product);
            product.setProductStock(stock);
        }
    }

    public void purchaseProduct(User user, Product product, int amount) throws OutOfStockException {
        int stock;
        stock = product.getProductStock() - amount;
        if (stock >= 0) {
            System.out.println(user.getUserName() + " purchased " + product.getProductName());
            product.setProductStock(stock);
            user.getPurchaseHistory().add(new Purchase(amount, product.getProductPrice(), product.getProductName()));
            if (stock <= minProduct) {
                displayLowStock(product);
            }
        } else if (stock < 0) {
            throw new OutOfStockException();
        }

    }

    public void displayAllProducts() {
        System.out.println("---------------------------------------");
        System.out.println("These are ALL Products.");
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }
        System.out.println("---------------------------------------");
    }

    public void displayCategoryProducts(Category category) {
        System.out.println("---------------------------------------");
        System.out.println("These are the Products of Category: " + category.name());
        for (Product product : this.products) {
            if (category == product.getProductCategory()) {
                System.out.println(product);

            }
        }
        System.out.println("---------------------------------------");
    }

    public void displayLesserProducts() {
        System.out.println("---------------------------------------");
        System.out.println("These Products are almost out of Stock!");
        for (Product product : this.products) {
            if (product.getProductStock() < minProduct) {
                System.out.println(product);
            }
        }
        System.out.println("---------------------------------------");
    }

    public void displayOutOfProducts() {
        System.out.println("---------------------------------------");
        System.out.println("These Products ARE out of Stock!");
        for (Product product : this.products) {
            if (product.getProductStock() == 0) {
                System.out.println(product);
            }
        }
        System.out.println("---------------------------------------");
    }

    public void displayLowStock(Product product) {
        System.out.println();
        System.out.println("!!!");
        System.out.println("Information for Staff");
        System.out.println(product.getProductName() + " ID: " + product.getProductID());
        System.out.println("Stock is now below 5");
        System.out.println("!!!");
        System.out.println();
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shopName='" + shopName + '\'' +
                ", shopAddress='" + shopAddress + '\'' +
                ", products=" + products +
                ", users=" + users +
                '}';
    }

    // getter | setter

    public String getShopName() {
        return shopName;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
}
