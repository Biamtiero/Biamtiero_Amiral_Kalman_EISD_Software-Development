
public class soal4 {

    public static boolean adaDuplikat(int[] angka) {
        int panjang = angka.length;

        // Loop bersarang untuk membandingkan setiap angka dengan angka lainnya
        for (int i = 0; i < panjang; i++) {
            for (int j = i + 1; j < panjang; j++) {
                if (angka[i] == angka[j]) {
                    return true; // Jika ada angka yang sama, kembalikan true
                }
            }
        }

        return false; // Jika tidak ditemukan duplikat, kembalikan false
    }

    public static void main(String[] args) {
        int[] data = {20, 1, 3, 2, 4, 6, 8, 5, 7, 9, 11, 13, 15, 10, 12, 14, 16, 18, 20, 17, 19};

        System.out.println(adaDuplikat(data)); // Output: true
    }
}
