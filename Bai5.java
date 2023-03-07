import java.util.Scanner;

public class Bai5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Tong = 0, number;

    do{
        System.out.println("Nhập số nguyên: ");
        number = sc.nextInt();
        Tong += number;
        if (Tong > 100)
            break;
    }
    while(number > 0);
    System.out.println("Tổng các số trên bằng: " + Tong);
    }
}