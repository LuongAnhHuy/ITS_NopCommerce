package Java_BE;

public class Main {
    public static void main(String[] args) {
        Manager tongGiamDoc = new Manager();
        tongGiamDoc.setName("Tong Giam Doc");
        tongGiamDoc.setNumberID("0");

        Manager truongPhong1 = new Manager();
        truongPhong1.setName("Truong phong 1");
        truongPhong1.setNumberID("1");
        truongPhong1.inThongTin();

        Employee nhanVien1 = new Employee();
        nhanVien1.setName("Nhan vien 1");
        nhanVien1.setNumberID("1.1");
        nhanVien1.setThoiGianLamViec(3);
        truongPhong1.addEmployee(nhanVien1);

        truongPhong1.inThongTinCapDuoi();

        Manager truongPhong2 = new Manager();
        truongPhong2.setName("Truong phong 2");
        truongPhong2.setNumberID("2");
        truongPhong2.inThongTin();

        Employee nhanVien2 = new Employee();
        nhanVien2.setName("Nhan vien 2");
        nhanVien2.setNumberID("2.1");
        nhanVien2.setThoiGianLamViec(4);
        truongPhong2.addEmployee(nhanVien2);

        Employee nhanVien3 = new Employee();
        nhanVien3.setName("Nhan vien 3");
        nhanVien3.setNumberID("3.1");
        nhanVien3.setThoiGianLamViec(5);
        truongPhong2.addEmployee(nhanVien3);

        truongPhong2.inThongTinCapDuoi();

        tongGiamDoc.addEmployee(truongPhong1);
        tongGiamDoc.addEmployee(truongPhong2);

        truongPhong2.inTime();

    }
}
