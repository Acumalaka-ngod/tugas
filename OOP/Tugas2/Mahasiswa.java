class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;

    // Constructor
    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    // Method untuk menampilkan informasi mahasiswa
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama + ", NIM: " + nim + ", Jurusan: " + jurusan);
    }

    public static void main(String[] args) {

        Mahasiswa mhs1 = new Mahasiswa("Budi Santoso", "21012345", "Teknik Informatika");

        Mahasiswa mhs2 = new Mahasiswa("Siti Aisyah", "21067890", "Sistem Informasi");

        mhs1.tampilkanInfo();
        mhs2.tampilkanInfo();

        mhs1.setNama("Budi Prasetyo");
        mhs2.setJurusan("Manajemen Informatika");

        System.out.println("Setelah perubahan:");
        mhs1.tampilkanInfo();
        mhs2.tampilkanInfo();
    }
}
