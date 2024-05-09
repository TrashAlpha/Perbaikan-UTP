
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Do your magic here...
        // Digunakan Scanner untuk memungkinkan input dari pengguna
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat datang di Pemesanan Tiket!");

        // Input nama pengguna
        System.out.print("Masukkan nama pemesan: ");
        String nama = input.nextLine();

        // Menampilkan pilihan jenis tiket dan menerima input pilihan dari pengguna
        System.out.println("Pilih jenis tiket: ");
        System.out.println("1. CAT 8");
        System.out.println("2. CAT 1");
        System.out.println("3. FESTIVAL");
        System.out.println("4. VIP");
        System.out.println("5. UNLIMITED EXPERIENCE");
        System.out.print("Masukkan pilihan: ");
        int pilihan = input.nextInt();

        // Membuat objek TiketKonser
        TiketKonser tiket = null;
        switch (pilihan) {
            case 1:
                // Polimorfisme --> instansiasi class CAT8
                tiket = new CAT8();
                break;
            
            case 2:
                // Polimorfisme --> instansiasi class CAT1
                tiket = new CAT1();
                break;

            case 3:
                // Polimorfisme --> instansiasi class FESTIVAL
                tiket = new FESTIVAL();
                break;

            case 4:
                // Polimorfisme --> instansiasi class VIP
                tiket = new VIP();
                break;

            case 5:
                // Polimorfisme --> instansiasi class VVIP
                tiket = new VVIP();
                break;

            default:
                // Output apabila input dari pengguna tidak ada dalam pilihan
                System.out.println("Input tidak valid!");
                System.exit(pilihan);
                break;
        }

        // Instansiasi objek PemesananTiket dan mencetak nota pesanan melalui method cetakNota()
        PemesananTiket pesan = new PemesananTiket(nama, tiket);
        pesan.cetakNota();

        input.close();
    }

    /*
     * Jangan ubah isi method dibawah ini, nama method boleh diubah
     * Method ini dipanggil untuk mendapatkan kode pesanan atau kode booking
     * Panggil method ini untuk kelengkapan mencetak output nota pesanan
     */
    public static String generateKodeBooking() {
        StringBuilder sb = new StringBuilder();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        int length = 8;

        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }

        return sb.toString();
    }

    /*
     * Jangan ubah isi method dibawah ini, nama method boleh diubah
     * Method ini dipanggil untuk mendapatkan waktu terkini
     * Panggil method ini untuk kelengkapan mencetak output nota pesanan
     */
    public static String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date currentDate = new Date();
        return dateFormat.format(currentDate);
    }
}