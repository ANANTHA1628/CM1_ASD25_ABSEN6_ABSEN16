public class ServiceTransaksi {
    Transaksi[] Trs;
    int idx;

    public ServiceTransaksi(int kapasitas) {
        Trs = new Transaksi[kapasitas];
        idx = 0;
    }

    void tambah(Transaksi t) {
        if (idx < Trs.length) {
            Trs[idx++] = t;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void displayData() {
        System.out.printf("%-15s %-15s %-10s %-15s %-18s %-25s %-10s\n", 
            "Kode", "No Rekening", "Saldo", "Debit/Kredit", "Final Saldo", "Tanggal", "Type");
        for (int i = 0; i < idx; i++) {
            Trs[i].tampilDataTransaksi();
        }
    }

    void Searching(String email) {
        boolean ditemukan = false;
        for (int i = 0; i < idx; i++) {
            if (Trs[i].bankAcc.email.equalsIgnoreCase(email)) {
                System.out.println("Data ditemukan:");
                Trs[i].bankAcc.tampilDataNorek();
                Trs[i].tampilDataTransaksi();
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Data tidak ditemukan.");
        }
    }

    void FindMaxDebitKredit() {
        if (idx == 0) {
            System.out.println("Data kosong!");
            return;
        }
        double max = Trs[0].inOutSaldo;
        Transaksi maxTrx = Trs[0];
        for (int i = 1; i < idx; i++) {
            if (Trs[i].inOutSaldo > max) {
                max = Trs[i].inOutSaldo;
                maxTrx = Trs[i];
            }
        }
        System.out.println("Transaksi dengan Debit/Kredit Tertinggi:");
        maxTrx.tampilDataTransaksi();
    }

    void SortFinalSaldoAsc() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (Trs[j].finalSaldo > Trs[j + 1].finalSaldo) {
                    Transaksi tmp = Trs[j];
                    Trs[j] = Trs[j + 1];
                    Trs[j + 1] = tmp;
                }
            }
        }
        System.out.println("Data diurutkan berdasarkan Final Saldo (ASC):");
        displayData();
    }
}
