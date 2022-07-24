import java.util.Scanner;

public class TinhNgay {
    public static void main(String[] args) {
        Scanner duLieu = new Scanner(System.in);
        int thang = duLieu.nextInt();
        switch (thang) {
            case 2:
                System.out.println("thang 2 co 28-29 ngay");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("thang " + thang + " co 31 ngay ");
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("thang " + thang + "co 30 ngay");
                break;
            default:
                System.out.println("sai thang");
        }
    }
}
