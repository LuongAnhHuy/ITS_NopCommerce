package Java_Buoi_3;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    //1 tài khoản bank bao gồm : id , tên người dùng, số tiền;
    //Account thì có action :
    //Nạp/ Rút tiền / chuyển tiền
    //Viết một chương trình menu :
    //Thêm  khách hành
    // In thông tin của khách hàng (nhập id)
    //Rút tiền / nạp tiền / chuyển khoản
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        List<User> users = new ArrayList<>();
        boolean exit = false;
        do {
            System.out.println("Vui long nhap lua chon: \n" +
                    "1. Them Khach Hang \n" +
                    "2. In thong tin Khach Hang \n" +
                    "3. Rut titen \n" +
                    "4. Nap Tien \n" +
                    "5. Chuyen Tien \n" +
                    "Nhan phim khac de thoat chuong trinh \n");
            System.out.println("Nhap lua chon cua ban");
            int a = scanner.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Nhap so luong khach hang muon them: ");
                    int sl = scanner.nextInt();
                    for (int i = 0; i < sl; i++) {
                        System.out.println("Khach hang so " + (i + 1));
                        User user = nhapDataUser();
                        addUser(users, user);
                    }
                    break;
                case 2:
                    User user = searchUser(inputID(), users);
                    if (user != null){
                        user.inThongTin();
                    }else {
                        System.out.println("Khach hang khong ton tai");
                    }
                    break;
                case 3:
                    User user1 = searchUser(inputID(), users);
                    if (user1 != null){
                        System.out.println("Nhap so tien muon rut");
                        long soTienRut = scanner.nextLong();
                        rutTien(user1, soTienRut);
                    }else {
                        System.out.println("Khach hang khong ton tai");
                    }
                    break;
                case 4:
                    User user2 = searchUser(inputID(), users);
                    if (user2 != null){
                        System.out.println("Nhap so tien muon nap");
                        long soTienNap = scanner.nextLong();
                        napTien(user2, soTienNap);
                    }else {
                        System.out.println("Rut tien khong thanh cong");
                    }
                    break;
                case 5:
                    System.out.println("Nhap tai khoan gui");
                    User tkGui = searchUser(inputID(), users);
                    if (tkGui == null){
                        break;
                    }
                    System.out.println("Nhap tai khoan nhan");
                    User tkNhan = searchUser(inputID(), users);
                    if (tkNhan == null){
                        break;
                    }
                    System.out.println("Nhap so tien gui");
                    long soTienGui = scanner.nextLong();
                    chuyenTien(tkGui, tkNhan,soTienGui);
                    break;
                default:
                    System.out.println("Thoat chuong trinh !!!!!!!!!!!!!");
                    exit = true;
                    break;
            }
        } while (!exit);


    }

    private static long inputID(){
        System.out.println("Nhap ID de xem thong tin khach hang");
        return scanner.nextLong();
    }
    private static User nhapDataUser() {
        System.out.println("Nhap ID: ");
        long id = scanner.nextLong();

        System.out.println("Nhap So Tien: ");
        long soTien = scanner.nextLong();

        System.out.println("Nhap ten: ");
        scanner.nextLine();
        String name = scanner.nextLine();

        return new User(id,name,soTien);
    }

    private static User searchUser(long id, List<User> users){
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    private static void addUser(List<User> users, User user){
        users.add(user);
    }

    private static void rutTien(User user, long soTienRut){
        boolean thanhCong = user.rutTien(soTienRut);
        if (thanhCong){
            System.out.println("Rut Tien Thanh Cong " + user.getUserName() + soTienRut);
        }else {
            System.out.println("Rut Tien That Bai " + user.getUserName());
        }
    }

    private static void napTien(User user, long soTienNap){
        user.napTien(soTienNap);
    }

    private static void chuyenTien(User tkGui, User tkNhan, long soTien){
        boolean thanhCong = tkGui.rutTien(soTien);
        if (thanhCong){
            tkNhan.napTien(soTien);
        }else {
            System.out.println("So Du Khong Du");
        }
    }
}
