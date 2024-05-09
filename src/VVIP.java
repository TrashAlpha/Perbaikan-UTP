class VVIP extends TiketKonser {
   // Do your magic here...
   // Constructor untuk inisialisasi harga tiket VVIP
   public VVIP() {
        super(11000000);
    }

    // Override method toString() untuk mengembalikan string berupa nama tiket yaitu UNLIMITED EXPERIENCE
    @Override
    public String toString() {
        return "UNLIMITED EXPERIENCE";
    }
}