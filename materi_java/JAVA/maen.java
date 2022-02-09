import java.util.Scanner;
import javax.swing.JOptionPane;
class maen{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String jawab,nama,name;
        int pilihan,nik,golongan,pokok,tunjangan,pajak,total;
        boolean satu=true;
        //2
        double diskon=0;
        String nama2;
        String[] jenis={"salah","deluxe room","suite room","presedent room"};
        int kamar,status,lama,tarif=0;
        //3
        int menu;
        //4
        Scanner input = new Scanner(System.in);
        int mhs,jml, banyakTes = 3, nilai[][], ntt[], ntr[];
        float rata[], jumlah[], rtt, rtr;
        //5
        int b,kolom;
        //6
        int jumlah_6,swap,q,z;
        //7
        String nama3;
        //8
        String nama4,alamat,hobby,no,umur;
        System.out.println("     QUIZ RREKAYASA PERANGKAT LUNAK     ");
        System.out.println("1.");
        System.out.println("2.");
        System.out.println("3.");
        System.out.println("4.");
        System.out.println("5.");
        System.out.println("6.");
        System.out.println("7.");
        System.out.println("8.");
        System.out.println("9.");

        do{
            System.out.print("pILIH[1-9]:");
            pilihan=scan.nextInt();

            do{
                if(pilihan == 1){
                    System.out.println("");
                    System.out.println("PROGRAM PERHITUNGAN GAJI KARYAWAN");
                    System.out.println("      SMK ASSALAAM BANDUNG       ");
                    System.out.println("======================================");
                    System.out.println();
                    System.out.print("Masukan Nama :");
                    nama=scan.nextLine();
                    scan.nextLine();
                    
                    System.out.print("Masukan NIK  :");
                    nik=scan.nextInt();
                    scan.nextLine();

                    System.out.println("1.golongan 1A");
                    System.out.println("2.golongan 1B");
                    System.out.println("3.golongan 2A");
                    System.out.println("4.golomgan 2B");
                    System.out.println("5.golongan 3A");
                    System.out.println("6.golongan 3B");

                    System.out.print("Pilih golongan: ");
                    golongan=scan.nextInt();
                    scan.nextLine();
                    if(golongan == 1){
                        pokok=1000000;
                        tunjangan=100000;

                        pajak=((5/2)*(pokok+tunjangan))/100;
                        total=((pokok+tunjangan)-pajak);
                        name=nama;
                        System.out.println("=======================================");
                        System.out.println("Nama Karyawan           :"+nama);
                        System.out.println("NIK Karyawan            :"+nik);
                        System.out.println("Gaji Pokok              :"+pokok);
                        System.out.println("Tunjangan Istri dan Anak:"+tunjangan);
                        System.out.println("Pajak                   :"+pajak);
                        System.out.println("Total Gaji Yang DiTerima:"+total);
                        System.out.println("=======================================");
                    }else if(golongan == 2){
                        pokok=1500000;
                        tunjangan=200000;

                        pajak=((5/2)*(pokok+tunjangan))/100;
                        total=((pokok+tunjangan)-pajak);
                        name=nama;
                        System.out.println("=======================================");
                        System.out.println("Nama Karyawan           :"+name);
                        System.out.println("NIK Karyawan            :"+nik);
                        System.out.println("Gaji Pokok              :"+pokok);
                        System.out.println("Tunjangan Istri dan Anak:"+tunjangan);
                        System.out.println("Pajak                   :"+pajak);
                        System.out.println("Total Gaji Yang DiTerima:"+total);
                        System.out.println("=======================================");
                    }else if(golongan == 3){
                        pokok=2000000;
                        tunjangan=300000;

                        pajak=((5/2)*(pokok+tunjangan))/100;
                        total=((pokok+tunjangan)-pajak);
                        name=nama;
                        System.out.println("=======================================");
                        System.out.println("Nama Karyawan           :"+name);
                        System.out.println("NIK Karyawan            :"+nik);
                        System.out.println("Gaji Pokok              :"+pokok);
                        System.out.println("Tunjangan Istri dan Anak:"+tunjangan);
                        System.out.println("Pajak                   :"+pajak);
                        System.out.println("Total Gaji Yang DiTerima:"+total);
                        System.out.println("=======================================");
                    }else if(golongan == 4){
                        pokok=2500000;
                        tunjangan=400000;

                        pajak=((5/2)*(pokok+tunjangan))/100;
                        total=((pokok+tunjangan)-pajak);
                        name=nama;
                        System.out.println("=======================================");
                        System.out.println("Nama Karyawan           :"+name);
                        System.out.println("NIK Karyawan            :"+nik);
                        System.out.println("Gaji Pokok              :"+pokok);
                        System.out.println("Tunjangan Istri dan Anak:"+tunjangan);
                        System.out.println("Pajak                   :"+pajak);
                        System.out.println("Total Gaji Yang DiTerima:"+total);
                        System.out.println("=======================================");
                    }else if(golongan == 5){
                        pokok=3000000;
                        tunjangan=500000;

                        pajak=((5/2)*(pokok+tunjangan))/100;
                        total=((pokok+tunjangan)-pajak);
                        name=nama;
                        System.out.println("=======================================");
                        System.out.println("Nama Karyawan           :"+name);
                        System.out.println("NIK Karyawan            :"+nik);
                        System.out.println("Gaji Pokok              :"+pokok);
                        System.out.println("Tunjangan Istri dan Anak:"+tunjangan);
                        System.out.println("Pajak                   :"+pajak);
                        System.out.println("Total Gaji Yang DiTerima:"+total);
                        System.out.println("=======================================");
                    }else if(golongan == 6){
                        pokok=3500000;
                        tunjangan=600000;

                        pajak=((5/2)*(pokok+tunjangan))/100;
                        total=((pokok+tunjangan)-pajak);
                        name=nama;
                        System.out.println("=======================================");
                        System.out.println("Nama Karyawan           :"+name);
                        System.out.println("NIK Karyawan            :"+nik);
                        System.out.println("Gaji Pokok              :"+pokok);
                        System.out.println("Tunjangan Istri dan Anak:"+tunjangan);
                        System.out.println("Pajak                   :"+pajak);
                        System.out.println("Total Gaji Yang DiTerima:"+total);
                        System.out.println("=======================================");
                    }else{
                        System.out.println("MAAF GOLONGAN ANDA SALAH");
                    }   
                }else if(pilihan == 2){
                    System.out.println("\tSistem Informasi perhotelan\t");
                    System.out.print("Masukan Nama Pelanggan :");
                    nama2=scan.nextLine();

                    System.out.println("Jenis kamar: ");
                    System.out.println("1.deluxe room 270.000/day");
                    System.out.println("2.suite room 300.000/day");
                    System.out.println("3.presedent room 375.000/day");
                    System.out.print("Pilih kamar:");
                    kamar=scan.nextInt();
                    if (kamar ==1){
                        
                        tarif=275000;
                    }else if(kamar == 2){
                        
                        tarif=300000;
                    }else if(kamar == 3){
                        
                        tarif=375000;
                    }
                    
                    System.out.println("lama:");
                    lama=scan.nextInt();
                    System.out.println("Status pelanggan");
                    System.out.println("1.Member");
                    System.out.println("2.Non Member");
                    System.out.print("Status: ");
                    status=scan.nextInt();

                    if (status == 1){
                        if(lama >= 4){
                            diskon=0.2;
                        }else if(lama>7){
                            diskon=0.35;
                        }else{
                            diskon=0;
                        }
                    }else{
                        if(lama>=4){
                            diskon=0.1;
                        }else if(lama>7){
                            diskon=0.15;
                        }else{
                            diskon=0;
                        }
                    }
                    int tarif_total=lama*tarif;
                    double disc=tarif_total*diskon;
                    double nomi=tarif_total-disc;
                    
                    System.out.println("\t NOTA PE,BAYARAN HOTEL BANDUNG \t");
                    System.out.println("Nama pelanggan           :"+nama2);
                    System.out.println("Jenis Kamar              :"+jenis[kamar]);
                    System.out.println("tarif penginapan         :"+tarif_total);
                    System.out.println("diskon menginap          :"+disc);
                    System.out.println("nomilan yg harus di bayar:"+nomi);
                    System.out.print("bayar                    :");
                    int bayar=scan.nextInt();
                    double kembalian=bayar-nomi;
                    System.out.println("kembalian                :"+kembalian);
                    System.out.println("===========================================");
                    if(bayar > nomi){
                        System.out.println();
                    }else{
                        System.out.println("MOHON MAAF UANG ANDA KURANG");
                    }   
                }else if(pilihan == 3){
                    System.out.println("+==========================+");
                    System.out.println("|1.Usaha(W)                |");
                    System.out.println("|2.Daya(P)                 |");
                    System.out.println("|3.Energi Ptensial(Ep)     |");
                    System.out.println("|4.Energi Kinetik(Ek)      |");
                    System.out.println("|5.Energi Mekanik(Em)      |");
                    System.out.println("+==========================+");
                    System.out.print("Pilih menu [1 s/d 5]:");
                    menu=scan.nextInt();
            
                    if (menu == 1){
                        System.out.println("Menghitung Besarnya Usaha(W)");
                        System.out.println("+==========================+");
                        System.out.print("Masukan Besaran Gaya(F)=");
                        int gaya=scan.nextInt();
                        System.out.print("Masukan Perpindahan Benda(F)=");
                        int benda=scan.nextInt();
                        System.out.println("Diketahu====================+");
                        System.out.println("Gaya(F) = "+gaya+" N");
                        System.out.println("Perpindahan(S) = "+benda+" m");
                        System.out.println("->Usaha(W)  = F * S");
                        System.out.println("       (W)  = "+gaya+" * "+benda);
                        double joule=gaya*benda;
                        System.out.println("       (W)  = "+joule+"Joule");
                        System.out.println("+==========================+");
                    }else if(menu == 2){
                        System.out.println("Menghitung Besarnya Daya(P)");
                        System.out.println("+==========================+");
                        System.out.print("Masukan Besarnya Usaha(J)=");
                        int Usaha=scan.nextInt();
                        System.out.print("Masukan Lamanya Waktu(s)=");
                        int waktu=scan.nextInt();
                        System.out.println("Diketahu====================+");
                        System.out.println("Usaha(W) = "+Usaha+" J");
                        System.out.println("Waktu(t) = "+waktu+" s");
                        System.out.println("->Daya(P)  = W / t");
                        System.out.println("       (P)  = "+Usaha+" / "+waktu);
                        double J_s=Usaha/waktu;
                        System.out.println("       (W)  = "+J_s+"J/s");
                        System.out.println("+==========================+");
                    }else if(menu == 3){
                        System.out.println("Menghitung Energi Potensial(Ep)");
                        System.out.println("+==========================+");
                        System.out.print("Masukan Massa Benda(Kg)=");
                        int Massa=scan.nextInt();
                        System.out.print("Masukan Gravitasi Bumi(m/s^2)=");
                        int bumi=scan.nextInt();
                        System.out.print("Masukan Ketinggian benda (m)=");
                        int tinggi=scan.nextInt();
                        System.out.println("Diketahu====================+");
                        System.out.println("Massa Benda(m) = "+Massa+" Kg");
                        System.out.println("Gravitasi Bumi(g) = "+bumi+" m/s^2");
                        System.out.println("Ketinggian Benda(h)="+tinggi+" m");
                        System.out.println("->Energi pontesial(Ep)= m * g * h");
                        System.out.println("       (Ep)  = "+Massa+" * "+bumi+" * "+tinggi);
                        double Ep=Massa*bumi*tinggi;
                        System.out.println("       (EP)  = "+Ep+" Joule");
                        System.out.println("+==========================+");
                    }else if(menu == 4){
                        System.out.println("Menghitung Energi Kinetik(Ek)");
                        System.out.println("+==========================+");
                        System.out.print("Masukan Massa Benda(Kg)=");
                        int Massa2=scan.nextInt();
                        System.out.print("Masukan Kecepatan Benda(m/s)=");
                        int cepat=scan.nextInt();
                        System.out.println("Diketahu====================+");
                        System.out.println("Massa Benda(Kg) = "+Massa2+" Kg");
                        System.out.println("Kecepatan benda(v) = "+cepat+" m/s");
                        System.out.println("->Energi Kinetik(Ek)  = 0.5 m * (v^2)");
                        System.out.println("       (Ek)  = 0.5 * "+Massa2+" * "+cepat);
                        int cepet1=cepat*cepat;
                        double masa=Massa2*0.5;
                        System.out.println("       (Ek)  = "+masa+" * "+cepet1);
                        Double EK=masa*cepet1;
                        System.out.println("       (Ek)  = "+EK+"Joule");
                        System.out.println("+==========================+");
                    }else if(menu == 5){
                        System.out.println("Menghitung Energi Mekanik(Em)");
                        System.out.println("+==========================+");
                        System.out.println("->Menghitung Energi Potensia(Ep)");
                        System.out.print("Masukan Massa Benda(m)=");
                        int Massa_em=scan.nextInt();
                        System.out.print("Masukan Gravitasi Bumi(g)=");
                        int bumi_em=scan.nextInt();
                        System.out.print("Masukan Ketinggian benda (h)=");
                        int tinggi_em=scan.nextInt();
                        System.out.println(" ");
                        System.out.println("->Energi pontesial(Ep)= m * g * h");
                        System.out.println("       (Ep)  = "+Massa_em+" * "+bumi_em+" * "+tinggi_em);
                        double Ep_em=Massa_em*bumi_em*tinggi_em;
                        System.out.println("       (EP)  = "+Ep_em+" Joule");
                       System.out.println("+==========================+");
                        System.out.print("Masukan Kecepatan Benda(m/s)=");
                        int cepat_em=scan.nextInt();
                        System.out.println("->Energi Kinetik(Ek)");
                        System.out.println("Massa Benda(m)="+Massa_em);
                        System.out.println("Kecepatan Benda(v)="+cepat_em);
                        System.out.println("->Energi Kinetik(Ek)=o.5 * m * (v^2)");
                        System.out.println("Ek = 0.5 "+Massa_em+" * ("+cepat_em+"^2)");
                        double masa_em=Massa_em*0.5;
                        int cpt=cepat_em*cepat_em;
                        System.out.println("Ek  = "+masa_em+" * "+cpt);
                        double Joule_em=masa_em*cpt;
                        System.out.println("Ek = "+Joule_em+"Joule");
                        System.out.println("+==========================+");
                        System.out.println("+Dik=======================+");
                        System.out.println("Energi Potensial (Ep)="+Ep_em+"Joule");
                        System.out.println("Energi Kinetik (Ep)  ="+Joule_em+"Joule");
                        System.out.println("-> Energi Mekanik (Em)= Ep + Ek");
                        System.out.println("Em = "+Ep_em+" + "+ Joule_em);
                        Double Hasil_Em=Ep_em+Joule_em;
                        System.out.println("Em = "+Hasil_Em+" Joule");

                    }
                }else if(pilihan == 4){
                    System.out.print("Masukkan Jumlah Mahasiswa : ");
                    mhs = input.nextInt();
                    
                    nilai = new int[mhs][banyakTes];
                    jumlah = new float[mhs];
                    rata = new float[mhs];
                    ntt = new int[banyakTes];
                    ntr = new int[banyakTes];

                    for(int h=0;h<mhs;h++){ //Mahasiswa
                        System.out.println("Mahasiswa " + (h+1));
            
                        for(int i=0;i<banyakTes;i++){ //Tes keberapa       
                        System.out.print("Nilai Tes " + (i+1) + " : ");
                        nilai[h][i] = input.nextInt();
                
                
                        jumlah[h] = jumlah[h] + nilai[h][i];
                        }
            
                        rata[h] = jumlah[h]/banyakTes;
                        System.out.println();
                    }
       
        
                    for(int i=0;i<banyakTes;i++){
                        ntt[i] = nilai[0][i];
                        ntr[i] = nilai[0][i];
                    }
                    rtt = rata[0];
                    rtr = rata[0];
                    for(int i=0;i<banyakTes;i++){
                        for(int j=0;j<mhs;j++){
                            if(ntt[i] < nilai[j][i]){
                                ntt[i] = nilai[j][i];
                            }
                            if(ntr[i] > nilai[j][i]){
                                ntr[i] = nilai[j][i];
                            }
                        }
                    }
        
        
                    for(int i=0;i<mhs;i++){
                        if(rtt < rata[i]){
                            rtt = rata[i];
                        }
                        if(rtr > rata[i]){
                            rtr = rata[i];
                        }
                    }
       
            
                    System.out.println("---------------------------");
                    System.out.println("Daftar Nilai Mahasiswa : ");
                    System.out.println("---------------------------");
                    System.out.println();
        
                    System.out.println("\t\tTest 1\tTest 2\tTest 3\tRata-rata");
        
        
                    for(int j=0;j<mhs;j++){
                        System.out.print("Mahasiswa " + (j+1));
                        for(int k=0;k<banyakTes;k++){
                            System.out.print("\t" + nilai[j][k]);
                        }
                    System.out.print("\t" + rata[j]);
                    System.out.println();
                    }
                    System.out.println();
        
        
                    System.out.print("Nilai Tertinggi\t");
                    for(int j=0;j<banyakTes;j++){
                        System.out.print(ntt[j] + "\t");
                    }
                    System.out.print(rtt);
                    System.out.println();
        
                
                    System.out.print("Nilai Teredah\t");
                    for(int j=0;j<banyakTes;j++){//Nilai terendah
                        System.out.print(ntr[j] + "\t");
                    }
                    System.out.print(rtr);//Rata-rata terendah
                    System.out.println();

                }else if(pilihan == 5){
                    System.out.print("Masukan Nilai Baris: ");
                    b=scan.nextInt();
                    System.out.print("Masukan Nilai Kolom: ");
                    kolom=scan.nextInt();
                    int[][] matriksA = new int[b][kolom];
                    int[][] matriksB = new int[b][kolom];
                    int[][] hasil = new int[b][kolom];
                    System.out.println("Masukan Matrik A:");
                    for(int i=0;i<b;i++){
                        for(int j=0;j<kolom;j++){
                            System.out.print("Baris ke- "+i+" kolom ke- "+j+":");
                            matriksA[i][j]=scan.nextInt();
                        }
                    }
                    System.out.println("Masukan Matrik b:");
                    for(int l=0;l<b;l++){
                        for(int a=0;a<kolom;a++){
                            System.out.print("Baris ke- "+l+" kolom ke- "+a+":");
                            matriksB[l][a]=scan.nextInt();
                        }
                    }
                    System.out.println("Matriks A:");
                    for(int i=0;i<b;i++){
                        for(int j=0;j<kolom;j++){
                            System.out.print(matriksA[i][j]+"\t ");
                        }   
                        System.out.println(" ");
                    }
                    System.out.println("Matriks B");
                    for(int l=0;l<b;l++){
                        for(int a=0;a<kolom;a++){
                            System.out.print(matriksB[l][a]+"\t ");
                        }
                        System.out.println(" ");
                    }
                    System.out.println("Hasil Penjumlahan Matrix :");
                    for (int x = 0; x < b; x++) {
                        for (int y = 0; y < kolom; y++) {
                            hasil[x][y] = matriksA[x][y] + matriksB[x][y];
                            System.out.print(hasil[x][y] + "\t");
                        }
                        System.out.println();
                    }
                    System.out.println("Hasil Pengurangan Matrik :");
                    for (int x =0;x<b;x++){
                        for(int y =0;y < kolom;y++){
                            hasil[x][y]=matriksA[x][y] - matriksB[x][y];
                            System.out.print(hasil[x][y] + "\t");
                        }
                    System.out.println();
                    }   
                    System.out.println("Hasil Perkalian Matrik :");
                    for (int x =0;x<b;x++){
                        for(int y =0;y < kolom;y++){
                            hasil[x][y]=matriksA[x][y] * matriksB[x][y];
                            System.out.print(hasil[x][y] + "\t");
                        }
                        System.out.println();
                    }
                    System.out.println("Hasil Pembagian Matrik :");
                    for (int x =0;x<b;x++){
                        for(int y =0;y < kolom;y++){
                            hasil[x][y]=matriksA[x][y] / matriksB[x][y];
                            System.out.print(hasil[x][y] + "\t");
                        }
                        System.out.println();
                    }   

                }else if(pilihan == 6){
                    System.out.print("Input Jumlah Data :");
                    jumlah_6 = scan.nextInt();
                    int arr[] =new int[jumlah_6];
                    for(z=0;z<jumlah_6;z++){
                        System.out.print("Masukan data ke- " + (z+1)+" =");
                        arr[z]=scan.nextInt();
                    }
                    System.out.println("Data sebelum di sorting:");
                    for(int a=0;a<jumlah_6;a++){
                    System.out.print(arr[a]+" ");
                    }
                    for ( z=0;z<(jumlah_6-1);z++){
                        for ( q=0;q<jumlah_6-z-1;q++){
                            if(arr[q] > arr[q+1]){
                                swap = arr[q];
                                arr[q] = arr[q+1];
                                arr[q+1] =swap;
                            }
                        }
                    }
                    System.out.println("\n\nData secara ascending:");
                    for( z=0;z<jumlah_6;z++){
                    System.out.print(arr[z] + " ");
                    }
                    for ( z=0;z<(jumlah_6-1);z++){
                        for ( q=0;q<jumlah_6-z-1;q++){
                            if(arr[q] < arr[q+1]){
                                swap = arr[q];
                                arr[q] = arr[q+1];
                                arr[q+1] =swap;
                            }
                        }
                    }
                    System.out.println("\n\nData secara descending:");
                    for( z=0;z<jumlah_6;z++){
                        System.out.print(arr[z] + " ");
                    }
                }else if(pilihan == 7){
                    nama3=JOptionPane.showInputDialog(null,"Nama Pembeli:");
                    String merk_helm=JOptionPane.showInputDialog(null,"Merk helm");


                }else if(pilihan == 8){
                    System.out.print("Masukan jumlah data: ");
                    int T=scan.nextInt();

                    for(int OP=0;OP<T;OP++){
                        System.out.println("==========Biodata==========");
                        nama4=JOptionPane.showInputDialog(null,"Nama:");
                        System.out.println("Nama        :"+nama4);
                        alamat=JOptionPane.showInputDialog(null,"Alamat:");
                        System.out.println("Alamat      :"+alamat);
                        hobby=JOptionPane.showInputDialog(null,"Hobby:");
                        System.out.println("Hobby       :"+hobby);
                        no=JOptionPane.showInputDialog(null,"No Telepon:");
                        System.out.println("No Telepon  :"+no);
                        umur=JOptionPane.showInputDialog(null,"Umur:");
                        System.out.println("Umur        :"+umur);
                    }
                }else if(pilihan == 9){
                    System.out.println("SILAKAN PILIH BANGUN RUANG");
                }  
                scan.nextLine(); 
                System.out.println("Apakah anda ingin mengulang program ini?");
                System.out.print("ya/tidak :");
                jawab=scan.nextLine();
                if(jawab.equals("ya")){
                    satu=true;
                }else if(jawab.equals("tidak")){
                    satu=false;
                }
            }while(satu);
            scan.nextLine(); 
                System.out.println("Apakah anda ingin mengganti Program?");
                System.out.print("ya/tidak :");
                jawab=scan.nextLine();
                if(jawab.equals("ya")){
                    satu=true;
                }else if(jawab.equals("tidak")){
                    satu=false;
                }
        }while(satu);
    }
}