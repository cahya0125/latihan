import java.util.Scanner;
public class perhitungan{
    public static void main(String[]args){
        String nama,alamat,kelas,jenis;
        int umur,badan,tinggi;
        Scanner scan=new Scanner(System.in);

        System.out.println("====BIODATA====");
        System.out.print("Nama Lengkap      :");
        nama=scan.nextLine();

        System.out.print("Umur              :");
        umur=scan.nextInt();
        scan.nextLine();

        System.out.print("Tinggi Badan      :");
        tinggi=scan.nextInt();
        scan.nextLine();

        System.out.print("Berat Badan       :");
        badan=scan.nextInt();
        scan.nextLine();
        
        System.out.print("Jenis Kelamin     :");
        jenis=scan.nextLine();
        
        System.out.print("Kelas             :");
        kelas=scan.nextLine();
        
        System.out.print("Alamat            :");
        alamat=scan.nextLine();

        //output
        System.out.println("====BIODATA====");
        System.out.println("Nama Lenglap  :"+nama  );
        System.out.println("Umur          :"+umur);
        System.out.println("Tinggi Badan  :"+tinggi+("Cm"));
        System.out.println("Berat Badan   :"+badan+("Kg"));
        System.out.println("Jenis Kelamin :"+jenis);
        System.out.println("Kelas         :"+kelas);
        System.out.println("Alamat        :"+alamat);
        System.out.println("=======TERIMA KASIH=======");
    }
}