public class Product {

    private static int counter = 1;

    private int productID;
    private int productStock;
    private double productPrice;
    private String productName;
    private String productDescription;
    private Category productCategory;

    // constructor

    public Product(double productPrice, String productName, String productDescription, Category productCategory) {
        this.productID = counter++;
        this.productPrice = productPrice;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productCategory = productCategory;
    }

    // method

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", productStock=" + productStock +
                ", productPrice=" + productPrice +
                ", productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", productCategory=" + productCategory +
                '}';
    }


    // getter | setter

    public int getProductStock() {
        return productStock;
    }

    public int getProductID() {
        return productID;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public Category getProductCategory() {
        return productCategory;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setProductCategory(Category productCategory) {
        this.productCategory = productCategory;
    }
}
