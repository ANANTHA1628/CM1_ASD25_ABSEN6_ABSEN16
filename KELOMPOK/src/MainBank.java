import java.util.Scanner;
public class MainBank {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ServiceTransaksi service = new ServiceTransaksi();
        int pilih;

        do {
            System.out.println("\nBANK MENU:");
            System.out.println("1. Data NoRekening");
            System.out.println("2. Data Transaksi");
            System.out.println("3. Search Data");
            System.out.println("4. Display min/max saldo");
            System.out.println("5. Sort Data");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();  

            switch (pilih) {
                case 1:
                System.out.printf("%-15s %-10s %-15s %-18s %-25s\n", "No Rekening", "Nama", "Nama Ibu", "No HP", "Email");
                System.out.println("---------------------------------------------------------------------------------------------");
                System.out.printf("%-15s %-10s %-15s %-18s %-25s\n", "16092027 3864", "Wallace", "Mel Mel", "082-458-264-3263", "wallace@qwuil.com");
                System.out.printf("%-15s %-10s %-15s %-18s %-25s\n", "16108017 9573", "Darius", "Susanti", "081-357-043-9847", "darius@tgr.org");
                System.out.printf("%-15s %-10s %-15s %-18s %-25s\n", "16204041 2243", "Fuller", "Rosalia", "085-556-712-7602", "fuller@gmail.com");
                System.out.printf("%-15s %-10s %-15s %-18s %-25s\n", "16276325 0112", "Maria", "Kristela", "082-767-223-4234", "maria@gmail.com");
                System.out.printf("%-15s %-10s %-15s %-18s %-25s\n", "16104017 2416", "Gery", "Fatimah", "083-683-415-8323", "gery@gery.com");
                case 2:
                    
                case 3:
                    System.out.print("Masukkan Email yang dicari: ");
                    String cariEmail = sc.nextLine();
                    service.Searching(cariEmail);
                    break;
                case 4:
                    
                    service.FindMinMax();
                    break;
                case 5:
                    
                    service.Sorting();
                    break;
                case 6:
                   
                    System.out.println("Terima kasih telah menggunakan sistem.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 6);  
    }
}