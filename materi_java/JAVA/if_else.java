import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        
        int pilihan,qty,hs,byr,qtycemilan=0, harga, 
            hargacemilan=0, totalharga, 
            totalhrgmakan, totalhrgcemilan, kembali;
        String menu, cemilan, pilcemil;
        Scanner scan = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("RESTORAN WARTEG HORDENG TERTUTUP");
        System.out.println("MENU : ");
        System.out.println("1. Menu Spesial Dzuhur ");
        System.out.println("2. Menu Tanggung Buka ");
        System.out.println("3. Menu Sahur ");
        System.out.println("=====================================");
        System.out.print("Masukan Menu Yang dipilih: ");
        pilihan = Integer.parseInt(scan.nextLine());
        if(pilihan == 1)
        {
            menu = "NASI, AYAM, ES TEH";
            harga = 15000;
            System.out.println("1. Menu Spesial Dzuhur");
            System.out.print("Berapa Porsi : ");
            qty = Integer.parseInt(scan.nextLine());
            System.out.print("Tambah Cemilan: ");
            pilcemil = scan.nextLine();
            if(pilcemil.equalsIgnoreCase("ya")){
                System.out.print("Masukan Cemilan   : ");
                cemilan = scan.nextLine();
                System.out.print("Harga Cemilan     : ");
                hargacemilan = Integer.parseInt(scan.nextLine());
                System.out.print("Banyaknya Cemilan : ");
                qtycemilan = Integer.parseInt(scan.nextLine());
            } else {
                cemilan = "tidak";
            }
            totalhrgmakan = harga * qty;
            totalhrgcemilan = hargacemilan * qtycemilan;
            totalharga = totalhrgcemilan + totalhrgmakan;
            System.out.println("NOTA PEMBAYARAN");
            System.out.println("=====================================");
            System.out.println("Hidangan Utama              : "+menu);
            System.out.println("Banyaknya Porsi             : "+qty);
            System.out.println("Cemilan                     : "+cemilan);
            System.out.println("Banyaknya Cemilan           : "+qtycemilan);
            System.out.println("Total Harga Hidangan Utama  : "+totalhrgmakan);
            System.out.println("Total Harga Cemilan         : "+totalhrgcemilan);
            System.out.println("Total Yang Harus Dibayar    : "+totalharga);
            System.out.println("=====================================");
            System.out.print("Masukan Uang Pembayaran     : ");
            byr = Integer.parseInt(scan.nextLine());
            kembali = byr - totalharga;
            if(byr > totalharga){
            System.out.println("Uang Kembali: Rp " + kembali+"\nTerimakasih" );
            } else {
                System.out.println("Jangan Kembali Lagi Kesini!");
            }
        }
        else if(pilihan == 2)
        {
            menu = "NASI, TEMPE OREK, TEH HANGAT";
            harga = 12000;
            System.out.println("2. Menu Tanggung Buka");
            System.out.print("Berapa Porsi : ");
            qty = Integer.parseInt(scan.nextLine());
            System.out.print("Tambah Cemilan: ");
            pilcemil = scan.nextLine();
            if(pilcemil.equalsIgnoreCase("ya")){
                System.out.print("Masukan Cemilan   : ");
                cemilan = scan.nextLine();
                System.out.print("Harga Cemilan     : ");
                hargacemilan = Integer.parseInt(scan.nextLine());
                System.out.print("Banyaknya Cemilan : ");
                qtycemilan = Integer.parseInt(scan.nextLine());
            } else {
                cemilan = "tidak";
            }
            totalhrgmakan = harga * qty;
            totalhrgcemilan = hargacemilan * qtycemilan;
            totalharga = totalhrgcemilan + totalhrgmakan;
            System.out.println("NOTA PEMBAYARAN");
            System.out.println("=====================================");
            System.out.println("Hidangan Utama              : "+menu);
            System.out.println("Banyaknya Porsi             : "+qty);
            System.out.println("Cemilan                     : "+cemilan);
            System.out.println("Banyaknya Cemilan           : "+qtycemilan);
            System.out.println("Total Harga Hidangan Utama  : "+totalhrgmakan);
            System.out.println("Total Harga Cemilan         : "+totalhrgcemilan);
            System.out.println("Total Yang Harus Dibayar    : "+totalharga);
            System.out.println("=====================================");
            System.out.print("Masukan Uang Pembayaran     : ");
            byr = Integer.parseInt(scan.nextLine());
            kembali = byr - totalharga;
            if(byr > totalharga){
            System.out.println("Uang Kembali: Rp " + kembali+"\nTerimakasih" );
            } else {
                System.out.println("Jangan Kembali Lagi Kesini!");
            }
        }
        else if(pilihan ==3)
        {
            menu = "INDOMIE TELOR SETENGAH MATANG, KOPI";
            harga = 10000;
            System.out.println("3. Menu Sahur");
            System.out.print("Berapa Porsi : ");
            qty = Integer.parseInt(scan.nextLine());
            System.out.print("Tambah Cemilan: ");
            pilcemil = scan.nextLine();
            if(pilcemil.equalsIgnoreCase("ya")){
                System.out.print("Masukan Cemilan   : ");
                cemilan = scan.nextLine();
                System.out.print("Harga Cemilan     : ");
                hargacemilan = Integer.parseInt(scan.nextLine());
                System.out.print("Banyaknya Cemilan : ");
                qtycemilan = Integer.parseInt(scan.nextLine());
            } else {
                cemilan = "tidak";
            }
            totalhrgmakan = harga * qty;
            totalhrgcemilan = hargacemilan * qtycemilan;
            totalharga = totalhrgcemilan + totalhrgmakan;
            System.out.println("=====================================");
            System.out.println("NOTA PEMBAYARAN");
            System.out.println("=====================================");
            System.out.println("Hidangan Utama              : "+menu);
            System.out.println("Banyaknya Porsi             : "+qty);
            System.out.println("Cemilan                     : "+cemilan);
            System.out.println("Banyaknya Cemilan           : "+qtycemilan);
            System.out.println("Total Harga Hidangan Utama  : "+totalhrgmakan);
            System.out.println("Total Harga Cemilan         : "+totalhrgcemilan);
            System.out.println("Total Yang Harus Dibayar    : "+totalharga);
            System.out.println("=====================================");
            System.out.print("Masukan Uang Pembayaran     : ");
            byr = Integer.parseInt(scan.nextLine());
            kembali = byr - totalharga;
            if(byr > totalharga){
            System.out.println("Uang Kembali: Rp " + kembali+"\nTerimakasih" );
            } else {
                System.out.println("Jangan Kembali Lagi Kesini!");
            }
        } else {
            System.out.println("Maaf Menu yang anda masukan salah!");
        }
    }  
}