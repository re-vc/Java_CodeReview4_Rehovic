import java.util.ArrayList;

public class User {

    private int userID;
    private String userName;
    private String userSurname;
    private String userEmail;
    private String userAddress;
    private int userZip;
    private String userPhone;

    private ArrayList<Product> userInventory = new ArrayList<>();

    public User(int userID, String userName, String userSurname, String userEmail, String userAddress, int userZip, String userPhone) {
        this.userID = userID;
        this.userName = userName;
        this.userSurname = userSurname;
        this.userEmail = userEmail;
        this.userAddress = userAddress;
        this.userZip = userZip;
        this.userPhone = userPhone;
    }

    // getter | setter
    public void setUserInventory(ArrayList<Product> userInventory) {
        this.userInventory = userInventory;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public void setUserZip(int userZip) {
        this.userZip = userZip;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public ArrayList<Product> getUserInventory() {
        return userInventory;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public int getUserZip() {
        return userZip;
    }

    public String getUserPhone() {
        return userPhone;
    }

    // method
    public void userPurchase(Shop shop, Product product){
        if (product.getProductStock() == 0){
            shop.removeProduct(product);
        } else {
            product.setProductStock(product.getProductStock() - 1);
        }
        userInventory.add(product);
        System.out.println("User purchased: " + product.getProductName());

        //userInventory.get(userInventory.indexOf(product)).setProductStock(0);
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", userSurname='" + userSurname + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", userZip=" + userZip +
                ", userPhone='" + userPhone + '\'' +
                ", userInventory=" + userInventory +
                '}';
    }
}
