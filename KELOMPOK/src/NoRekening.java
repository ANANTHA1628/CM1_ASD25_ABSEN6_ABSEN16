public class NoRekening {
    String noRekening, nama, namaIbu, noHp, email;

    public NoRekening(String noRekening, String nama, String namaIbu, String noHp, String email) {
        this.noRekening = noRekening;
        this.nama = nama;
        this.namaIbu = namaIbu;
        this.noHp = noHp;
        this.email = email;
    }

    public void tampilDataNorek() {
        System.out.printf("%-15s %-10s %-15s %-18s %-25s\n", noRekening, nama, namaIbu, noHp, email);
    }
}
