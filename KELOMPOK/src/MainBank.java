import java.util.Scanner;

public class MainBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ServiceTransaksi service = new ServiceTransaksi(10);

        service.tambah(new Transaksi("Tr001", 500000, 100000, 400000, "23-04-2024", "Debit",
            new NoRekening("16092027 3084", "Wallace", "Mel Mel", "082-458-264-3263", "wallace@qwuil.com")));
        service.tambah(new Transaksi("Tr002", 500000, 100000, 600000, "23-04-2024", "Kredit",
            new NoRekening("16108017 0573", "Darius", "Susanti", "081-357-043-9847", "darius@tgr.org")));
        service.tambah(new Transaksi("Tr003", 500000, 300000, 200000, "23-04-2024", "Debit",
            new NoRekening("16204041 2243", "Fuller", "Rosalia", "085-556-712-7602", "fuller@gmail.com")));
        service.tambah(new Transaksi("Tr004", 500000, 150000, 650000, "23-04-2024", "Kredit",
            new NoRekening("16276325 0112", "Maria", "Kristela", "082-767-223-4234", "maria@gmail.com")));
        service.tambah(new Transaksi("Tr005", 500000, 200000, 700000, "23-04-2024", "Kredit",
            new NoRekening("16104017 2416", "Gery", "Fatimah", "083-683-415-8323", "gery@gery.com")));

        int pilih;
        do {
            System.out.println("\n==================POLINEMA BANK==================");
            System.out.println("BANK MENU:");
            System.out.println("1. Data Norek");
            System.out.println("2. Data Transaksi");
            System.out.println("3. Search Data berdasarkan Email");
            System.out.println("4. Display max debit/kredit");
            System.out.println("5. Sort Data");
            System.out.println("6. Exit");
            System.out.print("Choose menu(1-6): ");
            pilih = sc.nextInt();
            sc.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.printf("%-15s %-10s %-15s %-18s %-25s\n", "No Rekening", "Nama", "Nama Ibu", "No HP", "Email");
                    for (int i = 0; i < service.idx; i++) {
                        service.Trs[i].bankAcc.tampilDataNorek();
                    }
                    break;
                case 2:
                    service.displayData();
                    break;
                case 3:
                    System.out.print("Masukkan Email: ");
                    String email = sc.nextLine();
                    service.Searching(email);
                    break;
                case 4:
                    service.FindMaxDebitKredit();
                    break;
                case 5:
                    service.SortFinalSaldoAsc();
                    break;
                case 6:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Menu tidak valid!");
            }

        } while (pilih != 6);
    }
}
