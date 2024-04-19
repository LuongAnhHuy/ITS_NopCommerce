package Java_BE;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
    public static List<Integer> time = new ArrayList<>();
    public void inThongTinCapDuoi(){
        if (employees != null) {
            for (Employee employee : employees){
                employee.inThongTin();
                employee.inThoiGianLamViec();
                if (employee instanceof Manager){
                    Manager manager = (Manager) employee;
                    manager.inThongTinCapDuoi();
                }

            }
        }
    }

    public void inTime() {

        if (name.equals("Truong phong 2")){
            for(Employee e:employees){
                time.add(e.getThoiGianLamViec());
            }
            insertionSort(time,time.size());
        }
    }

    void insertionSort(List<Integer> a, int array_size) {
        int i, j, last;
        for (i=1; i < array_size; i++) {
            last = a.get(i);
            j = i;
            while ((j > 0) && (a.get(j - 1) > last)) {
                a.set(j, a.get(j - 1));
                j = j - 1; }
            a.set(j, last);
        }
        System.out.println(a.get(array_size-1));
        // end for
    } // end of isort

    //[1,2,3]
    //[0,1,2]



}
