import java.util.Scanner;
public class login{
    public static void main(String[]args){
        String nama,passordd;
        Scanner scan=new Scanner(System.in);
        
        // input
        System.out.print("USERNAME: ");
        nama=scan.nextLine();
        System.out.print("PASSWORD: ");
        passordd=scan.nextLine();

        //output
        if (nama.equals("admin") && passordd.equals("1231")){
            System.out.println("Anda berhasil masuk");
        }else{
            System.out.println("Anda gagal masuk");
        }

    }
}    