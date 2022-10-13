package View;

import java.util.Scanner;

public class SapXepView {
    Scanner scanner = new Scanner(System.in);
    public int sXMenu() {
        while (true) {
            try {
                System.out.println("---- Sắp xếp sinh viên theo điểm trung bình ----");
                System.out.println("Chọn chức năng theo số (để tiếp tục)");
                System.out.println("1. Sắp xếp điểm trung bình tăng dần");
                System.out.println("2. Sắp xếp điểm trung bình giảm dần");
                System.out.println("3. Thoát");
                System.out.print("Chọn chức năng:");
                return Integer.parseInt(scanner.nextLine());
            } catch (Exception e){
                System.err.println("Hãy chọn các chức năng bên trên!");
            }

        }
    }
}
