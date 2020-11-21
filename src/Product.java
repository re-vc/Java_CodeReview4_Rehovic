public class Product {

    private int productID;
    private String productName;
    private String productDescription;
    private double productPrice;
    private int productStock;

    enum Category{
        TROUSERS, SHIRTS, JACKETS, SOCKS, GLOVES
    }

    private Category productCategory;

    public Product(int productID, String productName, String productDescription, double productPrice, int productStock, Category productCategory) {
        this.productID = productID;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.productStock = productStock;
        this.productCategory = productCategory;
    }

    // getter | setter

    public int getProductStock() {
        return productStock;
    }

    public Category getProductCategory() {
        return productCategory;
    }

    public int getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductCategory(Category productCategory) {
        this.productCategory = productCategory;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    // method

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", productPrice=" + productPrice +
                ", productStock=" + productStock +
                ", productCategory=" + productCategory +
                '}';
    }
}
