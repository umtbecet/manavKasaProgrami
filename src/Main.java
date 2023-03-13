import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double armut,elma,domates,muz,patlican,armutFiyati,elmaFiyati,domatesFiyati,muzFiyati,patlicanFiyati,toplamTutar;
        armutFiyati=2.14;
        elmaFiyati=3.67;
        domatesFiyati=1.11;
        muzFiyati=0.95;
        patlicanFiyati=5;
        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        armut = input.nextDouble();
        System.out.print("Elma Kaç Kilo ? : ");
        elma = input.nextDouble();
        System.out.print("Domates Kaç Kilo ? : ");
        domates = input.nextDouble();
        System.out.print("Muz Kaç Kilo ? : ");
        muz = input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlican = input.nextDouble();

        toplamTutar= armut*armutFiyati+elma*elmaFiyati+domates*domatesFiyati+muz*muzFiyati+patlican*patlicanFiyati;

        System.out.println("Ödenecek Toplam Tutar : "+ toplamTutar);

    }
}