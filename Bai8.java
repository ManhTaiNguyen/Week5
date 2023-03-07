import java.util.Scanner;
 
public class Bai8{
    public static void main(String[] args){
        int n, i, sum = 0;
        float tbc;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập các số nguyên có trong dãy: ");
        n = sc.nextInt();

        for (int count = 1; count <=n; count++){
            System.out.println("Nhập số thứ " + count + ": ");
            i = sc.nextInt();
            sum += i;
        }
        tbc = (float) sum / n;
        System.out.println("Trung bình cộng = " + tbc);
    }
}