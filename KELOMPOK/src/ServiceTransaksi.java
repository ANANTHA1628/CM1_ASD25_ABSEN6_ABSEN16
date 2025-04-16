public class ServiceTransaksi {
    Transaksi[] Trs = new Transaksi[100];
    int idx = 0;

    void tambah(Transaksi t) {
        if (idx < Trs.length) {
            Trs[idx] = t;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void displayData() {
        System.out.println("No Rekening\tNama\t\tNama Ibu\tNohp\t\t\t\temail");
        for (int i = 0; i < idx; i++) {
            NoRekening b = Trs[i].bankAcc;
            System.out.printf("%-12s\t%-8s\t%-10s\t%-20s\t%s\n", b.noRekening, b.nama, b.namaIbu, b.noHp, b.email);
        }
    }

    void Searching(String email) {
        for (int i = 0; i < idx; i++) {
            if (Trs[i].bankAcc.email.equalsIgnoreCase(email)) {
                System.out.println("Data ditemukan:");
                System.out.println("Nama: " + Trs[i].bankAcc.nama);
                System.out.println("No Rekening: " + Trs[i].bankAcc.noRekening);
                return;
            }
        }
        System.out.println("Data tidak ditemukan.");
    }

    void FindMinMax() {
        if (idx == 0) {
            System.out.println("Data kosong!");
            return;
        }
        double min = Trs[0].saldo;
        double max = Trs[0].saldo;
        for (int i = 1; i < idx; i++) {
            if (Trs[i].saldo < min) min = Trs[i].saldo;
            if (Trs[i].saldo > max) max = Trs[i].saldo;
        }
        System.out.println("Saldo minimum: " + min);
        System.out.println("Saldo maksimum: " + max);
    }

    void Sorting() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (Trs[j].bankAcc.nama.compareTo(Trs[j + 1].bankAcc.nama) > 0) {
                    Transaksi temp = Trs[j];
                    Trs[j] = Trs[j + 1];
                    Trs[j + 1] = temp;
                }
            }
        }
        System.out.println("Data berhasil diurutkan berdasarkan nama.");
    }
}
