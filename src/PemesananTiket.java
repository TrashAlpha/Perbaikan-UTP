class PemesananTiket {
  // Do your magic here...
  private String nama;
  private TiketKonser tiket;

  // Constructor untuk inisialisasi nama pemesan dan jenis tiket
  public PemesananTiket(String nama, TiketKonser tiket) {
    this.nama = nama;
    this.tiket = tiket;
  }

  // Method untuk mencetak nota pesanan tiket
  public void cetakNota() {
    System.out.println("\n----- Detail Pemesanan -----");
    System.out.println("Nama Pemesan: " + this.nama);
    System.out.println("Kode Booking: " + Main.generateKodeBooking());
    System.out.println("Tanggal Pesanan: " + Main.getCurrentDate());
    System.out.println("Tiket yang dipesan: " + this.tiket.toString());
    // Format harga apabila harga sudah menginjak atau melebihi 10 juta USD
    if(this.tiket.getHarga() > 9999999){
      System.out.printf("Total harga: %.1fE%d USD", (double) this.tiket.getHarga() / 1e7, 7);
    } else{
      System.out.println("Total harga: " + this.tiket.getHarga() + " USD");
    }
  }
}
