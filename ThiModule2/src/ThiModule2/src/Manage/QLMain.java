package Manage;

import View.MenuView;

public class QLMain {
    public MenuView menuView;
    public QLSV qlsv;

    public QLMain() {
        menuView = new MenuView();
        qlsv = new QLSV();
    }

    public void qlMain() {
        while (true) {
            int choice = menuView.menu();
            switch (choice) {
                case 1 -> //hiển thị danh sách
                        qlsv.hienthi();
                case 2 -> //Thêm
                        qlsv.themSinhVien(qlsv.taoSinhVien());
                case 3 -> //Cập nhật
                        qlsv.sua(qlsv.timIndex());
                case 4 -> //Xóa
                        qlsv.xoa(qlsv.timIndex());
                case 5 -> //Sắp xếp
                        qlsv.sapxep();
                case 6 -> //Đọc từ file
                        qlsv.docFile();
                case 7 -> //Ghi vào file
                        qlsv.ghiFile();
                case 8 -> //Thoát
                        System.exit(0);
            }
        }
    }
}

