import java.util.Scanner;
public class kasir{
    public static void main(String[]args){
        String nama;
        Double harga,jumlah,total,bayar,kembalian;
        Scanner scan=new Scanner(System.in);

        //input
        System.out.println("====Kasir Sederhana====");
        System.out.println("========================");
        System.out.print("Nama barang: ");
        nama=scan.nextLine();
        System.out.print("masukan harga: ");
        harga=scan.nextDouble();
        System.out.print("jumlah: ");
        jumlah=scan.nextDouble();
        System.out.println("========================");

        //penghitungan
        total=harga*jumlah;

        //output
        System.out.println("Nama Barang: "+nama);
        System.out.println("Harga: "+harga);
        System.out.println("jumlah: "+jumlah);
        System.out.println("Total :"+total);
        System.out.println("========================");

        //kembalian
        System.out.print("Masukan Uang :");
        bayar=scan.nextDouble();
        System.out.println("========================");

        kembalian=bayar-total;
        System.out.println("kembalian: " + kembalian);
        System.out.println("========================");
        

    }
}    