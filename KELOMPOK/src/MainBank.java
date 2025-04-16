import java.util.Scanner;

public class MainBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        servisTransaksi servis = new servisTransaksi(10);

        NoRekening b1 = new NoRekening("123", "Rina", "Siti", "0811", "rina@gmail.com");
        NoRekening b2 = new NoRekening("456", "Andi", "Ayu", "0822", "andi@yahoo.com");
        NoRekening b3 = new NoRekening("789", "Dina", "Budi", "0833", "dina@mail.com");

        servis.tambah(new Transaksi("TR001", 1000000, 200000, 1200000, "2025-04-15", "Deposit", b1));
        servis.tambah(new Transaksi("TR002", 1500000, 500000, 1000000, "2025-04-14", "Withdraw", b2));
        servis.tambah(new Transaksi("TR003", 2000000, 750000, 2750000, "2025-04-13", "Deposit", b3));

        int pilihan;
        do {
            System.out.println("===== MENU BANK =====");
            System.out.println("1. Tampilkan Semua Data");
            System.out.println("2. Sorting berdasarkan No Rekening");
            System.out.println("3. Pencarian Transaksi (Email)");
            System.out.println("4. Transaksi dengan Max Debit/Kredit");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    servis.displayData();
                    break;
                case 2:
                    servis.sortByNoRek();
                    servis.displayData();
                    break;
                case 3:
                    System.out.print("Masukkan Email yang dicari: ");
                    String email = sc.nextLine();
                    servis.searchByEmail(email);
                    break;
                case 4:
                    servis.cariMaxInOutSaldo();
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);

        sc.close();
    }
}