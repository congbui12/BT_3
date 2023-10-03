import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap n:");
        Integer n = sc.nextInt();

        Integer total = 0;
        for(int i = 1; i <= n; i += 2) {
            if(i % 2 == 1) {
                total += i;
            }
        }
        System.out.println(total);
    }
}
