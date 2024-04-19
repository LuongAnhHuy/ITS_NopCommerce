package Java_BE;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    String name;
    String numberID;
    int thoiGianLamViec;
    List <Employee> employees = new ArrayList<>();

    public String getName() {
        return name;
    }

    public String getNumberID() {
        return numberID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberID(String numberID) {
        this.numberID = numberID;
    }

    public void inThongTin(){
        System.out.println("---------------------------");
        System.out.println("Name: " + getName());
        System.out.println("Number ID: " + getNumberID());
        System.out.println("---------------------------");
    }

   public void addEmployee(Employee employee) {
        employees.add(employee);
   }

    public void setThoiGianLamViec(int thoiGianLamViec) {
        this.thoiGianLamViec = thoiGianLamViec;
    }

    public int getThoiGianLamViec() {
        return thoiGianLamViec;
    }

    public void inThoiGianLamViec(){
        System.out.println("---------------------------");
        System.out.println("So nam lam viec: " + getThoiGianLamViec());
        System.out.println("---------------------------");
    }


}
