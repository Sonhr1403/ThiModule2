package Manage;

import IO.ReadAndWrite;
import Model.SinhVien;
import Validate.Validate;
import View.SapXepView;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class QLSV {
    public SapXepView sapXepView = new SapXepView();
    Scanner scanner = new Scanner(System.in);
    ReadAndWrite<SinhVien> readAndWrite = new ReadAndWrite<>();
    public ArrayList<SinhVien> sinhViens = new ArrayList<>();
    public QLSV() {
        sinhViens = readAndWrite.read();
    }

//    {
//        sinhViens.add(new SinhVien("SV001","Nguyễn Bảo Sơn",23,"nam","Hà Nội",7.5));
//        readAndWrite.write(sinhViens);
//    }
    public void docFile() {
        readAndWrite.read();
    }

    public void ghiFile() {
        readAndWrite.write(sinhViens);
    }
    public void hienthi() {
        for (SinhVien x : sinhViens) {
            System.out.println(x.toString());
        }
    }

    public void themSinhVien(SinhVien sinhVien) {
        for (SinhVien sv : sinhViens) {
            if (sv.getHoTen().equals(sinhVien.getHoTen())) {
                return;
            }
        }
        sinhViens.add(sinhVien);
        ghiFile();
        System.out.println("Thêm sinh viên " + sinhVien.getHoTen() + " thành công!");
        System.out.println();
    }

    public SinhVien taoSinhVien() {
        System.out.print("Nhập mã sinh viên (định dạng sv+ số có 3 chữ sô): ");
        String mSV = Validate.validateString(Validate.REGEX_MSV);
        System.out.print("Nhập họ tên sinh viên (có chữ cái đầu viết hoa): ");
        String hoTen = Validate.validateString(Validate.REGEX_NAME);
        System.out.print("Nhập tuổi sinh viên: ");
        int tuoi = Validate.validateNumb(Validate.REGEX_NUMB);
        System.out.print("Nhập giới tính: ");
        String gT = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String diaChi = scanner.nextLine();
        System.out.print("Nhập điểm trung bình: ");
        double dTB = Double.parseDouble(scanner.nextLine());
        return new SinhVien(mSV,hoTen,tuoi,gT,diaChi,dTB);
    }

    public int timIndex() {
        System.out.println("Nhập mã sinh viên: ");
        String name = scanner.nextLine();
        for (int i = 0; i < sinhViens.size(); i++) {
            if (sinhViens.get(i).getmSV().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void sua(int index) {
        sinhViens.set(index, taoSinhVien());
        System.out.println("Sửa thành công!");
        ghiFile();
    }

    public void xoa(int index) {
        if (index != -1) {
            System.out.println("Bạn có muốn xoá sinh viên này: ");
            System.out.println("1.|Yes");
            System.out.println("2.|No");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                sinhViens.remove(index);
                System.out.println("Đã xóa thành công!");
            } else if (choice == 2) {
                System.out.println("Hủy!");
            } else {
                System.out.println("Hãy chọn lựa chọn trên!");
            }
            ghiFile();
        } else System.out.println("Sinh viên không tồn tại!");
    }

    public void sapxep() {
        int choiceSX = sapXepView.sXMenu();
        switch (choiceSX) {
            case 1 -> tangdan();
            case 2 -> giamdan();
            default -> System.err.println("Hãy lựa chọn 1 hoặc 2!");
        }
        System.out.println("Sắp xếp thành công!");
        hienthi();
        ghiFile();
    }

    public void tangdan(){
        for (int i = 0; i < sinhViens.size(); i++) {
            for (int j = i + 1; j < sinhViens.size(); j++) {
                if (sinhViens.get(i).getdTB() > sinhViens.get(j).getdTB()) {
                    SinhVien temp;
                    temp = sinhViens.get(i);
                    sinhViens.set(i, sinhViens.get(j));
                    sinhViens.set(j, temp);
                }
            }
        }
    }

    public void giamdan(){
        for (int i = 0; i < sinhViens.size(); i++) {
            for (int j = i + 1; j < sinhViens.size(); j++) {
                if (sinhViens.get(i).getdTB() < sinhViens.get(j).getdTB()) {
                    SinhVien temp;
                    temp = sinhViens.get(i);
                    sinhViens.set(i, sinhViens.get(j));
                    sinhViens.set(j, temp);
                }
            }
        }
    }


}
