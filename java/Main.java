import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int tuoi;
        String queQuan;
        System.out.println("Nhap ten:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Nhap tuoi:");
        tuoi = sc.nextInt();
        System.out.println("Nhap que quan:");
        sc.nextLine(); // Clear the buffer
        queQuan = sc.nextLine();
        System.out.println("Que quan ban vua nhap la: " + queQuan);
        System.out.println("Tuoi ban vua nhap la: " + tuoi);
        System.out.println("Ten ban vua nhap la: " + name);
    }
}