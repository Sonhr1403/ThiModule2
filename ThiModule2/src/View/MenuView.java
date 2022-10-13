package View;

import java.util.Scanner;

public class MenuView {
    Scanner scanner = new Scanner(System.in);
    public int menu() {
        while (true) {
            try {
                System.out.println("---- CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN ----");
                System.out.println("Chọn chức năng theo số (để tiếp tục)");
                System.out.println("1. Xem danh sách sinh viên");
                System.out.println("2. Thêm mới");
                System.out.println("3. Cập nhật");
                System.out.println("4. Xóa");
                System.out.println("5. Sắp xếp");
                System.out.println("6. Đọc từ file");
                System.out.println("7. Ghi vào file");
                System.out.println("8. Thoát");
                System.out.print("Chọn chức năng: ");
                return Integer.parseInt(scanner.nextLine());
            } catch (Exception e){
                System.err.println("Hãy chọn các chức năng bên trên!");
            }

        }
    }
}
