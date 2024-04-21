package Java_Buoi_3.KhachSan;

public class QuanLy {
    long giaTien;
    String loaiPhong;
    long id;
    long khachHang;


    public QuanLy(long giaTien, String loaiPhong, long id, long khachHang) {
        this.giaTien = giaTien;
        this.loaiPhong = loaiPhong;
        this.id = id;
        this.khachHang = khachHang;
    }

    public boolean kiemTraPhong(long soKhachHienTai){
        if (soKhachHienTai > khachHang){
            return true;
        }else{
            return false;
        }


    }
    public void thanhToan(long soNgay){
        giaTien += soNgay;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public void setGiaTien(long giaTien) {
        this.giaTien = giaTien;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public long getGiaTien() {
        return giaTien;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setKhachHang(long khachHang) {
        this.khachHang = khachHang;
    }

    public long getKhachHang() {
        return khachHang;
    }

    public long getId() {
        return id;
    }

    public void inThongTin(){
        System.out.println("ID Phong: " + id + " Loai Phong: " + loaiPhong + " Gia tien la: " + giaTien);
    }

}
