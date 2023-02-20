import java.util.Scanner;

public class MainTugas4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("Silahakn masukan Email, Tanggal (dd-MM-yyyy)(dddd, MMMM yy), IP Adress");
        System.out.println("masukan salah satu untuk mengidentifikasi tulisannya");
        System.out.print("Masukkan input: ");
        String input = scanner.nextLine();
        System.out.println("");

        if (isEmail(input)) {
            System.out.println("=====================================");
            System.out.println("Ini adalah email");
            System.out.println("=====================================");
        } else if (isIpAddress(input)) {
            System.out.println("=====================================");
            System.out.println("Ini adalah alamat IP");
            System.out.println("=====================================");
        } else if (isDate(input)) {
            System.out.println("=====================================");
            System.out.println("Ini adalah tanggal");
            System.out.println("=====================================");
        } else {
            System.out.println("=====================================");
            System.out.println("Input tidak dikenali");
            System.out.println("=====================================");
        }

        DaftarList soal2 = new DaftarList();
        System.out.println("");
        soal2.getMakanan();
        System.out.println("");
        soal2.getPialaDunia();
        System.out.println("");
        soal2.getProvinsi();
        System.out.println("");
        soal2.getPrograman();
        System.out.println("");
    }

    public static boolean isEmail(String input) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return input.matches(regex);
    }

    public static boolean isIpAddress(String input) {
        String regex = "^((\\d{1,2}|1\\d{2}|2[0-4]\\d|25[0-5])\\.){3}(\\d{1,2}|1\\d{2}|2[0-4]\\d|25[0-5])$";
        return input.matches(regex);
    }

    public static boolean isDate(String input) {
        String regex = "^(\\d{2}-\\d{2}-\\d{4}|[A-Z][a-z]+,\\s[A-Z][a-z]+\\s\\d{4})$";
        return input.matches(regex);
    }
}