import java.util.Scanner;
class ujian{
    public static void  main(String[] args){
        int bi;
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukan jumlah Bintang :");
        bi = scan.nextInt();

        //prosess

                    //    *
                    //   ***
                    //  *****
        for (int a=0;a<=bi;a++){
            for (int b=bi;b>=a;b--){
                System.out.print(" ");
            }
            for(int c=0;c<=a;c++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        for (int q=bi;q>=0;q--){
            for(int w=bi;w>=q;w--){
                System.out.print(" ");
            }
            for(int e=0;e<=q;e++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();




        
    }
}