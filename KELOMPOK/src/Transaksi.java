public class Transaksi {
    String kodeTransaksi;
    double saldo, inOutSaldo, finalSaldo;
    String tanggalTransaksi, type;
    NoRekening bankAcc;

    public Transaksi(String kodeTransaksi, double saldo, double inOutSaldo, double finalSaldo, String tanggalTransaksi, String type, NoRekening bankAcc) {
        this.kodeTransaksi = kodeTransaksi;
        this.saldo = saldo;
        this.inOutSaldo = inOutSaldo;
        this.finalSaldo = finalSaldo;
        this.tanggalTransaksi = tanggalTransaksi;
        this.type = type;
        this.bankAcc = bankAcc;
    }

    public void tampilDataTransaksi() {
        System.out.printf("%-15s %-15s %-10.1f %-15.1f %-18.1f %-25s %-10s\n",
            kodeTransaksi, bankAcc.noRekening, saldo, inOutSaldo, finalSaldo, tanggalTransaksi, type);
    }
}
