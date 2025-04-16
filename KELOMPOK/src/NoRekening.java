    public class NoRekening {
        String noRekening;
        String nama;
        String namaIbu;
        String noHp;
        String email;
    
        public NoRekening(String noRekening, String nama, String namaIbu, String noHp, String email) {
            this.noRekening = noRekening;
            this.nama = nama;
            this.namaIbu = namaIbu;
            this.noHp = noHp;
            this.email = email;
        }
    
        public void tampilDataNorek() {
            System.out.println("No Rekening   : " + noRekening);
            System.out.println("Nama          : " + nama);
            System.out.println("Nama Ibu      : " + namaIbu);
            System.out.println("No HP         : " + noHp);
            System.out.println("Email         : " + email);
            System.out.println("-------------------------------------");
        }
    }
    

