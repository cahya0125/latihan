import java.util.Scanner;
class han{
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
        System.out.println("     QUIZ RREKAYASA PERANGKAT LUNAK     ");
        System.out.println("1.");
        System.out.println("2.");
        System.out.println("3.");
        System.out.println("4.");
        System.out.println("5.");
        System.out.println("6.");
        System.out.println("7.");

        do{
            System.out.print("pILIH[1-7]:");
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
                    if(golongan == 1){
                        pokok=1000000;
                        tunjangan=100000;

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
                    

                    
                }
                scan.nextLine();
                System.out.print("ya/tidak :");
                jawab=scan.nextLine();
                if(jawab.equals("tidak")){
                    satu=false;
                    break;
                }
            }while(satu);

            do{
                if(pilihan == 2){
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
                }
                scan.nextLine();
                System.out.println("APAKAH ANDA MAU MENGULANG?");
                System.out.print("ya/tidak :");
                jawab=scan.nextLine();
                if(jawab.equals("tidak")){
                    satu=false;
                    break;
                }    
            }while(satu);
            System.out.println("+==========================+");
        System.out.println("|1.Usaha(W)                |");
        System.out.println("|2.Daya(P)                 |");
        System.out.println("|3.Energi Ptensial(Ep)     |");
        System.out.println("|4.Energi Kinetik(Ek)      |");
        System.out.println("|5.Energi Mekanik(Em)      |");
        System.out.println("+==========================+");
        System.out.print("Pilih menu [1 s/d 5]:");
        menu=scan.nextInt();
            do{
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
                scan.nextLine();
                System.out.println("APAKAH ANDA MAU MENGULANG?");
                System.out.print("ya/tidak :");
                jawab=scan.nextLine();
                if(jawab.equals("tidak")){
                    satu=false;
                    break;
                }    
            }while(satu);
        }while(satu);
    }
}