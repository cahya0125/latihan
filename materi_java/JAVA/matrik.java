import java.util.Scanner;
class matrik{
    public static void main(String[] args){
        int[][] matriksA = new int[2][2];
        int[][] matriksB = new int[2][2];
        int[][] hasil = new int[2][2];
        int b,k;
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukan Nilai Baris: ");
        b=scan.nextInt();
        System.out.print("Masukan Nilai Kolom: ");
        k=scan.nextInt();
        System.out.println("Masukan Matrik A:");
        for(int i=0;i<b;i++){
            for(int j=0;j<k;j++){
                System.out.print("Baris ke- "+i+" kolom ke- "+j+":");
                matriksA[i][j]=scan.nextInt();
            }
        }
        System.out.println("Masukan Matrik b:");
        for(int l=0;l<b;l++){
            for(int a=0;a<k;a++){
                System.out.print("Baris ke- "+l+" kolom ke- "+a+":");
                matriksB[l][a]=scan.nextInt();
            }
        }
        System.out.println("Matriks A:");
        for(int i=0;i<b;i++){
            for(int j=0;j<k;j++){
                System.out.print(matriksA[i][j]+"\t ");
            }
            System.out.println(" ");
        }
        System.out.println("Matriks B");
        for(int l=0;l<b;l++){
            for(int a=0;a<k;a++){
                System.out.print(matriksB[l][a]+"\t ");
            }
            System.out.println(" ");
        }
        System.out.println("Hasil Penjumlahan Matrix :");
        for (int x = 0; x < b; x++) {
            for (int y = 0; y < k; y++) {
                hasil[x][y] = matriksA[x][y] + matriksB[x][y];
                System.out.print(hasil[x][y] + "\t");
            }
            System.out.println();
        }
        System.out.println("Hasil Pengurangan Matrik :");
        for (int x =0;x<b;x++){
            for(int y =0;y < k;y++){
                hasil[x][y]=matriksA[x][y] - matriksB[x][y];
                System.out.print(hasil[x][y] + "\t");
            }
            System.out.println();
        }System.out.println("Hasil Perkalian Matrik :");
        for (int x =0;x<b;x++){
            for(int y =0;y < k;y++){
                hasil[x][y]=matriksA[x][y] * matriksB[x][y];
                System.out.print(hasil[x][y] + "\t");
            }
            System.out.println();
        }
        System.out.println("Hasil Pembagian Matrik :");
        for (int x =0;x<b;x++){
            for(int y =0;y < k;y++){
                hasil[x][y]=matriksA[x][y] / matriksB[x][y];
                System.out.print(hasil[x][y] + "\t");
            }
            System.out.println();
        }

    }
}