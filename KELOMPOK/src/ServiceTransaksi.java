public class ServiceTransaksi {
    Transaksi[] trs;
    int idx;

    public ServiceTransaksi(int kapasitas) {
        trs = new Transaksi[kapasitas];
        idx = 0;
    }

    public void tambah(Transaksi t) {
        if (idx < trs.length) {
            trs[idx++] = t;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    public void displayData() {
        for (int i = 0; i < idx; i++) {
            trs[i].tampilDataTransaksi();
            System.out.println();
        }
    }

    public void searchByEmail(String email) {
        boolean found = false;
        for (int i = 0; i < idx; i++) {
            if (trs[i].bankAcc.email.equalsIgnoreCase(email)) {
                trs[i].tampilDataTransaksi();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Data tidak ditemukan.");
        }
    }

    public void cariMaxInOutSaldo() {
        if (idx == 0) return;

        double max = trs[0].inOutSaldo;
        int posisi = 0;

        for (int i = 1; i < idx; i++) {
            if (trs[i].inOutSaldo > max) {
                max = trs[i].inOutSaldo;
                posisi = i;
            }
        }

        System.out.println("Transaksi dengan In/Out Saldo Tertinggi:");
        trs[posisi].tampilDataTransaksi();
    }

    public void sortByNoRek() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (trs[j].bankAcc.noRekening.compareTo(trs[j + 1].bankAcc.noRekening) > 0) {
                    Transaksi temp = trs[j];
                    trs[j] = trs[j + 1];
                    trs[j + 1] = temp;
                }
            }
        }
        System.out.println("Data berhasil diurutkan berdasarkan No Rekening.");
    }
}
