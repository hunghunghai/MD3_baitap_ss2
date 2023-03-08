package baitapss2ep1;

import java.util.Scanner;

public class hienThi20SoNguyen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số bạn muốn: ");
        int numbers = scanner.nextInt();
        int count = 0;
        int N = 2;
        while (count < 100) {
            boolean isPrime = true;
            for (int i = 2; i < Math.sqrt(numbers); i++) {
                if (numbers % i == 0) {
                    isPrime = false;
//                    break;
                }
            }
            if (isPrime) {
                count++;
                System.out.print(numbers + " ");
            }
            numbers++;
        }
    }

}