public class Transaksi {
    String kodeTransaksi;
    double saldo, saldoMasuk, saldoKeluar;
    String tanggal, type;
    Bank bankAcc;

    public Transaksi(String kodeTransaksi, double saldo, double saldoMasuk, double saldoKeluar, String tanggal, String type, Bank bankAcc) {
        this.kodeTransaksi = kodeTransaksi;
        this.saldo = saldo;
        this.saldoMasuk = saldoMasuk;
        this.saldoKeluar = saldoKeluar;
        this.tanggal = tanggal;
        this.type = type;
        this.bankAcc = bankAcc;
    }
}
