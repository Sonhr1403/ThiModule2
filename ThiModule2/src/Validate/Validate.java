package Validate;

import java.util.Scanner;

public class Validate {
    static Scanner scanner = new Scanner(System.in);
    public static final String REGEX_MSV = "[sv]+[0-9]{3,}";
    public static final String REGEX_NAME = "([A-Z][a-zàÀảẢãÃáÁạẠăĂằẰẳẲẵẴắẮặẶâÂầẦẩẨẫẪấẤậẬđĐèÈẻẺẽẼéÉẹẸêÊềỀểỂễỄếẾệỆìÌỉỈĩĨíÍịỊòÒỏỎõÕóÓọỌôÔồỒổỔỗỖốỐộỘơƠờỜởỞỡỠớỚợỢùÙủỦũŨúÚụỤưƯừỪửỬữỮứỨựỰỳỲỷỶỹỸýÝỵỴ ]+)+";
    public static final String REGEX_NUMB = "[0-9]+";
    public static final String REGEX_GT = "[(nam)(nữ)]";
    public static final String REGEX_DIACHI = "([A-Za-zàÀảẢãÃáÁạẠăĂằẰẳẲẵẴắẮặẶâÂầẦẩẨẫẪấẤậẬđĐèÈẻẺẽẼéÉẹẸêÊềỀểỂễỄếẾệỆìÌỉỈĩĨíÍịỊòÒỏỎõÕóÓọỌôÔồỒổỔỗỖốỐộỘơƠờỜởỞỡỠớỚợỢùÙủỦũŨúÚụỤưƯừỪửỬữỮứỨựỰỳỲỷỶỹỸýÝỵỴ ,_-0-9]";


    public static String validateString(String regex) {
        while (true) {
            String str = scanner.nextLine();
            if (str.matches(regex)) {
                return str;
            }
            System.out.print("Nhầm định dạng! Mời bạn nhập lại: ");
        }
    }

    public static int validateNumb(String regex) {
        while (true) {
            String numb = scanner.nextLine();
            if (numb.matches(regex)) {
                return Integer.parseInt(numb);
            }
            System.out.println("Nhầm định dạng! Mời bạn nhập lại: ");
        }
    }

    public static double validateDouble(String regex) {
        while (true) {
            String numb = scanner.nextLine();
            if (numb.matches(regex)) {
                return Double.parseDouble(numb);
            }
            System.out.println("Nhầm định dạng! Mời bạn nhập lại: ");
        }
    }
}
