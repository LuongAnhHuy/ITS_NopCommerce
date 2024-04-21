package Java_Buoi_3;

public class User {
    long id;
    String userName;
    long balance;

    public User(long id, String userName, long balance) {
        this.id = id;
        this.userName = userName;
        this.balance = balance;
    }

    public boolean rutTien(long soTien){
        if (soTien > balance){
            return false;
        }
        balance -= soTien;
        return true;
    }

    public void napTien(long soTien){
        balance += soTien;
    }

    public void inThongTin(){
        System.out.println("ID: " + id + " Name: " + userName + " So Tien: " + balance);
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getSoTien() {
        return balance;
    }

    public void setSoTien(int soTien) {
        this.balance = soTien;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
