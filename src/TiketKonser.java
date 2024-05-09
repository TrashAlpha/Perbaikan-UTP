abstract class TiketKonser implements HargaTiket {
    // Do your magic here...
    protected int harga;

    // Constructor untuk inisialisasi harga tiket
    public TiketKonser(int harga) {
        this.harga = harga;
    }

    // Implementasi method dari interface HargaTiket untuk mendapatkan harga tiket
    public int getHarga() {
        return this.harga;
    }
}