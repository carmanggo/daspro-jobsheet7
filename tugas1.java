import java.util.Scanner;

/**
 * tugas1
 */
public class tugas1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTiket, totalTiketTerjual = 0, hargaTiket = 50000;
        double totalPenjualan = 0, totalHarga;
        
        do {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid!");
                continue;
            }
            if (jumlahTiket == 0) {
                break;
            }

            totalHarga = jumlahTiket*hargaTiket;

            if (jumlahTiket > 10) {
                totalHarga = totalHarga - (totalHarga*0.15);
            } else if (jumlahTiket > 4) {
                totalHarga = totalHarga - (totalHarga*0.10);
            }

            System.out.println("Total bayar pelanggan: Rp " +totalHarga);

            totalTiketTerjual += jumlahTiket;
            totalPenjualan += totalHarga;

        } while (true);

        System.out.println("\nTotal tiket terjual: " +totalTiketTerjual);
        System.out.println("Total penjualan: Rp " +totalPenjualan);
    }
}