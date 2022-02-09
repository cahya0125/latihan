import java.util.Scanner;
class pusing{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int menu;
        String jawab;
        boolean satu=true;

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

    }
}