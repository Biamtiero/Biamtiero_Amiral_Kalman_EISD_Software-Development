import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String masukan = s.nextLine();
        masukan = masukan.toLowerCase();
        int kiri = 0;
        int kanan = masukan.length() - 1;
        boolean status = true;

        while (kanan > kiri) {
            if (masukan.charAt(kiri) != masukan.charAt(kanan)) {
                status = false;
                break;
            }
            kiri++;
            kanan--;
        }
        if (status) {
            System.out.println("eureeka!");
        } else {
            System.out.println("suka blyat");
        }
    }
}