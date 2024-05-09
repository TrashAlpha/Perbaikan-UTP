class VIP extends TiketKonser {
    // Do your magic here...
    // Constructor untuk inisialisasi harga tiket VIP
    public VIP() {
        super(8000000);
    }

    // Override method toString() untuk mengembalikan string berupa nama tiket yaitu VIP
    @Override
    public String toString() {
        return "VIP";
    }
}