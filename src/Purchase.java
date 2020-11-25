public class Purchase {

    private static int counter = 1;

    private int purchaseID;
    private int purchaseStock;
    private double purchasePrice;
    private String purchaseName;

    // constructor


    public Purchase(int purchaseStock, double purchasePrice, String purchaseName) {
        this.purchaseID = counter++;
        this.purchaseStock = purchaseStock;
        this.purchasePrice = purchasePrice;
        this.purchaseName = purchaseName;
    }

    public Purchase() {
    }

    // method

    @Override
    public String toString() {
        return "Purchase{" +
                "purchaseID=" + purchaseID +
                ", purchaseStock=" + purchaseStock +
                ", purchasePrice=" + purchasePrice +
                ", purchaseName='" + purchaseName + '\'' +
                '}';
    }

    // getter | setter

    public int getPurchaseStock() {
        return purchaseStock;
    }

    public int getPurchaseID() {
        return purchaseID;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public String getPurchaseName() {
        return purchaseName;
    }

    public void setPurchaseStock(int purchaseStock) {
        this.purchaseStock = purchaseStock;
    }

    public void setPurchaseID(int purchaseID) {
        this.purchaseID = purchaseID;
    }

    public void setPurchasePrice(double productPrice) {
        this.purchasePrice = productPrice;
    }

    public void setPurchaseName(String purchaseName) {
        this.purchaseName = purchaseName;
    }
}
