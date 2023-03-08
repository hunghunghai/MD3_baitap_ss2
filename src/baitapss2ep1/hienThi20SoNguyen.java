package baitapss2ep1;

import java.util.Scanner;

public class hienThi20SoNguyen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số bạn muốn: ");
        int numbers = scanner.nextInt();
        int count = 0;
        int N = 2;
        while (count < 20) {
            boolean isPrime = true;
            for (; N < Math.sqrt(numbers); N++) {
                if (numbers % N == 0) {
                    isPrime = false;
//                    break ;
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