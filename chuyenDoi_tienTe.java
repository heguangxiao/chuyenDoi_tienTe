import java.util.Scanner;

public class chuyenDoi_tienTe {
    public static void main(String[] args) {
        int rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your's USD :");
        double usd  = scanner.nextDouble();
        double vnd = usd * rate;
        System.out.println("Value your's USD in VietNam : " + vnd);
    }
}
