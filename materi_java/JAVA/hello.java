import java.util.Scanner;
class hello{
    public static void  main(String[] args){
        int bi,a;
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukan jumlah Bintang :");
        bi = scan.nextInt();


                //   *
                //  **
                // ***
        for (a=0;a<=bi;a++){
            for (int b=bi-1;b>=a;b--){
                System.out.print(" ");
            }
            for(int c=0;c<=a;c++){
                System.out.print("*");
            }    
            System.out.println();
        }
        
    }
}