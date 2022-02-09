import java.util.Scanner;

class main {
    public static void main(String[]args) {
        int hasil;
        int[][] matriksA = new int[2][2];
        int[][] matriksB = new int[2][2];
        Scanner scan = new Scanner(System.in);

        for (int x =0; x < matriksA.length; x++) {
            for (int y = 0; y < matriksB[x].length; y++) {
                System.out.print("Masukan Nilai MatrixA : [+x+],[+y+] :");
                matriksA[x][y] = scan.nextInt();
                System.out.print("Masukan Nilai MatrixB : [+x+],[+y+] :");
                matriksB[x][y] = scan.nextInt() ;
            } 
        }

        System.out.println("Matrix A :\tMatrix B :");

        for (int x = 0; x < matriksA.length; x++) {
            for (int y = 0; y < matriksB[x].length; y++) {
                System.out.print(matriksA[x][y] + "\t");
                
            }
            System.out.println();
        }
        System.out.println("Matrik B:");
        for(int x = 0; x < matriksA.length; x++){
            for(int y = 0; y < matriksB[x].length;y++){
                System.out.print(matriksB[x][y] + "\t");
            }
            System.out.println();
        }    
        System.out.println("Hasil Penjumlahan Matrix :");
        for (int x = 0; x < matriksA.length; x++) {
            for (int y = 0; y < matriksB[x].length; y++) {
                hasil = matriksA[x][y] + matriksB[x][y];
                System.out.print(hasil + "\t");
            }
            System.out.println();
        }
        System.out.println("Hasil Pengurangan Matrix :");
        for (int x = 0; x < matriksA.length; x++) {
            for (int y = 0; y < matriksB[x].length; y++) {
                hasil = matriksA[x][y] - matriksB[x][y];
                System.out.print(hasil + "\t");
            }
            System.out.println();
        }
        System.out.println("Hasil Perkalian Matrix :");
        for (int x = 0; x < matriksA.length; x++) {
            for (int y = 0; y < matriksB[x].length; y++) {
                hasil = matriksA[x][y] * matriksB[x][y];
                System.out.print(hasil + "\t");
            }
            System.out.println();
        }
        System.out.println("Hasil Pembagian Matrix :");
        for(int x = 0; x < matriksA.length;x++){
            for(int y = 0; y < matriksB[x].length;y++){
                hasil = matriksA[x][y] / matriksB[x][y];
                System.out.print(hasil + "\t");
            }
            System.out.println();
        }

    }
}