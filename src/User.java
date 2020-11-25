import java.util.ArrayList;

public class User {

    private static int counter = 1;

    private int userID;
    private String userName;
    private String userSurname;
    private String userEmail;
    private String userAddress;
    private String userZip;
    private String userPhone;

    private ArrayList<Purchase> purchaseHistory;

    public User(String userName, String userSurname, String userEmail, String userAddress, String userZip, String userPhone) {
        this.userID = counter++;
        this.userName = userName;
        this.userSurname = userSurname;
        this.userEmail = userEmail;
        this.userAddress = userAddress;
        this.userZip = userZip;
        this.userPhone = userPhone;
        this.purchaseHistory = new ArrayList<>();
    }

    // methods

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", userSurname='" + userSurname + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", userZip='" + userZip + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", purchaseHistory=" + purchaseHistory +
                '}';
    }

    // getter | setter
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

    public void setUserZip(String userZip) {
        this.userZip = userZip;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public void setPurchaseHistory(ArrayList<Purchase> purchaseHistory) {
        this.purchaseHistory = purchaseHistory;
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

    public String getUserZip() {
        return userZip;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public ArrayList<Purchase> getPurchaseHistory() {
        return purchaseHistory;
    }
}
