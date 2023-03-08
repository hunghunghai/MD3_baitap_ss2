package baitapss2ep2;

import java.util.Scanner;

public class hienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Chọn một hình dạng để hiển thị:");
            System.out.println("1. Hình Tam Giác vuông phía dưới bên trái");
            System.out.println("2. hình Tam Giác vuông phía trên bên trái");
            System.out.println("3. Hình Chữ Nhật");
            System.out.println("4. Thoát");

            System.out.print("Nhập Lựa chọn của bạn đi: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayRightTriangleBottonLeft();
                    break;
                case 2:
                    displayRightTriangleTopLeft();
                    break;
                case 3:
                    displayRectangle();
                    break;
                case 4:
                    System.out.println("thoát khỏi chương trình...");
                    break;
                default:
                    System.out.println("Vui lòng thử lại.");
            }
        } while (choice != 4);

        scanner.close();
    }

    public static void displayRightTriangleBottonLeft() {
        System.out.println("Hình tam giác vuông phía dưới bên trái:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void displayRightTriangleTopLeft() {
        System.out.println("Hình tam giác phái trên bên trái:");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void displayRectangle() {
        System.out.println("Hình chữ nhật:");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 7; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
