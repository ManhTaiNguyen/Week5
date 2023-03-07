import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args){
        int n, x = 1,gt = 1;
        Scanner sc = new Scanner (System.in);

        do{
            System.out.println("Nhập 1 số nguyên dương bất kì: ");
            n = sc.nextInt();
        } while (n <= 0);

        while (x <= n){
            gt *= x;
            x++;
        }
            System.out.println(n + "! = " + gt);
    }
}