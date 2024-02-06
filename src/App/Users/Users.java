package App.Users;

public class Users {

    private String userName;

    private int currentWallet;
    public Users(int currentWallet) {
        this.currentWallet = currentWallet;
    }
    public int getCurrentWallet() {
        return currentWallet;
    }

    public void setCurrentWallet(int currentWallet) {
        this.currentWallet = currentWallet;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Users() {
        this.userName = userName;
    }





}
