import java.util.Scanner;
public class MainBank {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ServiceTransaksi service = new ServiceTransaksi();
        int pilih;

        // Menu utama program
        do {
            System.out.println("\nBANK MENU:");
            System.out.println("1. Tampilkan Data Rekening");
            System.out.println("2. Tambah Transaksi");
            System.out.println("3. Cari Data berdasarkan Email");
            System.out.println("4. Tampilkan Saldo Minimum dan Maksimum");
            System.out.println("5. Urutkan Data Berdasarkan Nama");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();  // Membersihkan input buffer

            switch (pilih) {
                case 1:
                    // Tampilkan data rekening
                    service.displayData();
                    break;
                case 2:
                    // Tambah transaksi baru
                    System.out.print("No Rekening: ");
                    String norek = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Nama Ibu: ");
                    String ibu = sc.nextLine();
                    System.out.print("No HP: ");
                    String nohp = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    Bank newBank = new Bank(norek, nama, ibu, nohp, email);

                    System.out.print("Kode Transaksi: ");
                    String kode = sc.nextLine();
                    System.out.print("Saldo: ");
                    double saldo = sc.nextDouble();
                    System.out.print("Saldo Masuk: ");
                    double masuk = sc.nextDouble();
                    System.out.print("Saldo Keluar: ");
                    double keluar = sc.nextDouble();
                    sc.nextLine();  // Membersihkan input buffer
                    System.out.print("Tanggal Transaksi: ");
                    String tanggal = sc.nextLine();
                    System.out.print("Type Transaksi (Deposit/Withdraw): ");
                    String type = sc.nextLine();

                    Transaksi newTrans = new Transaksi(kode, saldo, masuk, keluar, tanggal, type, newBank);
                    service.tambah(newTrans);
                    break;
                case 3:
                    // Cari data berdasarkan email
                    System.out.print("Masukkan Email yang dicari: ");
                    String cariEmail = sc.nextLine();
                    service.Searching(cariEmail);
                    break;
                case 4:
                    // Tampilkan saldo minimum dan maksimum
                    service.FindMinMax();
                    break;
                case 5:
                    // Urutkan data berdasarkan nama
                    service.Sorting();
                    break;
                case 6:
                    // Keluar dari program
                    System.out.println("Terima kasih telah menggunakan sistem.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 6);  // Loop akan berhenti jika memilih menu 6
    }
}