import java.util.Scanner;
class opsi{
    public static void  main(String[] args){
        int bi;
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukan jumlah Bintang :");
        bi = scan.nextInt();
                //* 
                //**
                //***
        for(int a=0;a<=bi;a++){
            for(int b=0;b<=a;b++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int c=0;c<=bi;c++){
            for(int d=c;d<=bi;d++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}