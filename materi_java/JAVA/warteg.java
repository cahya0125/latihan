import java.util.Scanner;
public class warteg{
    public static void main(String[]args){
        int pilihan,harga,qty,harga_cemilan=0,qty_cemilan=0,Tutama,Tcemilan,all_total,bayar,kembalian;
        String menu,pilmil,cemilan;
        Scanner scan=new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("RESTORAN WARTEG HORDENG TERTUTUP");
        System.out.println("MENU :");
        System.out.println("1. Menu Spesial Dzuhur");
        System.out.println("2. Menu Tanggung Buka");
        System.out.println("3. Menu Sahur");
        System.out.println("==================================");
        System.out.print("Masukan Menu yg Dipilih: ");
        pilihan=scan.nextInt();
        scan.nextLine();

        if (pilihan == 1){
            menu ="Nasi,Ayam,Es Teh";
            harga =15000;
            System.out.println("1.Menu Spesial Dzuhur");
            System.out.print("Berapa porsi              : ");
            qty=scan.nextInt();
            scan.nextLine();
            System.out.print("Tambah Cemilan            : ");
            pilmil = scan.nextLine();
            if (pilmil.equalsIgnoreCase("ya")){
                System.out.print("Masukan Cemilan           : ");
                cemilan=scan.nextLine();
                System.out.print("Harga Persatu cemilan     : ");
                harga_cemilan=scan.nextInt();
                System.out.print("Banyak cemilan            : ");
                qty_cemilan=scan.nextInt();
            }else{
                cemilan="Tidak";
            }
            Tutama=harga*qty;
            Tcemilan=harga_cemilan*qty_cemilan;
            all_total=Tutama+Tcemilan;
            
            //output
            System.out.println("===================================");
            System.out.println("Hidangan Utama                  :"+menu);
            System.out.println("Banyak Porsi                    :"+qty);
            System.out.println("cemilan                         :"+cemilan);
            System.out.println("Banyak Cemilan                  :"+qty_cemilan);
            System.out.println("Total Harga Hidangan Utama      :"+Tutama);
            System.out.println("Total Harga Cemilan             :"+Tcemilan);
            System.out.println("Total Harga Seluruh             :"+all_total);
            System.out.println("===================================");
            System.out.print("Masukan jumlah uang anda          :");
            bayar=scan.nextInt();
            kembalian=bayar-all_total;
            
            if (bayar > all_total){
                System.out.println("uang kembalian                  :"+kembalian);
                System.out.println("Terima kasih,jangan lupa kembali lagi(:");
            }else{
                System.out.println("jangan kembali lagi, uang mu kurang "+kembalian);
            }
        }else if (pilihan == 2){
            menu ="Nasi,telor acak,Es Teh";
            harga =12000;
            System.out.println("1.Menu Spesial Dzuhur");
            System.out.print("Berapa porsi              : ");
            qty=scan.nextInt();
            scan.nextLine();
            System.out.print("Tambah Cemilan            : ");
            pilmil = scan.nextLine();
            if (pilmil.equalsIgnoreCase("ya")){
                System.out.print("Masukan Cemilan           : ");
                cemilan=scan.nextLine();
                System.out.print("Harga Persatu cemilan     : ");
                harga_cemilan=scan.nextInt();
                System.out.print("Banyak cemilan            : ");
                qty_cemilan=scan.nextInt();
            }else{
                cemilan="Tidak";
            }
            Tutama=harga*qty;
            Tcemilan=harga_cemilan*qty_cemilan;
            all_total=Tutama+Tcemilan;
            
            //output
            System.out.println("===================================");
            System.out.println("Hidangan Utama                  :"+menu);
            System.out.println("Banyak Porsi                    :"+qty);
            System.out.println("cemilan                         :"+cemilan);
            System.out.println("Banyak Cemilan                  :"+qty_cemilan);
            System.out.println("Total Harga Hidangan Utama      :"+Tutama);
            System.out.println("Total Harga Cemilan             :"+Tcemilan);
            System.out.println("Total Harga Seluruh             :"+all_total);
            System.out.println("===================================");
            System.out.print("Masukan jumlah uang anda          :");
            bayar=scan.nextInt();
            kembalian=bayar-all_total;
            
            if (bayar > all_total){
                System.out.println("uang kembalian                  :"+kembalian);
                System.out.println("Terima kasih,jangan lupa kembali lagi(:");
            }else{
                System.out.println("jangan kembali lagi, uang mu kurang "+kembalian);
            }

        }else if(pilihan == 3){
            menu ="INDOMI Telor Setengah matang,baso,sosis";
            harga =10000;
            System.out.println("1.Menu Spesial Dzuhur");
            System.out.print("Berapa porsi              : ");
            qty=scan.nextInt();
            scan.nextLine();
            System.out.print("Tambah Cemilan            : ");
            pilmil = scan.nextLine();
            if (pilmil.equalsIgnoreCase("ya")){
                System.out.print("Masukan Cemilan           : ");
                cemilan=scan.nextLine();
                System.out.print("Harga Persatu cemilan     : ");
                harga_cemilan=scan.nextInt();
                System.out.print("Banyak cemilan            : ");
                qty_cemilan=scan.nextInt();
            }else{
                cemilan="Tidak";
            }
            Tutama=harga*qty;
            Tcemilan=harga_cemilan*qty_cemilan;
            all_total=Tutama+Tcemilan;
            
            //output
            System.out.println("===================================");
            System.out.println("Hidangan Utama                  :"+menu);
            System.out.println("Banyak Porsi                    :"+qty);
            System.out.println("cemilan                         :"+cemilan);
            System.out.println("Banyak Cemilan                  :"+qty_cemilan);
            System.out.println("Total Harga Hidangan Utama      :"+Tutama);
            System.out.println("Total Harga Cemilan             :"+Tcemilan);
            System.out.println("Total Harga Seluruh             :"+all_total);
            System.out.println("===================================");
            System.out.print("Masukan jumlah uang anda          :");
            bayar=Integer.parseInt(scan.nextLine());
            //    Integer.parseInt
            kembalian=bayar-all_total;
            
            if (bayar > all_total){
                System.out.println("uang kembalian                  :"+kembalian);
                System.out.println("Terima kasih,jangan lupa kembali lagi(:");
            }else{
                System.out.println("jangan kembali lagi, uang mu kurang "+kembalian);
            }
        }else{
            System.out.println("PILIHAN YANG ANDA MASUKAN TIDAK ADA DI MENU");
            System.out.println("MOHON CEK KEMBALI MENU YANG AKAN DI PILIH");
        }
    }
}