import java.util.Scanner;

public class Main {

    static void toplama(){

        Scanner input= new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz : ");
        int counter=input.nextInt();

        int result=0,number;

        for(int i=1 ; i<=counter ;i++){

            System.out.print(i + ".sayı :");
            number=input.nextInt();

            result += number;

        }
        System.out.println("Sonuç : " + result);
    }

    static void cıkarma(){

        Scanner input= new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz:");
        int counter=input.nextInt();

        int result=0,number;

        for (int i=1 ; i<=counter ; i++){

            System.out.print(i + ".sayı :");
            number=input.nextInt();

            if(i==1){

                result += number;
                continue;
            }
            result -= number ;
        }
        System.out.println("Sonuç :" + result);
    }

    static void carpma(){

        Scanner input= new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz:");
        int counter=input.nextInt();

        int result=1;
        for(int i=1 ; i<=counter ; i++){

            System.out.print(i + ".sayı:");
            int number=input.nextInt();

            if(number==0){

                result=0;
                break;
            }
            result *=number;
        }
        System.out.println("Sonuç:" + result);
    }

    static void bolme(){

        Scanner input= new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz:");
        int counter=input.nextInt();

        double result=1.0;

        for(int i=1; i<=counter ; i++){

            System.out.print(i + ".sayı :");
            double number=input.nextDouble();

            if(i!=1 && number==0){

                System.out.println("Bir sayı 0'a bölünemez.");

            }
            result /= number;
        }
        System.out.println("Sonuç:" + result);
    }

    static void usalma() {

        Scanner input = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");

        int base = input.nextInt();

        System.out.print("Üs değeri giriniz :");

        int exponent = input.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {

            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

    static void faktoriyel() {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz :");

        int n = input.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {

            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }

    static void mod() {

        Scanner input = new Scanner(System.in);
        System.out.print("Modunu almak istediğiniz sayıyı giriniz:");
        int modalınan=input.nextInt();
        System.out.print("Almak istediğiniz modu giriniz:");
        int modu=input.nextInt();

        int mod= modalınan % modu;

        System.out.println("Modu:" + mod);

    }

    static void dikdortgen(){

        Scanner input= new Scanner(System.in);
        System.out.print("Dikdörtgenin uzun kenar uzunluğunu giriniz:");
        int uzun=input.nextInt();
        System.out.print("Dikdörtgenin kısa kenar uzunluğunu giriniz:");
        int kısa=input.nextInt();

        int alan,cevre;

        alan= uzun*kısa;
        cevre= 2*uzun + 2*kısa;

        System.out.println("Alanı:" + alan);
        System.out.println("Çevresi:" + cevre);

    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int select;
        String options = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";


        while(true){

            System.out.println(options);
            System.out.print("Yapmak istediğiniz işlemi seçiniz:");
            select=input.nextInt();


            if(select==0){
                break;
            }

            switch(select){

                case 1:
                    toplama();
                    break;

                case 2:

                    cıkarma();
                    break;

                case 3:

                    carpma();
                    break;

                case 4:

                    bolme();
                    break;

                case 5:

                    usalma();
                    break;

                case 6:

                    faktoriyel();
                    break;

                case 7:

                    mod();
                    break;

                case 8:

                    dikdortgen();
                    break;

                case 9:

                    System.exit(0);
                    break;

                default:
                    System.out.println("Yanlış tuşlama yaptınız. Lütfen tekrar deneyiniz.");

            }

        }



    }

}