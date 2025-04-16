public class Transaksi {
    String kodeTransaksi;
    double saldo;
    double inOutSaldo;
    double finalSaldo;
    String tanggalTransaksi;
    String type;
    NoRekening bankAcc;

    public Transaksi(String kodeTransaksi, double saldo, double inOutSaldo, double finalSaldo,
                     String tanggalTransaksi, String type, NoRekening bankAcc) {
        this.kodeTransaksi = kodeTransaksi;
        this.saldo = saldo;
        this.inOutSaldo = inOutSaldo;
        this.finalSaldo = finalSaldo;
        this.tanggalTransaksi = tanggalTransaksi;
        this.type = type;
        this.bankAcc = bankAcc;
    }

    public void tampilDataTransaksi() {
        System.out.println("Kode Transaksi : " + kodeTransaksi);
        System.out.println("Tanggal        : " + tanggalTransaksi);
        System.out.println("Type           : " + type);
        System.out.println("Saldo Awal     : " + saldo);
        System.out.println("In/Out Saldo   : " + inOutSaldo);
        System.out.println("Saldo Akhir    : " + finalSaldo);
        System.out.println("--- Data Nasabah ---");
        bankAcc.tampilDataNorek();
    }
}