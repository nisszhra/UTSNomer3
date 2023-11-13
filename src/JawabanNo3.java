import java.util.Scanner;

public class JawabanNo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan plat nomor kendaraan: ");
        String platNomor = scanner.nextLine();
        System.out.println("Status validitas plat nomor: " + cekValiditasPlatNomor(platNomor));
    }

    public static boolean cekValiditasPlatNomor(String platNomor) {
        if (platNomor.length() != 4) {
            return false;
        }

        int jumlahAngkaGenap = 0;
        int jumlahAngkaGanjil = 0;

        for (int i = 0; i < platNomor.length(); i++) {
            char karakter = platNomor.charAt(i);
            if (Character.isDigit(karakter)) {
                int nilaiAngka = Character.getNumericValue(karakter);
                if (nilaiAngka % 2 == 0) {
                    jumlahAngkaGenap++;
                } else {
                    jumlahAngkaGanjil++;
                }
            } else {
                return false;
            }
        }

        if (jumlahAngkaGenap == 3 && jumlahAngkaGanjil == 1) {
            return true;
        } else if (jumlahAngkaGenap == 1 && jumlahAngkaGanjil == 3) {
            return true;
        } else {
            return false;
        }
    }
}
