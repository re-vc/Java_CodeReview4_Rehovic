import java.util.ArrayList;

public class Shop {

    private String shopName;
    private String shopAddress;
    private ArrayList<Product> products = new ArrayList<>();
    //private ArrayList<User> users = new ArrayList<>();


    public Shop(String shopName, String shopAddress) {
        this.shopName = shopName;
        this.shopAddress = shopAddress;
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

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    // method
    public void addProduct(Product product){
        products.add(product);
    }

    public void removeProduct(Product product){
        products.remove(product);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shopName='" + shopName + '\'' +
                ", shopAddress='" + shopAddress + '\'' +
                ", products=" + products +
                '}';
    }
}
